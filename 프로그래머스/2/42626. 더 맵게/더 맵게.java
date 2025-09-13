import java.io.*;
import java.util.*;

class Solution {
    
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        for (int i : scoville) pq.add(i);
        
        int count = 0;
        while(pq.size() > 1 && pq.peek() < K ) {
            int a = pq.poll();
            int b = pq.poll();
            
            pq.add(a + b * 2);
            
            count++;
        }
        
        return pq.peek() >= K ? count : -1;
    }
}