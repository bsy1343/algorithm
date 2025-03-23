import java.io.*;
import java.util.*;

public class Main {

    static class Node {
        int x, s;
        Node (int x, int s) {
            this.x = x;
            this.s = s;
        }
    }
    static int n, k;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        visited = new boolean[100001];

        bfs(n, 0);
    }

    static void bfs(int start, int cnt) {
        Queue<Node> q = new LinkedList();

        visited[start] = true;
        q.add(new Node(start, cnt));

        while(!q.isEmpty()) {
            Node node = q.poll();

            if (node.x == k) {
                System.out.print(node.s);
                break;
            }

            int rst = node.x + 1;
            if (rst > -1 && rst < 100001 && !visited[rst]) {
                visited[rst] = true;
                q.add(new Node(rst, node.s+1));
            }

            rst = node.x - 1;
            if (rst > -1 && rst < 100001 && !visited[rst]) {
                visited[rst] = true;
                q.add(new Node(rst, node.s+1));
            }

            rst = node.x * 2;
            if (rst > -1 && rst < 100001 && !visited[rst]) {
                visited[rst] = true;
                q.add(new Node(rst, node.s+1));
            }
        }
    }
}