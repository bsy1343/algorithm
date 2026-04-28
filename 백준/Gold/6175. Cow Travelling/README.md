# [Gold IV] Cow Travelling - 6175

[문제 링크](https://www.acmicpc.net/problem/6175)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 141, 정답: 67, 맞힌 사람: 64, 정답 비율: 54.237%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Searching for the very best grass, the cows are travelling about the pasture which is represented as a grid with N rows and M columns (2 &lt;= N &lt;= 100; 2 &lt;= M &lt;= 100). Keen observer Farmer John has recorded Bessie&#39;s position as (R1, C1) at a certain time and then as (R2, C2) exactly T (0 &lt; T &lt;= 15) seconds later. He&#39;s not sure if she passed through (R2, C2) before T seconds, but he knows she is there at time T.</p>

<p>FJ wants a program that uses this information to calculate an integer S that is the number of ways a cow can go from (R1, C1) to (R2, C2) exactly in T seconds. Every second, a cow can travel from any position to a vertically or horizontally neighboring position in the pasture each second (no resting for the cows). Of course, the pasture has trees through which no cow can travel.</p>

<p>Given a map with &#39;.&#39;s for open pasture space and &#39;*&#39; for trees, calculate the number of possible ways to travel from (R1, C1) to (R2, C2) in T seconds.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers: N, M, and T</li>
	<li>Lines 2..N+1: Line i+1 describes row i of the pasture with exactly M characters that are each &#39;.&#39; or &#39;*&#39;</li>
	<li>Line N+2: Four space-separated integers: R1, C1, R2, and C2.</li>
</ul>

<p>&nbsp;</p>

### 출력

<p>Line 1: A single line with the integer S described above.</p>

### 힌트

<p>The pasture is 4 rows by 5 colum. The cow travels from row 1, column 3 to row 1, column 5, which takes exactly 6 seconds.</p>

<p>There is only one way from (1,3) to (1,5) in exactly 6 seconds (and it is the obvious one that travels around the two trees).</p>