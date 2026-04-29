# [Gold III] Two Squares - 32745

[문제 링크](https://www.acmicpc.net/problem/32745)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 22, 정답: 17, 맞힌 사람: 12, 정답 비율: 92.308%

### 분류

수학, 조합론, 포함 배제의 원리

### 문제 설명

<p>There is an $n$ by $m$ grid of white squares. You want to place a $k$ by $k$ red square and a $k$ by $k$ blue square on this grid such that they do not overlap. For example, here is a valid solution for $n=6$, $m=8$, $k=3$:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32745.%E2%80%85Two%E2%80%85Squares/55426fa4.png" data-original-src="https://boja.mercury.kr/assets/problem/32745-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 193px;"></p>

<p>How many ways are there to do this? Two ways are considered different if at least one square is a different color in each.</p>

<p>Since the answer may be large, output it modulo $10^9+7$.</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 10^5$) --- the number of test cases. The description of the test cases follows.</p>

<p>Each test case consists of a single line containing three integers $n$, $m$, and $k$ ($1 \le n, m \le 10^9$, $1 \le k \le \min(n, m)$) --- the number of rows and columns in the grid, and the side length of the squares, respectively.</p>

### 출력

<p>For each test case, print a single integer --- the number of ways to place both squares in the grid, taken modulo $10^9+7$.</p>

### 힌트

<p>The solutions for the first test case are:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32745.%E2%80%85Two%E2%80%85Squares/b18a03ba.png" data-original-src="https://boja.mercury.kr/assets/problem/32745-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 103px; height: 25px;"></p>

<p>In the second test case, there is no way to fit both squares inside the rectangle.</p>

<p>The solutions for the third test case are:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32745.%E2%80%85Two%E2%80%85Squares/f2e6077e.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32745-3.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 382px; height: 150px;"></p>