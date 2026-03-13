import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[] indeg;          // 진입차수: 각 노드를 가리키는 간선의 수
    static ArrayList<Integer>[] al;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 학생 수
        m = Integer.parseInt(st.nextToken()); // 키 비교 횟수
        indeg = new int[n + 1];
        al = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            al[i] = new ArrayList();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            al[x].add(y);   // x 앞에 y가 서야 함: x → y
            indeg[y]++;     // y는 x에 의존하므로 진입차수 증가
        }
        bfs(); // 위상정렬
        System.out.println(sb.toString());
    }

    static void bfs() {
        Queue<Integer> q = new LinkedList();

        // 진입차수가 0인 노드 = 아무도 앞에 세울 필요 없는 학생 → 시작점
        for (int i = 1; i <= n; i++) {
            if (indeg[i] == 0) q.add(i);
        }

        while (!q.isEmpty()) {
            int x = q.poll();
            sb.append(x).append(" ");

            for (int y : al[x]) {
                indeg[y]--;             // x를 줄 세웠으니 y의 의존성 하나 제거
                if (indeg[y] == 0) q.add(y); // 의존성이 모두 해소된 학생은 줄 설 수 있음
            }
        }
    }
}