import java.io.*;
import java.util.*;

public class Main {
    static int n, m, v;
    static int[] visited;
    static int[][] map;
    static ArrayList<Integer>[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        map = new int[n+1][n+1];
        visited = new int[n+1];
        arr = new ArrayList[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList();
        }

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = 1;
            map[y][x] = 1;

            arr[x].add(y);
            arr[y].add(x);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(arr[i]);
        }

        dfs(v);
        System.out.println();
        Arrays.fill(visited, 0);
        bfs(v);
    }

    static void dfs(int x) {
        visited[x] = 1;

        System.out.print(x + " ");
        // todo: 인접행렬
        for (int y = 1; y <= n; y++) {
            if (visited[y] == 1) continue;
            if (map[x][y] == 0) continue;
            dfs(y);
        }

        // todo: 인접리스트
        /*for (int y : arr[x]) {
            if (visited[y] == 1) continue;
            dfs(y);
        }*/
    }

    static void bfs(int x) {
        Queue<Integer> q = new LinkedList();
        visited[x] = 1;
        q.add(x);
        while (!q.isEmpty()) {
            x = q.poll();
            System.out.print(x + " ");

            // todo: 인접행렬
            for (int y = 1; y <= n; y++) {
                if (visited[y] == 1) continue;
                if (map[x][y] == 0) continue;
                q.add(y);
                visited[y] = 1;
            }

            // todo: 인접리스트
            /*for (int y : arr[x]) {
                if (visited[y] == 1) continue;
                q.add(y);
                visited[y] = 1;
            }*/
        }

    }
}