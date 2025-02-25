import java.util.*;
import java.io.*;

class Solution {
    static boolean[] visit;
    static ArrayList<String> al;
    public String[] solution(String[][] tickets) {
        visit = new boolean[tickets.length];
        al = new ArrayList<>();
        
        dfs(0, "ICN", "ICN", tickets);
        Collections.sort(al);
        
        return al.get(0).split(" ");
    }
    
    static void dfs (int depth, String now, String path, String[][] tickets) {
        if (depth == tickets.length) {
            al.add(path);
            // System.out.println(path);
            return;
        }
        
        for (int i = 0; i < visit.length; i++) {
            if (visit[i] == false && now.equals(tickets[i][0])) {
                visit[i] = true;
                dfs(depth + 1, tickets[i][1], path + " " + tickets[i][1], tickets);
                visit[i] = false;
            }
        }
    }
}