import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = Math.round(nums.length/2);
        HashSet<Integer> hs = new HashSet();
        
        for (int i : nums) {
            hs.add(i);
        }
        
        if (n > hs.size()) {
            answer = hs.size();
        } else {
            answer = n;
        }
        
        return answer;
    }
}