import java.io.*;
import java.util.*;


public class Main {

    static int n;
    static int[] arr;
    static int[][] dp;

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[n+1];
        dp = new int[n+1][2];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        // dp[i][0] i-1번째 계단을 밟지 않고, i번째 계단에 도착하며 얻는 최대 점수 > 2칸기준
        // dp[i][1] i-1번째 계단을 밟고서, i번째 계단에 도착하며 얻는 최대 점수 > 1칸 기준
        dp[1][0] = 0;
        dp[1][1] = arr[1];
        
        // n = 1이면 런타임 에러, for문은 어차피 실행안됨
        if (n >= 2) {
            dp[2][0] = arr[2];
            dp[2][1] = arr[1] + arr[2];
        }

        for (int i = 3; i <= n; i++) {
            /**
             * Case 1: dp[i][0] - 2칸 점프로 i번째 도착
             * dp[i-2][0]: i-2번째에 2칸 점프로 도착했던 경우
             * dp[i-2][1]: i-2번째에 1칸 점프로 도착했던 경우
             * 상관없음! 어차피 2칸 점프하면 연속 3개 제약에 걸리지 않음
             */
            dp[i][0] = Math.max(dp[i-2][0] + arr[i], dp[i-2][1]+ arr[i]);

            /**
             * Case 2: dp[i][1] - 1칸 점프로 i번째 도착
             * dp[i-1][0]만 사용: i-1번째에 2칸 점프로 도착한 경우만
             * dp[i-1][1] 사용 금지: i-1번째에 1칸 점프로 도착한 경우
             */
            dp[i][1] = dp[i-1][0] + arr[i];
        }

        System.out.println(Math.max(dp[n][0], dp[n][1]));
    }
}