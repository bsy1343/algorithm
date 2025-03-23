import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int x, y, s;
        Node(int x, int y, int s) {
            this.x = x;
            this.y = y;
            this.s = s;
        }
    }

    static int n, m, answer;
    static int[][] map;
    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        bfs(0, 0, map[0][0]);
    }

    static void bfs(int x, int y, int s) {
        Queue<Node> q = new LinkedList();
        visited[x][y] = true;
        q.add(new Node(x, y, s));

        while (!q.isEmpty()) {
            Node node = q.poll();

            if (node.x == n-1 && node.y == m-1) {
                System.out.println(node.s);
                break;
            }

            for (int i = 0; i < directions.length; i++) {
                int nx = node.x + directions[i][0];
                int ny = node.y + directions[i][1];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (map[nx][ny] != 1) continue;
                if (visited[nx][ny]) continue;
                visited[nx][ny] = true;

                q.add(new Node(nx, ny, node.s + map[nx][ny]));
            }

        }
    }
}