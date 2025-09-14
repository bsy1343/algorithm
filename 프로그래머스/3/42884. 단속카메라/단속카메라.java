import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, Comparator.comparingInt(o -> o[1]));
        
        int answer = 0;
        int lastCamera = Integer.MIN_VALUE;
        for (int[] route : routes) {
            int start = route[0];
            int end = route[1];
            
            while(lastCamera < start) {
                lastCamera = end;
                answer++;
            }
        }
        return answer;
    }
}