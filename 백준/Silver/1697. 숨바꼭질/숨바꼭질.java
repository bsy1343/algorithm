import java.io.*;
import java.util.*;

public class Main {

    // BFS 탐색에 사용할 노드 (위치, 거리)
    static class Node {
        int x, dist;
        Node (int x, int dist) {
            this.x = x;
            this.dist = dist;
        }
    }
    static int n, k;
    static int[] visited; // 방문 여부 체크 (재방문 방지)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 수빈이 위치
        k = Integer.parseInt(st.nextToken()); // 동생 위치
        visited = new int[100001];

        bfs(n, 0);
    }

    static void bfs (int x, int dist) {
        Queue<Node> q = new LinkedList();
        q.add(new Node(x, dist));
        visited[x] = 1;

        while(!q.isEmpty()) {
            Node node = q.poll();
            int nx = node.x;

            // 동생 위치 도달 시 거리 출력 후 종료
            if (nx == k) {
                System.out.println(node.dist);
                return;
            }

            // 이동 가능한 3가지 경우: +1, -1, *2
            int[] directions = {nx + 1, nx - 1, nx * 2};
            for (int i = 0; i < directions.length; i++) {
                int dx = directions[i];

                if (dx < 0 || dx >= 100001) continue; // 범위 초과
                if (visited[dx] != 0) continue;        // 이미 방문

                visited[dx] = 1;
                q.add(new Node(dx, node.dist + 1));
            }
        }
    }
}