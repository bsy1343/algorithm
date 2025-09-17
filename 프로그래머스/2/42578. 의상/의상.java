import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String[] str : clothes) {
            map.put(str[1], map.getOrDefault(str[1], 1) + 1);
        }
        
        int answer = 1;
        for (int val : map.values()) {
            answer *= val;
        }
        return answer - 1;
    }
}