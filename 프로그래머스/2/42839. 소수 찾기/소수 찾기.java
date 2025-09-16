import java.util.*;

class Solution {
    // 중복 제거를 위해 Set 사용
    static HashSet<Integer> numbers = new HashSet<>();
    // 순열 생성 시 방문 체크 배열
    static boolean[] used;

    public int solution(String numbersStr) {
        char[] arr = numbersStr.toCharArray(); // 입력 문자열을 문자 배열로 변환
        used = new boolean[arr.length];        // 각 자리 숫자 사용 여부 체크

        dfs(arr, "", 0);  // 백트래킹 시작 (현재까지 만든 수는 "", 깊이는 0)

        int count = 0;
        // 만들어진 모든 수 중에서 소수 판별
        for (int num : numbers) {
            if (isPrime(num)) count++;
        }
        return count; // 소수 개수 반환
    }

    // 순열(조합) DFS 탐색
    private void dfs(char[] arr, String current, int depth) {
        // current가 비어있지 않으면 정수로 변환하여 Set에 저장
        if (!current.equals("")) {
            numbers.add(Integer.parseInt(current));
        }
        // 모든 자리를 다 써봤으면 종료
        if (depth == arr.length) return;

        // 아직 사용하지 않은 자리 숫자를 하나씩 선택
        for (int i = 0; i < arr.length; i++) {
            if (used[i]) continue; // 이미 사용한 자리면 건너뜀
            used[i] = true;        // 현재 자리 사용 처리
            dfs(arr, current + arr[i], depth + 1); // 다음 자리로 재귀
            used[i] = false;       // 사용 해제 (백트래킹)
        }
    }

    // 소수 판별 함수
    private boolean isPrime(int n) {
        if (n < 2) return false;      // 0, 1은 소수 아님
        if (n == 2) return true;      // 2는 소수
        if (n % 2 == 0) return false; // 짝수는 소수 아님
        // 3부터 √n까지 홀수로 나눠보기
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false; // 나누어떨어지면 합성수
        }
        return true; // 위 조건 다 통과하면 소수
    }
}