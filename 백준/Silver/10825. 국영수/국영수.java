import java.io.*;
import java.util.*;

public class Main {
    static class Node implements Comparable<Node> {
        String name;
        int k, e, m;

        Node (String name, int k, int e, int m) {
            this.name = name;
            this.k = k;
            this.e = e;
            this.m = m;
        }

        @Override
        public int compareTo(Node node) {
            if (this.k != node.k) return node.k - this.k;
            if (this.e != node.e) return this.e - node.e;
            if (this.m != node.m) return node.m - this.m;
            return this.name.compareTo(node.name);
        }
    }
    static int n;
    static ArrayList<Node> al = new ArrayList();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int k = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            al.add(new Node(name, k, e, m));
        }

        Collections.sort(al);

        for (Node node : al) {
            System.out.println(node.name);
        }

    }
}