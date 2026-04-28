import java.io.*;
import java.util.*;

public class Main {

    static int n, m, sr, sc, sd, answer;
    static int[][] map;
    // 0:북, 1:동, 2:남, 3:서
    static int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        sr = Integer.parseInt(st.nextToken());
        sc = Integer.parseInt(st.nextToken());
        sd = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        simulate();

        System.out.println(answer);
    }

    static void simulate() {
        int r = sr, c = sc, d = sd;
        answer = 0;

        while (true) {
            // 1. 현재 칸이 청소 안 됐으면 청소
            if (map[r][c] == 0) {
                map[r][c] = 2; // 청소됨 표시
                answer++;
            }

            // 2. 주변 4칸 중 청소 안 한 빈 칸 찾기 (왼쪽으로 회전하며 탐색)
            boolean found = false;
            for (int i = 0; i < 4; i++) {
                d = (d + 3) % 4; // 왼쪽으로 회전
                int nr = r + directions[d][0];
                int nc = c + directions[d][1];

                if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                if (map[nr][nc] == 0) {
                    r = nr;
                    c = nc;
                    found = true;
                    break;
                }
            }

            // 3. 4방향 모두 청소 끝 또는 벽이면 후진 시도
            if (!found) {
                int back = (d + 2) % 4;
                int nr = r + directions[back][0];
                int nc = c + directions[back][1];

                // 후진할 곳이 벽이면 작동 종료
                if (nr < 0 || nr >= n || nc < 0 || nc >= m || map[nr][nc] == 1) break;

                r = nr;
                c = nc;
                // 방향 d는 그대로 유지 (후진만 함)
            }
        }
    }
}
