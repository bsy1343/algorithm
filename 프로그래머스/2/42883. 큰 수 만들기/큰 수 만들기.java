import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> s = new Stack();
        
        for (char c : number.toCharArray()) {
            while (!s.isEmpty() && k > 0 && s.peek() < c) {
                s.pop();
                k--;
            }
            
            s.add(c);
        }
        
        while (k > 0) {
            s.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : s) {
            sb.append(c);
        }
        return sb.toString();
    }
}