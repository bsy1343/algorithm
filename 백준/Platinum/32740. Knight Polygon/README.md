# [Platinum V] Knight Polygon - 32740

[문제 링크](https://www.acmicpc.net/problem/32740)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 13, 맞힌 사람: 12, 정답 비율: 52.174%

### 분류

기하학, 픽의 정리

### 문제 설명

<p>Two points $(x_1, y_1)$ and $(x_2, y_2)$ are considered to be a knight-move apart if exactly one of the following conditions holds:</p>

<ul>
	<li>$|x_1 - x_2| = 2$ and $|y_1 - y_2| = 1$</li>
	<li>$|x_1 - x_2| = 1$ and $|y_1 - y_2| = 2$</li>
</ul>

<p>Notice that this definition closely matches how a knight moves in chess. For example, here are three pairs of points that are a knight-move apart:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32740.%E2%80%85Knight%E2%80%85Polygon/e65258c0.png" data-original-src="https://boja.mercury.kr/assets/problem/32740-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 217px;"></p>

<p>You are given integers $p$ and $q$. Find a simple lattice polygon whose area is $p/q$, where each pair of adjacent vertices is a knight-move apart, or state that no such polygon exists.</p>

<p>A polygon is simple if there are exactly two edges touching each vertex, and no two edges of the polygon intersect except at its vertices. A polygon is a lattice polygon if the coordinates of each of its vertices are integers.</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 10$) --- the number of test cases. The description of the test cases follows.</p>

<p>Each test case consists of a single line containing two integers $p$ and $q$ ($1 \le p, q \le 10^4$) --- the numerator and denominator of the desired area, respectively.</p>

### 출력

<p>For each test case, if there is no solution, output a single integer $-1$.</p>

<p>Otherwise, the first line of output for each test case should contain a single integer $n$ ($3 \le n \le 10^5$) --- the number of vertices in your polygon.</p>

<p>The next $n$ lines of output should each contain two integers $x$ and $y$ ($-10^9 \le x, y \le 10^9$) --- the vertices of your polygon in either clockwise or counterclockwise order.</p>

<p>Your polygon should be simple, have an area of $\frac{p}{q}$, and each pair of adjacent vertices should be a knight-move apart.</p>

<p>If there are multiple solutions, print any.</p>

### 힌트

<p>Here is the polygon described by the output of the first test case, with an area of $\frac{18}{3} = 6$:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32740.%E2%80%85Knight%E2%80%85Polygon/0482f017.png" data-original-src="https://boja.mercury.kr/assets/problem/32740-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 187px; height: 158px;"></p>

<p>Here is the polygon described by the output of the third test case, with an area of $\frac{8}{1} = 8$:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32740.%E2%80%85Knight%E2%80%85Polygon/d74c2107.png" data-original-src="https://boja.mercury.kr/assets/problem/32740-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 221px;"></p>

<p>For the second and fourth test cases, we can show that no valid polygon exists.</p>