# [Silver I] Cow Picnic - 6207

[문제 링크](https://www.acmicpc.net/problem/6207)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 302, 정답: 186, 맞힌 사람: 170, 정답 비율: 65.891%

### 분류

너비 우선 탐색, 브루트포스 알고리즘, 깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>The cows are having a picnic! Each of Farmer John&#39;s K (1 &lt;= K &lt;= 100) cows is grazing in one of N (1 &lt;= N &lt;= 1,000) pastures, conveniently numbered 1...N. The pastures are connected by M (1 &lt;= M &lt;= 10,000) one-way paths (no path connects a pasture to itself).</p>

<p>The cows want to gather in the same pasture for their picnic, but (because of the one-way paths) some cows may only be able to get to some pastures. Help the cows out by figuring out how many pastures are reachable by all cows, and hence are possible picnic locations.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers, respectively: K, N, and M</li>
	<li>Lines 2..K+1: Line i+1 contains a single integer (1..N) which is the number of the pasture in which cow i is grazing.</li>
	<li>Lines K+2..M+K+1: Each line contains two space-separated integers, respectively A and B (both 1..N and A != B), representing a one-way path from pasture A to pasture B.</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: The single integer that is the number of pastures that are reachable by all cows via the one-way paths.</li>
</ul>

### 힌트

<p>The cows can meet in pastures 3 or 4.</p>