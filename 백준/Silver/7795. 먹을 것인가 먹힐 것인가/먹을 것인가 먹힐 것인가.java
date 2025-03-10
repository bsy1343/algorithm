import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int t, n, m, answer;
    static int[] a, b;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());

        for (int test_case = 0; test_case < t; test_case++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            answer = 0;

            a = new int[n];
            b = new int[m];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(b);

            for (int i = 0; i < n; i++) {
                // a[i]를 선택했을때, b에서 a[i] 보다 작은게 몇개나 있는지 count 하기
                answer += lower_bound(b, 0, m-1, a[i]);
            }

            System.out.println(answer);
        }
    }

    static int lower_bound(int[] A, int L, int R, int X) {
        // A배열에서 X 미만의 수중 제일 오른쪽 인덱스를 리턴해주는 함수
        // 그게 없다면 L을 리턴
        while (L <= R) {
            int mid = (L + R) / 2;
            if (A[mid] < X) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return L;
    }

//    static int upper_bound(int[] A, int L, int R, int X) {
//        while (L <= R) {
//            int mid = (L + R) / 2;
//            if (A[mid] <= X) {  // ✅ X와 같은 값도 무시하고 오른쪽으로 이동
//                L = mid + 1;
//            } else {
//                R = mid - 1;
//            }
//        }
//        return L;
//    }

//    static int binary_search(int[] A, int L, int R, int X) {
//        while (L <= R) {
//            int mid = (L + R) / 2;
//            if (A[mid] == X) {  // ✅ 정확한 값을 찾았을 때
//                return mid;  // ✅ X가 위치한 인덱스 반환
//            } else if (A[mid] < X) {  // ✅ X보다 작은 경우, 오른쪽 탐색
//                L = mid + 1;
//            } else {  // ✅ X보다 큰 경우, 왼쪽 탐색
//                R = mid - 1;
//            }
//        }
//        return -1;  // ✅ X가 배열에 없으면 -1 반환
//    }
}