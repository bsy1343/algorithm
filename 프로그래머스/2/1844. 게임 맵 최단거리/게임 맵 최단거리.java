import java.io.*;
import java.util.*;

class Solution {

    // BFS 탐색용 노드 (현재 위치 x,y 와 출발점으로부터의 거리)
    static class Node {
        int x, y, dist;
        Node (int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    static int n, m, answer;
    static int[][] visited;
    // 상하좌우 4방향 이동
    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int solution(int[][] maps) {
        n = maps.length;    // 행 크기
        m = maps[0].length; // 열 크기
        visited = new int[n][m];

        bfs(0, 0, maps); // 시작점 (0,0)

        // BFS 도중 도착점에 못 도달하면 answer=0 → -1 반환
        return answer == 0 ? -1 : answer;
    }

    static void bfs(int x, int y, int[][] maps) {
        Queue<Node> q = new LinkedList();
        q.add(new Node(x, y, 1)); // 초기거리 1
        visited[x][y] = 1; // 시작점 방문 처리

        while (!q.isEmpty()) {
            Node node = q.poll();

            // 도착점 (n-1, m-1) 도달 시 거리 저장 후 종료
            // BFS 특성상 처음 도달한 경우가 무조건 최단거리
            if (node.x == n-1 && node.y == m-1) {
                answer = node.dist;
                return;
            }

            // 4방향 탐색
            for (int i = 0; i < directions.length; i++) {
                int nx = node.x + directions[i][0];
                int ny = node.y + directions[i][1];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue; // 범위 벗어남
                if (visited[nx][ny] != 0) continue;                    // 이미 방문
                if (maps[nx][ny] != 1) continue;                       // 벽(0)은 이동 불가

                visited[nx][ny] = 1;                          // 방문 처리
                q.add(new Node(nx, ny, node.dist + 1));       // 거리 +1 해서 큐에 추가
            }
        }
    }
}