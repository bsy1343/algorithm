package 민코딩.UnionFind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 순환회로검사 {
    // 항상 PS에서 꼭 넣고 시작하는 코드
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st; // <- 특정 기준을 통해 문자열을 자르는 역할

    static int parent[];

    static int Find(int a) {
        if(a == parent[a])
            return a;
        parent[a] = Find(parent[a]);
        return parent[a];
    }

    static void Union(int a, int b) {
        int pa = Find(a);
        int pb = Find(b);
        parent[pa] = pb;
    }

    public static void main(String[] args) throws IOException {

        int cntNode = Integer.parseInt(br.readLine());

        int adj[][] = new int[cntNode][cntNode];

        for(int i = 0; i < cntNode; i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < cntNode; j++)
            {
                adj[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // Union-Find를 위한 전처리
        parent = new int[cntNode];
        for(int i = 0; i < cntNode; i++)
            parent[i] = i;

        int flag = 0;
        for(int from = 0; from < cntNode; from++)
        {
            for(int to = 0; to < from; to++)
            {
                if(adj[from][to] == 0)
                    continue; // from -> to로 갈 수 없으면 무시

                if(Find(from) == Find(to)) // <- cycle이 발생할 예정
                    flag = 1; // 우회로가 만들어져 cycle이 생길 것이라고 기록
                Union(from, to);
            }
        }
        if(flag == 1)
            System.out.println("WARNING");
        else
            System.out.println("STABLE");


    }
}