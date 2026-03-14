import java.io.*;
import java.util.*;

class Solution {
    static int[] visited;
    static char[] arr;
    static HashSet<Integer> hs = new HashSet();
    
    public int solution(String numbers) {
        int answer = 0;
        arr = numbers.toCharArray();
        visited = new int[arr.length];
        
        dfs(0, "");
        
        for (int val : hs) {
            if (isCheck(val)) answer++;
        }
        return answer;
    }
    
    static void dfs(int idx, String result) {
        if (!result.equals("")) {
            hs.add(Integer.valueOf(result));
        }
        
        if (idx == arr.length) return;
        
        for (int i = 0; i < arr.length; i++) {
            if (visited[i] != 0) continue;
            visited[i] = 1;
            dfs(idx + 1, result + arr[i]);
            visited[i] = 0;
        }
    }
    
    static boolean isCheck(int val) {
        if (val < 2) return false;
        if (val == 2) return true;
        if (val % 2 == 0) return false;
        for (int i = 3; i * i <= val; i+=2) {
            if (val % i == 0) return false;
        }
        return true;
    }
}