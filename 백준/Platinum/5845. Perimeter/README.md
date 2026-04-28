# [Platinum V] Perimeter - 5845

[문제 링크](https://www.acmicpc.net/problem/5845)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 236, 정답: 109, 맞힌 사람: 65, 정답 비율: 41.139%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 집합과 맵, 깊이 우선 탐색, 트리를 사용한 집합과 맵, 격자 그래프

### 문제 설명

<p>Farmer John has arranged N hay bales (1 &lt;= N &lt;= 50,000) in the middle of one of his fields. If we think of the field as a 1,000,000 x 1,000,000 grid of 1 x 1 square cells, each hay bale occupies exactly one of these cells (no two hay bales occupy the same cell, of course).</p>

<p>FJ notices that his hay bales all form one large connected region, meaning that starting from any bale, one can reach any other bale by taking a series of steps either north, south, east, or west onto directly adjacent bales. The connected region of hay bales may however contain &quot;holes&quot; -- empty regions that are completely surrounded by hay bales.</p>

<p>Please help FJ determine the perimeter of the region formed by his hay bales. Note that holes do not contribute to the perimeter.</p>

### 입력

<ul>
	<li>Line 1: The number of hay bales, N.</li>
	<li>Lines 2..1+N: Each line contains the (x,y) location of a single hay bale, where x and y are integers both in the range 1..1,000,000. Position (1,1) is the lower-left cell in FJ&#39;s field, and position (1000000,1000000) is the upper-right cell.</li>
</ul>

### 출력

<ul>
	<li>Line 1: The perimeter of the connected region of hay bales.</li>
</ul>

### 힌트

<h4>Input Details</h4>

<p>The connected region consisting of hay bales looks like this:</p>

<pre>
XX 
X XX
XXX</pre>

<h4>Output Details</h4>

<p>The length of the perimeter of the connected region is 14 (for example, the left side of the region contributes a length of 3 to this total). Observe that the hole in the middle does not contribute to this number.</p>