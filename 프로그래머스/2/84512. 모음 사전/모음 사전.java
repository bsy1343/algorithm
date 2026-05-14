import java.util.*;

class Solution {
    // 모음 배열 - 사전 순서대로 정의
    static String[] vowels = {"A", "E", "I", "O", "U"};
    // 생성된 모든 모음 단어를 저장할 리스트
    static List<String> words = new ArrayList<>();
    
    public int solution(String word) {
        // 빈 문자열부터 DFS 시작 - 모든 모음 단어 생성
        dfs("");
        // 1-based index로 반환 (indexOf는 0부터 시작)
        return words.indexOf(word) + 1;
    }
    
    static void dfs(String current) {
        // 빈 문자열 제외하고 단어 목록에 추가
        if (current.length() > 0) words.add(current);
        // 5글자 도달 시 재귀 종료
        if (current.length() == 5) return;
        
        // A, E, I, O, U 순서대로 붙여서 재귀 호출 (사전 순서 보장)
        for (String v : vowels) {
            dfs(current + v);
        }
    }
}