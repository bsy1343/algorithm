import java.io.*;
import java.util.*;

class Solution {
    
    static class Node {
        int x;
        int y;
        int s;
        Node (int x, int y, int s) {
            this.x = x;
            this.y = y;
            this.s = s;
        }
    }
    
    static int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static int n, m, answer;
    static int[][] maps, visited;
        
    public int solution(int[][] maps) {
        this.answer = -1;
        this.maps = maps;
        this.n = maps.length;
        this.m = maps[0].length;
        this.visited = new int[n][m];
        
        bfs(0, 0, maps[0][0]);
        
        return answer;
    }
    
    
    private void bfs(int x, int y, int s) {
        Queue<Node> q = new LinkedList();
        visited[x][y] = 1;
        q.add(new Node(x, y, s));
        
        while (!q.isEmpty()) {
            Node now = q.poll();
            
            if (now.x == n-1 && now.y == m-1) {
                answer = now.s;
                return;
            }
            
            for (int i = 0; i < direction.length; i++) {
                int dx = direction[i][0] + now.x;
                int dy = direction[i][1] + now.y;
                
                if (dx < 0 || dy < 0 || dx >= n || dy >= m || maps[dx][dy] == 0 ||visited[dx][dy] == 1) {
                    continue;
                }
                
                visited[dx][dy] = 1;
                q.add(new Node(dx, dy, now.s+1));
            }
            
        }
    }
}