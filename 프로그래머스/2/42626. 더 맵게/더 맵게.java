import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 최소힙
        for (int s : scoville) pq.add(s);

        int count = 0;
        // 최소값이 K 미만이고, 섞을 재료(최소 2개)가 있을 때만 진행
        while (pq.size() > 1 && pq.peek() < K) {
            int a = pq.poll();      // 최소
            int b = pq.poll();      // 두 번째 최소
            pq.add(a + 2 * b);      // 새 음식
            count++;
        }
        // 모두 K 이상이면 성공, 아니면 실패(-1)
        return pq.peek() >= K ? count : -1;
    }
}