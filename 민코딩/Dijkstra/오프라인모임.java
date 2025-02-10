package 민코딩.Dijkstra;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 오프라인모임 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) ;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());	// 마을의 수
        int M = Integer.parseInt(st.nextToken());	// 도로의 수
        int P = Integer.parseInt(st.nextToken());	// 학습할 마을번호

        // 입력정보를 저장할 ArrayList
        ArrayList<N3603>[] arr = new ArrayList[N+1];
        // ArrayList와 노드별방문정보 초기화
        for (int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<N3603>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());	// 정점 a
            int b = Integer.parseInt(st.nextToken());	// 정점 b
            int c = Integer.parseInt(st.nextToken());	// a -> b 소요시간

            arr[a].add(new N3603(b, c));
        }

        int INF = Integer.MAX_VALUE;
        // 각 마을에서 출발해서 소요시간을 체크할 2차원배열
        int[][] hap = new int[N+1][N+1];
        // 각 마을에서 출발해서 다른마을을 방문하는 소요시간을 다익스트라로 반복 수행
        for (int i = 1; i <= N; i++) {
            Arrays.fill(hap[i], INF);

            // 다익스트라 처리를 위한 pq와 시작점 추가
            PriorityQueue<N3603> pq = new PriorityQueue<N3603>();
            pq.add(new N3603(i, 0));

            while(!pq.isEmpty()) {
                N3603 node = pq.poll();
                if (hap[i][node.pos] < node.cost) continue;
                hap[i][node.pos] = node.cost;

                for (N3603 next : arr[node.pos]) {
                    if (hap[i][next.pos] > node.cost + next.cost) {
                        pq.add(new N3603(next.pos, node.cost + next.cost));
                    }
                }
            }

        }

        int max = 0;
        // P를 제외하고 다른마을 -> P, P -> 다른마을 중 최대값을 계산, 마을i->마을P 소요시간 + 마을P->마을i 소요시간
        for (int i = 1; i <= N; i++) {
            if (i == P) continue;    				// 마을P 제외
            if (max < hap[i][P] + hap[P][i])		// 마을i->마을P 소요시간 + 마을P->마을i 소요시간
                max = hap[i][P] + hap[P][i];
//    		for (int j = 1; j <= N; j++) {
//				//System.out.print(hap[i][j] + " ");
//			}
//    		System.out.println();
        }

        System.out.println(max);

/*
입력1
4 8 2
1 2 4
1 3 2
1 4 7
2 1 1
2 3 5
3 1 2
3 4 4
4 2 3

출력
10
 */

    }

    static class N3603 implements Comparable<N3603>{
        int pos, cost;
        public N3603(int pos, int cost) {
            this.pos = pos;
            this.cost = cost;
        }

        @Override
        public int compareTo(N3603 o) {
            // TODO Auto-generated method stub
            return this.cost - o.cost;
        }
    }

}