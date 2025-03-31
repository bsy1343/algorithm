import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for (int test_case = 0; test_case < t; test_case++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] num = new int[n + 1];
            int[][] sum = new int[n + 1][n + 1];
            int[][] dy = new int[n + 1][n + 1];

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                num[i] = Integer.parseInt(st.nextToken());
            }

            // 초기화
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    sum[i][j] = sum[i][j-1] + num[j];
                }
            }

            // 점화식
            for (int len = 2; len <= n; len++) {
                for (int i = 1; i <= n - len + 1; i++) {
                    int j = i + len - 1;
                    dy[i][j] = Integer.MAX_VALUE;

                    for (int k = i; k < j; k++) {
                        dy[i][j] = Math.min(dy[i][j], dy[i][k] + dy[k+1][j] + sum[i][j]);
                    }
                }
            }

            System.out.println(dy[1][n]);
        }
    }
}