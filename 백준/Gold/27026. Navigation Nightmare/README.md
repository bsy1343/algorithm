# [Gold I] Navigation Nightmare - 27026

[문제 링크](https://www.acmicpc.net/problem/27026)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 8, 맞힌 사람: 8, 정답 비율: 32.000%

### 분류

자료 구조, 분리 집합, 오프라인 쿼리

### 문제 설명

<p>Farmer John&#39;s pastoral neighborhood has N farms (2 &le; N &le; 40,000), usually numbered/labeled 1..N. A series of M (1 &le; M &lt; 40,000) vertical and horizontal roads each of varying lengths (1 &le; length &le; 1000) connect the farms. A map of these farms might look something like the illustration below in which farms are labeled F1..F7 for clarity and lengths between connected farms are shown as (n):</p>

<pre>
           F1 --- (13) ---- F6 --- (9) ----- F3
            |                                 |
           (3)                                |
            |                                (7)
           F4 --- (20) -------- F2            |
            |                                 |
           (2)                               F5
            | 
           F7 
</pre>

<p>Being an ASCII diagram, it is not precisely to scale, of course.</p>

<p>Each farm can connect directly to at most four other farms via roads that lead exactly north, south, east, and/or west. Moreover, farms are only located at the endpoints of roads, and some farm can be found at every endpoint of every road. No two roads cross, and precisely one path (sequence of roads) links every pair of farms.</p>

<p>FJ lost his paper copy of the farm map and he wants to reconstruct it from backup information on his computer. This data contains lines like the following, one for every road:</p>

<ul>
	<li>There is a road of length 10 running north from Farm #23 to Farm #17</li>
	<li>There is a road of length 7 running east from Farm #1 to Farm #17</li>
	<li>...</li>
</ul>

<p>As FJ is retrieving this data, he is occasionally interrupted by questions such as the following that he receives from his navigationally-challenged neighbor, farmer Bob:</p>

<p>What is the Manhattan distance between farms #1 and #23?</p>

<p>FJ answers Bob, when he can (sometimes he doesn&#39;t yet have enough data yet). In the example above, the answer would be 17, since Bob wants to know the &quot;Manhattan&quot; distance between the pair of farms.</p>

<p>The Manhattan distance between two points (x1,y1) and (x2,y2) is just |x1-x2| + |y1-y2| (which is the distance a taxicab in a large city must travel over city streets in a perfect grid to connect two x,y points).</p>

<p>When Bob asks about a particular pair of farms, FJ might not yet have enough information to deduce the distance between them; in this case, FJ apologizes profusely and replies with &quot;-1&quot;.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and M</li>
	<li>Lines 2..M+1: Each line contains four space-separated entities, F1, F2, L, and D that describe a road. F1 and F2 are numbers of two farms connected by a road, L is its length, and D is a character that is either &#39;N&#39;, &#39;E&#39;, &#39;S&#39;, or &#39;W&#39; giving the direction of the road from F1 to F2.</li>
	<li>Line M+2: A single integer, K (1 &le; K &le; 10,000), the number of FB&#39;s queries</li>
	<li>Lines M+3..M+K+2: Each line corresponds to a query from Farmer Bob and contains three space-separated integers: F1, F2, and I. F1 and F2 are numbers of the two farms in the query and I is the index (1 &le; I &le; M) in the data after which Bob asks the query. Data index 1 is on line 2 of the input data, and so on.</li>
</ul>

### 출력

<ul>
	<li>* Lines 1..K: One integer per line, the response to each of Bob&#39;s queries.  Each line should contain either a distance measurement or -1, if it is impossible to determine the appropriate distance.</li>
</ul>

### 힌트

<p>At time 1, FJ knows the distance between 1 and 6 is 13. At time 3, the distance between 1 and 4 is still unknown. At the end, location 6 is 3 units west and 7 north of 2, so the distance is 10.</p>