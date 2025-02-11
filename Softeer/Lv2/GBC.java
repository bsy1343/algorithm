package Softeer.Lv2;

// https://softeer.ai/practice/6270
import java.util.Scanner;

public class GBC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] BL = new int[N];
        int[] BV = new int[N];
        for (int i = 0; i < N; i++) {
            BL[i] = sc.nextInt();
            BV[i] = sc.nextInt();
        }

        int[] AL = new int[M];
        int[] AV = new int[M];
        for (int i = 0; i < M; i++) {
            AL[i] = sc.nextInt();
            AV[i] = sc.nextInt();
        }

        int b_index = 0;
        int a_index = 0;
        int result = 0;
        while (b_index < N && a_index < M) {
            // 속도차이의 맥스값을 구함
            result = Integer.max(result, AV[a_index]-BV[b_index]);

            if (BL[b_index] < AL[a_index]) {
                AL[a_index] = AL[a_index] - BL[b_index];
                b_index++;
            } else if (BL[b_index] > AL[a_index]) {
                BL[b_index] = BL[b_index] - AL[a_index];
                a_index++;
            } else {
                a_index++;
                b_index++;
            }
        }

        System.out.println(result);

        sc.close();
    }
}