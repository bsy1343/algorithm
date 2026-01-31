import java.util.*;
import java.io.*;

public class Main {

    static int n, m;
    static int[] parent;
    static StringBuilder sb = new StringBuilder();

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        parent = new int[m];

        dfs(0);

        System.out.println(sb);
    }

    static void dfs(int idx) {
        if (idx == m) {
            for (int i = 0; i < m; i++) {
                sb.append(parent[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = 1; i <= n; i++) {
                parent[idx] = i;
                dfs(idx + 1);
            }
        }
    }
}