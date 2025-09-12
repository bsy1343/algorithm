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
    static int[][] visited, maps;
    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    
    public int solution(int[][] maps) {
        Solution.maps = maps;
        n = maps.length;
        m = maps[0].length;
        visited = new int[n][m];
        
        bfs(0, 0, 1);
        
        return answer == 0 ? -1 : answer;
    }
    
    static void bfs(int x, int y, int dist) {
        Queue<Node> q = new LinkedList();
        q.add(new Node(x, y, dist));
        visited[x][y] = 1;
        
        while(!q.isEmpty()) {
            Node node  = q.poll();

            if (node.x == n-1 && node.y == m-1) {
                answer = node.dist;
                return;
            }
            
            for (int i = 0; i < directions.length; i++) {
                int nx = node.x + directions[i][0];
                int ny = node.y + directions[i][1];
                
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (visited[nx][ny] != 0) continue;
                if (maps[nx][ny] != 1) continue;
                visited[nx][ny] = 1;
                q.add(new Node(nx, ny, node.dist + 1));
            }
        }
    }
}