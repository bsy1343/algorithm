import java.util.*;
import java.io.*;

class Solution {
    static int[][] dungeons;
    static int[] visited;
    static int answer;
    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        visited = new int[dungeons.length];
        answer = 0;
        
        dfs(0, k);
        
        return answer;
    }
    
    static void dfs(int idx, int result) {
        answer = Math.max(idx, answer);
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] == 1) continue;
            if (dungeons[i][0] > result) continue;
            visited[i] = 1;
            dfs(idx + 1, result - dungeons[i][1]);
            visited[i] = 0;
        }
    }
}