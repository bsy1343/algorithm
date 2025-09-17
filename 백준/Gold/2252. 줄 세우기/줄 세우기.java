import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[] indeg;
    static ArrayList<Integer>[] al;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        indeg = new int[n + 1];
        al = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            al[i] = new ArrayList();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            al[x].add(y);
            indeg[y]++;
        }

        bfs();

        System.out.println(sb.toString());
    }

    static void bfs() {
        Queue<Integer> q = new LinkedList();

        for (int i = 1; i <= n; i++) {
            if (indeg[i] == 0) q.add(i);
        }

        while(!q.isEmpty()) {
            int x = q.poll();

            sb.append(x).append(" ");

            for (int y : al[x]) {
                indeg[y]--;
                if (indeg[y] == 0) q.add(y);
            }
        }

    }
}