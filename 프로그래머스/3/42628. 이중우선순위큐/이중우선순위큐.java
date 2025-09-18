import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        Queue<Integer> min = new PriorityQueue<>();
        Queue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        
        for (String str : operations) {
            if (str.startsWith("I")) {
                int x = Integer.parseInt(str.substring(2));
                min.add(x);
                max.add(x);
            } else if (!min.isEmpty() && str.equals("D -1")) {
                max.remove(min.poll());
            } else if (!max.isEmpty() && str.equals("D 1")) {
                min.remove(max.poll());
            }
        }
        if (max.isEmpty() && min.isEmpty()) {
            return new int[] {0, 0};
        }
        return new int[] {max.poll(), min.poll()};
    }
}