import java.io.*;
import java.util.*;

class Solution {
    static char[] c;
    static int[] visited;
    static HashSet<Integer> hs = new HashSet();
    
    public int solution(String numbers) {
        c = numbers.toCharArray();
        visited = new int[c.length];
        
        dfs(0, "");
        
        int answer = 0;
        for (int num : hs) {
            if (isChecked(num)) answer++;
        }
        
        return answer;
    }
    
    static void dfs (int idx, String result) {
        if (!"".equals(result)) hs.add(Integer.valueOf(result));
        
        if (idx == c.length) {
            return;
        } else {
            for (int i = 0; i < c.length; i++) {
                if (visited[i] == 1) continue;
                visited[i] = 1;
                dfs(idx + 1, result+c[i]);
                visited[i] = 0;
            }   
        }
    }
    
    static boolean isChecked(int val) {
        if (val < 2) return false;
        for (int i = 2; i <= Math.sqrt(val); i++) {
            if (val % i == 0) return false;
        }
        return true;
    }
}