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
            int x = Integer.parseInt(st.nextToken());
            arr[i] = x;
        }

        // 상한을 구하기 위해서이지만 위의 for문에서 상한을 찾는게 더 좋긴함.
        Arrays.sort(arr);

        // 본문에 절단기 설정은 0~양수라고 나옴 arr[n-1]은 제일 높은 나무
        int l = 0, r = arr[n-1];
        while(l <= r) {
            int mid = (l + r) / 2;

            if (determination(mid)) {
                answer = mid;
                // 최대값 탐색
                l = mid + 1;
            } else {
                // 최소값 탐색
                r = mid - 1;
            }
        }

        System.out.println(answer);
    }

    static boolean determination(int val) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > val) {
                sum += arr[i] - val;
            }
        }
        return sum >= m;
    }
}