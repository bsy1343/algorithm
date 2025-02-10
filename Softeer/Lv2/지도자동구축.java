package Softeer.Lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://softeer.ai/practice/6280
public class 지도자동구축 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int D = Integer.parseInt(br.readLine());
        int K = 2;

        // 2, 3, 5, 9, 17 ...
        for (int i = 0; i < D; i++) {
            K = K * 2 - 1;
        }
        System.out.println(K * K);
    }
}