class Solution {
    static int n, answer;
    static int[][] computers;
    static int visit[];
    
    public int solution(int n, int[][] computers) {
        this.n = n;
        this.computers = computers;
        this.visit = new int[n];
        this.answer = 0;
        
        for (int i = 0; i < n; i++) {
            if (visit[i] == 0) {
                answer++;   
                dfs(i);
            }
        }
        
        return answer;
    }
    
    private void dfs(int i ) {
        visit[i] = 1;
        for (int j = 0; j < n; j++) {
            if (computers[i][j] == 1 && visit[j] == 0) {
                dfs(j);
            }
        }
    }
}