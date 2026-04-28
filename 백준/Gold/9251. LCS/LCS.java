import java.io.*;
import java.util.*;

public class Main {

    static String a, b;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = br.readLine();
        b = br.readLine();

        int n = a.length();
        int m = b.length();

        // dp[i][j] := a의 1~i, b의 1~j에서의 LCS 길이
        dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // Case 1: 두 문자가 같으면 > 이전 LCS에 +1
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // Case 2: 다르면 > 한 쪽 빼고 비교한 결과 중 큰 값
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println(dp[n][m]);
    }
}
