import java.io.*;
import java.util.*;

public class Main {

    static int n, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    static int[] arr, operator;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        operator = new int[4];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, arr[0]);

        System.out.println(max);
        System.out.println(min);
    }

    static void dfs (int index, int result) {
        if (index == n-1) {
            min = Math.min(min, result);
            max = Math.max(max, result);
        } else {
            for (int i = 0; i < 4; i++) {
                if (operator[i] > 0) {
                    operator[i]--;
                    dfs(index + 1, calc(result, arr[index+1], i));
                    operator[i]++;
                }
            }
        }
    }

    static int calc(int value, int cmd, int operator) {
        if (operator == 0) {
            value += cmd;
        } else if (operator == 1) {
            value -= cmd;
        } else if (operator == 2) {
            value *= cmd;
        } else if (operator == 3) {
            value /= cmd;
        }
        return value;
    }
}