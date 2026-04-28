# [Gold III] Spiral Matrix - 23450

[문제 링크](https://www.acmicpc.net/problem/23450)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 56, 정답: 19, 맞힌 사람: 17, 정답 비율: 40.476%

### 분류

애드 혹, 많은 조건 분기

### 문제 설명

<p>Lee got a ticket to the Google Developer Day. When he came to the exhibition hall, he found that the booths were located in a matrix of size $n \times m$.</p>

<p>Unfortunately, Lee had badly sprained his left ankle a week before the GDD when playing basketball. As a result, he couldn&#39;t wander freely as he wanted. His ankle would get hurt if he tried to turn left. Lee also didn&#39;t want to make a big right turn by turning right multiple times, which would make him look stupid.</p>

<p>Lee wanted to visit each booth exactly once. Given his ankle situation, he made some rules visiting the booths. He could start with any booth in the exhibition hall, and choose an initial direction. Then each move would have to follow one of the possible moves:</p>

<ol>
	<li>Go straight to visit the next booth.</li>
	<li>Turn right once and then go straight to visit the next booth.</li>
</ol>

<p>You are a friend of Lee and you have the good habit of helping him. Can you find out the number of different ways to visit each booth exactly once? Two ways are considered different if and only if the visiting orders in these two ways vary.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$ ($1 \le T \le 100$). $T$ test cases follow.</p>

<p>For each test case, the first and only line contains two integers $n$ and $m$ ($1 \le n, m \le 100$), the number of rows and the number of columns of the matrix, respectively.</p>

### 출력

<p>For each test case, output one line containing &quot;<code>Case #x: y</code>&quot;, where <code>x</code> is the test case number (starting from $1$), and <code>y</code> is the number of different ways modulo ($10^9+7$).</p>

### 힌트

<p>Here are the 4 different ways for $n = 2, m = 2$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23450.%E2%80%85Spiral%E2%80%85Matrix/0a5f910c.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23450.%E2%80%85Spiral%E2%80%85Matrix/0a5f910c.png" data-original-src="https://upload.acmicpc.net/2539a365-f549-437a-b826-dfc49d4bf48f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 381px; height: 81px;" /></p>