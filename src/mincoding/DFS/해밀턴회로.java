package src.mincoding.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 해밀턴회로 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;
    static int[][] MAP;
    static int[] visited;
    static int sum = 0;
    static int cnt = 0;
    static int ans = Integer.MAX_VALUE;

    static void dfs(int node) {

        // 시작 노드로 돌아왔고, 모든 노드를 방문했다면
        if(cnt == n && node == 0) {
            if (sum < ans)
                ans = sum;
        }

        // ** 시작 노드로 돌아와야 하기 때문에, 시작 노드를 visited 체크하지 않고 시작
        for(int i = 0; i < n; i++) {
            if(visited[i] == 1)
                continue;
            if(MAP[node][i] == 0)
                continue;

            // 가지치기
            // 만약 지금 -> 다음 노드까지의 비용이 이미 최소값을 초과한다면 -> 가망성이 없는 루트
            if(sum + MAP[node][i] > ans)
                continue;

            // pre -> 들어가면서 비용 누적, 방문 기록
            sum += MAP[node][i];
            // 방문한 노드 개수 기록
            visited[i] = 1;
            cnt++;

            dfs(i);

            // post -> 나오면서 비용, 방문 기록 해제
            sum -= MAP[node][i];
            visited[i] = 0;
            cnt--;
        }
    }

    public static void main(String[]args) throws IOException {
        n = Integer.parseInt(br.readLine());
        //init
        MAP = new int[n][n];
        visited = new int[n];
        //input
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                MAP[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 원래는 1부터 시작이지만 0부터 시작으로 변경 (1~N -> 0~N-1)
        dfs(0);
        System.out.println(ans);
    }
}