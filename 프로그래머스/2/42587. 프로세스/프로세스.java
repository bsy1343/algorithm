import java.io.*;
import java.util.*;

class Solution {
    static class Node {
        int prior, idx;
        Node (int prior, int idx) {
            this.prior = prior;
            this.idx = idx;
        }
    }
    
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Node> q = new LinkedList();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < priorities.length; i++) {
            q.add(new Node(priorities[i], i));
            pq.add(priorities[i]);
        }
        
        while(!q.isEmpty()) {
            Node node = q.poll();
            
            if (node.prior == pq.peek()) {
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