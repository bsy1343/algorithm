import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int test_case = 0; test_case < t; test_case++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] arr = new int[n+1];
            int[] arr_done = new int[n+1];
            int[] indeg = new int[n+1];
            ArrayList<Integer>[] adj = new ArrayList[n+1];

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                adj[i] = new ArrayList();
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 1; i <= k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                adj[x].add(y);
                // indegree 계산하기
                indeg[y]++;
            }
            // 도착지점
            int end = Integer.parseInt(br.readLine());

            Queue<Integer> q = new LinkedList();
            // 제일 앞에 "정렬될 수 있는" 정점 찾기
            for (int i = 1; i <= n; i++) {
                if (indeg[i] == 0) {
                    q.add(i);
                    arr_done[i] = arr[i];
                }
            }
            // 위상 정렬 순서대로 T_done 계산을 함께 해주기
            while(!q.isEmpty()) {
                int x = q.poll();
                for (int y : adj[x]) {
                    indeg[y]--;
                    if (indeg[y] == 0) q.add(y);
                    // arr_done에 해당 거리의 최대값 갱신
                    arr_done[y] = Math.max(arr_done[y], arr_done[x] + arr[y]);
                }
            }

            System.out.println(arr_done[end]);
        }
        
    }
}