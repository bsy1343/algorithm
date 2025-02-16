package Softeer.Lv2;

import java.util.Scanner;

// https://softeer.ai/practice/9497
public class Recovering_The_Region {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cnt = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j == N-1) {
                    System.out.print(cnt);
                } else {
                    System.out.print(cnt + " ");
                }
            }
            cnt++;
            System.out.println();
        }
        sc.close();
    }
}