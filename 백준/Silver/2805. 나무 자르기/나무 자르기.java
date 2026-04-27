import java.io.*;
import java.util.*;

public class Main {
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
        while(l <= r) {
            int mid = (l + r) / 2;

            if (ditermination(mid)) {
                answer = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        System.out.println(answer);
    }

    static boolean ditermination(int val) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > val) {
                sum += arr[i] - val;
            }
        }
        return sum >= m;
    }
}
