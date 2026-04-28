# [Gold II] City Horizon - 6242

[문제 링크](https://www.acmicpc.net/problem/6242)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 235, 정답: 92, 맞힌 사람: 77, 정답 비율: 47.239%

### 분류

자료 구조, 집합과 맵, 스위핑, 트리를 사용한 집합과 맵

### 문제 설명

<p>Farmer John has taken his cows on a trip to the city! As the sun sets, the cows gaze at the city horizon and observe the beautiful silhouettes formed by the rectangular buildings.</p>

<p>The entire horizon is represented by a number line with N (1 &lt;= N &lt;= 40,000) buildings. Building i&#39;s silhouette has a base that spans locations A_i through B_i along the horizon (1 &lt;= A_i &lt; B_i &lt;= 1,000,000,000) and has height H_i (1 &lt;= H_i &lt;= 1,000,000,000). Determine the area, in square units, of the aggregate silhouette formed by all N buildings.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Input line i+1 describes building i with three space-separated integers: A_i, B_i, and H_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: The total area, in square units, of the silhouettes formed by all N buildings</li>
</ul>

### 힌트

<p>The first building overlaps with the fourth building for an area of 1 square unit, so the total area is just 3*1 + 1*4 + 2*2 + 2*3 - 1 = 16.</p>