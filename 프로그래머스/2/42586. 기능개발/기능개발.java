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
                // 방문을 하지 않았을떄 조건이 안맞으면 break 시킴 (두번째 프로세스가 완료되어도 첫번쨰가 완료 안되면 break조건)
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