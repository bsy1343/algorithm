import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        ArrayList<Integer> al = new ArrayList();
        int a = 0, b = 0, c = 0;
        int max = 0;
        for (int i = 0; i < answers.length; i++) {
            a = arr[0][i % arr[0].length] == answers[i] ? a + 1 : a;
            b = arr[1][i % arr[1].length] == answers[i] ? b + 1 : b;
            c = arr[2][i % arr[2].length] == answers[i] ? c + 1 : c;
            
            max = Math.max(a, Math.max(b, c));
        }
        
        if (a == max) al.add(1);
        if (b == max) al.add(2);
        if (c == max) al.add(3);
        
        
        return al.stream().mapToInt(o -> o).toArray();
    }
}