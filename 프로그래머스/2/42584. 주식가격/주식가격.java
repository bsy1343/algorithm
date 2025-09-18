import java.util.*;

class Solution {
    static int[] prices;
    public int[] solution(int[] prices) {
        Solution.prices = prices;
        int[] arr = new int[prices.length];
        
        for (int i = 0; i < prices.length; i++) {
            arr[i] = count(i);
        }
        return arr;
    }
    
    static int count(int idx) {
        int cnt = 0;
        for (int i = idx + 1; i < prices.length; i++) {
            cnt++;
            if (prices[idx] > prices[i]) break;
        }
        return cnt;
    }
}