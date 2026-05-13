import java.util.*;
import java.io.*;
class Solution {
    static int answer;       // 최대 탐험 던전 수
    static int[] visited;    // 던전 방문 여부 (0: 미방문, 1: 방문)
    static int[][] dungeons; // dungeons[i][0]: 최소 피로도, dungeons[i][1]: 소모 피로도

    public int solution(int k, int[][] dungeons) {
        this.answer = 0;
        this.visited = new int[dungeons.length];
        this.dungeons = dungeons;
        
        dfs(0, k); // 탐험한 던전 수 0개, 초기 피로도 k로 시작
        
        return answer;
    }
    
    static void dfs(int idx, int result) {
        // 현재까지 탐험한 던전 수(idx)와 기존 최대값 비교해서 갱신
        answer = Math.max(idx, answer);
        
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] == 1) continue;          // 이미 방문한 던전 스킵
            if (result < dungeons[i][0]) continue;  // 현재 피로도가 최소 피로도 미달이면 스킵
            
            visited[i] = 1;                                  // 던전 방문 처리
            dfs(idx + 1, result - dungeons[i][1]);           // 다음 던전 탐색, 피로도 차감
            visited[i] = 0;                                  // 백트래킹: 방문 취소
        }
    }
}
