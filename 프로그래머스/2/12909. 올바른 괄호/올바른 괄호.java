import java.io.*;
import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        char[] arr = s.toCharArray();
        
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cnt == 0 && arr[i] == ')') {
                answer = false;
                break;
            }
            
            if (arr[i] == '(') cnt++;
            if (arr[i] == ')') cnt--;
        }
        
        if (answer && cnt == 0)  {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}