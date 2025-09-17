import java.io.*;
import java.util.*;

public class Main {

    static int t, n;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();
        dp = new int [11];

        dp[1] = 1; // 1
        dp[2] = 2; // 1+1, 2
        dp[3] = 4; // 1+1+1, 1+2, 2+1, 3
        // 4 = 7   >> 1+1+1+1, 2+1+1, 1+2+1, 1+1+2, 2+2, 3+1, 1+3

        for (int i = 4; i < 11; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }

        while(t-- > 0) {
            n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }
}