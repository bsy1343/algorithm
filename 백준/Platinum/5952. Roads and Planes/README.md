# [Platinum II] Roads and Planes - 5952

[문제 링크](https://www.acmicpc.net/problem/5952)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 170, 정답: 42, 맞힌 사람: 38, 정답 비율: 26.761%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>Farmer John is conducting research for a new milk contract in a new territory. He intends to distribute milk to T (1 &lt;= T &lt;= 25,000) towns conveniently numbered 1..T which are connected by up to R (1 &lt;= R &lt;= 50,000) roads conveniently numbered 1..R and/or P (1 &lt;= P &lt;= 50,000) airplane flights conveniently numbered 1..P.</p>

<p>Either road i or plane i connects town A_i (1 &lt;= A_i &lt;= T) to town B_i (1 &lt;= B_i &lt;= T) with traversal cost C_i. For roads, 0 &lt;= C_i &lt;= 10,000; however, due to the strange finances of the airlines, the cost for planes can be quite negative (-10,000 &lt;= C_i &lt;= 10,000).</p>

<p>Roads are bidirectional and can be traversed from A_i to B_i or B_i to A_i for the same cost; the cost of a road must be non-negative.</p>

<p>Planes, however, can only be used in the direction from A_i to B_i specified in the input. In fact, if there is a plane from A_i to B_i it is guaranteed that there is no way to return from B_i to A_i with any sequence of roads and planes due to recent antiterror<br />
regulation.</p>

<p>Farmer John is known around the world as the source of the world&#39;s finest dairy cows. He has in fact received orders for his cows from every single town. He therefore wants to find the cheapest price for delivery to each town from his distribution center in town S (1 &lt;= S &lt;= T) or to know that it is not possible if this is the case.</p>

### 입력

<ul>
	<li>Line 1: Four space separated integers: T, R, P, and S</li>
	<li>Lines 2..R+1: Three space separated integers describing a road: A_i, B_i and C_i</li>
	<li>Lines R+2..R+P+1: Three space separated integers describing a plane: A_i, B_i and C_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..T: The minimum cost to get from town S to town i, or &#39;NO PATH&#39; if this is not possible</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>6 towns. &nbsp;There are roads between town 1 and town 2, town 3 and town 4, and town 5 and town 6 with costs 5, 5 and 10; there are planes from town 3 to town 5, from town 4 to town 6, and from town 1 to town 3 with costs -100, -100 and -10. &nbsp;FJ is based in town 4.</p>

<p>FJ&#39;s cows begin at town 4, and can get to town 3 on the road. &nbsp;They can get to towns 5 and 6 using planes from towns 3 and 4. &nbsp;However, there is no way to get to towns 1 and 2, since they cannot go backwards on the plane from 1 to 3.</p>

<p>&nbsp;</p>

<p>&nbsp;</p>