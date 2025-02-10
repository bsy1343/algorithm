package Softeer.Lv2;

// https://softeer.ai/practice/6270
import java.util.Scanner;

public class GBC_참고 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리
        int N = sc.nextInt(); // 제한 구간 개수
        int M = sc.nextInt(); // 테스트 구간 개수

        int[] limitLengths = new int[N];
        int[] limitSpeeds = new int[N];
        for (int i = 0; i < N; i++) {
            limitLengths[i] = sc.nextInt();
            limitSpeeds[i] = sc.nextInt();
        }

        int[] testLengths = new int[M];
        int[] testSpeeds = new int[M];
        for (int i = 0; i < M; i++) {
            testLengths[i] = sc.nextInt();
            testSpeeds[i] = sc.nextInt();
        }

        // 구간별 비교
        int maxExcessSpeed = 0;
        int limitIndex = 0, testIndex = 0;
        int limitDistance = 0, testDistance = 0;

        while (limitIndex < N && testIndex < M) {
            int currentLimitSpeed = limitSpeeds[limitIndex];
            int currentTestSpeed = testSpeeds[testIndex];

            // 초과 속도 계산
            if (currentTestSpeed > currentLimitSpeed) {
                maxExcessSpeed = Math.max(maxExcessSpeed, currentTestSpeed - currentLimitSpeed);
            }

            // 구간 소진 처리
            if (limitLengths[limitIndex] - limitDistance < testLengths[testIndex] - testDistance) {
                testDistance += (limitLengths[limitIndex] - limitDistance);  // 실제 주행 거리에 제한구간 길이만큼 더함
                limitDistance = 0;  // 현재 제한구간은 다 썼으니 0으로
                limitIndex++;  // 다음 제한구간으로 이동
            } else if (limitLengths[limitIndex] - limitDistance > testLengths[testIndex] - testDistance) {
                limitDistance += (testLengths[testIndex] - testDistance);  // 제한구간 거리에 실제주행 길이만큼 더함
                testDistance = 0;  // 현재 주행구간은 다 썼으니 0으로
                testIndex++;  // 다음 주행구간으로 이동
            } else {
                limitDistance = 0;  // 둘 다 끝났으니 0으로
                testDistance = 0;   // 둘 다 끝났으니 0으로
                limitIndex++;       // 다음 제한구간으로
                testIndex++;        // 다음 주행구간으로
            }
        }

        // 결과 출력
        System.out.println(maxExcessSpeed);
    }
}