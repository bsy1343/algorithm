import java.util.*;
import java.io.*;

class Solution {
    static ArrayList<Integer>[] al;
    
    public int solution(int n, int[][] wires) {
        
        al = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            al[i] = new ArrayList();
        }
        
        for (int[] arr : wires) {
            al[arr[0]].add(arr[1]);
            al[arr[1]].add(arr[0]);
        }
        
        int answer = n;
        for (int[] arr : wires) {
            al[arr[0]].remove(Integer.valueOf(arr[1]));
            al[arr[1]].remove(Integer.valueOf(arr[0]));
            
            int cnt = bfs(arr[0]);
            
            answer = Math.min(answer, Math.abs(cnt - (n-cnt)));
            
            al[arr[0]].add(arr[1]);
            al[arr[1]].add(arr[0]);
        }
        
        return answer;
    }

    static int bfs(int start) {
        int[] visited = new int[al.length + 1];
        Queue<Integer> q = new LinkedList();
        q.add(start);
        visited[start] = 1;
        
        int cnt = 0;
        while(!q.isEmpty()) {
            int now = q.poll();
            
            cnt++;
            for (int next : al[now]) {
                if (visited[next] == 1) continue;
                visited[next] = 1;
                q.add(next);
            }
        }
        return cnt;
    }
}