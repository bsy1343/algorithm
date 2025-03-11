import java.io.*;
import java.util.*;

public class Main {

    static int n, c, l, r, answer;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr = new int[n];

        l = 0;
        r = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            r = Math.max(r, arr[i]);
        }

        Arrays.sort(arr);

        answer = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (determination(mid)) {
                answer = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        System.out.println(answer);
    }

    static boolean determination(int d) {
        // d 만큼의 거리 차이를 둔다면 c개 만큼의 공유기를 설치 할 수 있는가?
        // 제일 왼쪽 집부터 가능한 많이 설치 한다. (0번쨰는 일단 설치)
        // d 만큼의 거리를 두면서 최대로 설치한 개수와 c를 비교하자
        int cnt = 1;
        int last = arr[0];

        for (int i = 1; i < n; i++) {
            // cnt가 c 만큼 설치 가능하면 더 이상 볼 일이 없음
            if (cnt == c) break;
            // arr[i]에 설치 가능?
            //if (last + d <= arr[i]) {
            if (arr[i] - last >= d) {
                last = arr[i];
                cnt++;
            }
        }
        return cnt >= c;
    }
}