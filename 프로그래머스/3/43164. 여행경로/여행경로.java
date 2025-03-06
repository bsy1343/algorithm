import java.io.*;
import java.util.*;

class Solution {
    static int[] visit;
    static ArrayList<String> al;
    
    public String[] solution(String[][] tickets) {
        visit = new int[tickets.length];
        al = new ArrayList();
        
        // dfs를 통해 모든것 돌리기
        dfs(0, "ICN", "ICN", tickets);
        
        
        // 답안 제출 시 알파벳 순으로 정렬
        Collections.sort(al);
        
        return al.get(0).split(" ");
    }
    
    private static void dfs(int depth, String start, String path, String[][] map) {
        if (depth == map.length) {
            al.add(path);
            // System.out.println(path);
            return;
        }
        
        for (int i = 0; i < map.length; i++) {
            if (visit[i] == 0 && start.equals(map[i][0])) {
                visit[i] = 1;
                dfs(depth + 1, map[i][1], path + " " + map[i][1], map);
                visit[i] = 0;
            }
        }
    }
}