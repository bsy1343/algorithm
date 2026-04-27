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
    static HashMap<Long, Integer> map = new HashMap();
    static ArrayList<Node> al = new ArrayList();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            long card = Long.parseLong(br.readLine());
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        for (Map.Entry<Long, Integer> map : map.entrySet()) {
            al.add(new Node(map.getKey(), map.getValue()));
        }

        Collections.sort(al);

        System.out.println(al.get(0).num);
    }
}
