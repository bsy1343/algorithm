import java.io.*;
import java.util.*;

public class Main {
    static int n, m, v;
    static int[] visited;
    static ArrayList<Integer>[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        visited = new int[n + 1];
        arr = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 양방향
            arr[x].add(y);
            arr[y].add(x);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(arr[i]);
        }

        dfs(v);

        System.out.println();
        // 초기화
        Arrays.fill(visited, 0);

        bfs(v);
    }

    static void dfs(int x) {
        visited[x] = 1;
        System.out.print(x + " ");

        for (int y : arr[x]) {
            if (visited[y] == 1) continue;
            dfs(y);
        }
    }

    static void bfs(int x) {
        Queue<Integer> q = new LinkedList();
        q.add(x);
        visited[x] = 1;

        while(!q.isEmpty()) {
            x = q.poll();
            System.out.print(x + " ");

            for (int y : arr[x]) {
                if (visited[y] == 1) continue;
                visited[y] = 1;
                q.add(y);
            }
        }
    }
}