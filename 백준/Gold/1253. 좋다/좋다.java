import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int answer = 0;
        for (int i = 0; i < n; i++) {
            int l = 0, r = n-1, sum = arr[i];

            while(l < r) {
                // 자기 자신을 포함하지 않도록 체크
                if (l == i) {
                    l++;
                    continue;
                }
                if (r == i) {
                    r--;
                    continue;
                }
                int rst = arr[l] + arr[r];
                if (rst == sum) {
                    answer++;
                    break;
                } else if (rst > sum) {
                    r--;
                } else if (rst < sum){
                    l++;
                }
            }
        }

        System.out.println(answer);
    }
}