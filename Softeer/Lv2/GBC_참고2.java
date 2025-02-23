package Softeer.Lv2;

// https://softeer.ai/practice/6270

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GBC_참고2 {
    // GPT 기준으로 수를 나타내는 클래스
    static class Number implements Comparable<Number> {
        int x;          // 소수점 왼쪽 부분
        int y;          // 소수점 오른쪽 부분 (-1이면 정수)
        String original; // 원래 입력 문자열

        Number(String s) {
            this.original = s;
            String[] parts = s.split("\\."); // 소수점으로 분리
            this.x = Integer.parseInt(parts[0]); // 정수 부분
            if (parts.length == 1) {
                this.y = -1; // 소수점 없는 경우
            } else {
                this.y = Integer.parseInt(parts[1]); // 소수점 아래 부분을 정수로
            }
        }

        @Override
        public int compareTo(Number other) {
            // x 비교
            if (this.x != other.x) {
                return Integer.compare(this.x, other.x);
            }
            // x가 같으면 y 비교
            // y가 -1이면 정수이므로 더 작게 취급
            if (this.y == -1 && other.y != -1) return -1;
            if (this.y != -1 && other.y == -1) return 1;
            // 둘 다 정수거나 둘 다 소수점 있으면 y 비교
            return Integer.compare(this.y, other.y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        // 입력된 수를 Number 객체로 변환해 리스트에 저장
        List<Number> numbers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();
            numbers.add(new Number(input));
        }

        // GPT 기준으로 정렬
        Collections.sort(numbers);

        // 결과 출력
        for (Number num : numbers) {
            System.out.println(num.original);
        }

        sc.close();
    }
}