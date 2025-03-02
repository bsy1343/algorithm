package 민코딩.Dijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class NxM최단거리 {

    static class Node {
        int x, y, z;
        Node (int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n, m;
    static int[][] visit, map;
    static int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        visit = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int x = Integer.parseInt(st.nextToken());
                map[i][j] = x;
                visit[i][j] = Integer.MAX_VALUE;
            }
        }
        dijkstra();
        System.out.println(visit[n-1][m-1]);
    }

    static void dijkstra () throws Exception {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.z));

        pq.add(new Node(0, 0, map[0][0]));
        visit[0][0] = map[0][0];
        while (!pq.isEmpty()) {
            Node now = pq.poll();

            // 이게 유효한것인지 확인 해 봐야함.
            // if (visit[now.x][now.y] < now.z) continue;

            for (int i = 0; i < direction.length; i++) {
                int nx = now.x + direction[i][0];
                int ny = now.y + direction[i][1];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }

                int nz = now.z + map[nx][ny];
                if (visit[nx][ny] < nz) {
                    continue;
                }

                visit[nx][ny] = nz;
                pq.add(new Node(nx, ny, nz));
            }
        }
    }
}