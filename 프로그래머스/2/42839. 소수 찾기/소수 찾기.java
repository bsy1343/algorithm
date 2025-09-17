import java.util.*;
import java.io.*;

class Solution {
    static HashSet<Integer> hs = new HashSet();
    static boolean[] used;
    static char[] arr;
    
    public int solution(String numbers) {
        arr = numbers.toCharArray();
        used = new boolean[arr.length];
        
        dfs(0, "");
        
        int answer = 0;
        for (int num : hs) {
            if (isPrime(num)) answer++;
        }
        
        return answer;
    }
    
    static void dfs(int idx, String cur) {
        if (!cur.equals("")) {
            hs.add(Integer.parseInt(cur));
        }
        
        if (idx == arr.length) return;
        
        for (int i = 0; i < arr.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            dfs(idx + 1, cur + arr[i]);
            used[i] = false;
        }
    }
    
    static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
}