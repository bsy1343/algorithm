# [Silver III] 파도반 수열 - 9461

[문제 링크](https://www.acmicpc.net/problem/9461)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 136379, 정답: 61749, 맞힌 사람: 50674, 정답 비율: 43.946%

### 분류

수학, 다이나믹 프로그래밍

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/9461.%E2%80%85%ED%8C%8C%EB%8F%84%EB%B0%98%E2%80%85%EC%88%98%EC%97%B4/e156b5c8.png" data-original-src="https://www.acmicpc.net/upload/images/pandovan.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:182px; width:289px" />오른쪽 그림과 같이 삼각형이 나선 모양으로 놓여져 있다. 첫 삼각형은 정삼각형으로 변의 길이는 1이다. 그 다음에는 다음과 같은 과정으로 정삼각형을 계속 추가한다. 나선에서 가장 긴 변의 길이를 k라 했을 때, 그 변에 길이가 k인 정삼각형을 추가한다.</p>

<p>파도반 수열 P(N)은 나선에 있는 정삼각형의 변의 길이이다. P(1)부터 P(10)까지 첫 10개 숫자는 1, 1, 1, 2, 2, 3, 4, 5, 7, 9이다.</p>

<p>N이 주어졌을 때, P(N)을 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. (1 &le; N &le; 100)</p>

### 출력

<p>각 테스트 케이스마다 P(N)을 출력한다.</p>