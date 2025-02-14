package Softeer;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, int[]> map = new TreeMap<>();
        //Map<String, int[]> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), new int[18]);
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for (int j = start; j < end; j++) {
                map.get(name)[j] = 1;
            }
        }

        for (Map.Entry<String, int[]> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + Arrays.toString(entry.getValue()));
        }


    }
}
