import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] arr = s.toCharArray();
        int cnt = 0;
        for (char c : arr) {
            if (cnt == 0 && c == ')') return false;
            if (c == '(') cnt++;
            if (c == ')') cnt--;
        }

        return cnt == 0;
    }
}