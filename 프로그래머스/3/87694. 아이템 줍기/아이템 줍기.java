import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    
    // BFS를 위한 좌표 및 거리 정보를 담은 클래스
    static class Point {
        int x, y, dist;
        Point(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    
    // 상하좌우 이동 방향
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        // 좌표 최대 범위 고려: 문제에서 좌표 최대 50, 스케일링 후 100, 여유 공간 포함하여 102 사용
        int[][] board = new int[102][102];
        
        // 1. 직사각형 영역 모두 채우기 (스케일링)
        for (int[] rec : rectangle) {
            int x1 = rec[0] * 2;
            int y1 = rec[1] * 2;
            int x2 = rec[2] * 2;
            int y2 = rec[3] * 2;
            
            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    board[i][j] = 1;
                }
            }
        }
        
        // 2. 내부(경계가 아닌 부분) 제거하기
        for (int[] rec : rectangle) {
            int x1 = rec[0] * 2;
            int y1 = rec[1] * 2;
            int x2 = rec[2] * 2;
            int y2 = rec[3] * 2;
            
            // 내부 영역은 경계보다 1씩 안쪽부터 x2, y2 전까지
            for (int i = x1 + 1; i < x2; i++) {
                for (int j = y1 + 1; j < y2; j++) {
                    board[i][j] = 0;
                }
            }
        }
        
        // 3. BFS를 사용해 최단 경로 찾기
        boolean[][] visited = new boolean[102][102];
        Queue<Point> queue = new LinkedList<>();
        int startX = characterX * 2;
        int startY = characterY * 2;
        int targetX = itemX * 2;
        int targetY = itemY * 2;
        
        queue.offer(new Point(startX, startY, 0));
        visited[startX][startY] = true;
        
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            
            // 아이템 위치에 도달하면 경로 길이를 2로 나누어 반환
            if (p.x == targetX && p.y == targetY) {
                return p.dist / 2;
            }
            
            // 네 방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                
                if (nx >= 0 && ny >= 0 && nx < 102 && ny < 102) {
                    if (!visited[nx][ny] && board[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        queue.offer(new Point(nx, ny, p.dist + 1));
                    }
                }
            }
        }
        
        // 문제 조건 상 항상 경로가 존재함
        return 0;
    }
}