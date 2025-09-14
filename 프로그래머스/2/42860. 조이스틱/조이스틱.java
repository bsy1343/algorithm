import java.util.*;

class Solution {
    public int solution(String name) {
        int n = name.length();
        int answer = 0;

        // 1. 상/하 이동 횟수
        for (int i = 0; i < n; i++) {
            char c = name.charAt(i);
            answer += Math.min(c - 'A', 'Z' - c + 1);
        }

        // 2. 좌/우 이동 최솟값 찾기
        int move = n - 1; // 기본적으로 오른쪽으로 쭉 가는 경우
        for (int i = 0; i < n; i++) {
            int next = i + 1;
            // 연속된 'A' 구간 찾기
            while (next < n && name.charAt(next) == 'A') {
                next++;
            }
            // i까지 갔다가 뒤로 돌아가는 경우 vs 처음부터 뒤로 갔다 오는 경우
            move = Math.min(move, i + (n - next) + Math.min(i, n - next));
        }

        answer += move;
        return answer;
    }
}