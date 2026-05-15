import java.util.*;
import java.io.*;

class Solution {
    static String[] arr = {"A", "E", "I", "O", "U"};
    static ArrayList<String> al = new ArrayList();
    
    public int solution(String word) {
        
        dfs("");
        
        return al.indexOf(word) + 1;
    }
    
    static void dfs(String result) {
        if (result.length() > 0) al.add(result);
        if (result.length() == 5) return;
    
        for (String str : arr) {
            dfs(result + str);
        }
    }
}