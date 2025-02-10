package Softeer.Lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://softeer.ai/practice/6284
public class 바이러스 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        long K = Integer.parseInt(st.nextToken());
        long P = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            K = K * P % 1000000007;
        }

        System.out.println(K);
    }
}
