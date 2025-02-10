package 민코딩.BinarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinarySearch {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, k;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            int x = Integer.parseInt(st.nextToken());
            bs(0, n , x);
        }
    }

    static void bs (int start, int end, int node) {
        if (start == end) {
            if (arr[start] == node) {
                System.out.print("O");
            } else {
                System.out.print("X");
            }
            return;
        }

        int mid = (start + end) / 2;
        if (arr[mid] < node) {
            bs(mid + 1, end, node);
        } else {
            bs(start, mid, node);
        }
    }
}