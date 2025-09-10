import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int garo = Integer.MIN_VALUE;
        int sero = Integer.MIN_VALUE;
        
        for (int i = 0; i < sizes.length; i++) {
            garo = Math.max(garo, Math.max(sizes[i][0], sizes[i][1]));
            sero = Math.max(sero, Math.min(sizes[i][0], sizes[i][1]));
        }
        answer = garo * sero;
        return answer;
    }
}