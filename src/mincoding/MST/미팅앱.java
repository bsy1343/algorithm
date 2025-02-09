package src.mincoding.MST;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 미팅앱 {

    static class Node {
        int u, v, d;
        Node (int u, int v, int d) {
            this.u = u;
            this.v = v;
            this.d = d;
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n, m, ans, cnt;
    static String[] sex;
    static int[] group;

    static PriorityQueue<Node> pq;
    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        group = new int[n + 1];
        sex = new String[n + 1];

        Arrays.fill(group, -1);

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            sex[i] = st.nextToken();
        }
        pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.d));
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            pq.add(new Node(u, v, d));
        }

        kruskal();

        if (cnt == n-1) {
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }
    }

    static void kruskal () {
        while (!pq.isEmpty()) {
            Node node = pq.poll();

            if (find(node.u) == find(node.v)) {
                continue;
            }

            if (sex[node.u].equals(sex[node.v])) {
                continue;
            }

            int f1 = find(node.u);
            int f2 = find(node.v);

            if (f1 != f2) {
                group[f2] = f1;
                ans += node.d;
                cnt++;
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