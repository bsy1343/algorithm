import java.util.*;

public class Main {
    static int n, s, answer;
    static int[] nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();

        nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // S = 0인 경우 빈 부분수열 제외
        answer = 0;
        if (s == 0) answer--;
        dfs(0, 0);

        System.out.println(answer);
    }

    static void dfs(int index, int result) {
        if (index == n) {
            if (result == s) answer++;
        } else {
            dfs(index + 1, result + nums[index]);
            // 부분수열: 원래 배열에서 일부 요소를 제거할 수 있지만, 남은 요소들의 상대적 순서는 유지해야 합니다.
            // 연속부분수열: 원래 배열에서 연속된 요소들만 포함한 것입니다.
            dfs(index + 1, result);
        }
    }
}