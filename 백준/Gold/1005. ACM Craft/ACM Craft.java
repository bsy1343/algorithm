import java.io.*;
import java.util.*;

public class Main {
    static int t, n, k, w;
    static int[] arr, indeg, result;
    static ArrayList<Integer>[] al;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        t = Integer.parseInt(br.readLine()); // 테스트케이스 개수

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken()); // 건물 개수
            k = Integer.parseInt(st.nextToken()); // 건설 순서 규칙 개수

            arr = new int[n + 1];       // 각 건물의 건설 시간
            result = new int[n + 1];  // 해당 건물까지 걸린 총 최소 시간
            indeg = new int[n + 1];     // 진입 차수 배열
            al = new ArrayList[n + 1];  // 인접 리스트

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                al[i] = new ArrayList<>(); // 각 건물의 연결 리스트 초기화
                arr[i] = Integer.parseInt(st.nextToken()); // 각 건물의 건설 시간 입력
            }

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()); // x 건물
                int y = Integer.parseInt(st.nextToken()); // y 건물
                al[x].add(y); // x → y (x가 완공되어야 y 건설 가능)
                indeg[y]++;   // y의 진입 차수 증가
            }

            w = Integer.parseInt(br.readLine()); // 최종 목표 건물

            bfs(); // 위상 정렬 + dp 수행

            System.out.println(result[w]); // 목표 건물까지의 최소 건설 시간 출력
        }
    }

    static void bfs() {
        Queue<Integer> q = new LinkedList<>();

        // 진입 차수가 0인 건물부터 큐에 넣음 (선행 건물 필요 없음)
        for (int i = 1; i <= n; i++) {
            if (indeg[i] == 0) {
                q.add(i);
                result[i] = arr[i]; // 최초 건물은 자기 건설 시간만 걸림
            }
        }

        // 위상 정렬 시작
        while (!q.isEmpty()) {
            int x = q.poll();

            for (int y : al[x]) {
                // y까지의 최대 건설 시간 갱신 (선행 건물 중 가장 오래 걸린 경로 반영)
                result[y] = Math.max(result[y], result[x] + arr[y]);

                indeg[y]--; // y의 진입 차수 감소
                if (indeg[y] == 0) q.add(y); // 선행 건물 모두 완료되면 큐에 추가
            }
        }
    }
}