import java.util.*;
import java.io.*;

class Solution {
    static int[][] computers;
    static int[] visited;
    static int n, answer;
    
    public int solution(int n, int[][] computers) {
        this.computers = computers;
        this.visited = new int[n];
        this.n = n;
        this.answer = 0;
        
        for (int i = 0; i < n; i++) {
            if (visited[i] == 1) continue;
            answer++;
            dfs(i);
        }
        
        return answer;
    }
    
    static void dfs(int row) {
        visited[row] = 1;
        for (int col = 0; col < n; col++) {
            if (visited[col] == 1) continue;
            if (computers[row][col] == 0) continue;
            dfs(col);
        }
    }
}