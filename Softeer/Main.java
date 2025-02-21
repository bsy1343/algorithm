package Softeer;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        String[] arr = {"1110111", "0010010", "0111101", "0111011", "1011010", "1101011", "1101111", "1110010", "1111111", "1111011"};
        String empty = "0000000";

        int t = Integer.parseInt(st.nextToken());
        int[] a = new int[5];
        int[] b = new int[5];

        for (int z = 0; z < t; z++) {
            st = new StringTokenizer(br.readLine());
            String sa = String.format("%5s", st.nextToken());
            String sb = String.format("%5s", st.nextToken());

            for (int i = 0; i < 5; i++) {
                a[i] = sa.charAt(i) == ' ' ? -1 : sa.charAt(i) - '0';
                b[i] = sb.charAt(i) == ' ' ? -1 : sb.charAt(i) - '0';
            }
            // System.out.println(Arrays.toString(a) + " : " + Arrays.toString(b));

            int cnt = 0;
            for (int i = 0; i < 5; i++) {
                if (a[i] != b[i]) {
                    String a_value = a[i] == -1 ? empty : arr[a[i]];
                    String b_value = b[i] == -1 ? empty : arr[b[i]];
                    for (int j = 0; j < 7; j++) {
                        if (a_value.charAt(j) != b_value.charAt(j)) {
                            cnt++;
                        }
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
