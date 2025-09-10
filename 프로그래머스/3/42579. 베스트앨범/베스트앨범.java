import java.io.*;
import java.util.*;

class Solution {
    
    static class Node implements Comparable<Node>{
        String genres;
        int plays, value, idx;
        
        Node (String genres, int plays, int value, int idx) {
            this.genres = genres;
            this.plays = plays;
            this.value = value;
            this.idx = idx;
        }
        
        @Override
        public int compareTo(Node node) {
            if (this.value != node.value) return node.value - this.value;
            if (this.plays != node.plays) return node.plays - this.plays;
            if (this.idx != node.idx) return this.idx - node.idx;
            return this.genres.compareTo(node.genres);
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        ArrayList<Node> al = new ArrayList();
        HashMap<String, Integer> map = new HashMap();
        
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        for (int i = 0; i < genres.length; i++) {
            al.add(new Node(genres[i], plays[i], map.get(genres[i]), i));
        }
        
        Collections.sort(al);
        
        HashMap<String, Integer> visitedMap = new HashMap();
        ArrayList<Integer> arrList = new ArrayList();
        for (Node node : al) {
            int cnt = visitedMap.getOrDefault(node.genres, 0);
            if (cnt < 2) {
                arrList.add(node.idx);
                visitedMap.put(node.genres, cnt + 1);
            }
        }
        
        answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}