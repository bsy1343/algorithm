import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder stack = new StringBuilder(); // 스택처럼 사용

        for (char c : number.toCharArray()) {
            // 뒤에 더 큰 숫자가 왔으면 이전 작은 숫자들을 가능한 만큼 제거
            while (k > 0 && stack.length() > 0 && stack.charAt(stack.length() - 1) < c) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            stack.append(c);
        }

        // 아직 못 지운 게 남았으면(내림차순 같은 입력) 뒤에서 지움
        if (k > 0) stack.setLength(stack.length() - k);

        return stack.toString();
    }
}