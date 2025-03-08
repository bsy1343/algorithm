import java.util.*;
import java.io.*;

public class Main {

    static int[] map;
    static int n, q, answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        q = n;
        map = new int[n];

        dfs(0);

        System.out.print(answer);
    }

    static void dfs(int row) {
        if (row == n) {
            answer++;
        } else {
            for (int col = 0; col < n; col++) {
                if (isAttack(row, col)) {
                    map[row] = col;
                    dfs(row + 1);
                    map[row] = 0;
                }
            }
        }
    }

    static boolean isAttack (int row, int col) {
        for (int i = 0; i < row; i++) {
            // 같은 행인지 검사
            if (map[i] == col) return false;
            // ↘️(우하향) 대각선 검사
            if (row + col ==  i + map[i]) return false;
            // ↖️(좌상향) 대각선 검사
            if (row - col ==  i - map[i]) return false;
            // if (Math.abs(row - i) == Math.abs(col - map[i])) 대각선검사
        }
        return true;
    }
}