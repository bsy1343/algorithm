import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        // 최소 힙 (최솟값 빠르게 꺼낼 용도)
        PriorityQueue<Integer> minpq = new PriorityQueue<>();
        // 최대 힙 (최댓값 빠르게 꺼낼 용도)
        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());

        for (String operation : operations) {
            if (operation.startsWith("I ")) {
                // I n → 값 n 삽입 (두 힙에 모두 넣어서 동기화 시작)
                int n = Integer.parseInt(operation.substring(2));
                minpq.add(n);
                maxpq.add(n);
            } else if (!minpq.isEmpty() && operation.equals("D -1")) {
                // D -1 → 최솟값 삭제
                // minpq에서 poll() → 최솟값 꺼내고
                // maxpq에서 remove(그 값) → 같은 값 제거하여 동기화 유지
                maxpq.remove(minpq.poll());
            } else if (!maxpq.isEmpty() && operation.equals("D 1")) {
                // D 1 → 최댓값 삭제
                // maxpq에서 poll() → 최댓값 꺼내고
                // minpq에서 remove(그 값) → 같은 값 제거하여 동기화 유지
                minpq.remove(maxpq.poll());
            }
        }

        // 큐가 비어있으면 [0,0] 반환
        if (minpq.isEmpty() && maxpq.isEmpty()) {
            return new int[]{0, 0};
        }

        // 큐가 남아있으면 [최댓값, 최솟값] 반환
        return new int[]{maxpq.poll(), minpq.poll()};
    }
}