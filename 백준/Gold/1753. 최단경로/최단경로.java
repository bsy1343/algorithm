import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int idx, dist;
        Node (int idx, int dist) {
            this.idx = idx;
            this.dist = dist;
        }
    }

    static int v, e, k;
    static int[] visited;
    static ArrayList<Node>[] al;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(br.readLine());

        visited = new int[v + 1];
        al = new ArrayList[v + 1];

        for (int i = 1; i <= v; i++) {
            al[i] = new ArrayList();
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            al[x].add(new Node(y, s));
        }

        Arrays.fill(visited, Integer.MAX_VALUE);

        dijkstra(k);

        for (int i = 1; i <= v; i++) {
            System.out.println(visited[i] == Integer.MAX_VALUE ? "INF" : visited[i]);
        }
    }

    static void dijkstra(int idx) {
        Queue<Node> q = new PriorityQueue<>(Comparator.comparingInt(o -> o.dist));
        q.add(new Node(idx, 0));
        visited[idx] = 0;

        while(!q.isEmpty()){
            Node now = q.poll();

            if (visited[now.idx] < now.dist) continue;

            for (Node next : al[now.idx]) {
                int cost = visited[now.idx] + next.dist;
                if (visited[next.idx] <= cost) continue;
                visited[next.idx] = cost;
                q.add(new Node(next.idx, cost));
            }
        }
    }
}