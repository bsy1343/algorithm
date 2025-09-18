import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> al = new ArrayList();
        int n = progresses.length;
        int visited[] = new int[n];
        
        int day = 1;
        int total = 0;
        while(true) {
            if (total == n) break;
            
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (visited[i] != 0) continue;
                if (progresses[i] + day * speeds[i] >= 100) {
                    visited[i] = 1;
                    cnt++;
                    total++;
                } else {
                    break;
                }
            }
            
            if (cnt > 0) {
                al.add(cnt);
            }
            
            day++;
        }
        
        return al.stream().mapToInt(o -> o).toArray();
    }
}