import java.util.*;

class Solution {
    static int[] visited;
    static ArrayList<Integer>[] al;
    static int max;
    
    public int solution(int n, int[][] edge) {
        
        visited = new int[n + 1];
        al = new ArrayList[n + 1];
        
        Arrays.fill(visited, -1);
        
        for (int i = 1; i <= n; i++) {
            al[i] = new ArrayList();
        }
        
        for (int[] x : edge) {
            al[x[0]].add(x[1]);
            al[x[1]].add(x[0]);
        }
        
        bfs(1);
        
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (visited[i] == max) answer++;
        }
        return answer;
    }
    
    static void bfs(int idx) {
        Queue<Integer> q = new LinkedList();
        q.add(idx);
        visited[idx] = 0;
        
        while(!q.isEmpty()) {
            int x = q.poll();
            
            for (int y : al[x]) {
                if (visited[y] != -1) continue;
                visited[y] = visited[x] + 1;
                max = Math.max(max, visited[y]);
                q.add(y);
            }
        }
    }
}