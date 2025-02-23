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

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            String bs = sc.next().toUpperCase();
//            String as = sc.next().toUpperCase();
//
//            if (bs.indexOf("X") > -1) {
//                System.out.print(as.charAt(bs.indexOf("X")));
//            }
//        }
//        sc.close();
//    }
}