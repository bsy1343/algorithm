import java.util.*;
import java.io.*;

public class Solution {
    static int[] arr;
    
    static ArrayList<Integer> al = new ArrayList();
    
    public int[] solution(int []arr) {
        int cur = -1;
        for (int i = 0; i < arr.length; i++) {
            if (cur == arr[i]) continue;
            cur = arr[i];
            al.add(arr[i]);
        }

        return al.stream().mapToInt(o -> o).toArray();
    }
}