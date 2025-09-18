import java.io.*;
import java.util.*;

class Solution {
    static class Node {
        String str;
        int cnt;
        Node (String str, int cnt) {
            this.str = str;
            this.cnt = cnt;
        }
    }
    static String begin, target;
    static String[] words;
    
    static int[] visited;
    static int answer;
    public int solution(String begin, String target, String[] words) {
        Solution.begin = begin;
        Solution.target = target;
        Solution.words = words;
        
        visited = new int[words.length];
        
        bfs(begin);
        
        return answer;
    }
    
    static void bfs(String s) {
        Queue<Node> q = new LinkedList();
        q.add(new Node(s, 0));
        
        while(!q.isEmpty()) {
            Node node = q.poll();
            
            if (node.str.equals(target)) {
                answer = node.cnt;
                break;
            }
            
            for (int i = 0; i < words.length; i++) {
                if (visited[i] != 0) continue;
                if (!isCheck(node.str, words[i])) continue;
                visited[i] = 1;
                q.add(new Node(words[i], node.cnt + 1));
            }
        }
    }
    
    static boolean isCheck(String a, String b) {
        int length = a.length();
        int cnt = 0;
        for (int i = 0; i < length; i++) {
            if (a.charAt(i) != b.charAt(i)) cnt++;
        }
        return cnt == 1;
    }
}