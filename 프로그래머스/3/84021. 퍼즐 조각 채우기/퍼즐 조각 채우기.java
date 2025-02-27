import java.util.*;

public class Solution {
    // DFS 탐색을 위한 4방향 (상, 하, 좌, 우)
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public int solution(int[][] game_board, int[][] table) {
        int n = game_board.length;
        boolean[][] visitedGame = new boolean[n][n];
        boolean[][] visitedTable = new boolean[n][n];

        // 게임 보드의 빈 영역(홀)과 테이블의 퍼즐 조각을 저장할 리스트
        List<List<int[]>> holes = new ArrayList<>();
        List<List<int[]>> pieces = new ArrayList<>();

        // 게임 보드에서 값이 0인 영역(빈 칸)을 DFS로 추출 (빈 영역은 퍼즐이 들어갈 자리)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (game_board[i][j] == 0 && !visitedGame[i][j]) {
                    List<int[]> shape = new ArrayList<>();
                    dfs(game_board, visitedGame, i, j, 0, shape);
                    holes.add(normalize(shape));
                }
            }
        }

        // 테이블에서 값이 1인 영역을 DFS로 추출 (각각이 퍼즐 조각)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (table[i][j] == 1 && !visitedTable[i][j]) {
                    List<int[]> shape = new ArrayList<>();
                    dfs(table, visitedTable, i, j, 1, shape);
                    pieces.add(normalize(shape));
                }
            }
        }

        int answer = 0;
        // 각 퍼즐 조각은 한 번만 사용합니다.
        boolean[] used = new boolean[pieces.size()];

        // 각 빈 영역(홀)에 대해 맞는 퍼즐 조각을 찾습니다.
        for (List<int[]> hole : holes) {
            for (int i = 0; i < pieces.size(); i++) {
                if (used[i]) continue;
                List<int[]> piece = pieces.get(i);
                // 빈 영역과 퍼즐 조각은 칸의 개수가 같아야 함
                if (hole.size() != piece.size()) continue;
                boolean matched = false;
                List<int[]> rotated = piece;
                // 4가지 회전 (0°, 90°, 180°, 270°)를 시도
                for (int r = 0; r < 4; r++) {
                    if (isSameShape(hole, rotated)) {
                        matched = true;
                        break;
                    }
                    // 회전 후 정규화하여 비교
                    rotated = normalize(rotate(rotated));
                }
                if (matched) {
                    used[i] = true;
                    answer += hole.size();
                    break;
                }
            }
        }

        return answer;
    }

    // DFS로 target(0 또는 1)인 영역의 좌표를 찾아 shape 리스트에 추가
    private void dfs(int[][] board, boolean[][] visited, int x, int y, int target, List<int[]> shape) {
        int n = board.length;
        visited[x][y] = true;
        shape.add(new int[]{x, y});
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (!visited[nx][ny] && board[nx][ny] == target) {
                    dfs(board, visited, nx, ny, target, shape);
                }
            }
        }
    }

    // 좌표들을 정렬 후, 최소 좌표를 (0,0)으로 옮겨 정규화한다.
    private List<int[]> normalize(List<int[]> shape) {
        // 좌표 정렬 (x좌표 우선, 같으면 y좌표)
        Collections.sort(shape, (a, b) -> {
            if (a[0] == b[0])
                return a[1] - b[1];
            return a[0] - b[0];
        });
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        for (int[] p : shape) {
            minX = Math.min(minX, p[0]);
            minY = Math.min(minY, p[1]);
        }
        List<int[]> norm = new ArrayList<>();
        for (int[] p : shape) {
            norm.add(new int[]{p[0] - minX, p[1] - minY});
        }
        // 정렬을 다시 해준다.
        Collections.sort(norm, (a, b) -> {
            if (a[0] == b[0])
                return a[1] - b[1];
            return a[0] - b[0];
        });
        return norm;
    }

    // 90도 회전: (x, y) -> (y, maxX - x)
    private List<int[]> rotate(List<int[]> shape) {
        List<int[]> rotated = new ArrayList<>();
        int maxX = 0;
        for (int[] p : shape) {
            maxX = Math.max(maxX, p[0]);
        }
        for (int[] p : shape) {
            rotated.add(new int[]{p[1], maxX - p[0]});
        }
        return rotated;
    }

    // 두 모양이 같은지 (정규화 및 정렬된 상태에서) 비교
    private boolean isSameShape(List<int[]> s1, List<int[]> s2) {
        if (s1.size() != s2.size()) return false;
        for (int i = 0; i < s1.size(); i++) {
            if (s1.get(i)[0] != s2.get(i)[0] || s1.get(i)[1] != s2.get(i)[1])
                return false;
        }
        return true;
    }
}
