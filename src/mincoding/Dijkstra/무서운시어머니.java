package src.mincoding.Dijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 무서운시어머니 {

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

    static int x, y, n, ex, ey;
    static int end = Integer.MIN_VALUE;
    static int[][] visit, map;
    static int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];

        visit = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int x = Integer.parseInt(st.nextToken());
                map[i][j] = x;
                visit[i][j] = Integer.MAX_VALUE;
                if (end < x) {
                    end = x;
                    ex = i;
                    ey = j;
                }

            }
        }
        dijkstra();
        System.out.println(visit[ex][ey]);
    }

    static void dijkstra () throws Exception {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.z));

        pq.add(new Node(x, y, map[x][y]));
        visit[x][y] = map[x][y];
        while (!pq.isEmpty()) {
            Node now = pq.poll();

            for (int i = 0; i < direction.length; i++) {
                int nx = now.x + direction[i][0];
                int ny = now.y + direction[i][1];

                if (nx < 0 || ny < 0 || nx >= n || ny >= n || map[nx][ny] == -1) {
                    continue;
                }

                int nz = now.z + map[nx][ny];
                if (visit[nx][ny] < nz) {
                    continue;
                }

                visit[nx][ny] = nz;
                map[nx][ny] = -1;
                pq.add(new Node(nx, ny, nz));
            }
        }
    }
}
