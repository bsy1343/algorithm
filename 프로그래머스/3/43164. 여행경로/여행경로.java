import java.io.*;
import java.util.*;

class Solution {
    
    static String[][] tickets;
    
    static int[] visited;
    static ArrayList<String> al = new ArrayList();
    
    public String[] solution(String[][] tickets) {
        
        Solution.tickets = tickets;
        visited = new int[tickets.length];
        
        dfs(0, "ICN", "ICN");
        Collections.sort(al);
        
        return al.get(0).split(" ");
    }
    
    static void dfs(int idx, String now, String result) {
        if (idx == tickets.length) {
            al.add(result);
            return;
        } else {
            for (int i = 0; i < tickets.length; i++) {
                if (visited[i] != 0) continue;
                if (!now.equals(tickets[i][0])) continue;
                visited[i] = 1;
                dfs(idx + 1, tickets[i][1], result + " " + tickets[i][1]);
                visited[i] = 0;
                
            }
        }
    }
}