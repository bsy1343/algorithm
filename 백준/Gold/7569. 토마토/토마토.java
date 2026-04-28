import java.io.*;
import java.util.*;

public class Main {

    static class Node {
        int x, y, z, dist;
        Node (int x, int y, int z, int dist) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.dist = dist;
        }
    }

    static int m, n, h;
    static int[][][] box;
    static int[][] directions = {{1, 0, 0}, {-1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}};
    static Queue<Node> q = new LinkedList();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken()); // 가로
        n = Integer.parseInt(st.nextToken()); // 세로
        h = Integer.parseInt(st.nextToken()); // 높이

        box = new int[h][n][m];

        for (int z = 0; z < h; z++) {
            for (int y = 0; y < n; y++) {
                st = new StringTokenizer(br.readLine());
                for (int x = 0; x < m; x++) {
                    box[z][y][x] = Integer.parseInt(st.nextToken());
                    // 익은 토마토는 시작점으로 큐에 추가 (멀티소스 BFS)
                    if (box[z][y][x] == 1) q.add(new Node(x, y, z, 0));
                }
            }
        }

        bfs();
    }

    static void bfs() {
        int answer = 0;

        while (!q.isEmpty()) {
            Node node = q.poll();
            answer = Math.max(answer, node.dist);

            for (int i = 0; i < directions.length; i++) {
                int nx = node.x + directions[i][0];
                int ny = node.y + directions[i][1];
                int nz = node.z + directions[i][2];

                if (nx < 0 || nx >= m || ny < 0 || ny >= n || nz < 0 || nz >= h) continue;
                if (box[nz][ny][nx] != 0) continue; // 안 익은 토마토(0)만 다음 단계로

                box[nz][ny][nx] = 1;
                q.add(new Node(nx, ny, nz, node.dist + 1));
            }
        }

        // 안 익은 토마토 남아있으면 -1 출력
        for (int z = 0; z < h; z++) {
            for (int y = 0; y < n; y++) {
                for (int x = 0; x < m; x++) {
                    if (box[z][y][x] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
