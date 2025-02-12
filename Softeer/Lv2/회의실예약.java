package Softeer.Lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

//https://softeer.ai/practice/6266
public class 회의실예약 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, int[]> schedule = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            schedule.put(br.readLine(), new int[18]);
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String room = st.nextToken();
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int[] times = schedule.get(room);
            for (int k = start; k < end; k++) {
                times[k] = 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (String room : schedule.keySet()) {
            sb.append("Room ").append(room).append(":\n");
            int[] times = schedule.get(room);
            List<int[]> data = new ArrayList<>();

            for (int i = 9; i < times.length; i++) {
                if (times[i] == 0 && (i == 9 || times[i - 1] == 1)) {
                    int start = i;
                    while (i < times.length && times[i] == 0) i++;
                    data.add(new int[]{start, i});
                    i--;
                }
            }

            if (data.isEmpty()) {
                sb.append("Not available\n");
            } else {
                sb.append(data.size()).append(" available:\n");
                for (int[] time : data) {
                    sb.append(String.format("%02d-%02d\n", time[0], time[1]));
                }
            }

            if (++count < N) sb.append("-----\n");
        }

        System.out.print(sb);
    }
}