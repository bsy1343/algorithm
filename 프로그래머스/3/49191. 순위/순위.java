import java.util.*;

class Solution {
    public int solution(int n, int[][] results) {
        
        ArrayList<Integer>[] win = new ArrayList[n + 1];
        ArrayList<Integer>[] lose = new ArrayList[n + 1];
        
        for (int i = 1; i <= n; i++) {
            win[i] = new ArrayList();
            lose[i] = new ArrayList();
        }
        
        for (int[] result : results) {
            win[result[0]].add(result[1]);
            lose[result[1]].add(result[0]);
        }
        
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int w = bfs(i, win, n);
            int l = bfs(i, lose, n);
            
            if (w + l == n - 1) answer++;
        }
        
        return answer;
    }
    
    static int bfs(int idx, ArrayList<Integer>[] arr, int n) {
        int[] visited = new int[n + 1];
        Queue<Integer> q = new LinkedList();
        q.add(idx);
        visited[idx] = 1;
        
        int cnt = 0;
        while (!q.isEmpty()) {
            int x = q.poll();
            
            for (int y : arr[x]) {
                if (visited[y] != 0) continue;
                visited[y] = 1;
                q.add(y);
                cnt++;
            }
        }
        return cnt;
    }
}