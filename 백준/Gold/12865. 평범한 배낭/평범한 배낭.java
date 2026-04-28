import java.io.*;
import java.util.*;

public class Main {

    static int n, k;
    static int[] w, v;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        w = new int[n + 1];
        v = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        // dp[i][j] := i개 물건까지 고려, 배낭 무게 한도 j일 때 최대 가치
        dp = new int[n + 1][k + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                // Case 1: i번째 물건을 안 넣음 > 이전 상태 그대로
                dp[i][j] = dp[i - 1][j];

                // Case 2: i번째 물건을 넣음 > 들어갈 자리 있을 때만
                if (j >= w[i]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - w[i]] + v[i]);
                }
            }
        }

        System.out.println(dp[n][k]);
    }
}
