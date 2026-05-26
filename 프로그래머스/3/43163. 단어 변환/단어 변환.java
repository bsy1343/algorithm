import java.util.*;
import java.io.*;

class Solution {

    // BFS 탐색용 노드 (현재 단어, 변환 횟수)
    static class Node {
        String name;
        int cnt;
        Node (String name, int cnt) {
            this.name = name;
            this.cnt = cnt;
        }
    }

    static int answer;
    static int[] visited;

    public int solution(String begin, String target, String[] words) {
        visited = new int[words.length];

        bfs(begin, target, words);

        // target이 words에 없으면 bfs에서 answer가 갱신 안됨 → 0 반환
        return answer;
    }

    static void bfs(String begin, String target, String[] words) {
        Queue<Node> q = new LinkedList();
        q.add(new Node(begin, 0)); // 시작 단어, 변환 횟수 0

        while (!q.isEmpty()) {
            Node now = q.poll();

            // target 도달 시 변환 횟수 저장 후 종료
            // BFS 특성상 처음 도달한 경우가 무조건 최소 변환 횟수
            if (now.name.equals(target)) {
                answer = now.cnt;
                return;
            }

            for (int i = 0; i < words.length; i++) {
                if (visited[i] != 0) continue;          // 이미 사용한 단어 skip
                if (!diff(now.name, words[i])) continue; // 한 글자 차이 아니면 skip
                visited[i] = 1;
                q.add(new Node(words[i], now.cnt + 1)); // 변환 횟수 +1
            }
        }
    }

    // 두 단어의 다른 글자 수가 1개인지 확인
    // 1개만 다르면 한 번에 변환 가능
    static boolean diff(String x, String y) {
        int cnt = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != y.charAt(i)) cnt++;
        }
        return cnt == 1;
    }
}