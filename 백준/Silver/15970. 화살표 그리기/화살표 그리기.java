import java.io.*;
import java.util.*;

public class Main {

    static int n, answer;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static ArrayList<Integer>[] al;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        // 1 ≤ y ≤ N
        al = new ArrayList[n + 1];

        // 색깔 배열 초기화
        for (int i = 1; i <= n; i++) {
            al[i] = new ArrayList();
        }

        // 색 마다 값을 넣어줌
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int value = Integer.parseInt(st.nextToken());
            int color = Integer.parseInt(st.nextToken());
            al[color].add(value);
        }

        // 색깔 별로 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(al[i]);
        }

        for (int color = 1; color <= n; color++) {
            // 색깔 별로, 각 점마다 가장 가까운 점 찾기
            for (int i = 0; i < al[color].size(); i++) {
                // 왼쪽점까지의 거리
                int toLeft = fnLeft(color, i);
                // 오른쪽점까지의 거리
                int toRight = fnRight(color, i);

                answer += Math.min(toLeft, toRight);
            }
        }

        System.out.println(answer);
    }

    static int fnLeft(int color, int index) {
        // 왼쪽으로 갈 곳이 없다면 무한대 리턴
        if (index == 0) return Integer.MAX_VALUE;

        // 왼쪽으로 이동 할 수 있으면 바로 이전 인덱스와의 거리를 계산
        return al[color].get(index) - al[color].get(index-1);
    }

    static int fnRight(int color, int index) {
        // 오른쪽으로 갈 곳이 없다면 무한대 리턴
        if (index == al[color].size() - 1) return Integer.MAX_VALUE;

        // 오른쪽으로 이동 할 수 있으면 다음 인덱스와의 거리를 계산
        return al[color].get(index + 1) - al[color].get(index);
    }
}