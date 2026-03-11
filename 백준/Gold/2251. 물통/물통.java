import java.io.*;
import java.util.*;

public class Main {
    // 물통의 현재 상태를 나타내는 노드 (A, B, C 각각의 물의 양)
    static class Node {
        int a, b, c;
        Node(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    static int a, b, c;           // 물통 A, B, C의 최대 용량
    static int[][][] visited;      // 방문 여부: visited[a현재량][b현재량][c현재량]
    static ArrayList<Integer> al = new ArrayList<>();  // A가 빌 때 C의 물 양 목록
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        a = Integer.parseInt(st.nextToken()); // A 최대 용량
        b = Integer.parseInt(st.nextToken()); // B 최대 용량
        c = Integer.parseInt(st.nextToken()); // C 최대 용량

        visited = new int[a + 1][b + 1][c + 1];

        // 초기 상태: A=0, B=0, C=가득(c)
        bfs(c);

        Collections.sort(al);
        for (int x : al) {
            sb.append(x).append(" ");
        }
        
        System.out.println(sb.toString());
    }

    static void bfs(int x) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(0, 0, x));   // 초기 상태 삽입
        visited[0][0][x] = 1;

        while (!q.isEmpty()) {
            Node node = q.poll();
            int na = node.a;
            int nb = node.b;
            int nc = node.c;

            // A가 비어있을 때 C의 물 양을 정답 목록에 추가
            if (na == 0) {
                al.add(nc);
            }

            // A -> B: A에서 B로 붓기 (B가 가득 차거나 A가 빌 때까지)
            if (na > 0) {
                int pour = Math.min(na, b - nb);  // 실제로 부을 수 있는 양
                add(q, na - pour, nb + pour, nc);
            }

            // A -> C: A에서 C로 붓기
            if (na > 0) {
                int pour = Math.min(na, c - nc);
                add(q, na - pour, nb, nc + pour);
            }

            // B -> A: B에서 A로 붓기
            if (nb > 0) {
                int pour = Math.min(nb, a - na);
                add(q, na + pour, nb - pour, nc);
            }

            // B -> C: B에서 C로 붓기
            if (nb > 0) {
                int pour = Math.min(nb, c - nc);
                add(q, na, nb - pour, nc + pour);
            }

            // C -> A: C에서 A로 붓기
            if (nc > 0) {
                int pour = Math.min(nc, a - na);
                add(q, na + pour, nb, nc - pour);
            }

            // C -> B: C에서 B로 붓기
            if (nc > 0) {
                int pour = Math.min(nc, b - nb);
                add(q, na, nb + pour, nc - pour);
            }
        }
    }

    // 방문하지 않은 상태만 큐에 추가
    static void add(Queue<Node> q, int a, int b, int c) {
        if (visited[a][b][c] == 1) return;  // 이미 방문한 상태면 스킵
        visited[a][b][c] = 1;
        q.add(new Node(a, b, c));
    }
}