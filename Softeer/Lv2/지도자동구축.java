package Softeer.Lv2;

import java.util.Scanner;

// https://softeer.ai/practice/6280
public class 지도자동구축 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int K = 2;
        // K = 2, 3, 5, 9, 17, 33
        for (int i = 0; i < N; i++) {
            K = K * 2 - 1;
        }
        System.out.println(K * K);
        sc.close();
    }
}