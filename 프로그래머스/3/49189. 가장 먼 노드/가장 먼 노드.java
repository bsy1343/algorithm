import java.io.*;
import java.util.*;

class Solution {
    static class Node {
        int idx, dist;
        Node (int idx, int dist) {
            this.idx = idx;
            this.dist = dist;
        }
    }
    
    static int n;
    static int[][] edge;
    
    static int[] visited;
    static ArrayList<Node>[] al;
    public int solution(int n, int[][] edge) {
        Solution.n = n;
        Solution.edge = edge;
        
        visited = new int[n + 1];
        al = new ArrayList[n + 1];
        
        for (int i = 1; i <= n; i++) {
            al[i] = new ArrayList();
        }
        
        Arrays.fill(visited, Integer.MAX_VALUE);
        
        for (int i = 0; i < edge.length; i++) {
            al[edge[i][0]].add(new Node(edge[i][1], 1));
            al[edge[i][1]].add(new Node(edge[i][0], 1));
        }
        
        dijkstra(1, 0);
        
        
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
    
    static void dijkstra(int idx, int dist) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.dist));
        pq.add(new Node(idx, dist));
        visited[idx] = 0;
        
        while(!pq.isEmpty()) {
            Node now = pq.poll();
            
            if (visited[now.idx] < now.dist) continue;
            
            for (Node next : al[now.idx]) {
                int cost = visited[now.idx] + next.dist;
                
                if (visited[next.idx] <= cost) continue;
                
                visited[next.idx] = cost;;
                pq.add(new Node(next.idx, cost));
            }
            
        }
    }
}