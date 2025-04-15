import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int answer = 0;
        for (int i = 0; i < n; i++) {
            int target = arr[i];

            int l = 0, r = n -1;
            while(l < r) {
                if (l == i) {
                    l++;
                    continue;
                }

                if (r == i) {
                    r--;
                    continue;
                }

                int sum = arr[l] + arr[r];
                if (sum == target) {
                    answer++;
                    break;
                } else if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        System.out.println(answer);
    }
}