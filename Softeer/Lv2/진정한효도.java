package Softeer.Lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://softeer.ai/practice/7374
public class 진정한효도 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int K = 3;
        int result = Integer.MAX_VALUE;
        int[][] MAP = new int[K][K];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++) {
                MAP[i][j] = Integer.parseInt(st.nextToken());
                // System.out.print(MAP[i][j] + " ");
            }
            // System.out.println();
        }

        // 가로
        for (int i = 0; i < K; i++) {
            for (int v = 1; v <= 3; v++) {
                int cnt = 0;
                for (int j = 0; j < K; j++) {
                    cnt += Math.abs(MAP[i][j] - v);
                }
                result = Integer.min(result, cnt);
            }
        }

        // 세로
        for (int i = 0; i < K; i++) {
            for (int v = 1; v <= 3; v++) {
                int cnt = 0;
                for (int j = 0; j < K; j++) {
                    cnt += Math.abs(MAP[j][i] - v);
                }
                result = Integer.min(result, cnt);
            }
        }
        System.out.println(result);
    }
}
