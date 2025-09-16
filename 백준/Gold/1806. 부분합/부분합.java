import java.io.*;
import java.util.*;

public class Main {
    static int n, s;
    static int[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int l = 0, r = 0;
        int sum = 0;
        int answer = Integer.MAX_VALUE;
        while (true) {
            if (sum >= s) {
                answer = Math.min(answer, r - l);
                sum -= arr[l++];
            } else {
                if (r == n) break;
                sum += arr[r++];
            }
        }
        System.out.println(answer == Integer.MAX_VALUE ? 0 : answer);

    }
}