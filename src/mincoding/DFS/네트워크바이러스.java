package src.mincoding.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 네트워크바이러스 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N;
    static int M;
    static int[][] mat;
    static int[] visited;
    static int cnt = 0;

    static void dfs(int node) {
        for(int i = 1; i <= N; i++) {
            if(mat[node][i] == 0)
                continue;
            if(visited[i] == 1)
                continue;
            visited[i] = 1;
            dfs(i);
            cnt++;
        }
    }

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        mat = new int[N+1][N+1];
        visited = new int[N+1];
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            mat[from][to] = 1;
            mat[to][from] = 1;
        }
        visited[1] = 1;
        dfs(1);
        System.out.println(cnt);
    }
}