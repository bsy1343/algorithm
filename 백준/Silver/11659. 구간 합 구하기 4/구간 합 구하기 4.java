import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[] sum;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        sum = new int[n + 1];

        // sum[i] := 1번부터 i번까지 누적합
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());
        }

        // i ~ j 구간 합 = sum[j] - sum[i-1]
        for (int q = 0; q < m; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            sb.append(sum[j] - sum[i - 1]).append("\n");
        }

        System.out.println(sb);
    }
}
