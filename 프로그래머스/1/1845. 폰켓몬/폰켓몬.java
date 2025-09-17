import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet();
        int n = nums.length / 2;
        
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        
        int answer = 0;
        if (n > hs.size()) {
            answer = hs.size();
        } else {
            answer = n;
        }
        
        return answer;
    }
}