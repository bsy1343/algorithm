import java.io.*;
import java.util.*;

public class Main {

    static class Node {
        int x, y, dist;
        Node (int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    static int n, m;
    static int[][] visited, map;
    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new int[n][m];
        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        bfs(0, 0, 1);
    }

    static void bfs(int x, int y, int dist) {
        Queue<Node> q = new LinkedList();
        q.add(new Node(x, y, dist));
        visited[x][y] = 1;

        while(!q.isEmpty()) {
            Node node = q.poll();

            if (node.x == n - 1 && node.y == m - 1) {
                System.out.println(node.dist);
                break;
            }

            for (int i = 0; i < directions.length; i++) {
                int nx = node.x + directions[i][0];
                int ny = node.y + directions[i][1];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (visited[nx][ny] != 0) continue;
                    if (map[nx][ny] != 1) continue;

                visited[nx][ny] = 1;
                q.add(new Node(nx, ny, node.dist + 1));
            }
        }
    }
}