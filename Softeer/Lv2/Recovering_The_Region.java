package Softeer.Lv2;

import java.util.Scanner;

// https://softeer.ai/practice/9497
public class Recovering_The_Region {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n-1) {
                    System.out.println(cnt++);
                } else {
                    System.out.print(cnt + " ");
                }
            }
        }
        sc.close();
    }
}