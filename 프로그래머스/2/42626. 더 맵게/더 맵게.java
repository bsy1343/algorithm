import java.io.*;
import java.util.*;

class Solution {
    
    public int solution(int[] scoville, int K) {
        // 최소 힙(작은 값이 먼저 나옴)으로 스코빌 지수 관리
        PriorityQueue<Integer> pq = new PriorityQueue();
        
        // 모든 음식의 스코빌 지수를 힙에 넣는다
        for (int i : scoville) pq.add(i);
        
        int count = 0; // 섞은 횟수 기록
        
        // 1) 최소값이 K 미만이고
        // 2) 섞을 음식이 2개 이상 있을 때 반복
        while (pq.size() > 1 && pq.peek() < K ) {
            // 가장 작은 음식
            int a = pq.poll();
            // 두 번째로 작은 음식
            int b = pq.poll();
            
            // 새로운 음식의 스코빌 지수 = 가장 작은 음식 + (두 번째 음식 * 2)
            pq.add(a + b * 2);
            
            // 섞은 횟수 +1
            count++;
        }
        
        // 반복이 끝난 후:
        // - 최소값이 K 이상이면 성공 → count 반환
        // - 그렇지 않으면(더 이상 섞을 수 없는데 K 미만이 남아 있으면) 실패 → -1
        return pq.peek() >= K ? count : -1;
    }
}