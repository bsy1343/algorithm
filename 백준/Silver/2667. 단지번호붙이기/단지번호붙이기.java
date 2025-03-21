import java.io.*;
import java.util.*;

public class Main {

    static boolean[][] visited;
    static int[][] map;
    static int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static ArrayList<Integer> al = new ArrayList();
    static int n, answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] != 1) continue;
                if (visited[i][j]) continue;
                cnt++;
                answer = 0;
                dfs(i, j);
                al.add(answer);
            }
        }

        Collections.sort(al);

        System.out.println(cnt);

        for (int c : al) {
            System.out.println(c);
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        answer++;

        for (int i = 0; i < direction.length; i++) {
            int nx = x + direction[i][0];
            int ny = y + direction[i][1];

            if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
            if (map[nx][ny] != 1) continue;
            if (visited[nx][ny]) continue;
            dfs(nx, ny);
        }

    }

}