import java.io.*;
import java.util.*;

class Solution {
    boolean solution(String s) {
        char[] arr = s.toCharArray();
        
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cnt == 0 && arr[i] == ')') return false;
            
            if (arr[i] == '(') cnt++;
            if (arr[i] == ')') cnt--;
        }

        return cnt == 0;
    }
}