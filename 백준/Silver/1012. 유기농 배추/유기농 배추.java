import java.io.*;
import java.util.*;

public class Main {

    static class Node {
        int x, y;
        Node (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int t, n, m, k, answer;
    static int[][] visited, map;
    static int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static ArrayList<Node> al;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        t = Integer.parseInt(br.readLine());

        for (int test_case = 0; test_case < t; test_case++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            visited = new int[n][m];
            map = new int[n][m];
            answer = 0;
            al = new ArrayList();

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
                al.add(new Node(x, y));
            }

            for (Node node : al) {
                if (visited[node.x][node.y] != 0) continue;

                dfs(node.x, node.y);
                answer++;
            }

            System.out.println(answer);
        }
    }

    static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList();
        q.add(new Node(x, y));
        visited[x][y] = 1;

        while(!q.isEmpty()) {
            Node node = q.poll();

            for (int i = 0; i < direction.length; i++) {
                int dx = node.x + direction[i][0];
                int dy = node.y + direction[i][1];

                if (dx < 0 || dy < 0 || dx >= n || dy >= m) continue;
                if (visited[dx][dy] != 0) continue;
                if (map[dx][dy] != 1) continue;
                q.add(new Node(dx, dy));
                visited[dx][dy] = 1;
            }
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = 1;
        for (int i = 0; i < direction.length; i++) {
            int dx = x + direction[i][0];
            int dy = y + direction[i][1];

            if (dx < 0 || dy < 0 || dx >= n || dy >= m) continue;
            if (visited[dx][dy] != 0) continue;
            if (map[dx][dy] != 1) continue;

            dfs(dx, dy);
        }
    }
}