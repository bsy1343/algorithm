import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] visited = new int [progresses.length];
        ArrayList<Integer> al = new ArrayList();
        
        int day = 1;
        int complete = 0;
        while(true) {
            if (complete == progresses.length) break; 
            
            int todayComplete = 0;
            for (int i = 0; i < speeds.length; i++) {
                if (visited[i] != 0) continue;
                if (speeds[i] * day + progresses[i] >= 100) {
                    visited[i] = 1;
                    complete++;
                    todayComplete++;
                } else {
                    break;
                }
            }
            
            if (todayComplete > 0) {
                al.add(todayComplete);
            }
            
            day++;
        }
        
        return al.stream().mapToInt(o -> o).toArray();
    }
}