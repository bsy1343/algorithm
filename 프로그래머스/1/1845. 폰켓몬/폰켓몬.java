import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length / 2;
        
        HashSet<Integer> hs = new HashSet();
        for (int i : nums) {
            hs.add(i);
        }
        
        answer = hs.size() < n ? hs.size() : n;
        
        
        
        return answer;
    }
}