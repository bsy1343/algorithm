package Softeer.Lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 비밀메뉴 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());  // 비밀 메뉴 길이
        int N = Integer.parseInt(st.nextToken());  // 사용자의 입력 길이
        int K = Integer.parseInt(st.nextToken());  // 버튼 개수

        // 비밀 메뉴 조작법 입력
        int[] hidden = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            hidden[i] = Integer.parseInt(st.nextToken());
        }

        // 사용자의 버튼 입력
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // M > N 이면 비밀 메뉴를 입력할 수 없으므로 바로 "normal" 출력
        if (M > N) {
            System.out.println("normal");
            return;
        }

        // 슬라이딩 윈도우 방식으로 부분 배열 확인
        for (int i = 0; i <= N - M; i++) {
            boolean found = true;
            for (int j = 0; j < M; j++) {
                if (arr[i + j] != hidden[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                System.out.println("secret");
                return;
            }
        }

        // 비밀 메뉴 패턴이 없으면 "normal"
        System.out.println("normal");
    }
}