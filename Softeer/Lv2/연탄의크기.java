package Softeer.Lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://softeer.ai/practice/7628
public class 연탄의크기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] ARR = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            ARR[i] = Integer.parseInt(st.nextToken());
        }
        // System.out.println(Arrays.toString(ARR));

        int result = Integer.MIN_VALUE;
        for (int i = 2; i <= 100; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (ARR[j] % i == 0) {
                    cnt++;
                }
                result = Integer.max(result, cnt);
            }
        }
        System.out.println(result);
    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int result = 0;
//        for (int i = 2; i <= 100; i++) {
//            int cnt = 0;
//            for (int j = 0; j < n; j++) {
//                if (arr[j] % i == 0) {
//                    result = Math.max(result, ++cnt);
//                }
//            }
//        }
//
//        System.out.println(result);
//    }
}