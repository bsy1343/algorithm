package src.mincoding.Dijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 통행료 {
    static class Node {
        int pos, cost;
        Node (int pos, int cost) {
            this.pos = pos;
            this.cost = cost;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n, m, k;
    static int a, b;
    static int[] visit;
    static ArrayList<Node>[] al;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());


        al = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            al[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            al[x].add(new Node(y, cost));
            al[y].add(new Node(x, cost));
        }

        dijkstra();
    }

    static void dijkstra () throws Exception {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.cost));
        int nCost = 0;
        for (int i = 0; i <= k; i++) {

            visit = new int[n * 2];
            Arrays.fill(visit, Integer.MAX_VALUE);

            if (i != 0) {
                nCost += Integer.parseInt(br.readLine());
            }
            pq.add(new Node(a, 0));

            while (!pq.isEmpty()) {
                Node now = pq.poll();

                if (visit[now.pos] < now.cost) {
                    continue;
                }

                visit[now.pos] = now.cost;

                for (Node next : al[now.pos]) {
                    if (visit[next.pos] > next.cost + now.cost + nCost) {
                        pq.add(new Node(next.pos, next.cost + now.cost + nCost));
                    }
                }
            }
            System.out.println(visit[b]);
        }
    }
}