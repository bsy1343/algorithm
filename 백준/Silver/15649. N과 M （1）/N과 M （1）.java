import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[] selected, visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // 출력해야할 자리수만큼
        selected = new int[m];
        visited = new int[n];

        dfs(0);

        System.out.println(sb.toString());
    }

    static void dfs(int index) {
        if (index == m) {
            for (int answer : selected) {
                sb.append(answer).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = 0; i < n; i++) {
                if (visited[i] == 0) {
                    visited[i] = i+1;
                    selected[index] = i+1;
                    dfs(index + 1);
                    // 초기화, 안해도 됨
                    selected[index] = 0;
                    visited[i] = 0;
                }
            }
        }
    }
}