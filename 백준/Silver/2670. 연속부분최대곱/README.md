# [Silver IV] 연속부분최대곱 - 2670

[문제 링크](https://www.acmicpc.net/problem/2670)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 21869, 정답: 8015, 맞힌 사람: 6231, 정답 비율: 36.354%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘

### 문제 설명

<p>N개의 실수가 있을 때, 한 개 이상의 연속된 수들의 곱이 최대가 되는 부분을 찾아, 그 곱을 출력하는 프로그램을 작성하시오. 예를 들어 아래와 같이 8개의 양의 실수가 주어진다면,</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/2670.%E2%80%85%EC%97%B0%EC%86%8D%EB%B6%80%EB%B6%84%EC%B5%9C%EB%8C%80%EA%B3%B1/dfd27f62.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/2670.%E2%80%85%EC%97%B0%EC%86%8D%EB%B6%80%EB%B6%84%EC%B5%9C%EB%8C%80%EA%B3%B1/dfd27f62.png" data-original-src="https://www.acmicpc.net/upload/images/Kr2fhViNP7YfNWrhf77jJeXwsd.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 600px; height: 49px; " /></p>

<p>색칠된 부분의 곱이 최대가 되며, 그 값은 1.638이다.</p>

### 입력

<p>첫째 줄은 나열된 양의 실수들의 개수 N이 주어지고, 그 다음 줄부터 N개의 수가 한 줄에 하나씩 들어 있다. N은 10,000 이하의 자연수이다. 실수는 소수점 첫째자리까지 주어지며, 0.0보다 크거나 같고, 9.9보다 작거나 같다.</p>

### 출력

<p>계산된 최댓값을 소수점 이하 넷째 자리에서 반올림하여 소수점 이하 셋째 자리까지 출력한다.</p>