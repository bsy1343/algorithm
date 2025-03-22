import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main {

    static class Node {
        int x, y;
        Node (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int n, m, answer;
    static int[][] map, visited;
    static int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static ArrayList<Node> arr = new ArrayList();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) arr.add(new Node(i, j));
            }
        }

        answer = Integer.MIN_VALUE;
        dfs(0);

        System.out.println(answer);
    }

    static void dfs(int depth) {
        if (depth == 3) {
            bfs();
        } else {
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < m; y++) {
                    if (map[x][y] == 0) {
                        map[x][y] = 1;
                        dfs(depth + 1);
                        map[x][y] = 0;
                    }
                }
            }
        }
    }

    static void bfs() {
        Queue<Node> q = new LinkedList();

        visited = new int[n][m];
        for (Node node : arr) {
            visited[node.x][node.y] = 1;
            q.add(new Node(node.x, node.y));
        }

        while(!q.isEmpty()) {
            Node node = q.poll();

            for (int i = 0; i < direction.length; i++) {
                int nx = node.x + direction[i][0];
                int ny = node.y + direction[i][1];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (map[nx][ny] != 0) continue;
                if (visited[nx][ny] != 0) continue;
                visited[nx][ny] = 1;
                q.add(new Node(nx, ny));
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == 1) continue;
                if (map[i][j] == 0) cnt++;
            }
        }
        answer = Math.max(answer, cnt);
    }
}
