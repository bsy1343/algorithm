import java.io.*;
import java.util.*;

public class Main {

    static int n, total;
    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static int[][] map, visited;
    static ArrayList<Integer> al = new ArrayList();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new int[n][n];

        for (int i = 0; i < n; i++) {
            char[] x = br.readLine().toCharArray();
            for (int j = 0; j < n; j++) {
                map[i][j] = x[j] - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 0) continue;
                if (visited[i][j] == 1) continue;
                total++;
                al.add(dfs(i, j));
            }
        }

        Collections.sort(al);

        System.out.println(total);
        for (int x : al) {
            System.out.println(x);
        }

    }

    static int dfs(int x, int y) {
        int cnt = 1;
        visited[x][y] = 1;

        for (int i = 0; i < directions.length; i++) {
            int dx = x + directions[i][0];
            int dy = y + directions[i][1];

            if (dx < 0 || dx >= n || dy < 0 || dy >= n) continue;
            if (visited[dx][dy] == 1) continue;
            if (map[dx][dy] == 0) continue;

            cnt += dfs(dx, dy);
        }
        return cnt;
    }
}