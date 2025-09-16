import java.io.*;
import java.util.*;
import org.w3c.dom.Node;

public class Main {
    static class Node {
        int x, dist;

        Node(int x, int dist) {
            this.x = x;
            this.dist = dist;
        }
    }

    static int n, k;
    static int[] arr, visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        visited = new int[100001];

        bfs(n);

    }

    static void bfs(int idx) {
        Queue<Node> q = new LinkedList();
        q.add(new Node(idx, 0));
        visited[idx] = 1;

        while(!q.isEmpty()) {
            Node node = q.poll();

            if (node.x == k) {
                System.out.println(node.dist);
                break;
            }

            if (node.x + 1 < 100001 && visited[node.x + 1] == 0) {
                visited[node.x + 1] = 1;
                q.add(new Node(node.x + 1, node.dist + 1));
            }

            if (node.x - 1 >= 0 && visited[node.x - 1] == 0) {
                visited[node.x - 1] = 1;
                q.add(new Node(node.x - 1, node.dist + 1));
            }

            if (node.x * 2 < 100001 && visited[node.x * 2] == 0) {
                visited[node.x * 2] = 1;
                q.add(new Node(node.x * 2, node.dist + 1));
            }
        }
    }
}