import java.io.*;
import java.util.*;

public class Main {

    static int n, root, minor;
    static int[] leaf;
    static ArrayList<Integer>[] al;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        leaf = new int[n];
        al = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            al[i] = new ArrayList();
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (x == -1) {
                root = i;
                continue;
            }
            al[x].add(i);
        }

        minor = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            al[i].remove(Integer.valueOf(minor));
        }

        if (root != minor) {
            dfs(root, -1);
        }

        System.out.println(leaf[root]);

    }

    static void dfs(int x, int par) {
        if (al[x].isEmpty()) {
            leaf[x]++;
        }
        for (int y : al[x]) {
            if (y == par) continue;
            dfs(y, x);
            leaf[x] += leaf[y];
        }
    }
}