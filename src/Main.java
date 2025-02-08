package src;

import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int K = Integer.parsein(st.nextToken());
        int P = Integer.parse(st.nextToken());
        int N = Integer.parse(st.nextToken());

        int result = 0;

        fop
        result = K * P * N % 1000000007;

        System.out.println(result);


    }
}