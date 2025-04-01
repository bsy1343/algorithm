import java.io.*;
import java.util.*;

public class Main {
    static int n, r, q;
    static int[] dy;
    static ArrayList<Integer>[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());

        dy = new int[n + 1];
        arr = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList();
        }

        for (int i = 1; i <= n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x].add(y);
            arr[y].add(x);
        }

        dfs(r, -1);

        for (int i = 1; i <= q; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            System.out.println(dy[x]);
        }
    }

    static void dfs(int x, int par) {
        dy[x] = 1;
        for (int y : arr[x]) {
            if (y == par) continue;
            dfs(y, x);
            dy[x] += dy[y];
        }
    }
}