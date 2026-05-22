import java.io.*;
import java.util.*;

class Solution {
    static class Node {
        int x, y, s;
        Node(int x, int y, int s) {
            this.x = x;
            this.y = y;
            this.s = s;
        }
    }
    
    static int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    static int[][] visited, maps;
    static int n, m, answer;
    
    public int solution(int[][] maps) {
        this.maps = maps;
        this.n = maps.length;
        this.m = maps[0].length;
        this.visited = new int[n][m];
        
        bfs(0, 0);
        return answer == 0 ? -1 : answer;
    }
    
    static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList();
        q.add(new Node(x, y, 1));
        visited[x][y] = 1;
        
        while (!q.isEmpty()) {
            Node now = q.poll();
            
            if (now.x == n-1 && now.y == m-1) {
                answer = now.s;
                return;
            }
            
            for (int i = 0; i < directions.length; i++) {
                int nx = now.x + directions[i][0];
                int ny = now.y + directions[i][1];
                
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (visited[nx][ny] == 1) continue;
                if (maps[nx][ny] == 0) continue;
                visited[nx][ny] = 1;
                q.add(new Node(nx, ny, now.s + 1));
                
            }
        }
    }
}