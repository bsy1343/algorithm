# [Platinum II] Earthquake Damage 2 - 6102

[문제 링크](https://www.acmicpc.net/problem/6102)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 81, 정답: 19, 맞힌 사람: 16, 정답 비율: 22.535%

### 분류

그래프 이론, 최대 유량, 최대 유량 최소 컷 정리

### 문제 설명

<p>Wisconsin has had an earthquake that has struck Farmer John&#39;s farm! The earthquake has damaged some of the pastures so that they are unpassable. Remarkably, none of the cowpaths was damaged.</p>

<p>As usual, the farm is modeled as a set of P (1 &lt;= P &lt;= 3,000) pastures conveniently numbered 1..P which are connected by a set of C (1 &lt;= C &lt;= 20,000) non-directional cowpaths conveniently numbered 1..C. Cowpath i connects pastures a_i and b_i (1 &lt;= a_i &lt;= P; 1 &lt;= b_i &lt;= P). Cowpaths might connect a_i to itself or perhaps might connect two pastures more than once. The barn is located in pasture 1.</p>

<p>A total of N (1 &lt;= N &lt;= P) cows (in different pastures) sequentially contacts Farmer John via moobile phone with an integer message report_j (2 &lt;= report_j &lt;= P) that indicates that pasture report_j is undamaged but that the calling cow is unable to return to the barn from pasture report_j because she could not find a path that does not go through damaged pastures.</p>

<p>After all the cows report in, determine the minimum number of pastures that are damaged.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers: P, C, and N</li>
	<li>Lines 2..C+1: Line i+1 describes cowpath i with two integers: a_i and b_i</li>
	<li>Lines C+2..C+N+1: Line C+1+j contains a single integer: report_j</li>
</ul>

### 출력

<ul>
	<li>Line 1: One number, the minimum number of damaged pastures.</li>
</ul>