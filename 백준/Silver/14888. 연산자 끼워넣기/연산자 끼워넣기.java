import java.io.*;
import java.util.*;

public class Main {

    static int n, min, max;
    static int[] num, operator;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        num = new int[n];
        operator = new int[4];

        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, num[0]);

        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int idx, int result) {
        if (idx == n-1) {
            min = Math.min(min, result);
            max = Math.max(max, result);
        } else {
            for (int i = 0; i < 4; i++) {
                if (operator[i] == 0) continue;
                operator[i]--;
                dfs(idx+1, calc(result, i, num[idx+1]));
                operator[i]++;
            }
        }
    }

    static int calc(int result, int idx , int val) {
        if (idx == 0) {
            result += val;
        } else if (idx == 1) {
            result -= val;
        } else if (idx == 2) {
            result *= val;
        } else if (idx == 3) {
            result /= val;
        }
        return result;
    }
}