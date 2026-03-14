import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int sero = 0;
        int garo = 0;
        for (int[] arr : sizes) {
            sero = Math.max(sero, Math.max(arr[0], arr[1]));
            garo = Math.max(garo, Math.min(arr[0], arr[1]));
        }
        
        return sero * garo;
    }
}