import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hs = new HashSet();
        for (int num : nums) {
            hs.add(num);
        }
        answer = hs.size() > nums.length/2 ? nums.length/2 : hs.size();
        // System.out.println(hs.size() < nums.length/2 : nums.length/2 ? hs.size());
        return answer;
    }
}