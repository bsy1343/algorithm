import java.util.*;
import java.io.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> al = new ArrayList();
        
        int cur = -1;
        for (int x : arr) {
            if (cur == x) continue;
            cur = x;
            al.add(x);
        }
        
        return al.stream().mapToInt(o -> o).toArray();
    }
}