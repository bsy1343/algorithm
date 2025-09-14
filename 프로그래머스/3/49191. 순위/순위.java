import java.util.*;
import java.io.*;

class Solution {
    static int n;
    static int[][] results;
    
    static int[] visited;
    public int solution(int n, int[][] results) {
        Solution.n = n;
        Solution.results = results;
        
        ArrayList<Integer>[] win = new ArrayList[n + 1];
        ArrayList<Integer>[] lose = new ArrayList[n + 1];
        
        for (int i = 1; i <= n; i++) {
            win[i] = new ArrayList();
            lose[i] = new ArrayList();
        }
        
        for (int[] arr : results) {
            win[arr[0]].add(arr[1]);
            lose[arr[1]].add(arr[0]);
        }
        
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int wCnt = bfs(i, win);
            int lCnt = bfs(i, lose);
            
            if (wCnt + lCnt == n - 1) {
                answer++;
            }
        }
        
        return answer;
    }
    
    static int bfs(int idx, ArrayList<Integer>[] arr) {
        visited = new int[n + 1];
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