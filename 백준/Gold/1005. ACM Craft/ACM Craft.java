import java.io.*;
import java.util.*;

public class Main {
    static int t, n, k, w;
    static int[] arr, indeg, result;
    static ArrayList<Integer>[] al;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        t = Integer.parseInt(st.nextToken());

        while(t-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            arr = new int[n + 1];
            indeg = new int[n + 1];
            result = new int[n + 1];
            al = new ArrayList[n + 1];

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                al[i] = new ArrayList();
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                al[x].add(y);
                indeg[y]++;
            }
            w = Integer.parseInt(br.readLine());

            bfs();

            System.out.println(result[w]);
        }
    }

    static void bfs() {
        Queue<Integer> q = new LinkedList();
        for (int i = 1; i <= n; i++) {
            if (indeg[i] == 0) {
                q.add(i);
                result[i] = arr[i];
            }
        }

        while(!q.isEmpty()) {
            int x = q.poll();

            for (int y : al[x]) {
                result[y] = Math.max(result[y], arr[y] + result[x]);

                indeg[y]--;
                if (indeg[y] == 0) q.add(y);
            }
        }
    }
}