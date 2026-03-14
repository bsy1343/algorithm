import java.io.*;
import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        
        Arrays.sort(times);
        long l = 1;
        long r = (long) times[times.length - 1] * n;
        
        while(l <= r) {
            long mid = (l + r) / 2;
            if (isCheck(mid, n, times)) {
                answer = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return answer;
    }
    
    static boolean isCheck(long target, int n, int[] times) {
        long total = 0;
        for (int time : times) {
            total += target / time;
            if (total >= n) return true;
        }
        return false;
    }
}