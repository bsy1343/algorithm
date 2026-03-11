import java.io.*;
import java.util.*;

public class Main {

    static class Node {
        int a, b, c;
        Node (int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c= c;
        }
    }
    static int a, b, c;
    static int[][][] visited;
    static ArrayList<Integer> al = new ArrayList();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        visited = new int[a + 1][b + 1][c + 1];

        bfs(c);

        Collections.sort(al);

        StringBuilder sb = new StringBuilder();
        for (int x : al) {
            sb.append(x).append(" ");
        }
        System.out.println(sb.toString());
    }

    static void bfs(int x) {
        Queue<Node> q = new LinkedList();
        q.add(new Node(0, 0, x));
        visited[0][0][x] = 1;

        while(!q.isEmpty()) {
            Node node = q.poll();
            int na = node.a;
            int nb = node.b;
            int nc = node.c;

            if (na == 0) {
                al.add(nc);
            }

            // a -> b
            if (na > 0) {
                int pour = Math.min(na, b - nb);
                add(q, na - pour, nb + pour, nc);
            }

            // a -> c
            if (na > 0) {
                int pour = Math.min(na, c - nc);
                add(q, na - pour, nb, nc + pour);
            }

            // b -> a
            if (nb > 0) {
                int pour = Math.min(nb, a - na);
                add(q, na + pour, nb - pour, nc);
            }

            // b -> c
            if (nb > 0) {
                int pour = Math.min(nb, c - nc);
                add(q, na, nb - pour, nc + pour);
            }

            // c -> a
            if (nc > 0) {
                int pour = Math.min(nc, a - na);
                add(q, na + pour, nb, nc - pour);
            }

            // c -> b
            if (nc > 0) {
                int pour = Math.min(nc, b - nb);
                add(q, na, nb + pour, nc - pour);
            }
        }
    }

    static void add(Queue<Node> q, int a, int b, int c) {
        if (visited[a][b][c] == 1) return;
        visited[a][b][c] = 1;
        q.add(new Node(a, b, c));
    }
}