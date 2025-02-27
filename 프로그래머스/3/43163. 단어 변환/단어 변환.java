import java.util.*;
import java.io.*;

// https://jisunshine.tistory.com/157 참고
class Solution {
    static int answer;
    static int[] visit;
    public int solution(String begin, String target, String[] words) {
        answer = 0;
        visit = new int[words.length];
        
        dfs(begin, target, words, 0);
        return answer;
    }
    
    public static void dfs(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) {
            answer = cnt;
            return;
        }
        
        for (int i = 0; i < words.length; i++) {
            if (visit[i] == 1) {
                continue;
            }
            
            int k = 0;
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) == words[i].charAt(j)) {
                    k++;
                }
            }
            
            if (k == begin.length() -1) {
                visit[i] = 1;
                System.out.println("dfs : i="+ i +" : "+words[i] + " : " + target + " : " + (cnt+1) );
                dfs(words[i], target, words, cnt+1);
                System.out.println("백트래킹 : i="+ i +" : "+words[i] + " : " + target + " : " + (cnt+1) );
                visit[i] = 0;
            }
        }
    }
}