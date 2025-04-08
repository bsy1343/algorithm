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

        if (s == 0) answer--;
        dfs(1, 0);

        System.out.println(answer);
    }

    static void dfs(int idx, int result) {
        if (n + 1 == idx) {
            if (result == s) answer++;
        } else {
            dfs(idx + 1, result + arr[idx]);
            dfs(idx + 1, result);
        }
    }
}