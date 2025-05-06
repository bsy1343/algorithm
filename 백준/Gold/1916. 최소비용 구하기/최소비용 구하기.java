import java.io.*;
import java.util.*;
import org.w3c.dom.Node;

public class Main {
    static class Node {
        int idx, dist;
        Node (int idx, int dist) {
            this.idx = idx;
            this.dist = dist;
        }
    }
    static int n, m, start, end;
    static int[] dist;
    static ArrayList<Node>[] al;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        dist = new int[n + 1];
        al = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) al[i] = new ArrayList();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            al[x].add(new Node(y, s));
        }

        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        dijkstra(start);

        System.out.println(dist[end]);
    }

    static void dijkstra(int start) {
        PriorityQueue<Node> q = new PriorityQueue<>(Comparator.comparingInt(o -> o.dist));
        q.add(new Node(start, 0));
        dist[start] = 0;

        while(!q.isEmpty()) {
            Node node = q.poll();

            if (dist[node.idx] < node.dist) continue;

            for (Node e : al[node.idx]) {
                if (dist[e.idx] <= dist[node.idx] + e.dist) continue;
                dist[e.idx] = dist[node.idx] + e.dist;

                q.add(new Node(e.idx, dist[e.idx]));
            }
        }

    }
}