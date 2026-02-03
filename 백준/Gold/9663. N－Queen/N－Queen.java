import java.util.*;

public class Main {

    static int n, answer;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n];

        dfs(0);

        System.out.println(answer);
    }

    static void dfs(int row) {
        if (row == n) {
            answer++;
        } else {
            for (int col = 0; col < n; col++) {
                if (isAttack(row, col)) {
                    arr[row] = col;
                    dfs(row + 1);
                    arr[row] = 0;
                }
            }
        }
    }

    static boolean isAttack(int row, int col) {
        for (int i = 0; i < row; i++) {
            // 열 확인
            if (arr[i] == col) return false;

            // 대각선 확인
            if (row + col == i + arr[i]) return false;

            // 대각선 확인
            if (row - col == i - arr[i]) return false;
        }
        return true;
    }
}