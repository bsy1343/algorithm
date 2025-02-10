package 민코딩.TwoPointers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 슬라이딩윈도우 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int t, n, size;
    static int[] arr;
    public static void main(String[] args) throws Exception {
        t = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= t; testCase++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            size = Integer.parseInt(st.nextToken());

            arr = new int[n];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int sum = 0;

            for(int i = 0; i < size; i ++)
            {
                sum += arr[i];
            }

            int maxSum = sum;
            int startIdx = 0;
            int endIdx = size-1;
            int b = size;
            for (int a = 0; a < n; a++) {
                if (b >= n) {
                    break;
                }

                sum -= arr[a];
                sum += arr[b];

                if (maxSum < sum) {
                    maxSum = sum;
                    startIdx = a+1;
                    endIdx = b;
                }
                b++;
            }

            System.out.println("#" + testCase + " " + startIdx + " " + endIdx + " " + maxSum );
        }
    }
}
