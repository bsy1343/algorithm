import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        
        ArrayList<Integer> result = new ArrayList();
        for (int[] command : commands) {
            int start = command[0]-1;
            int end = command[1]-1;
            int target = command[2]-1;
            
            ArrayList<Integer> al = new ArrayList();
            for (int i = start; i <= end; i++) {
                al.add(array[i]);
            }
            
            Collections.sort(al);
            result.add(al.get(target));
        }
        
        return result.stream().mapToInt(o -> o).toArray();
    }
}