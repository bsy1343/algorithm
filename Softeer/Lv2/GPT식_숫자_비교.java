package Softeer.Lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// https://softeer.ai/practice/11001
public class GPT식_숫자_비교 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> numbers = new ArrayList<>();

        // 입력 받기
        for (int i = 0; i < N; i++) {
            numbers.add(sc.next());
        }

        // Collections.sort는 리스트의 모든 요소들을 두 개씩 비교하면서 정렬합니다.
        // (a, b)는 비교할 두 수를 의미합니다.
        Collections.sort(numbers, (a, b) -> {
            // 1. 각 숫자를 소수점을 기준으로 나눕니다.
            // 예: "1.23" -> ["1", "23"], "3" -> ["3"]
            // 삼항연산자 사용: (조건) ? (참일때) : (거짓일때)
            String[] aParts = a.contains(".") ? a.split("\\.") : new String[]{a};
            String[] bParts = b.contains(".") ? b.split("\\.") : new String[]{b};

            // 2. 소수점 왼쪽(정수 부분)을 비교
            // 예: "1.23"과 "2.1"을 비교할 때 1 < 2 이므로 "1.23"이 앞으로
            int aLeft = Integer.parseInt(aParts[0]);
            int bLeft = Integer.parseInt(bParts[0]);
            if (aLeft != bLeft) {
                return aLeft - bLeft;  // 음수면 a가 앞으로, 양수면 b가 앞으로
            }

            // 3. 정수 부분이 같을 때, 소수점 유무를 비교
            // 예: "3"과 "3.1"을 비교할 때
            if (aParts.length == 1 && bParts.length > 1) return -1;  // a가 정수, b가 소수면 a가 앞으로
            if (aParts.length > 1 && bParts.length == 1) return 1;   // a가 소수, b가 정수면 b가 앞으로
            if (aParts.length == 1 && bParts.length == 1) return 0;  // 둘 다 정수면 같은 것으로 처리

            // 4. 정수 부분도 같고 둘 다 소수일 때, 소수 부분을 비교
            // 예: "1.2"와 "1.11"을 비교할 때 2 < 11 이므로 "1.2"가 앞으로
            return Integer.parseInt(aParts[1]) - Integer.parseInt(bParts[1]);
        });

        // 출력
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}