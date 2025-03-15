import java.util.*;

public class Main {
    static class Node implements Comparable<Node> {
        int value, index;
        Node (int value, int index) {
            this.value = value;
            this.index = index;
        }
        @Override
        public int compareTo (Node node) {
            if (value != node.value) return value - node.value;
            return index - node.index;
        }
    }

    static int n;
    static int[] p;
    static ArrayList<Node> al = new ArrayList();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        p = new int[n];

        for (int i = 0; i < n; i++) {
            al.add(new Node(sc.nextInt(), i));
        }

        Collections.sort(al);

        for (int i = 0; i < n; i++) {
            p[al.get(i).index] = i;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " ");
        }
    }
}