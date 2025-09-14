import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, Comparator.comparingInt(o -> o[1]));
        int answer = 0;
        int camera = Integer.MIN_VALUE;
        for (int[] route : routes) {
            int start = route[0];
            int end = route[1];
            
            if (camera < start) {
                answer++;
                camera = end;
            }
        }
        return answer;
    }
}