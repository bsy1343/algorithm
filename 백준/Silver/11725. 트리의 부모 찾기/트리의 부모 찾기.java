import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[] parent;
    static ArrayList<Integer>[] al;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        parent = new int[n + 1];
        al = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            al[i] = new ArrayList();
        }

        for (int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            al[x].add(y);
            al[y].add(x);
        }

        dfs(1, -1);

        for (int i = 2; i <= n; i++) {
            System.out.println(parent[i]);
        }
    }

    static void dfs(int x, int par) {
        for (int y : al[x]) {
            if (y == par) continue;
            parent[y] = x;
            dfs(y, x);
        }
    }
}