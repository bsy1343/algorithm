package Softeer.Lv2;


import java.io.*;
import java.util.*;

// https://softeer.ai/practice/6288
public class 금고털이 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int Result = 0;

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

        // 값으로 내림차순
        Collections.sort(list, (o1, o2) -> o2[1] - o1[1]);

        for (int[] arr : list) {
            if (K >= arr[0]) {
                K = K - arr[0];
                Result += arr[0] * arr[1];
            } else {
                // 가방의 무게보다 남은 보석의 무게가 많기 때문의 가방이 있는 만큼의 무게만큼 값을 매기고 환산하여 리턴
                Result += K * arr[1];
                break;
            }
        }
        System.out.println(Result);
    }
}