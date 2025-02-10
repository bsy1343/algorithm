package 민코딩.Dijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 포스터붙이기 {
    static class Node implements Comparable<Node>{
        int pos, cost;
        Node (int pos, int cost) {
            this.pos = pos;
            this.cost = cost;
        }
        @Override
        public int compareTo(Node o) {
            if (this.cost > o.cost) {
                return 1;
            } else if (this.cost < o.cost) {
                return -1;
            } else {
                return 0;
            }
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int C, P, K, A, B;
    static int[] visit;

    static ArrayList<Node>[] al;
    static PriorityQueue<Node> pq;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        visit = new int[P+1];
        Arrays.fill(visit, Integer.MAX_VALUE);
        al = new ArrayList[P+1];

        for (int i = 1; i <= P; i++) {
            al[i] = new ArrayList<>();
        }

        for (int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            al[x].add(new Node(y, z));
            al[y].add(new Node(x, z));
        }

        dijkstra();

    }

    static void dijkstra () {
        pq = new PriorityQueue<>();
        pq.add(new Node(K, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            if (visit[now.pos] < now.cost) {
                continue;
            }

            visit[now.pos] = now.cost;

            if (now.pos == A || now.pos == B) {
                break;
            }

            for (Node next : al[now.pos]) {
                if (visit[next.pos] > now.cost + next.cost) {
                    pq.add(new Node(next.pos, now.cost + next.cost));
                }
            }
        }

        int start, end, sum;
        if (visit[A] > visit[B]) {
            start = B;
            end = A;
        } else {
            start = A;
            end = B;
        }
        sum = visit[start];

        Arrays.fill(visit, Integer.MAX_VALUE);
        pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            if (visit[now.pos] < now.cost) {
                continue;
            }

            visit[now.pos] = now.cost;

            if (now.pos == end) {
                break;
            }

            for (Node next : al[now.pos]) {
                if (visit[next.pos] > now.cost + next.cost) {
                    pq.add(new Node(next.pos, now.cost + next.cost));
                }
            }
        }
        sum += visit[end];

        System.out.println(sum);
    }
}