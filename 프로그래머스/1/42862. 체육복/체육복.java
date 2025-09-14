import java.io.*;
import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] visited = new int[n + 1];
        
        Arrays.fill(visited, 1);
        
        for (int i : lost) visited[i]--;
        for (int i : reserve) visited[i]++;
        
        int cnt = lost.length;
        for (int i = 1; i <= n; i++) {
            if (visited[i] == 0) {
                if (i > 1 && visited[i - 1] == 2) {
                    visited[i-1]--;
                    visited[i]++;
                    cnt--;
                } else if (i < n && visited[i + 1] == 2) {
                    visited[i+1]--;
                    visited[i]++;
                    cnt--;
                }
            }
        }
        int answer = 0;
        for (int i = 1; i <= n ; i++) {
            if (visited[i] >= 1) answer++;
        }
        
        System.out.println(answer);
        System.out.println((n-cnt));
        return answer;
    }
}