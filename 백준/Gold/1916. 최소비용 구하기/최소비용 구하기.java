import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int idx, dist;
        Node(int idx, int dist) {
            this.idx = idx;
            this.dist = dist;
        }
    }

    static int n, m, s, e;
    static int[] visited;          // visited[i] = 출발점에서 i까지의 최단거리
    static ArrayList<Node>[] al;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine()); // 도시 수
        m = Integer.parseInt(br.readLine()); // 버스 수
        visited = new int[n + 1];
        al = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            al[i] = new ArrayList();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x    = Integer.parseInt(st.nextToken());
            int y    = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());
            al[x].add(new Node(y, dist)); // x → y, 비용 dist (단방향)
        }

        st = new StringTokenizer(br.readLine());
        s = Integer.parseInt(st.nextToken()); // 출발 도시
        e = Integer.parseInt(st.nextToken()); // 도착 도시

        Arrays.fill(visited, Integer.MAX_VALUE); // 모든 거리 무한대로 초기화

        dijkstra(s);

        System.out.println(visited[e]); // 출발 → 도착 최단거리 출력
    }

    static void dijkstra(int idx) {
        // 최소 힙: dist가 작은 노드부터 꺼냄
        Queue<Node> q = new PriorityQueue<>(Comparator.comparingInt(o -> o.dist));
        q.add(new Node(idx, 0));
        visited[idx] = 0; // 출발점 거리 0

        while (!q.isEmpty()) {
            Node now = q.poll();

            // 핵심 최적화: 꺼낸 노드의 dist가 이미 기록된 최단거리보다 크면 스킵
            // → 큐에 같은 노드가 여러 번 들어갈 수 있는데, 이미 더 짧은 경로로 처리된 경우
            if (visited[now.idx] < now.dist) continue;

            for (Node next : al[now.idx]) {
                // 현재 노드를 거쳐서 next로 가는 비용
                int cost = visited[now.idx] + next.dist;

                // 기존에 기록된 next까지의 거리보다 크거나 같으면 갱신 불필요
                if (visited[next.idx] <= cost) continue;

                // 더 짧은 경로 발견 → 갱신 후 큐에 추가
                visited[next.idx] = cost;
                q.add(new Node(next.idx, cost));
            }
        }
    }
}