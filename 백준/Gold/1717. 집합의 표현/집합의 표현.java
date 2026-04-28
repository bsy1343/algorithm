import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[] parent;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        parent = new int[n + 1];
        // 처음에는 각자 자기 자신이 루트
        for (int i = 0; i <= n; i++) parent[i] = i;

        for (int q = 0; q < m; q++) {
            st = new StringTokenizer(br.readLine());
            int op = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // op == 0: 합집합
            // op == 1: 같은 집합인지 확인
            if (op == 0) {
                union(a, b);
            } else {
                sb.append(find(a) == find(b) ? "YES" : "NO").append("\n");
            }
        }

        System.out.println(sb);
    }

    static int find(int x) {
        // 경로 압축
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    static void union(int a, int b) {
        int ra = find(a);
        int rb = find(b);
        if (ra != rb) parent[ra] = rb;
    }
}
