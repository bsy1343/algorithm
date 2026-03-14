import java.util.*;
import java.io.*;

class Solution {

    static int[] visited;
    static ArrayList<String> al = new ArrayList(); // 가능한 모든 경로 저장

    public String[] solution(String[][] tickets) {
        visited = new int[tickets.length];

        // ICN 출발, 초기 결과 문자열도 "ICN"으로 시작
        dfs(0, "ICN", "ICN", tickets);

        // 알파벳 순으로 정렬 → 첫 번째가 정답 (알파벳 최소 경로)
        Collections.sort(al);

        // "ICN JFK ATL ICN" → ["ICN", "JFK", "ATL", "ICN"] 으로 분리
        return al.get(0).split(" ");
    }

    // idx    : 사용한 티켓 수
    // now    : 현재 위치
    // result : 현재까지의 경로 문자열 (공백 구분)
    static void dfs(int idx, String now, String result, String[][] tickets) {

        // 모든 티켓 사용했으면 경로 저장
        if (idx == tickets.length) {
            al.add(result);
        } else {
            for (int i = 0; i < tickets.length; i++) {
                if (visited[i] != 0) continue;                  // 이미 사용한 티켓 skip
                if (!now.equals(tickets[i][0])) continue;       // 현재 위치에서 출발하는 티켓 아니면 skip
                visited[i] = 1;                                  // 티켓 사용 처리
                dfs(idx + 1, tickets[i][1], result + " " + tickets[i][1], tickets);
                visited[i] = 0;                                  // 백트래킹: 티켓 반납
            }
        }
    }
}