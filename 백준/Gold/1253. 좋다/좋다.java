import java.io.*;
import java.util.*;

public class Main {
    static int n, answer;
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

        for (int i = 0; i < n; i++) {
            int target = arr[i];

            int l = 0, r = n-1;
            while(l < r) {
                if (i == l) {
                    l++;
                    continue;
                }
                if (i == r) {
                    r--;
                    continue;
                }

                int sum = arr[l] + arr[r];

                if (sum == target) {
                    answer++;
                    break;
                } else if (sum > target) {
                    r--;
                } else {
                    l++;
                }
            }
        }

        System.out.println(answer);
    }
}