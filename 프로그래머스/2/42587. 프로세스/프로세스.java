import java.util.*;

class Solution {
    static class Node {
        int x, idx;
        Node (int x, int idx) {
            this.x = x;
            this.idx = idx;
        }
    }
    
    public int solution(int[] priorities, int location) {
        Queue<Node> q = new LinkedList();
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < priorities.length; i++) {
            q.add(new Node(priorities[i], i));
            pq.add(priorities[i]);
        }
        
        int answer = 0;
        while(!q.isEmpty()) {
            Node node = q.poll();
            
            if (node.x == pq.peek()) {
                answer++;
                pq.poll();
                if (node.idx == location) return answer;
            } else {
                q.add(node);
            }
        }
        
        return answer;
    }
}