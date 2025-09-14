import java.io.*;
import java.util.*;

class Solution {
    public String solution(String number, int k) {
        // 숫자를 하나씩 담으면서 조건에 따라 제거할 스택
        Stack<Character> s = new Stack();
        
        // 주어진 숫자 문자열을 하나씩 순회
        for (char c : number.toCharArray()) {
            // 스택이 비어있지 않고, 아직 제거 횟수(k)가 남아있으며,
            // 스택의 맨 위 값보다 현재 숫자가 더 크다면
            // => 작은 숫자를 제거해서 더 큰 숫자가 앞으로 오도록 만듦
            while(!s.isEmpty() && k > 0 && s.peek() < c) {
                s.pop();  // 맨 위 숫자 제거
                k--;      // 제거 횟수 1 감소
            }
            // 현재 숫자를 스택에 추가
            s.add(c);
        }
        
        // 만약 아직 제거해야 할 숫자가 남아 있다면 (내림차순 정렬된 경우 등)
        // 뒤에서부터 제거
        while(k > 0) {
            s.pop();
            k--;
        }
        
        // 스택에 남은 숫자들을 이어 붙여 최종 결과 문자열 생성
        StringBuilder sb = new StringBuilder();
        for (char c : s) {
            sb.append(c);
        }
        
        return sb.toString(); // 가장 큰 수 반환
    }
}