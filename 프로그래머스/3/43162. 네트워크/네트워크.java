class Solution {
    static int n, answer;
    static int[] visit;
    static int[][] computers;
    public int solution(int n, int[][] computers) {
        this.answer = 0;
        this.n = n;
        this.computers = computers;
        this.visit = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (visit[i] == 0) {
                answer++;
                dfs(i);
            }
        }
        
        return answer;
    }
    
    static void dfs (int i) {
        visit[i] = 1;
        for (int j = 0; j < n; j++) {
            if (visit[j] == 0 && computers[i][j] == 1) {
                dfs(j);
            }
        }
    }
}