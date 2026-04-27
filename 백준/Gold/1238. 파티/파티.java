import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static class Node implements Comparable<Node> {
        int pos, cost;
        Node(int pos, int cost) {
            this.pos = pos;
            this.cost = cost;
        }
        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost; // ✅ 수정
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, m, x;
    static int[] dist;
    static ArrayList<Node>[] al;
    static ArrayList<Node>[] ral; // 역방향 그래프

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        dist = new int[n + 1];
        al  = new ArrayList[n + 1];
        ral = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            al[i]  = new ArrayList<>();
            ral[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            al[a].add(new Node(b, c));   // 정방향
            ral[b].add(new Node(a, c));  // 역방향
        }

        // x → 모든 노드 (정방향)
        int[] fromX = dijkstra(x, al);
        // 모든 노드 → x (역방향 그래프에서 x 출발)
        int[] toX   = dijkstra(x, ral);

        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, fromX[i] + toX[i]);
        }
        System.out.println(max);
    }

    static int[] dijkstra(int start, ArrayList<Node>[] graph) {
        int[] d = new int[n + 1];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();
            if (d[now.pos] < now.cost) continue;

            for (Node next : graph[now.pos]) {
                if (d[next.pos] > now.cost + next.cost) {
                    d[next.pos] = now.cost + next.cost;
                    pq.add(new Node(next.pos, d[next.pos]));
                }
            }
        }
        return d;
    }
}			