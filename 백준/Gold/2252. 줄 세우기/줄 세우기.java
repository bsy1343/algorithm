import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] indeg = new int[n+1];
        ArrayList<Integer>[] adj = new ArrayList[n+1];
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) adj[i] = new ArrayList();

        for (int i = 1; i <=m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj[x].add(y);
            // indegree 계산하기
            indeg[y]++;
        }

        Queue<Integer> q = new LinkedList();
        // 제일 앞에 "정렬될 수 있는" 정점 찾기
        for (int i = 1; i <= n; i++) {
            if (indeg[i] == 0) q.add(i);
        }

        // 정렬될 수 있는 정점이 있다면?
        // 1. 정렬 결과에 추가하기
        // 2. 정점과 연결된 간선 제거하기
        // 3. 새롭게 "정렬 될 수 있는" 정점 Queue에 추가하기
        while(!q.isEmpty()) {
            int x = q.poll();
            sb.append(x).append(" ");

            for (int y : adj[x]) {
                indeg[y]--;
                if (indeg[y] == 0) q.add(y);
            }
        }

        System.out.println(sb);
    }
}