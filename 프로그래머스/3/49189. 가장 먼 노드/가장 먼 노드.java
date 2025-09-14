import java.io.*;
import java.util.*;

class Solution {
    static int n;
    static int[][] edge;
    
    static int[] visited;
    static ArrayList<Integer>[] al;
    public int solution(int n, int[][] edge) {
        Solution.n = n;
        Solution.edge = edge;
        
        visited = new int[n + 1];
        al = new ArrayList[n + 1];
        
        for (int i = 1; i <= n; i++) {
            al[i] = new ArrayList();
        }
        
        Arrays.fill(visited, -1);
        
        for (int i = 0; i < edge.length; i++) {
            al[edge[i][0]].add(edge[i][1]);
            al[edge[i][1]].add(edge[i][0]);
        }
        
        bfs(1);
        
        
        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, visited[i]);
        }
        
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
                if (visited[y] != -1 ) continue;
                visited[y] = visited[x] + 1;
                q.add(y);
            }
            
        }
    }
}