import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dy = new int[1001][10];
        int[] arr = new int[n];

        // 초기값 구하기
        for (int num = 0; num <= 9; num++) {
            dy[1][num] = 1;
        }

        // 점화식을 토대로 dy 배열 채우기
        for (int len = 2; len <= n; len++) {
            for (int num = 0; num <= 9; num++) {
                // dy[len][num] := ?
                for (int prev = 0; prev <= num; prev++) {
                    dy[len][num] += dy[len-1][prev];
                    dy[len][num] %= 10007;
                }
            }
        }

        // dy배열로 정답 계산하기
        int answer = 0;
        for (int num = 0; num <= 9; num++) {
            answer += dy[n][num];
            answer %= 10007;
        }

        System.out.println(answer);
    }
}