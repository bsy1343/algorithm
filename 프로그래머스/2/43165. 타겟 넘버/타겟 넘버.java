import java.util.*;
import java.io.*;

class Solution {
    static int t, answer;
    static int[] n;
    public int solution(int[] numbers, int target) {
        n = numbers;
        t = target;
        answer = 0;
        
        dfs(0, 0);
        return answer;
    }
    
    private void dfs(int index, int value) {
        if (index == n.length) {
            if (t == value) {
                answer++;
            }
            return;
        }
        dfs(index + 1, value + n[index]);
        dfs(index + 1, value - n[index]);
    }
}