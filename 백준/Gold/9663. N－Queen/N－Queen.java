import java.util.*;

public class Main{

    static int n, answer;
    static int[] map;

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        map = new int[n];

        dfs(0);

        System.out.println(answer);
    }

    static void dfs (int row) {
        if (row == n) {
            answer++;
        } else {
            for (int col = 0; col < n; col++) {
                // 다음 체크 할 col의 정합성 체크
                if (!checked(row, col)) continue;
                map[row] = col;
                dfs(row + 1);
                /*
                다음 col에서 바로 덮어쓰기 때문에 초기화 값이 뭐든 상관없음
                checked는 row 이전만 검사하므로 현재 row의 잔여값은 절대 참조 안 됨
                */
                // map[row] = -1;
            }
        }
    }

    static boolean checked(int row, int col) {
        for (int i = 0; i < row; i++ ) {
            // 열 검사
            if (map[i] == col) return false;
            // 대각선 검사
            if (Math.abs(row-i) == Math.abs(map[i] - col)) return false;
        }
        return true;
    }

}
