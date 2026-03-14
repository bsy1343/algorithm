class Solution {
    static int[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (visited[i] != 0) continue;
            answer++;
            dfs(i, n, computers);
        }
        
        return answer;
    }
    
    static void dfs(int row, int n, int[][] computers) {
        visited[row] = 1;
        
        for (int col = 0; col < n; col++) {
            if (visited[col] != 0) continue;
            if (computers[row][col] != 1) continue;
            dfs(col, n, computers);
        }
        
    }
}