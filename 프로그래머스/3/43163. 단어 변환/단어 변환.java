import java.util.*;
import java.io.*;

class Solution {
    static int[] visited;
    static int answer;
    
    public int solution(String begin, String target, String[] words) {
        this.visited = new int[words.length];
        this.answer = Integer.MAX_VALUE;
        
        dfs(begin, target, words, 0);
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
    
    static void dfs(String current, String target, String[] words, int depth) {
        
        if (target.equals(current)) {
            answer = Math.min(answer, depth);   
        }
        
        for (int i = 0; i < words.length; i++) {
            if (visited[i] == 1) continue;
            if (!checked(words[i], current)) continue;
            visited[i] = 1;
            dfs(words[i], target, words, depth + 1);
            visited[i] = 0;
        }
    }
    
    static boolean checked(String a, String b) {
        int cnt = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) cnt++;
        }
        
        return cnt == a.length()-1;
    }
}