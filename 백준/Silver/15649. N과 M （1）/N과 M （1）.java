import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[] selected, visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        selected = new int[n+1];
        visited = new int[n+1];

        dfs(1);

        System.out.print(sb.toString());
    }

    static void dfs(int k) {
        if (k == m + 1) {
            for (int i = 1; i <= m; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = 1; i <= n; i++) {
                if (visited[i] == 0) {
                    visited[i] = 1;
                    selected[k] = i;
                    dfs(k + 1);
                    visited[i] = 0;
                    selected[k] = 0;
                }
            }
        }
    }
}