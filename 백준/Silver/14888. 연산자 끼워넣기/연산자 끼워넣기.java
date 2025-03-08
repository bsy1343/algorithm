import java.util.*;
import java.io.*;

public class Main {
    static int n, min, max;
    static int[] nums, operators;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        nums = new int[n];
        operators = new int[5];


        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            operators[i] = sc.nextInt();
        }

        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        dfs(0, nums[0]);

        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int k, int result) {
        if (k == n-1) {
            min = Math.min(min, result);
            max = Math.max(max, result);
        } else {
            for (int i = 0; i < 4; i++) {
                if (operators[i] > 0) {
                    operators[i]--;
                    dfs(k + 1, calculator(result, nums[k+1], i));
                    operators[i]++;
                }

            }
        }
    }

    static int calculator(int value, int cmd, int operator) {
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