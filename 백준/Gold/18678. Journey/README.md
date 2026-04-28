# [Gold IV] Journey - 18678

[문제 링크](https://www.acmicpc.net/problem/18678)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 7, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

다이나믹 프로그래밍, 수학

### 문제 설명

<p>One day, Homer was bored in his house and decided to go in a journey to discover the lands of Springfield. The lands of Springfield is an infinite grid. Homer&rsquo;s house is located at cell (0, 0) and his journey consisted of N steps, where each step is either move one cell right or one cell down.</p>

<p>Being bored already, Homer didn&rsquo;t want his journey to be boring as well. He decided he won&rsquo;t move in the same direction for more than K consecutive steps. Thus, a journey is considered to be interesting if for each K + 1 consecutive steps Homer has moved in both directions.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18678.%E2%80%85Journey/c1e2b092.png" data-original-src="https://upload.acmicpc.net/44270360-5151-473a-a70c-32af987b4e7f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 697px; height: 302px;" /></p>

<p style="text-align: center;">Figure 1: Example with N = 5 and K = 2 (first test case)</p>

<p>Given N and K, count the number of interesting journeys Homer can make. Two Journeys are considered different if for some i the i-th step in the first Journey differs from that of the second Journey. Since the number can be large, print it modulo 1,000,000,007.</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T, the number of test cases (1 &le; T &le; 500), followed by T test cases.</p>

<p>Each test case will be presented on a single line containing two integers separated by a single space. The first integer will denote the number of steps in Homer&rsquo;s journey N, followed by the second integer K representing the maximum number of consecutive steps Homer can take while moving in the same direction, where (0 &le; N &le; 10<sup>5</sup>) and (0 &le; K &le; 10<sup>5</sup>).</p>

### 출력

<p>For each test case, output a single line denoting the number of different journeys Homer can make modulo 1,000,000,007.</p>