import java.util.*;
import java.io.*;

public class Main {

    static int n, m;
    static int[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        // 정의를 한다.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        visited = new int[n + 1];

        dfs(1);

        System.out.print(sb.toString());
        sc.close();
    }
    
    static void dfs(int k) {
        if (k == m + 1) {
            for (int i = 1; i <= m; i++) {
                sb.append(visited[i]).append(" ");
            }
            sb.append("\n");
            return;
        } else {
            for (int i = 1; i <= n; i++) {
                visited[k] = i;
                dfs(k+1);
                // 의미없지만 의례상
                visited[k] = 0;
            }
        }
    }
}
