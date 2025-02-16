package Softeer.Lv2;

import java.util.Scanner;

// https://softeer.ai/practice/7703
public class X_Marks_The_Spot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String S = sc.next().toUpperCase();
            String T = sc.next().toUpperCase();

            int index = S.indexOf("X");
            // sb.append(String.valueOf(T.charAt(index)));
            sb.append(T.charAt(index));
        }

        System.out.println(sb);
        sc.close();
    }
}