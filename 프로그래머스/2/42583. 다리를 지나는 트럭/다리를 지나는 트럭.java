import java.util.*;
import java.io.*;

class Solution {
    static class Node {
        int weight, exitTime;
        Node(int weight, int exitTime) {
            this.weight = weight;
            this.exitTime = exitTime;
        }
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Node> q = new LinkedList<>();
        int time = 0;
        int curWeight = 0;
        int idx = 0;

        while (idx < truck_weights.length || !q.isEmpty()) {
            time++;

            // 다리에서 빠질 트럭 / 큐가 있고, 해당 큐의 시간(거리 + 넣은시간)에 해당하면 빼기
            if (!q.isEmpty() && q.peek().exitTime == time) {
                curWeight -= q.poll().weight;
            }

            // 새로운 트럭 올릴 수 있으면 올림
            if (idx < truck_weights.length && curWeight + truck_weights[idx] <= weight) {
                curWeight += truck_weights[idx];
                q.add(new Node(truck_weights[idx], time + bridge_length));
                idx++;
            }
        }

        return time;
    }
}