import java.io.*;
import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        
        char[] arr = s.toCharArray();
        
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cnt == 0 && arr[i] == ')') {
                cnt--;
                break;
            }
            
            if (arr[i] == '(') cnt++;
            if (arr[i] == ')') cnt--;
        }
        
        if (cnt == 0) answer = true;
        
        return answer;
    }
}