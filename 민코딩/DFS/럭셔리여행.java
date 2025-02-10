package 민코딩.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 럭셔리여행 {
    // 항상 PS에서 꼭 넣고 시작하는 코드
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st; // <- 특정 기준을 통해 문자열을 자르는 역할
    static int cntNode;
    static int adj[][];
    static int e;
    static int visited[];
    // index : node번호, value : 해당 점을 들렸는가?\

    static int cost = 0; // 현재 경로상 비용

    // tip : 실제 내가 어떤 경로로 오고 있는지 보고 싶으실때(디버깅에 용이)
    static ArrayList<Integer> path = new ArrayList<>();

    static int MaxCost = -1;
    static int MinCost = 2134567890;

    static void dfs(int now) {
        // now라는 점에 있다.
        // --------- 기저조건
        if(now == e) {
            if(cost > MaxCost) MaxCost = cost;
            if(cost < MinCost) MinCost = cost;
            return;
        }

        for(int to = 0; to < cntNode; to++)
        {
            // -------------- 판별
            if(adj[now][to] == 0)
                continue; // now->to로 갈 수 없으면 무시
            if(visited[to] == 1)
                continue; // to라는 점은 앞에서 들렸던 점이다.

            //now->to로 갈 수 있다.

            // -------------- 계산 및 처리, 기록
            // 기록'만'으로 진행 : 갈 수 있는 모든 점을 딱 1번씩만 들려봄
            int next = to;
            visited[next] = 1;
            path.add(next); // next가 경로에 추가됐다.
            cost += adj[now][next]; // now->next로 가는 비용 추가

            // -------------- 실제로 다음으로 가라!
            dfs(next); // 현재 now -> next로 가는 방법에 대한 경우

            // -------------- 처리 복구
            // now->next로 가는 방법 말고 다른 node->next갈 수도 있으니 기록을 삭제
            // 기록삭제 : dfs에서는 '다양한경로'
            visited[next] = 0;
            path.remove(path.size() - 1); // 경로의 마지막 점(next) 삭제
            cost -= adj[now][next]; // now->next로 가는게 취소됐으니 비용도 복구
        }
    }

    public static void main(String[] args) throws IOException {
        cntNode = Integer.parseInt(br.readLine());
        adj = new int[cntNode][cntNode];
        for(int from = 0; from < cntNode; from++)
        {
            st = new StringTokenizer(br.readLine());
            for(int to = 0; to < cntNode; to++)
                adj[from][to] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        visited = new int[cntNode];
        visited[s] = 1;
        path.add(s);
        dfs(s);
        System.out.println(MinCost);
        System.out.println(MaxCost);
    }
}