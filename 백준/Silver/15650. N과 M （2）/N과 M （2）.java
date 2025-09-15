import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[] selected, visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        selected = new int[n + 1];
        visited = new int[n + 1];

        dfs(1);

        System.out.println(sb.toString());
    }

    static void dfs(int idx) {
        if (idx > m) {
            for (int i = 1; i <= m; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        } else {
            int start = idx == 1 ? 1 : selected[idx - 1];
            for (int i = start; i <= n; i++ ) {
                if (visited[i] != 0) continue;
                visited[i] = 1;
                selected[idx] = i;
                dfs(idx + 1);
                visited[i] = 0;
            }
        }
    }
}