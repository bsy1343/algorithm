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
    static int n, m, answer = Integer.MAX_VALUE;
    static int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static int[][] map, visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n + 1][m + 1];
        visited = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            for (int j = 1; j <= m; j++) {
                int x = str.charAt(j-1) - '0';
                map[i][j] = x;
            }
        }

        bfs(1, 1);

        System.out.println(answer);
    }

    static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList();
        q.add(new Node(x, y, 1));
        visited[x][y] = 1;

        while(!q.isEmpty()) {
            Node node = q.poll();

            if (node.x == n && node.y == m) {
                answer = Math.min(answer, node.s);
            }

            for (int i = 0; i < direction.length; i++) {
                int nx = node.x + direction[i][0];
                int ny = node.y + direction[i][1];

                if (nx < 1 || ny < 1 || nx > n || ny > m) continue;
                if (map[nx][ny] != 1) continue;
                if (visited[nx][ny] != 0) continue;
                visited[nx][ny] = 1;
                q.add(new Node(nx, ny, node.s + 1));
            }
        }

    }
}