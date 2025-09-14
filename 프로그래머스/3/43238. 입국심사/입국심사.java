import java.io.*;
import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        
        long minTime = 1;
        long maxTime = (long) times[times.length - 1] * n; // 최악의 시간
        long answer = maxTime;  // 가능한 값 중 최소를 찾음
        
        while (minTime <= maxTime) {
            // 기준 시간을 검색 (이분탐색)
            long mid = (minTime + maxTime) / 2;
            
            // 현재 시간에 심사 가능한 사람 수 체크
            if (canFinishInTime(mid, n, times)) {
                answer = mid;       // 가능하면 답 업데이트
                maxTime = mid - 1;  // 더 짧은 시간 시도
            } else {
                minTime = mid + 1;  // 시간 늘리기
            }
        }
        
        return answer;
    }
    
    private boolean canFinishInTime(long curTime, int n, int[] times) {
        long totalPeople = 0;
        
        // curTime 시간 동안 처리 가능한 총 인원
        for (int t : times) {
            totalPeople += curTime / t;
            
            if (totalPeople >= n) return true; // 이미 충분
        }
        
        return false;
    }
}