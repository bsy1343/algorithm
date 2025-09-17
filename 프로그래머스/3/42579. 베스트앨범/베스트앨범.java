import java.io.*;
import java.util.*;

class Solution {
    
    static class Node implements Comparable<Node> {
        String genres;
        int plays, idx, total;
        
        Node (String genres, int plays, int idx, int total) {
            this.genres = genres;
            this.plays = plays;
            this.idx = idx;
            this.total = total;
        }
        
        @Override
        public int compareTo(Node node) {
            if (this.total != node.total) return node.total - this.total;
            if (this.plays != node.plays) return node.plays - this.plays;
            if (this.idx != node.idx) return this.idx - node.idx;
            return this.genres.compareTo(node.genres);
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap();
        ArrayList<Node> al = new ArrayList();
        
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        for (int i = 0; i < genres.length; i++) {
            al.add(new Node(genres[i], plays[i], i, map.get(genres[i])));
        }
        
        Collections.sort(al);
        
        HashMap<String, Integer> map2 = new HashMap();
        ArrayList<Integer> al2 = new ArrayList();
        for (Node node : al) {
            int cnt = map2.getOrDefault(node.genres, 0);
            if (cnt < 2) {
                al2.add(node.idx);
                map2.put(node.genres, cnt+1);
            }
        }
        
        return al2.stream().mapToInt(o ->o).toArray();
    }
}