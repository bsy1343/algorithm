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
    static int n, m, answer;
    static int[][] map, visited;
    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static ArrayList<Node> al = new ArrayList();

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
                if (map[i][j] == 2) {
                    al.add(new Node(i, j));
                }
            }
        }

        backTracking(0);

        System.out.println(answer);
    }

    static void backTracking(int index) {
        if (index == 3) {
            visited = new int[n][m];
            for (Node node : al) {
                dfs(node.x, node.y);
            }
            answer = Math.max(answer, count());
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] != 0) continue;
                    map[i][j] = 1;
                    backTracking(index + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = 1;

        for (int i = 0; i < directions.length; i++) {
            int dx = x + directions[i][0];
            int dy = y + directions[i][1];

            if (dx < 0 || dx >= n || dy < 0 || dy >= m) continue;
            if (visited[dx][dy] != 0) continue;
            if (map[dx][dy] != 0) continue;

            dfs(dx, dy);
        }
    }

    static int count() {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] != 0) continue;
                if (map[i][j] != 0) continue;
                cnt++;
            }
        }
        return cnt;
    }
}