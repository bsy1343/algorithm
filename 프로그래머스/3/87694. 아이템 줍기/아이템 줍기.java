import java.io.*;
import java.util.*;

class Solution {
    static class Node {
        int x, y, dist;
        Node (int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    
    static int n, m, answer;
    static int[][] visited, map;
    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        n = rectangle.length;
        m = rectangle[0].length;
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
        
        bfs(rectangle, characterX*2, characterY*2, itemX*2, itemY*2);
        
        return answer;
    }
    
    static void bfs(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        Queue<Node> q = new LinkedList();
        q.add(new Node(characterX, characterY, 0));
        visited[characterX][characterY] = 1;
        
        while(!q.isEmpty()) {
            Node node = q.poll();
            
            if (node.x == itemX && node.y == itemY) {
                answer = node.dist / 2;
                return;
            }
            
            for (int i = 0; i < directions.length; i++) {
                int dx = node.x + directions[i][0];
                int dy = node.y + directions[i][1];
                
                if (dx < 0 || dx >= 101 || dy < 0 || dy >= 101) continue;
                if (visited[dx][dy] != 0) continue;
                if (map[dx][dy] != 1) continue;
                visited[dx][dy] = 1;
                q.add(new Node(dx, dy, node.dist + 1));
            }
        }
    }
}