import java.util.*;
import java.io.*;

class Solution {
    static int[] visited;
    static int k, cnt, answer;
    static int[][] dungeons;
    public int solution(int k, int[][] dungeons) {
        this.k = k;
        this.dungeons = dungeons;
        this.visited = new int[dungeons.length];
        this.answer = 0;
        
        dfs(0, k);
        
        return answer;
    }
    
    static void dfs(int idx, int result) {
        answer = Math.max(idx, answer);
        
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] == 1) continue;
            if (result < dungeons[i][0]) continue;
            
            visited[i] = 1;
            dfs(idx + 1, result - dungeons[i][1]);
            visited[i] = 0;

        }
    }
}