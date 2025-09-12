import java.io.*;
import java.util.*;

class Solution {
    static int n;
    static int[][] computers;
    
    static int answer;
    static int[] visited;
    
    
    public int solution(int n, int[][] computers) {
        Solution.n = n;
        Solution.computers = computers;
        visited = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (visited[i] != 0) continue;
            answer++;
            dfs(i);
        }
        
        return answer;
    }
    
    static void dfs(int row) {
        visited[row] = 1;
        for (int col = 0; col < n; col++) {
            if (visited[col] != 0) continue;
            if (computers[row][col] != 1) continue;
            dfs(col);
            
        }
    }
}