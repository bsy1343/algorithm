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

    static int n, m, s, e;
    static int[] visited;
    static ArrayList<Node>[] al;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        visited = new int[n + 1];
        al = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            al[i] = new ArrayList();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());

            al[x].add(new Node(y, dist));
        }
        st = new StringTokenizer(br.readLine());
        s = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        Arrays.fill(visited, Integer.MAX_VALUE);

        bfs(s);

        System.out.println(visited[e]);
    }

    static void bfs(int idx) {
        Queue<Node> q = new LinkedList();
        q.add(new Node(idx, 0));
        visited[idx] = 0;

        while(!q.isEmpty()) {
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