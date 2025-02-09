package src.mincoding.BinarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연료게이지 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n;
    static char[] arr;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            arr = br.readLine().toCharArray();
            if (arr[arr.length-1] == '#') {
                System.out.println("100%");
            } else {
                bs(0, arr.length, '#');
            }
        }
    }

    static void bs (int start, int end, int node) {
        if (start == end) {
            System.out.println(start * 100 / arr.length + "%");
            return;
        }

        int mid = (start + end) / 2;
        if (arr[mid] == node) {
            bs(mid + 1, end, node);
        } else {
            bs(start, mid, node);
        }

    }
}