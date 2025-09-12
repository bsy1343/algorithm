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
    
    static String begin, target;
    static String[] words;
    
    static int answer;
    static int[] visited;
    
    public int solution(String begin, String target, String[] words) {
        Solution.begin = begin;
        Solution.target = target;
        Solution.words = words;
        visited = new int[words.length];
        answer = 0;
        
        bfs(begin, 0);
        
        return answer;
    }
    
    static void bfs(String name, int cnt) {
        Queue<Node> q = new LinkedList();
        q.add(new Node(name, cnt));
        
        while(!q.isEmpty()) {
            Node node = q.poll();
            
            if (node.name.equals(target)) {
                answer = node.cnt;
                return;
            }
            
            for (int i = 0; i < words.length; i++) {
                if (visited[i] != 0) continue;
                if (diff(node.name, words[i])) {
                    visited[i] = 1;
                    q.add(new Node(words[i], node.cnt + 1));
                }
            }
        }
    }
    
    static boolean diff(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) count++;
        }
        return count == 1;
    }
}











