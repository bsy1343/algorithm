import java.util.*;

class Solution {
    static class Node {
        int weight, time;
        Node (int weight, int time) {
            this.weight = weight;
            this.time = time;
        }
    }
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Node> q = new LinkedList();
        
        int time = 0;
        int idx = 0;
        int curWeight = 0;
        
        while(idx < truck_weights.length || !q.isEmpty()) {
            time++;
            
            // 퇴장
            if (!q.isEmpty() && q.peek().time == time) {
                curWeight -= q.poll().weight;
            }
            
            if (idx < truck_weights.length) {
                int next = truck_weights[idx];
                if (weight >= curWeight + next) {
                    curWeight += next;
                    q.add(new Node (next, bridge_length + time));
                    idx++;
                }
            }
        }
        return time;
    }
}