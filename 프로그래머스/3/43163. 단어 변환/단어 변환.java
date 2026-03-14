import java.util.*;
import java.io.*;

class Solution {
    static class Node {
        String name;
        int cnt;
        Node (String name, int cnt) {
            this.name = name;
            this.cnt = cnt;
        }
    }
    static int answer;
    static int visited[];
    
    public int solution(String begin, String target, String[] words) {
        visited = new int[words.length];
        
        bfs(begin, target, words);
        
        return answer;
    }
    
    static void bfs(String begin, String target, String[] words) {
        Queue<Node> q = new LinkedList();
        q.add(new Node(begin, 0));
        
        while(!q.isEmpty()) {
            Node now = q.poll();
            
            if (now.name.equals(target)) {
                answer = now.cnt;
                return;
            }
            
            for (int i = 0; i < words.length; i++) {
                if (visited[i] != 0) continue;
                if (!diff(now.name, words[i])) continue;
                visited[i] = 1;
                q.add(new Node(words[i], now.cnt + 1));
            }
        }
    }
    
    static boolean diff(String x, String y) {
        int cnt = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != y.charAt(i)) cnt++;
        }
        
        return cnt == 1;
    }
}