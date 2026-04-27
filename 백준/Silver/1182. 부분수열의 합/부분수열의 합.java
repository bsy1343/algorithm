import java.io.*;
import java.util.*;

public class Main {
    static int n, s, answer;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // s가 0인 경우 부분수열의 모든 합을 구하지 않았을떄 0이기 때문에 그 경우의 수를 없앤다.
        if (s == 0) answer--;

        dfs(1, 0);

        System.out.println(answer);
    }

    static void dfs(int idx, int value) {
        if (idx > n) {
            if (value == s) {
                answer++;
            }
        } else {
            dfs(idx + 1, value + arr[idx]);
            dfs(idx + 1, value);
        }
    }
}