import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int garo = Integer.MIN_VALUE;
        int sero = Integer.MIN_VALUE;
        int maxGaro = Integer.MIN_VALUE;
        int maxSero = Integer.MIN_VALUE;
        for (int i = 0; i < sizes.length; i++) {
           garo = Integer.max(sizes[i][0], sizes[i][1]);
           sero = Integer.min(sizes[i][0], sizes[i][1]);
           // System.out.println("garo: " + garo + ", sero: " + sero);
           maxGaro = Integer.max(maxGaro, garo);
           maxSero = Integer.max(maxSero, sero);
           // System.out.println("maxGaro: " + maxGaro + ", maxSero: " + maxSero);
            
        }
        answer = maxGaro * maxSero;
        return answer;
    }
}