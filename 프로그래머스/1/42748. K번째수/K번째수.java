import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> result = new ArrayList();
        
        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> al = new ArrayList();
            
            int x = commands[i][0];
            int y = commands[i][1];
            int z = commands[i][2];
            
            for (int j = x-1; j < y; j++) {
                al.add(array[j]);
            }
            
            Collections.sort(al);
            
            result.add(al.get(z-1));
        }
        
        return result.stream().mapToInt(o -> o).toArray();
    }
}