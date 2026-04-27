import java.io.*;
import java.util.*;

public class Main {
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

        // l은 최소 거리 , r은 최대거리
        // 최소값은 무조건 1보다 작을수 없다 (공유기의 설치 거리가 0이 될수가 없으니)
        // 최대값은 최소값 - 최대값의 설정
        // 설치할 집의 번지를 정하는게 아니라 공유기간의 최소거리를 측정
        int l = 1, r = arr[n -1]-arr[0];
        while(l <= r) {
            int mid = (l + r) / 2;

            if (determination(mid)) {
                answer = mid;
                // 가능한 거리를 최대한 크게
                l = mid + 1;
            } else {
                r = mid -1;
            }
        }

        System.out.println(answer);
    }

    // 최소값을 넘겨서 설치가 가능한가?
    static boolean determination(int value) {
        int cnt = 1;
        int last = arr[0];

        for (int i = 1; i < n; i++) {
            if (cnt == c) break;
            if (arr[i]-last >= value) {
                last = arr[i];
                cnt++;
            }
        }
        return cnt >= c;
    }
}
