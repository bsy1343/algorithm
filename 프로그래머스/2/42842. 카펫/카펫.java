import java.io.*;
import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int total = brown + yellow;
        
        // 세로부터 시작해서 가로까지 탐색 (가로 >= 세로 조건)
        for (int h = 3; h <= Math.sqrt(total); h++) {
            if (total % h == 0) {
                int w = total / h;
                
                // 노란색 격자 개수 확인
                int yellowCount = (w - 2) * (h - 2);
                
                if (yellowCount == yellow) {
                    answer[0] = w;  // 가로
                    answer[1] = h;  // 세로
                    break;
                }
            }
        }
        
        return answer;
    }
}