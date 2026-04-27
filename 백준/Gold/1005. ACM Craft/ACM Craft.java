import java.io.*;
import java.util.*;

public class Main {
    static int t, n, k, w;
    static int[] arr;    // 각 건물의 건설 시간
    static int[] indeg;  // 진입차수: 선행되어야 할 건물 수
    static int[] result; // 해당 건물 완공까지의 최소 총 시간
    static ArrayList<Integer>[] al;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        t = Integer.parseInt(st.nextToken()); // 테스트케이스 수

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken()); // 건물 수
            k = Integer.parseInt(st.nextToken()); // 건설 순서 규칙 수

            arr    = new int[n + 1];
            indeg  = new int[n + 1];
            result = new int[n + 1];
            al     = new ArrayList[n + 1];

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                al[i]  = new ArrayList<>();
                arr[i] = Integer.parseInt(st.nextToken()); // 건물별 건설 시간 입력
            }

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                al[x].add(y); // x 완공 후 y 건설 가능: x → y
                indeg[y]++;   // y는 x에 의존 → 진입차수 증가
            }

            w = Integer.parseInt(br.readLine()); // 목표 건물

            bfs();

            System.out.println(result[w]); // 목표 건물 완공까지 걸리는 최소 시간
        }
    }

    static void bfs() {
        Queue<Integer> q = new LinkedList<>();

        // 선행 건물이 없는 건물(indeg==0)은 바로 착공 가능 → 시작점
        // 시작점이 여러 개일 수 있으므로 모두 큐에 추가
        for (int i = 1; i <= n; i++) {
            if (indeg[i] == 0) {
                q.add(i);
                result[i] = arr[i]; // 선행 건물 없음 → 자기 건설 시간이 곧 완공 시간
            }
        }

        while (!q.isEmpty()) {
            int x = q.poll();

            for (int y : al[x]) {
                // x 완공 후 y를 지을 때의 총 시간 vs 기존에 기록된 y의 최대 시간 중 더 큰 값 선택
                // 선행 건물이 여러 개라면 가장 늦게 완공되는 경로가 y의 착공 시점을 결정하기 때문
                result[y] = Math.max(result[y], result[x] + arr[y]);

                indeg[y]--; // 선행 건물 x가 완공됐으므로 y의 의존성 하나 제거
                if (indeg[y] == 0) q.add(y); // 모든 선행 건물 완공 → y 착공 가능, 이 시점에 result[y] 확정
            }
        }
    }
}
