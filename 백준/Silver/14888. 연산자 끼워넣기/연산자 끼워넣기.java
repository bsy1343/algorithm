import java.io.*;
import java.util.*;

public class Main {

    static int n, max, min;
    static int[] num, operator;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        num = new int[n + 1];
        operator = new int[5];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        dfs(1, num[1]);

        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int idx, int result) {
        if (idx >= n) {
            max = Math.max(max, result);
            min = Math.min(min, result);
        } else {
            for (int i = 1; i <= 4; i++) {
                if (operator[i] == 0) continue;
                operator[i]--;
                dfs(idx + 1, calc(result, num[idx+1], i));
                operator[i]++;
            }
        }
    }

    static int calc(int result, int value, int code) {
        if (code == 1) {
            result += value;
        } else if (code == 2) {
            result -= value;
        } else if (code == 3) {
            result *= value;
        } else if (code == 4) {
            result /= value;
        }
        return result;
    }
}