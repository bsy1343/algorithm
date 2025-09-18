import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        
        long answer = 0;
        long min = 1;
        long max = (long) times[times.length - 1] * n;
        
        while(min <= max) {
            long mid = (min + max) / 2;
            
            if (isCheck(mid, n, times)) {
                answer = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return answer;
    }
    
    static boolean isCheck(long curTime, int n, int[] times) {
        long total = 0;
        
        for (int time : times) {
            total += curTime/time;
            if (total >= n) return true;
        }
        return false;
    }
}