import java.io.*;
import java.util.*;

class Solution {
    static String[] arr = {"A", "E", "I", "O", "U"};
    static ArrayList<String> al = new ArrayList();
    
    public int solution(String word) {
        
        dfs("");
        
        return al.indexOf(word);
    }
    
    static void dfs(String val) {
        if (val.length() <= 5) al.add(val);
        if (val.length() > 5) return;
        
        for (String s : arr) {
            dfs(val + s);
        }
    }
}