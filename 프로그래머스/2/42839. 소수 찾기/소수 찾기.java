import java.util.*;
import java.io.*;

class Solution {
    // 중복 제거를 위한 HashSet (같은 숫자가 여러 번 만들어져도 한 번만 저장됨)
    static HashSet<Integer> hs = new HashSet();
    // 순열 생성을 위한 방문 체크 배열
    static int[] visited;
    // 입력받은 숫자 문자열을 문자 배열로 저장
    static char[] arr;

    public int solution(String numbers) {
        arr = numbers.toCharArray();          // "17" → ['1','7']
        visited = new int[arr.length];       // 각 자리 숫자 사용 여부

        dfs(0, "");                           // DFS 시작 (현재 깊이 0, 현재 문자열 "")

        int answer = 0;
        // HashSet에 모아둔 숫자들 중 소수 개수 세기
        for (int num : hs) {
            if (isPrime(num)) answer++;
        }

        return answer; // 최종 소수 개수 반환
    }

    // 백트래킹(DFS)으로 가능한 모든 숫자 조합 생성
    static void dfs(int idx, String result) {
        // 현재 문자열이 비어있지 않다면 정수로 변환해 Set에 저장
        if (!result.equals("")) {
            hs.add(Integer.parseInt(result));
        }

        // 모든 자리를 다 썼으면 리턴
        if (idx == arr.length) return;

        // 아직 쓰지 않은 숫자 자리 하나 선택
        for (int i = 0; i < arr.length; i++) {
            if (visited[i] != 0) continue;              // 이미 사용한 자리면 건너뜀
            visited[i] = 1;                     // 자리 사용 표시
            dfs(idx + 1, result + arr[i]);      // 다음 자리 탐색 (문자 추가)
            visited[i] = 0;                    // 사용 해제 (백트래킹)
        }
    }

    // 소수 판별 함수
    static boolean isPrime(int n) {
        if (n < 2) return false;         // 0, 1은 소수 아님
        if (n == 2) return true;         // 2는 소수
        if (n % 2 == 0) return false;    // 짝수는 소수 아님 (2 제외)

        // 3부터 √n까지 홀수로 나누어보며 체크
        for (int i = 3; i * i <= n; i += 2) {
            // 나누어떨어지면 소수 아님
            if (n % i == 0) return false;
        }
        return true; // 위 조건 통과하면 소수
    }
}
