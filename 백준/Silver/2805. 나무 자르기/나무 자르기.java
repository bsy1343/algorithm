import java.util.*;
import java.io.*;

public class Main{

    static int n, m, answer;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int l = 0, r = arr[n-1];
        answer = Integer.MIN_VALUE;

        while(l <= r) {
            int mid = (l + r) / 2;

            if (validation(mid) >= m) {
                answer = Math.max(answer, mid);
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        System.out.println(answer);
    }

    static long validation(int target) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= target) continue;
            sum += arr[i] - target;
        }

        return sum;
    }

}