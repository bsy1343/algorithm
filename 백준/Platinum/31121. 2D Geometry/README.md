# [Platinum IV] 2D Geometry - 31121

[문제 링크](https://www.acmicpc.net/problem/31121)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 5, 맞힌 사람: 4, 정답 비율: 26.667%

### 분류

기하학, 무작위화

### 문제 설명

<p>There are $n$ <strong>distinct</strong> points on a 2-dimension plane. The coordinates of the $i$-th point is $(x_i, y_i)$.</p>

<p>If there are three points $A$, $B$ and $C$ which form a triangle $ABC$ with <strong>positive area</strong>, Bobo can remove them simultaneously from the plane. Also, if there are multiple triangles with positive area, Bobo can choose to remove any of them. Find the minimum number of points left on the plane if he can perform the operation for <strong>any number of times</strong>.</p>

### 입력

<p>The input consists of several test cases terminated by end-of-file. For each test case,</p>

<p>The first line contains an integer $n$.</p>

<p>For the following $n$ lines, the $i$-th line contains two integers $x_i$ and $y_i$.</p>

### 출력

<p>For each test case, output an integer which denotes the minimum number of points left.</p>

### 제한

<ul>
	<li>$1 \leq n \leq 2 \times 10^5$</li>
	<li>$0 \leq x_i, y_i \leq 10^9$ for each $1 \leq i \leq n$</li>
	<li>$(x_i, y_i) \neq (x_j, y_j)$ for each $1 \leq i &lt; j \leq n$</li>
	<li>In each input, the sum of $n$ does not exceed $2 \times 10^5$.</li>
</ul>

### 힌트

<p>For the third test case, if Bobo chooses to remove the triangle $\{(0, 1), (1, 1), (1, 2)\}$ first, there will be no other triangles to remove. Alternatively, Bobo can remove the triangle $\{(0, 0), (0, 1), (1, 1)\}$ first and then $\{(0, 2), (0, 3), (1, 2)\}$.</p>