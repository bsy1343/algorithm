import java.io.*;
import java.util.*;

public class Main {

    static class Node {
        int x, s;
        Node (int x, int s) {
            this.x = x;
            this.s = s;
        }
    }
    static int n, k;
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
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

            if (nx == k) {
                System.out.println(node.s);
            }

            int[] directions = {nx + 1, nx - 1, nx * 2};
            for (int i = 0; i < directions.length; i++) {
                int dx = directions[i];

                if (dx < 0 || dx >= 100001) continue;
                if (visited[dx] != 0) continue;

                visited[dx] = 1;
                q.add(new Node(dx, node.s + 1));
            }
        }
    }
}