import java.io.*;
import java.util.*;

class Solution {
    
    static class Node implements Comparable<Node> {
        String str;
        
        Node (String str) {
            this.str = str;
        }
        
        @Override
        public int compareTo(Node node) {
            String s1 = node.str + this.str;
            String s2 = this.str + node.str;
            return s1.compareTo(s2);
        }
    }
    
    public String solution(int[] numbers) {
        
        ArrayList<Node> al = new ArrayList();
        for (int number : numbers) {
            al.add(new Node(String.valueOf(number)));
        }
        
        Collections.sort(al);
        
        if (al.get(0).str.equals("0")) {
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        for (Node node : al) {
            sb.append(node.str);
        }
        
        return sb.toString();
    }
}