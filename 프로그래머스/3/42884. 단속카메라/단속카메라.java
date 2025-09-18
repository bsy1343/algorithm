import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, (o1, o2) -> o1[1] - o2[1]);
        // Arrays.sort(routes, Comparator.comparingInt(o -> o[1]));
        
        int answer = 0;
        int lastCamera = Integer.MIN_VALUE;
        for (int[] route : routes) {
            int start = route[0];
            int end = route[1];
            
            if (lastCamera < start) {
                answer++;
                lastCamera = end;
            }
        }
        return answer;
    }
}