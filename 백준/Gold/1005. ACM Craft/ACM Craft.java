import java.io.*;
import java.util.*;

public class Main {
    static int t, n, k, w;
    static int[] arr, indeg, arr_done;
    static ArrayList<Integer>[] al;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        t = Integer.parseInt(br.readLine());

        for (int test_case = 0; test_case < t; test_case++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            arr = new int[n + 1];
            arr_done = new int[n + 1];
            indeg = new int[n + 1];
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

            System.out.println(arr_done[w]);
        }
    }

    static void bfs() {
        Queue<Integer> q = new LinkedList();

        for (int i = 1; i <= n; i++) {
            if (indeg[i] == 0) {
                q.add(i);
                arr_done[i] = arr[i];
            }
        }

        while(!q.isEmpty()) {
            int x = q.poll();

            for (int y : al[x]) {
                arr_done[y] = Math.max(arr_done[y], arr_done[x] + arr[y]);
                indeg[y]--;
                if (indeg[y] == 0) q.add(y);
            }
        }
    }
}