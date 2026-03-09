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

        for (int i =  1; i <= n; i++) {
            al[i] = new ArrayList();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            al[x].add(y);
            al[y].add(x);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(al[i]);
        }

        dfs(v);

        sb.append('\n');

        Arrays.fill(visited, 0);
        bfs(v);

        System.out.println(sb.toString());
    }

    static void dfs(int x) {
        visited[x] = 1;

        sb.append(x).append(" ");
        for (int y : al[x]) {
            if (visited[y] == 1) continue;
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
                if (visited[y] == 1) continue;
                visited[y] = 1;
                q.add(y);
            }
        }
    }
}