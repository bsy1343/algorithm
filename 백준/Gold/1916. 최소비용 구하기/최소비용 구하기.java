import java.io.*;
import java.util.*;
import java.util.stream.Collector;

public class Main {
    static class Edge {
        int to, weight;
        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static class Info {
        int idx, dist;
        Info(int idx, int dist) {
            this.idx = idx;
            this.dist = dist;
        }

    }

    static int n, m;
    static int[] dist;
    static ArrayList<Edge>[] edges;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        dist = new int[n + 1];
        edges = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) edges[i] = new ArrayList();

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            edges[x].add(new Edge(y, s));
        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());


        for (int i = 1; i <= n; i++) dist[i] = Integer.MAX_VALUE;

        dijkstra(start);

        System.out.println(dist[end]);
    }

    // 모든 정점까지에 대한 거리를 무한대로 초기화 해주기.
    // ※주의사항※
    // 문제의 정답으로 가능한 거리의 최댓값보다 큰 값임을 보장해야 한다.
    static void dijkstra(int start) {
        // 최소 힙 생성
        PriorityQueue<Info> q = new PriorityQueue<>(Comparator.comparingInt(o -> o.dist));

        // 시작점을 기록해주고, 시작점은 0부터 시작하니 초기 0
        q.add(new Info(start, 0));
        dist[start] = 0;

        // 거리 정보들이 모두 소진될 때까지 거리 갱신을 반복한다.
        while(!q.isEmpty()) {
            Info info = q.poll();

            if (dist[info.idx] < info.dist) continue;

            // 연결된 모든 간선들을 통해서 다른 정점들에 대한 정보를 갱신해준다.
            for (Edge e : edges[info.idx]) {
                if (dist[info.idx] + e.weight >= dist[e.to]) continue;

                dist[e.to] = dist[info.idx] + e.weight;
                q.add(new Info(e.to, dist[e.to]));
            }
        }
    }
}