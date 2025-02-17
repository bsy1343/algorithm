package Softeer.Lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나무공격 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] MAP = new int[N][M];
        int RESULT = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                MAP[i][j] = Integer.parseInt(st.nextToken());
                if (MAP[i][j] == 1) {
                    RESULT++;
                }
            }
        }
        // System.out.println(RESULT);

        // 1차 공격
        st = new StringTokenizer(br.readLine());
        int first_start = Integer.parseInt(st.nextToken())-1;
        int first_end = Integer.parseInt(st.nextToken());
        for (int i = first_start; i < first_end; i++) {
            for (int j = 0; j < M; j++) {
                if (MAP[i][j] == 1) {
                    MAP[i][j] = 0;
                    RESULT--;
                    break;
                }
            }
        }
        // System.out.println(RESULT);

        // 2차 공격
        st = new StringTokenizer(br.readLine());
        int second_start = Integer.parseInt(st.nextToken())-1;
        int second_end = Integer.parseInt(st.nextToken());
        for (int i = second_start; i < second_end; i++) {
            for (int j = 0; j < M; j++) {
                if (MAP[i][j] == 1) {
                    MAP[i][j] = 0;
                    RESULT--;
                    break;
                }
            }
        }
        System.out.println(RESULT);
    }
}