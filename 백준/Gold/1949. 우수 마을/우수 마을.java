import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[] num;
    static int[][] dy;
    static ArrayList<Integer>[] arrList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        num = new int[n + 1];
        dy = new int[n + 1][2];
        arrList = new ArrayList[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            arrList[i] = new ArrayList();
        }

        for (int i = 1; i <= n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arrList[x].add(y);
            arrList[y].add(x);
        }

        dfs(1, -1);

        System.out.println(Math.max(dy[1][0], dy[1][1]));
    }

    static void dfs(int x, int par) {
        dy[x][0] = 0;
        dy[x][1] = num[x];

        for (int y : arrList[x]) {
            if (y == par) continue;
            dfs(y, x);
            dy[x][0] += Math.max(dy[y][0], dy[y][1]);
            dy[x][1] += dy[y][0];
        }
    }
}