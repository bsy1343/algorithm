import java.io.*;
import java.util.*;

class Solution {
    static int n, answer;
    static int[] visited;
    static int[][] computers;
    
    public int solution(int n, int[][] computers) {
        Solution.n = n;
        Solution.computers = computers;
        visited = new int[n];
        
        for (int i = 0; i < n; i++) {
            if(visited[i] == 0) {
                answer++;
                dfs(i);
            }
        }
        
        return answer;
    }
    
    // row를 돌면서, 열에서 1이면서 아직 방문 안 한 곳 → 같은 네트워크로 이어지고, 그렇게 연결된 덩어리 하나가 네트워크.
    static void dfs(int row) {
        visited[row] = 1;
        for (int col = 0; col < n; col++) {
            if (visited[col] == 0 && computers[row][col] == 1) {
                dfs(col);
            }
        }
    }
}