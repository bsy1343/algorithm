import java.io.*;
import java.util.*;

public class Main {

    static class Node implements Comparable<Node> {
        int num, idx;

        Node (int num, int idx) {
            this.num = num;
            this.idx = idx;
        }

        @Override
        public int compareTo(Node node) {
            if (this.num != node.num) return this.num - node.num;
            return this.idx - node.idx;
        }
    }
    static int n;
    static int[] arr, p;
    static ArrayList<Node> al = new ArrayList();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        p = new int[n];


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            al.add(new Node(arr[i], i));
        }
        Collections.sort(al);

        for (int i = 0; i < n; i++) {
            p[al.get(i).idx] = i;
        }

        for (int i : p) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);

    }
}