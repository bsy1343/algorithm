package 민코딩.MST;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 최소스패닝트리 {
    static class Node {
        int a, b, c;
        Node (int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int v, e, ans;
    static int[] group;
    static PriorityQueue<Node> pq;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());

        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        group = new int[v + 1];
        Arrays.fill(group, -1);

        pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.c));

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            pq.add(new Node(a, b, c));
        }

        kruskal();
    }

    static void kruskal () throws Exception {
        while (!pq.isEmpty()) {
            Node node = pq.poll();

            if (find(node.a) == find(node.b)) {
                continue;
            }

            int f1 = find(node.a);
            int f2 = find(node.b);

            if (f1 != f2) {
                group[f2] = f1;
                ans += node.c;
            }
        }

        System.out.println(ans);
    }

    static int find (int p) {
        if (group[p] == -1) {
            return p;
        }

        return group[p] = find(group[p]);
    }
}