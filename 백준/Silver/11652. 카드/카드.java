import java.io.*;
import java.util.*;

public class Main {
    static class Node implements Comparable<Node> {
        long num;
        int cnt;
        Node (long num, int cnt) {
            this.num = num;
            this.cnt = cnt;
        }

        @Override
        public int compareTo(Node node) {
            // 카운트의 내림차순
            if (cnt != node.cnt) return node.cnt - cnt;
            // 수의 오름차순
            return Long.compare(num, node.num);
        }
    }
    static int n;
    static int[] arr;
    static ArrayList<Node> al = new ArrayList();
    static HashMap<Long, Integer> map = new HashMap();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n+1];

        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Long, Integer> map : map.entrySet()) {
            al.add(new Node(map.getKey(), map.getValue()));
        }

        Collections.sort(al);

        System.out.print(al.get(0).num);
        sc.close();
    }
}