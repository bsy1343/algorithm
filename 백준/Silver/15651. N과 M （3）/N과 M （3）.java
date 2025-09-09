import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        selected = new int[m + 1];

        dfs(1);

        System.out.println(sb);
    }

    static void dfs(int idx) {
        if (idx > m) {
            for (int i = 1; i <= m; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = 1; i <= n; i++) {
                selected[idx] = i;
                dfs(idx + 1);
            }
        }
    }
}