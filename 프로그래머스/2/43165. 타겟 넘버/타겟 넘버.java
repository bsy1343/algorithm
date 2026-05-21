import java.util.*;
import java.io.*;

class Solution {
    static int[] numbers;
    static int target, answer;
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        this.answer = 0;
        
        dfs(0, 0);
        
        return answer;
    }
    
    static void dfs(int idx, int result) {
        if (idx == numbers.length) {
            if (result == target) answer++;
        } else {
            dfs(idx + 1, result + numbers[idx]);
            dfs(idx + 1, result - numbers[idx]);
        }
    }
}