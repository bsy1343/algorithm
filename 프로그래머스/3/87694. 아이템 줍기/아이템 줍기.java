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
    
    static int[][] rectangle;
    static int characterX, characterY, itemX, itemY;
    
    static int answer;
    static int[][] map, visited;
    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        Solution.rectangle = rectangle;
        Solution.characterX = characterX;
        Solution.characterY = characterY;
        Solution.itemX = itemX;
        Solution.itemY = itemY;
        
        map = new int[101][101];
        visited = new int[101][101];
        
        for (int x = 0; x < rectangle.length; x++) {
            int ax = rectangle[x][0] * 2;
            int ay = rectangle[x][1] * 2;
            int bx = rectangle[x][2] * 2;
            int by = rectangle[x][3] * 2;
            
            for (int i = ax; i <= bx; i++) {
                for (int j = ay; j <= by; j++) {
                    map[i][j] = 1;
                }
            }
        }
        
        for (int x = 0; x < rectangle.length; x++) {
            int ax = rectangle[x][0] * 2;
            int ay = rectangle[x][1] * 2;
            int bx = rectangle[x][2] * 2;
            int by = rectangle[x][3] * 2;
            
            for (int i = ax+1; i < bx; i++) {
                for (int j = ay+1; j < by; j++) {
                    map[i][j] = 0;
                }
            }
        }
        
        bfs(characterX * 2, characterY * 2, 0);
        
        return answer;
    }
    
     static void bfs(int x, int y, int dist) {
         Queue<Node> q = new LinkedList();
         q.add(new Node(x, y, dist));
         visited[x][y] = 1;
         
         while(!q.isEmpty()) {
             Node node = q.poll();
             
             if (node.x == itemX * 2 && node.y == itemY * 2) {
                 answer = node.dist/2;
                 return;
             }
             
             for (int i = 0; i < directions.length; i++) {
                 int nx = node.x + directions[i][0];
                 int ny = node.y + directions[i][1];
                 
                 if (nx < 0 || ny < 0 || nx >= 101 || ny >= 101) continue;
                 if (visited[nx][ny] != 0) continue;
                 if (map[nx][ny] != 1) continue;
                 
                 visited[nx][ny] = 1;
                 q.add(new Node(nx, ny, node.dist + 1));
             }
         }
     }
}