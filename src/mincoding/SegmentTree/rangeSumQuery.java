package src.mincoding.SegmentTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class rangeSumQuery {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, q;
    static int[] arr;
    static long[] tree;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        tree = new long[n * 4];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        init(1, n, 1);

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (type == 1) {
                update(1, n, 1, a, b);
            } else {
                System.out.println(query(1, n, 1, a, b));
            }
        }
    }

    static long merge (long left, long right) {
        return left + right;
    }

    static long init (int start, int end, int node) {
        if (start == end) {
            return tree[node] = arr[start];
        }

        int mid = (start + end) / 2;
        long leftVal = init(start, mid, node * 2);
        long rightVal = init(mid + 1, end, node * 2 + 1);

        return tree[node] = merge(leftVal, rightVal);
    }

    static long query (int start, int end, int node, int left, int right) {
        if (left > end || right < start) {
            return 0;
        }

        if (left <= start && right >= end) {
            return tree[node];
        }

        int mid = (start + end) / 2;
        long leftVal = query(start, mid, node * 2, left, right);
        long rightVal = query(mid + 1, end,node * 2 + 1, left, right);

        return merge(leftVal, rightVal);
    }

    static long update (int start, int end, int node, int idx, int val) {
        if (idx < start || idx > end) {
            return tree[node];
        }

        if (start == end) {
            arr[idx] = val;
            return tree[node] = val;
        }

        int mid = (start + end) / 2;
        long leftVal = update(start, mid, node * 2, idx, val);
        long rightVal = update(mid + 1, end,node * 2 + 1, idx, val);

        return tree[node] = merge(leftVal, rightVal);
    }
}