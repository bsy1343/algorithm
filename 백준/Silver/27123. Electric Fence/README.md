# [Silver I] Electric Fence - 27123

[문제 링크](https://www.acmicpc.net/problem/27123)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 165, 정답: 81, 맞힌 사람: 68, 정답 비율: 49.275%

### 분류

수학, 기하학, 정수론, 유클리드 호제법, 픽의 정리

### 문제 설명

<p>In this problem, &#39;lattice points&#39; in the plane are points with integer coordinates.</p>

<p>In order to contain his cows, Farmer John constructs a triangular electric fence by stringing a &quot;hot&quot; wire from the origin (0,0) to a lattice point (n,m), then to a lattice point on the positive x axis (p,0) (p&gt;0), and then back to the origin (0,0).</p>

<p>A cow can be placed at each lattice point within the fence without touching the fence (very thin cows). Cows can not be placed on lattice points that the fence touches. How many cows can a given fence hold?</p>

### 입력

<p>The single input line contains three space-separated integers that denote n, m, and p.</p>

### 출력

<p>Print a line with a single integer that represents the number of cows the specified fence can hold.</p>

### 제한

<ul>
	<li>0 &lt; n &lt; 32768</li>
	<li>0 &lt; m &lt; 32768</li>
	<li>0 &lt; p &lt; 65536</li>
</ul>