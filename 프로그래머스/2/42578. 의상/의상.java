import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];
            hm.put(type, hm.getOrDefault(type, 1) + 1);
        }

        for (String key : hm.keySet()) {
            answer *= hm.get(key);
        }

        return answer-1;
    }
}