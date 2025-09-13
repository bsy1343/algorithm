import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for (int i = 0; i < prices.length; i++) {
            answer[i] = count(i, prices);
        }
        
        return answer;
    }
    
    static int count(int idx, int[] prices) {
        int cnt = 0;
        for (int i = idx + 1; i < prices.length; i++) {
            cnt++;
            if (prices[i] < prices[idx]) break;
        }
        
        return cnt;
    }
}