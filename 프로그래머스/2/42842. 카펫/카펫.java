import java.util.*;
import java.io.*;

class Solution {
    
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        
        for (int i = 3; i <= total; i++) {
            if (total % i != 0) continue;
            
            int garo = total / i;        
            int count = (garo - 2) * (i -2);
            
            if (yellow == count) {
                answer[0] = garo;
                answer[1] = i;
                break;
            }
        
        }
        return answer;
    }
}