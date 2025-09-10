import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[][] humans = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] result = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == humans[0][i%humans[0].length]) result[0]++;
            if (answers[i] == humans[1][i%humans[1].length]) result[1]++;
            if (answers[i] == humans[2][i%humans[2].length]) result[2]++;
        }
        
        int max = Math.max(result[0], Math.max(result[1], result[2]));
        ArrayList<Integer> al = new ArrayList();
        
        for (int i = 0; i < result.length; i++) {
            if (result[i] == max) al.add(i+1);
        }
        
        answer = al.stream().mapToInt(o -> o).toArray();
        return answer;
    }
}