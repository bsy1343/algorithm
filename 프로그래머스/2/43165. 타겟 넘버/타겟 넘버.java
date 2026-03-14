class Solution {
    static int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        
        dfs(0, 0, numbers, target);
        return answer;
    }
    
    static void dfs(int idx, int result, int[] numbers, int target) {
        if (idx == numbers.length) {
            if (result == target) answer++;
        } else {
            dfs(idx + 1, result - numbers[idx], numbers, target);
            dfs(idx + 1, result + numbers[idx], numbers, target);
        }
    }
}