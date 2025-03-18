import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];

        int l = 0, r = Integer.MIN_VALUE;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            r = Math.max(r, arr[i]);
        }

        int answer = 0;
        // l은 나무의 최소 높이, r은 나무의 최대 높이
        while (l <= r) {
            int mid = ( l + r ) / 2;
            // determination
            if (determination(mid)) {
                answer = mid;
                l = mid + 1;
            } else {
                r = mid -1;
            }
        }

        System.out.println(answer);
    }

    static boolean determination(int h) {
        // h 높이로 나무들을 잘랐을 떄, M 만큼을 얻을 수 있으면 true, 그렇지 않으면 false를 return하는 함수
        // 나무의 길이의 범위가 20억이고 sum할 경우 21억이 넘을 가능성이 있기에 int -> long
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > h) {
                sum += arr[i] - h;
            }
        }
        return sum >= m;
    }
}