import java.util.*;
import java.io.*;

public class Main{
    static int n, c, answer;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int l = 0, r = arr[n-1];
        while(l <= r) {
            int mid = (l + r) / 2;
            if (determination(mid)) {
                answer = mid;
                l = mid + 1;
            } else {
                r = mid -1;
            }
        }

        System.out.println(answer);
    }

    static boolean determination (int value) {
        int cnt = 1;
        int last = arr[0];

        for (int i = 1; i < n; i++) {
            // if (cnt == c) return;
            if (arr[i] - last >= value) {
                cnt++;
                last = arr[i];
            }
        }
        return cnt >= c;
    }
}