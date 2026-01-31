import java.util.*;
import java.io.*;

public class Main {

    static int n, m;
    static int[] selected, visited;
    static StringBuilder sb = new StringBuilder();

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        selected = new int[m];
        visited = new int[n + 1];

        dfs(0);

        System.out.println(sb);
    }

    static void dfs(int idx) {
        if (idx == m) {
            for (int i = 0; i < m; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = 1; i <= n; i++) {
                if (visited[i] == 1) continue;
                visited[i] = 1;
                selected[idx] = i;
                dfs(idx + 1);
                visited[i] = 0;
            }
        }
    }
}