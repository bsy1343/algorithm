import java.io.*;
import java.util.*;

public class Main {

    static int n, max, min;
    static int[] num, operator;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        num = new int[n];
        operator = new int[4];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n ; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4 ; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        dfs(0, num[0]);

        System.out.println(max);
        System.out.println(min);
    }
    static void dfs(int idx, int result) {
        if (idx == n - 1) {
            max = Math.max(max, result);
            min = Math.min(min, result);
        } else {
            for (int i = 0; i < 4; i++) {
                if (operator[i] == 0) continue;
                operator[i]--;
                dfs(idx + 1, calc(result, num[idx + 1], i));
                operator[i]++;
            }
        }
    }

    static int calc(int result, int value, int code) {
        if (code == 0) {
            result += value;
        } else if (code == 1) {
            result -= value;
        } else if (code == 2) {
            result *= value;
        } else if (code == 3) {
            result /= value;
        }
        return result;
    }
}
