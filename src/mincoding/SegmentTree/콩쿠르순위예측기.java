package src.mincoding.SegmentTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 콩쿠르순위예측기 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n, cnt, total;
    static int[] tree;

    public static void main(String[] args) throws Exception {
        n = Integer.parseInt(br.readLine());

        total = 1_000_000;

        tree = new int[total * 4];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x == 1) {
                update(1, total, 1, y, 1);
                int rank = query(1, total, 1, 1, y);
                System.out.println(rank + "위");
                cnt++;
            } else {
                update(1, total, 1, y, 0);
                cnt--;
                System.out.println(cnt  + "명");
            }
        }

    }

    static int merge (int left, int right) {
        return left + right;
    }

    static int query (int start, int end, int node, int left, int right) {
        if (left > end || right < start) {
            return 0;
        }

        if (left <= start && right >= end) {
            return tree[node];
        }

        int mid = (start + end) / 2;
        int leftval = query(start, mid, node * 2, left, right);
        int rightval = query(mid + 1, end, node * 2 + 1, left, right);

        return merge(leftval, rightval);
    }

    static int update (int start, int end, int node, int idx, int val) {
        if (idx < start || idx > end) {
            return tree[node];
        }

        if (start == end) {
            return tree[node] = val;
        }

        int mid = (start + end) / 2;
        int leftval = update(start, mid, node * 2, idx, val);
        int rightval = update(mid + 1, end, node * 2 + 1, idx, val);

        return tree[node] = merge(leftval, rightval);
    }

}