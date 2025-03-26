import java.io.*;
import java.util.*;
import org.w3c.dom.Node;

public class Main {

    static class Edge{
        int to, weight;
        Edge (int to, int weight){
            this.to = to;
            this.weight = weight;
        }
    }

    static class Info{
        int idx, dist;
        Info(int idx, int dist) {
            this.idx = idx;
            this.dist = dist;
        }
    }

    static int v, e, start;
    static int[] dist;
    static ArrayList<Edge>[] arrList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(br.readLine());

        dist = new int[v + 1];
        arrList = new ArrayList[v + 1];

        for (int i = 1; i <= v; i++) arrList[i] = new ArrayList();

        for (int i = 1; i <= e; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            arrList[s].add(new Edge(e, w));
        }

        Arrays.fill(dist, Integer.MAX_VALUE);

        dijkstra(start);

        for (int i = 1; i <= v; i++) {
            System.out.println(dist[i] == Integer.MAX_VALUE ? "INF" : dist[i]);
        }
    }

    static void dijkstra(int start) {
        PriorityQueue<Info> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.dist));
        pq.add(new Info(start, 0));
        dist[start] = 0;

        while(!pq.isEmpty()) {
            Info info = pq.poll();

            if (dist[info.idx] < info.dist) continue;

            for (Edge e : arrList[info.idx]) {
                if (info.dist + e.weight >= dist[e.to]) continue;
                dist[e.to] = info.dist + e.weight;
                pq.add(new Info(e.to, dist[e.to]));
            }
        }

    }
}