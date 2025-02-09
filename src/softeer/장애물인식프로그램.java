package src.softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// https://softeer.ai/practice/6282
public class 장애물인식프로그램 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int K, B;
    static int[][] MAP;
    final static int[][] DIRECTION = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());

        MAP = new int[K][K];

        for (int i = 0; i < K; i++) {
            String input = br.readLine();
            for (int j = 0; j < K; j++) {
                MAP[i][j] = input.charAt(j) - '0';
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < K; j++) {
                if (MAP[i][j] == 1) {
                    B++;
                    list.add(dfs(i, j));
                }
            }
        }

        // 오름차순
        Collections.sort(list);

        // 내림차순은 Collections.reverse(list);

        System.out.println(B);
        for(int size : list) {
            System.out.println(size);
        }
    }

    private static int dfs(int x, int y) {
        int count = 1;
        MAP[x][y] = 0;
        for (int i = 0; i < DIRECTION.length; i++) {
            int nx = x + DIRECTION[i][0];
            int ny = y + DIRECTION[i][1];

            if (nx < 0 || ny < 0 || nx >= K || ny >= K || MAP[nx][ny] == 0) {
                continue;
            }
            count +=dfs(nx, ny);
        }
        return count;
    }
}