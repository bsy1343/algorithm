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
            if (this.cnt != node.cnt) return node.cnt - this.cnt;
            return Long.compare(this.num, node.num);
        }
    }

    static int n;
    static ArrayList<Node> al = new ArrayList();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        HashMap<Long, Integer> map = new HashMap();
        for (int i = 0; i < n; i++) {
            Long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            al.add(new Node(entry.getKey(), entry.getValue()));
        }

        Collections.sort(al);

        System.out.println(al.get(0).num);
    }
}