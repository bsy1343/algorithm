import java.io.*;
import java.util.*;

public class Main {

    static int t, n, m, answer;
    static int[] arrA, arrB;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        t = Integer.parseInt(br.readLine());

        for (int test_case = 0; test_case < t; test_case++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            arrA = new int[n];
            arrB = new int[m];

            answer = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arrA[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                arrB[i] = Integer.parseInt(st.nextToken());
            }

            // B배열을 정렬 (이진탐색을 위해 필수!)
            Arrays.sort(arrB);

            // A의 각 원소에 대해 B에서 자신보다 작은 원소의 개수를 구함
            for (int i = 0; i < n; i++) {
                // arrA[i]보다 작은 B배열의 원소 개수를 더함
                answer += lower_bound(0, m-1, arrA[i]);
            }

            System.out.println(answer);
        }
    }

    // lower_bound: val보다 작은 원소의 개수를 반환
    static int lower_bound(int l, int r, int val) {
        while(l <= r) {
            int mid = (l + r) / 2;

            if (arrB[mid] < val) {
                // 중간값이 찾는값보다 작으면 오른쪽 절반 탐색
                l = mid + 1;
            } else {
                // 중간값이 찾는값보다 크거나 같으면 왼쪽 절반 탐색
                r = mid - 1;
            }
        }
        // l은 val보다 작은 원소의 개수를 나타냄
        return l;
    }
}
