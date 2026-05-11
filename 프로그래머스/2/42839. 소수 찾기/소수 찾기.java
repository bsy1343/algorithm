import java.util.*;
import java.io.*;

class Solution {
    static char[] arr;
    static int[] visited;
    static HashSet<Integer> hs = new HashSet();
    public int solution(String numbers) {
        arr = numbers.toCharArray();
        visited = new int[arr.length];
        
        dfs(0, "");
        
        int answer = 0;
        for (int num : hs) {
            if (isChecked(num)) answer++;
        }
        
        return answer;
    }
    
    static void dfs(int idx, String result) {
        
        if (!"".equals(result)) hs.add(Integer.valueOf(result));
        
        if (idx == arr.length) {
            return;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (visited[i] == 1) continue;
                visited[i] = 1;
                dfs(idx + 1, result + arr[i]);
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