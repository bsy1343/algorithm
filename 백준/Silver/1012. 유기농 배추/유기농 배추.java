import java.io.*;
import java.util.*;

public class Main {

    static class Node {
        int x, y;
        Node (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int t, m, n, k;
    static int[][] visited, map;
    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static ArrayList<Node> al = new ArrayList();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        t = Integer.parseInt(br.readLine());

        for (int test_case = 0; test_case < t; test_case++) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            visited = new int[m][n];
            map = new int[m][n];

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }

            int answer = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (visited[i][j] != 0) continue;
                    if (map[i][j] != 1) continue;
                    answer++;
                    bfs(i, j);
                }
            }

            System.out.println(answer);
        }
    }

    static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList();
        q.add(new Node(x, y));
        visited[x][y] = 1;

        while(!q.isEmpty()) {
            Node node = q.poll();

            for (int i = 0; i < directions.length; i++) {
                int nx = node.x + directions[i][0];
                int ny = node.y + directions[i][1];

                if (nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
                if (visited[nx][ny] != 0) continue;
                if (map[nx][ny] != 1) continue;

                visited[nx][ny] = 1;
                q.add(new Node(nx, ny));
            }
        }
    }
}