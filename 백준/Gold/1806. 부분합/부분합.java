import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // r을 +1하면서 이동하기 때문에 -1을 하여도 첫 시작은 0
        // answer는 l~r까지의 연속된수열의 갯수의 최대보다 높은 값을 설정해야함 n+1 이상
        int r = -1, sum = 0, answer = Integer.MAX_VALUE;
        for (int l = 0; l < n; l++) {
            // l-1을 구간에서 제외하기, 첫 구간엔 뺄수 있는게 없으니 sum = 0
            if (l > 0) {
                sum -= arr[l - 1];
            }

            // r을 옮길 수 있을때까지 옮기기
            while (r + 1 < n && sum < s) {
                sum += arr[++r];
            }

            // l~r 의 합, 즉 sum이 조건을 만족하면 정답 갱신
            if (sum >= s) {
                answer = Math.min(answer, r - l + 1);
            }
        }

        if (answer == Integer.MAX_VALUE) {
            answer = 0;
        }

        System.out.println(answer);
    }
}