import java.io.*;
import java.util.*;

class Solution {
    static class Node {
        int x, y, d;
        
        Node (int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }
    
    static int[][] map, visited;
    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static int n, answer;
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        this.n = rectangle.length;
        visited = new int[101][101];
        map = new int[101][101];
        
        
        for (int i = 0; i < n; i++) {
            int ax = rectangle[i][0] * 2;
            int ay = rectangle[i][1] * 2;
            int bx = rectangle[i][2] * 2;
            int by = rectangle[i][3] * 2;
            for (int x = ax; x <= bx; x++) {
                for (int y = ay; y <= by; y++) {
                    map[x][y] = 1;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            int ax = rectangle[i][0] * 2;
            int ay = rectangle[i][1] * 2;
            int bx = rectangle[i][2] * 2;
            int by = rectangle[i][3] * 2;
            for (int x = ax+1; x < bx; x++) {
                for (int y = ay+1; y < by; y++) {
                    map[x][y] = 0;
                }
            }
        }
        
        bfs(rectangle, characterX * 2, characterY * 2, itemX * 2, itemY * 2);
        
        return answer;
    }
    
    static void bfs(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        Queue<Node> q = new LinkedList();
        q.add(new Node(characterX, characterY, 0));
        visited[characterX][characterY] = 1;
        
        while(!q.isEmpty()) {
            Node now = q.poll();
            
            if (now.x == itemX && now.y == itemY) {
                answer = now.d / 2;
                return;
            }
            
            for (int i = 0; i < directions.length; i++) {
                int dx = now.x + directions[i][0];
                int dy = now.y + directions[i][1];
                
                if (dx < 0 || dx >= 101 || dy < 0 || dy >= 101) continue;
                if (visited[dx][dy] == 1) continue;
                if (map[dx][dy] == 0) continue;
                visited[dx][dy] = 1;
                q.add(new Node(dx, dy, now.d + 1));
            }
        }
    }
    
}