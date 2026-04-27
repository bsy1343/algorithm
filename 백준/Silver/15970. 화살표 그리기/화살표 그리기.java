import java.io.*;
import java.util.*;

public class Main {

    static int n, answer;
    static ArrayList <Integer>[] al;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        answer = 0;
        al = new ArrayList[n + 1];


        for (int i = 0; i <= n; i++) {
            al[i] = new ArrayList();
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int color = Integer.parseInt(st.nextToken());

            al[color].add(num);
        }


        for (int color = 1; color <= n; color++) {
            Collections.sort(al[color]);
            for (int idx = 0;  idx < al[color].size(); idx++) {
                int left = fnLeft(color, idx);
                int right = fnRight(color, idx);

                answer += Math.min(left, right);
            }
        }

        System.out.println(answer);

    }

    static int fnLeft(int color, int idx) {
        if (idx == 0) return Integer.MAX_VALUE;
        return al[color].get(idx) - al[color].get(idx - 1);
    }

    static int fnRight(int color, int idx) {
        if (idx == al[color].size() - 1) return Integer.MAX_VALUE;
        return al[color].get(idx + 1) - al[color].get(idx);
    }
}
