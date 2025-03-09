import java.io.*;
import java.util.*;

public class Main {

    static class Node implements Comparable<Node>{
        String s;
        int k, e, m;
        Node (String s, int k, int e, int m) {
            this.s = s;
            this.k = k;
            this.e = e;
            this.m = m;
        }
        @Override
        public int compareTo(Node node) {
            // 국어 내림차순
            if (k != node.k) return node.k - k;
            // 영어 점수 오름차순
            if (e != node.e) return e - node.e;
            // 수학 점수 내림차순
            if (m != node.m) return node.m - m;
            // 오름차순
            return s.compareTo(node.s);
        }
    }
    static int n;
    static ArrayList<Node> al = new ArrayList();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            al.add(new Node(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }

         Collections.sort(al);

        for (Node node : al) {
            System.out.println(node.s);
        }
    }
}