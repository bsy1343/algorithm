import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] arr = new int[n + 1];
        
        Arrays.fill(arr, 1);
        
        for (int x : lost) arr[x]--;
        for (int x : reserve) arr[x]++;
        
        for (int i = 1; i <= n; i++) {
            if (arr[i] != 0) continue;
            if (i > 1 && arr[i - 1] == 2) {
                arr[i]++;
                arr[i - 1]--;
            } else if (i < n && arr[i + 1] == 2) {
                arr[i]++;
                arr[i + 1]--;
            }
        }
        
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] >= 1) answer++;
        }
        
        return answer;
    }
}