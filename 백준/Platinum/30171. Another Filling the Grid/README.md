# [Platinum V] Another Filling the Grid - 30171

[문제 링크](https://www.acmicpc.net/problem/30171)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 20, 맞힌 사람: 18, 정답 비율: 90.000%

### 분류

조합론, 다이나믹 프로그래밍, 포함 배제의 원리, 수학

### 문제 설명

<p>You have $n \times n$ square grid and an integer $k$. Put an integer in each cell while satisfying the conditions below.</p>

<ul>
	<li>All numbers in the grid should be between $1$ and $k$ inclusive.</li>
	<li>Minimum number of the $i$-th row is $1$ ($1 \le i \le n$).</li>
	<li>Minimum number of the $j$-th column is $1$ ($1 \le j \le n$).</li>
</ul>

<p>Find the number of ways to put integers in the grid. Since the answer can be very large, find the answer modulo $(10^{9} + 7)$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30171.%E2%80%85Another%E2%80%85Filling%E2%80%85the%E2%80%85Grid/e3672bd6.png" data-original-src="https://upload.acmicpc.net/f60b532d-b998-49f4-aa25-aaaf72cdde91/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 250px;" /></p>

<p>These are the examples of valid and invalid grid when $n=k=2$.</p>

### 입력

<p>The only line contains two integers $n$ and $k$ ($1 \le n \le 250$, $1 \le k \le 10^{9}$).</p>

### 출력

<p>Print the answer modulo $(10^{9} + 7)$.</p>

### 힌트

<p>In the first example, following $7$ cases are possible.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30171.%E2%80%85Another%E2%80%85Filling%E2%80%85the%E2%80%85Grid/7187d7a8.png" data-original-src="https://upload.acmicpc.net/e2c51953-8468-4f86-bcff-d864da30e22c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 243px;" /></p>

<p>In the second example, make sure you print the answer modulo $(10^{9} + 7)$.</p>