import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList();
        
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int idx = commands[i][2];
            
            ArrayList<Integer> al = new ArrayList();
            for (int j = start-1; j < end; j++) {
                al.add(array[j]);
            }
            Collections.sort(al);
            result.add(al.get(idx-1));
        }
        answer = result.stream().mapToInt(o -> o).toArray();
        return answer;
    }
}