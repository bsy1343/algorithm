import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int l = 0, r = n-1, x = 0, y = 0, max = Integer.MAX_VALUE;
        while(l < r) {
            int sum = arr[l] + arr[r];

            if (Math.abs(sum) < max) {
                max = Math.min(max, Math.abs(sum));
                x = arr[l];
                y = arr[r];
            }

            if (sum < 0) {
                l++;
            } else {
                r--;
            }
        }

        System.out.println(x + " " + y);
    }
}