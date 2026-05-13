import java.util.*;
import java.io.*;
class Solution {
    static ArrayList<Integer>[] al;
    
    public int solution(int n, int[][] wires) {
        
        // 그래프 초기화 (1번 인덱스부터 사용)
        al = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            al[i] = new ArrayList();
        }
        
        // 양방향 간선 추가
        for (int[] arr : wires) {
            al[arr[0]].add(arr[1]);
            al[arr[1]].add(arr[0]);
        }
        
        int answer = n;
        
        // 모든 간선을 하나씩 끊어보며 완전탐색
        for (int[] arr : wires) {
            // 간선 끊기
            al[arr[0]].remove(Integer.valueOf(arr[1]));
            al[arr[1]].remove(Integer.valueOf(arr[0]));
            
            // 끊긴 간선의 한쪽(arr[0])에서 BFS로 연결된 노드 수 카운트
            int cnt = bfs(arr[0]);
            
            // 두 컴포넌트 크기 차이의 최솟값 갱신
            answer = Math.min(answer, Math.abs(cnt - (n - cnt)));
            
            // 간선 복구
            al[arr[0]].add(arr[1]);
            al[arr[1]].add(arr[0]);
        }
        
        return answer;
    }
    
    static int bfs(int start) {
        int[] visited = new int[al.length]; // 방문 배열 (인덱스 0~n)
        Queue<Integer> q = new LinkedList();
        q.add(start);
        visited[start] = 1;
        
        int cnt = 0;
        while(!q.isEmpty()) {
            int now = q.poll();
            cnt++; // 현재 노드 카운트
            
            for (int next : al[now]) {
                if (visited[next] == 1) continue; // 이미 방문한 노드 스킵
                visited[next] = 1;
                q.add(next);
            }
        }
        return cnt; // 한쪽 컴포넌트 크기 반환
    }
}