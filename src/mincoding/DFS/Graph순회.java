package src.mincoding.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Graph순회 {
    // 항상 PS에서 꼭 넣고 시작하는 코드
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st; // <- 특정 기준을 통해 문자열을 자르는 역할

    static int adj[][];
    static int cntNode;
    static int visited[];
    static void func_pre(int now)
    // now에 있다.
    {
        // if(기저조건) <- option

        System.out.print(now + " "); // preorder
        for(int to = cntNode; to >= 1; to--)
        {
            if(adj[now][to] == 0) // now->to로 갈 수 없으면 무시
                continue;
            if(visited[to] == 1)
                continue; // to라는 점을 들렸었다면 무시

            int next = to; // now에서 갈 수 있는 next
            visited[next] = 1; // next로 간다라고 기록

            // now에서 갈 수 있는 next로 가라!
            func_pre(next);
        }
    }

    static void func_post(int now)
    // now에 있다.
    {
        // if(기저조건) <- option

        for(int to = cntNode; to >= 1; to--)
        {
            if(adj[now][to] == 0) // now->to로 갈 수 없으면 무시
                continue;
            if(visited[to] == 1)
                continue; // to라는 점을 들렸었다면 무시

            int next = to; // now에서 갈 수 있는 next
            visited[next] = 1; // next로 간다라고 기록
            // now에서 갈 수 있는 next로 가라!
            func_post(next);
        }
        System.out.print(now + " "); // postorder
    }

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        st = new StringTokenizer(br.readLine());
        cntNode = Integer.parseInt(st.nextToken());
        int cntEdge = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(br.readLine());

        adj = new int[1 + cntNode][1 + cntNode];
        for(int i = 0; i < cntEdge; i++)
        {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            adj[from][to] = 1;
        }
        visited = new int[1 + cntNode];
        visited[s] = 1; // s도 간다고 기록을 하고 s로 가야함
        func_pre(s);
        System.out.println();
        // 모든 visited가 기록되어 있음
        visited = new int[1 + cntNode]; // visited를 비어있는 상태로 다시 시작

        visited[s] = 1; // s도 간다고 기록을 하고 s로 가야함
        func_post(s);

    }
}