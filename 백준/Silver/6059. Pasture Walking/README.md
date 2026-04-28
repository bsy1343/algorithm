# [Silver I] Pasture Walking - 6059

[문제 링크](https://www.acmicpc.net/problem/6059)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 203, 정답: 132, 맞힌 사람: 116, 정답 비율: 69.461%

### 분류

너비 우선 탐색, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 최소 공통 조상, 최단 경로, 트리

### 문제 설명

<p>The N cows (2 &lt;= N &lt;= 1,000) conveniently numbered 1..N are grazing among the N pastures also conveniently numbered 1..N. Most conveniently of all, cow i is grazing in pasture i.</p>

<p>Some pairs of pastures are connected by one of N-1 bidirectional walkways that the cows can traverse. Walkway i connects pastures A_i and B_i (1 &lt;= A_i &lt;= N; 1 &lt;= B_i &lt;= N) and has a length of L_i (1 &lt;= L_i &lt;= 10,000).</p>

<p>The walkways are set up in such a way that between any two distinct pastures, there is exactly one path of walkways that travels between them. Thus, the walkways form a tree.</p>

<p>The cows are very social and wish to visit each other often. Ever in a hurry, they want you to help them schedule their visits by computing the lengths of the paths between Q (1 &lt;= Q &lt;= 1,000) pairs of pastures (each pair given as a query p1,p2 (1 &lt;= p1 &lt;= N; 1 &lt;= p2 &lt;= N).</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and Q</li>
	<li>Lines 2..N: Line i+1 contains three space-separated integers: A_i, B_i, and L_i</li>
	<li>Lines N+1..N+Q: Each line contains two space-separated integers representing two distinct pastures between which the cows wish to travel: p1 and p2</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..Q: Line i contains the length of the path between the two pastures in query i.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<ul>
	<li>Query 1: The walkway between pastures 1 and 2 has length 2.</li>
	<li>Query 2: Travel through the walkway between pastures 3 and 4, then the one between 4 and 1, and finally the one between 1 and 2, for a total length of 7.</li>
</ul>

<p>&nbsp;</p>