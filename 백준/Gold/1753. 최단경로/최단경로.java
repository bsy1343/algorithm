import java.io.*;
import java.util.*;

public class Main {

    // 그래프의 노드: 인접한 정점 번호(idx)와 해당 간선의 가중치(dist)
    static class Node {
        int idx, dist;
        Node (int idx, int dist) {
            this.idx = idx;
            this.dist = dist;
        }
    }

    static int v, e, k;
    static int[] visited;           // visited[i] = 출발점 k에서 i까지의 현재 최단거리
    static ArrayList<Node>[] al;    // al[i] = i에서 출발하는 간선 목록

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        v = Integer.parseInt(st.nextToken()); // 정점 수
        e = Integer.parseInt(st.nextToken()); // 간선 수
        k = Integer.parseInt(br.readLine());  // 출발 정점

        visited = new int[v + 1];
        al = new ArrayList[v + 1];

        for (int i = 1; i <= v; i++) {
            al[i] = new ArrayList();
            visited[i] = Integer.MAX_VALUE; // 초기 최단거리는 무한대로 설정
        }

        // 방향 그래프 입력 (x → y, 가중치 dist)
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());

            al[x].add(new Node(y, dist));
        }

        dijkstra(k);

        // 도달 불가능한 정점은 INF, 가능하면 최단거리 출력
        for (int i = 1; i <= v; i++) {
            System.out.println(visited[i] == Integer.MAX_VALUE ? "INF" : visited[i]);
        }
    }

    static void dijkstra(int idx) {
        // 최소 힙: dist가 작은 노드부터 꺼냄 (항상 현재 가장 짧은 경로를 먼저 처리)
        Queue<Node> q = new PriorityQueue<>(Comparator.comparing(o -> o.dist));

        q.add(new Node(idx, 0));
        visited[idx] = 0; // 출발점 거리 = 0

        while (!q.isEmpty()) {
            Node now = q.poll();

            // ★ 핵심 skip 조건 ★
            // visited[now.idx] < now.dist 의미:
            //   "이 노드는 큐에 들어간 이후, 이미 더 짧은 경로로 업데이트됐다"
            //   → 지금 꺼낸 항목은 outdated(구식)이므로 처리할 필요 없음 → skip
            //
            // 왜 이 조건이어야 하는가?
            //   큐에 같은 노드가 여러 번 들어갈 수 있음
            //   예) 노드2에 대해 (2, 10) 먼저 추가, 이후 더 짧은 (2, 5) 추가
            //       visited[2] = 5로 갱신된 상태
            //       나중에 (2, 10)이 꺼내지면 → visited[2](5) < now.dist(10) → skip
            if (visited[now.idx] < now.dist) continue;

            for (Node next : al[now.idx]) {
                // 현재 노드를 경유했을 때 next까지의 비용
                // now.dist 대신 visited[now.idx]를 쓰는 이유:
                //   위 skip 조건 통과 시 visited[now.idx] == now.dist가 보장되므로 동일하지만
                //   visited를 쓰는 게 "현재 확정된 최단거리"를 명확히 표현함
                int cost = visited[now.idx] + next.dist;

                // 기존 최단거리보다 크거나 같으면 업데이트 불필요
                if (visited[next.idx] <= cost) continue;

                // 더 짧은 경로 발견 → 갱신 후 큐에 추가
                visited[next.idx] = cost;
                q.add(new Node(next.idx, cost));
            }
        }
    }
}