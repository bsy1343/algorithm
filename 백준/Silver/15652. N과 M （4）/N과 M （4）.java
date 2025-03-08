import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        selected = new int[n + 1];

        dfs(1);

        System.out.print(sb.toString());
    }

    static void dfs(int k) {
        if (k == m + 1) {
            for (int i = 1; i <= m; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
            return;
        } else {
            int start = selected[k-1] == 0 ? 1 : selected[k-1];
            for (int i = start; i <= n; i++) {
                selected[k] = i;
                dfs(k + 1);
            }
        }
    }
}