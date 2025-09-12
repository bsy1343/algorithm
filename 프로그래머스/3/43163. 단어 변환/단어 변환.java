import java.util.*;

class Solution {
    static class Node {
        String word;
        int cnt;
        Node(String word, int cnt) {
            this.word = word;
            this.cnt = cnt;
        }
    }
    
    static int n, answer;
    static int[] visited;
    static String[] words;
    static String begin, target;

    public int solution(String begin, String target, String[] words) {
        Solution.begin = begin;
        Solution.target = target;
        Solution.n = words.length;
        Solution.words = words;
        visited = new int[n];

        // target이 아예 words 안에 없으면 불가능
        // boolean exist = false;
        // for (String w : words) {
        //     if (w.equals(target)) exist = true;
        // }
        // if (!exist) return 0;
        
        bfs();

        return answer; // 못 도달했을 때
    }
    
    static void bfs() {
         // 큐: [현재단어, 단계수]
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(begin, 0));

        while (!q.isEmpty()) {
            Node cur = q.poll();

            // 목표 도착하면 그때의 단계수 반환 (최단 거리 보장됨)
            if (cur.word.equals(target)) {
                answer = cur.cnt;
                return;
            }

            // 모든 단어를 돌면서 "한 글자만 다른 단어"면 큐에 추가
            for (int i = 0; i < n; i++) {
                if (visited[i] == 1) continue;
                if (diff1(cur.word, words[i])) {
                    visited[i] = 1;
                    q.add(new Node(words[i], cur.cnt + 1));
                }
            }
        }
    }

    static boolean diff1(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) diff++;
        }
        return diff == 1; // 정확히 한 글자만 다르면 true
    }
    
}