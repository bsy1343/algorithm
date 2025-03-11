import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, m, answer;
    static int l = 0;
    static int r = Integer.MIN_VALUE;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            r = Math.max(r, arr[i]);
        }
        
        // l은 나무의 최소 높이, r은 나무의 최대 높이 
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

    static boolean determination(int h) {
        // h 높이로 나무들을 잘랐을 떄, M 만큼을 얻을 수 있으면 true, 그렇지 않으면 false를 return하는 함수
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > h) {
                sum += arr[i] - h;
            }
        }
        return sum >= m;
    }
}