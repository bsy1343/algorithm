import java.util.*;
import java.io.*;

class Solution {
    static class Node {
        int x, y, s;
        Node (int x, int y, int s) {
            this.x = x;
            this.y = y;
            this.s = s;
        }
    }
    static int answer;
    static int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static int[][] map;
    static int[][] visit;
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        // 정의를 받는다.
        map = new int[102][102];
        visit = new int[102][102];
        answer = 0;
        
        Scanner sc = new Scanner(System.in);
        int sizeX = rectangle.length;
        int sizeY = rectangle[0].length;
        
        // 모든 네모를 1로 채운다
        for (int t = 0; t < sizeX; t++) {
            int fx = rectangle[t][0] * 2;
            int fy = rectangle[t][1] * 2;
            int sx = rectangle[t][2] * 2;
            int sy = rectangle[t][3] * 2;
            
            for (int i = fx; i <= sx; i++) {
                for (int j = fy; j <= sy; j++) {
                    map[i][j] = 1;
                }
            }
        }
        
        // 네모 안을 0으로 만든다
        for (int t = 0; t < sizeX; t++) {
            int fx = rectangle[t][0] * 2;
            int fy = rectangle[t][1] * 2;
            int sx = rectangle[t][2] * 2;
            int sy = rectangle[t][3] * 2;
            
            for (int i = fx+1; i < sx; i++) {
                for (int j = fy+1; j < sy; j++) {
                    map[i][j] = 0;
                }
            }
        }
        
        // bfs를 통해 값을 도출해낸댜.
        Queue<Node> q = new LinkedList();
        q.add(new Node(characterX*2, characterY*2, 0));
        visit[characterX*2][characterY*2] = 1;
        
        while (!q.isEmpty()) {
            Node now = q.poll();
            
            if (now.x == itemX*2 && now.y == itemY*2) {
                answer = now.s/2;
                break;
            }
            
            for (int i = 0; i < direction.length; i++) {
                int nx = now.x + direction[i][0];
                int ny = now.y + direction[i][1];
                
                if ( nx > -1 && ny > -1 && nx <= 102 && ny <= 102 && visit[nx][ny] == 0 && map[nx][ny] == 1) {
                    visit[nx][ny] = 1;
                    q.add(new Node(nx, ny, now.s+1));
                }
            }
        }
        
        return answer;
    }
}