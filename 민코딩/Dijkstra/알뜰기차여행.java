package 민코딩.Dijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 알뜰기차여행 {
    static class Node {
        int pos, cost;
        Node (int pos, int cost) {
            this.pos = pos;
            this.cost = cost;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n, t;
    static int[] visit;
    static ArrayList<Node>[] al;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());

        visit = new int[n * 2];
        Arrays.fill(visit, Integer.MAX_VALUE);


        al = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            al[i] = new ArrayList<>();
        }

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            al[x].add(new Node(y, cost));
        }

        dijkstra();

        if (visit[n -1] == Integer.MAX_VALUE) {
            System.out.println("impossible");
        } else {
            System.out.println(visit[n -1]);
        }
    }

    static void dijkstra () {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.cost));
        pq.add(new Node(0, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            if (visit[now.pos] < now.cost) {
                continue;
            }

            visit[now.pos] = now.cost;

            for (Node next : al[now.pos]) {
                if (visit[next.pos] > next.cost + now.cost) {
                    pq.add(new Node(next.pos, next.cost + now.cost));
                }
            }
        }
    }
}
