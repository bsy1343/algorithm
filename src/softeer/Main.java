package src.softeer;

import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int result = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int w = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            map.put(g, map.getOrDefault(g, 0) + w);
        }

        List<int[]> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            list.add(new int[]{mapEntry.getValue(), mapEntry.getKey()});
        }

        Collections.sort(list, (a, b) -> b[1] - a[1]);

        for (int[] arr : list) {
            if (K >= arr[0]) {
                K -= arr[0];
                result += arr[0]*arr[1];
            } else {
                result += K * arr[1];
                break;
            }
        }
        System.out.print(result);
    }
}
