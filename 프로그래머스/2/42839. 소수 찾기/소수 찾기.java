import java.io.*;
import java.util.*;

class Solution {
    static char[] arr;        // 입력 문자열을 문자 배열로 저장
    static int[] visited;   // 각 문자 사용 여부 (0: 미사용, 1: 사용중)
    static HashSet<Integer> hs = new HashSet(); // 만들 수 있는 모든 숫자 저장 (중복 제거)
    
    public int solution(String numbers) {
        arr = numbers.toCharArray();      // "011" → ['0','1','1']
        visited = new int[arr.length];    // 방문 배열 초기화
        
        dfs(0, "");  // DFS 시작
        
        // HashSet에 모인 숫자들 중 소수 개수 카운트
        int answer = 0;
        for (int num : hs) {
            if (isChecked(num)) answer++;
        }
        
        return answer;
    }
    
    // idx: 현재 뽑은 자릿수, result: 현재까지 만든 숫자 문자열
    static void dfs(int idx, String result) {
        // 빈 문자열이 아니면 숫자로 변환해서 HashSet에 추가 (중복 자동 제거)
        if (!"".equals(result)) hs.add(Integer.valueOf(result));
        
        // 모든 자리를 다 사용했으면 종료
        if (idx == arr.length) {
            return;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (visited[i] == 1) continue;  // 이미 사용한 문자는 스킵
                
                visited[i] = 1;                      // 사용 표시
                dfs(idx + 1, result + arr[i]);          // 다음 자리 탐색
                visited[i] = 0;                      // 백트래킹 (사용 해제)
            }   
        }
    }
    
    // 소수 판별: val이 소수면 true, 아니면 false
    static boolean isChecked(int val) {
        if (val < 2) return false;  // 0, 1은 소수 아님
        
        // 2부터 √val 까지만 나눠보면 충분 (약수는 √val 기준으로 쌍으로 존재)
        for (int i = 2; i <= Math.sqrt(val); i++) {
            if (val % i == 0) return false;  // 나눠지면 소수 아님
        }
        return true;  // 끝까지 안 나눠지면 소수
    }
}