import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static int[][] map, visited;
    static ArrayList<Integer> arr = new ArrayList();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        visited = new int[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 0) continue;
                if (visited[i][j] == 1) continue;
                arr.add(dfs(i, j));
            }
        }

        Collections.sort(arr);

        System.out.println(arr.size());
        for (int answer : arr) {
            System.out.println(answer);
        }
    }

    static int dfs(int x, int y) {
        visited[x][y] = 1;
        int count = 1;

        for (int i = 0; i < direction.length; i++) {
            int nx = x + direction[i][0];
            int ny = y + direction[i][1];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
            if (map[nx][ny] == 0) continue;
            if (visited[nx][ny] == 1) continue;
            count += dfs(nx, ny);
        }
        return count;
    }
}