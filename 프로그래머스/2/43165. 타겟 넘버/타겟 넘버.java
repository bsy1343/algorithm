import java.io.*;
import java.util.*;

class Solution {
    static int[] numbers;
    static int target;
    static int answer;
    public int solution(int[] numbers, int target) {
        Solution.numbers = numbers;
        Solution.target = target;
        answer = answer;
        
        dfs(0, 0);
        
        return answer;
    }
    
    static void dfs(int idx, int result) {
        if (idx == numbers.length) {
            if (result == target) {
                answer++;
            }
        } else {
            dfs(idx + 1, result + numbers[idx]);
            dfs(idx + 1, result - numbers[idx]);
        }
    }
}