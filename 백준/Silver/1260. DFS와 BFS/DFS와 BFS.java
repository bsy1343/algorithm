import java.io.*;
import java.util.*;

public class Main {

    static int n, m, v;
    static int[] visited;
    static ArrayList<Integer>[] al;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        visited = new int[n + 1];
        al = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            al[i] = new ArrayList();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            al[x].add(y);
            // 입력으로 주어지는 간선은 양방향이다.
            al[y].add(x);
        }

        // 본문 지시: 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문
        for (int i = 1; i <= n; i++) {
            Collections.sort(al[i]);
        }

        dfs(v);

        Arrays.fill(visited, 0);

        sb.append("\n");

        bfs(v);

        System.out.println(sb.toString());
    }

    static void dfs(int x) {
        visited[x] = 1;
        sb.append(x).append(" ");
        for (int y : al[x]) {
            if (visited[y] != 0) continue;
            visited[y] = 1;
            dfs(y);
        }
    }

    static void bfs(int idx) {
        Queue<Integer> q = new LinkedList();
        q.add(idx);
        visited[idx] = 1;

        while(!q.isEmpty()) {
            int x = q.poll();
            sb.append(x).append(" ");
            for (int y : al[x]) {
                if (visited[y] != 0) continue;
                visited[y] = 1;
                q.add(y);
            }

        }
    }
}