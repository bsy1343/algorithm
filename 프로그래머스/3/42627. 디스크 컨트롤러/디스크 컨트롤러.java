import java.io.*;
import java.util.*;

class Solution {
    static class Node {
        int start, end;
        Node (int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public int solution(int[][] jobs) {
        int answer = 0;
        // 리버스는 Comparator.comparingInt(o -> o.start).reversed().thenComparingInt(Comparator.comparingInt(o -> o.end).reversed())
        // o -> o.start가 안되면 (Node o) -> o.start
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt((Node o) -> o.start).thenComparingInt(o -> o.end));
        for (int[] job : jobs) {
            pq.add(new Node(job[0], job[1]));
        }
        
        int time = 0;      // 현재 시각 (CPU 시계)
        int idx = 0;       // jobs 배열에서 확인할 다음 작업의 인덱스
        int total = 0;     // 모든 작업의 응답시간 합계
        int n = jobs.length;
        
        // 모든 작업을 처리할 때까지 반복
        while (idx < n || !pq.isEmpty()) {
            
            // 3. 현재 시각까지 도착한 모든 작업을 대기열에 추가
            while (idx < n && jobs[idx][0] <= time) {
                pq.offer(new Node(jobs[idx][0], jobs[idx][1]));  // [요청시각, 작업시간]
                idx++;
            }
            
            // 4. 실행할 작업 결정
            if (pq.isEmpty()) {
                // 대기열이 비어있음 → 다음 작업 도착시각으로 시간 점프
                time = jobs[idx][0];
            } else {
                // 대기열에서 작업시간이 가장 짧은 작업 실행
                Node currentJob = pq.poll();
                time += currentJob.end;                    // 작업 실행
                total += time - currentJob.start;          // 응답시간 계산
            }
        }
        
        return total / n;  // 평균 응답시간

    }
}