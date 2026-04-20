import java.io.*;
import java.util.*;

class Solution {
    
    static class Node implements Comparable<Node> {
        String genre;
        int play, total, idx;
        
        Node (String genre, int play, int total, int idx) {
            this.genre = genre;
            this.play = play;
            this.total = total;
            this.idx = idx;
        }
        
        @Override
        public int compareTo(Node node) {
            if (this.total != node.total) return node.total - this.total;
            if (this.play != node.play) return node.play - this.play;
            if (this.idx != node.idx) return this.idx - node.idx;
            
            return this.genre.compareTo(node.genre);
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        
        HashMap<String, Integer> map = new HashMap();
        ArrayList<Node> al = new ArrayList();
        
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        for (int i = 0; i < genres.length; i++) {
            al.add(new Node(genres[i], plays[i], map.get(genres[i]), i));
        }
        
        Collections.sort(al);
        
        ArrayList<Integer> al2 = new ArrayList();
        HashMap<String, Integer> map2 = new HashMap();
        for (Node node : al) {
            int cnt = map2.getOrDefault(node.genre, 0);
            if (cnt < 2) {
                al2.add(node.idx);
                map2.put(node.genre, cnt+1);
            }
        }
        
        return al2.stream().mapToInt(o -> o).toArray();
    }
}