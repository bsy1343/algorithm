import java.util.*;
import java.io.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // 사전순 정렬
        // 접두어 관계인 쌍이 반드시 인접하게 됨
        // ex) ["119","11990","97674223"] → ["119","11990","97674223"]
        //      "119"와 "11990"이 자동으로 붙음
        Arrays.sort(phone_book);
        
        // 인접한 쌍만 비교 (i-1, i)
        // 정렬 덕분에 이것만으로 모든 쌍을 검사한 것과 동일
        for (int i = 1; i < phone_book.length; i++) {
            
            // phone_book[i]가 phone_book[i-1]로 시작하면
            // → i-1번이 i번의 접두어 = 규칙 위반
            // ex) "11990".startsWith("119") → true → 즉시 false 반환
            if (phone_book[i].startsWith(phone_book[i-1])) return false;
        }
        
        // 모든 인접 쌍에서 접두어 관계가 없으면 true
        return answer;
    }
}