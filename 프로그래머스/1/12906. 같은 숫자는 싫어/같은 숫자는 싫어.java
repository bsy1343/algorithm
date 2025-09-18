import java.util.*;
import java.io.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> al = new ArrayList();
        int cur = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (cur == arr[i]) continue;
            cur = arr[i];
            al.add(cur);
        }
        
        return al.stream().mapToInt(o -> o).toArray();
    }
}