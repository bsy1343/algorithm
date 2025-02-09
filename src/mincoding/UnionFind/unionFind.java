package src.mincoding.UnionFind;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class unionFind {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n, q;
    static int[] group;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());

        group = new int[n + 1];

        Arrays.fill(group, -1);

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int f1 = find(a);
            int f2 = find(b);
            if (type == 1) {
                if (f1 != f2) {
                    group[f2] = f1;
                };
            } else {
                if (f1 != f2) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }

    }

    static int find (int p) {
        if (group[p] == -1) {
            return p;
        }
        return group[p] = find(group[p]);
    }
}