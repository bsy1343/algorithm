import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] dist;
    static final int INF = (int) 1e9;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        dist = new int[n + 1][n + 1];

        // 자기 자신은 0, 그 외는 INF로 초기화
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j) dist[i][j] = INF;
            }
        }

        for (int e = 0; e < m; e++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            // 같은 (a, b) 여러개일 수 있으므로 최소값만 저장
            dist[a][b] = Math.min(dist[a][b], c);
        }

        // 플로이드 워셜: dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])
        // k를 거쳐가는 경로가 더 짧으면 갱신
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sb.append(dist[i][j] == INF ? 0 : dist[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
