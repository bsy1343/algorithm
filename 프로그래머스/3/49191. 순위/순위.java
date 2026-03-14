import java.io.*;
import java.util.*;

class Solution {
    public int solution(int n, int[][] results) {
        ArrayList<Integer>[] win = new ArrayList[n + 1];
        ArrayList<Integer>[] lose = new ArrayList[n + 1];
        
        for (int i = 1; i <= n; i++) {
            win[i] = new ArrayList();
            lose[i] = new ArrayList();
        }
        
        for (int[] i : results) {
            win[i[0]].add(i[1]);
            lose[i[1]].add(i[0]);
        }
        
        
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int w = bfs(i, win, n);
            int l = bfs(i, lose, n);
            
            if (w + l + 1 == n) answer++;
        }
        return answer;
    }
    
    static int bfs(int idx, ArrayList<Integer>[] al, int n) {
        int[] visited = new int[n + 1];
        Queue<Integer> q = new LinkedList();
        q.add(idx);
        visited[idx] = 1;
        
        int cnt = 0;
        while (!q.isEmpty()) {
            int x = q.poll();
            
            for (int y : al[x]) {
                if (visited[y] != 0) continue;
                visited[y] = 1;
                cnt++;
                q.add(y);
            }
        }
        return cnt;
    }
}