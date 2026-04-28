# [Platinum II] Kingdom Connectivity - 18976

[문제 링크](https://www.acmicpc.net/problem/18976)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 16, 맞힌 사람: 12, 정답 비율: 70.588%

### 분류

그래프 이론, 최소 스패닝 트리, 평면 그래프

### 문제 설명

<p>You are an engineer under the king&#39;s command. The king asked you to build a castle. The project is almost finished. It is already known that the castle is to contain $n$ towers and $m$ walls, each wall connecting some pair of towers. The towers can be viewed as points in the plane, and walls as segments connecting towers. The plan satisfies a number of sensible assumptions:</p>

<ul>
	<li>no wall connects a tower to itself;</li>
	<li>there can be at most one wall between any pair of towers;</li>
	<li>different walls do not intersect anywhere except at the towers;</li>
	<li>no two towers have the same position;</li>
	<li>no wall can pass through any towers other than its endpoints.</li>
</ul>

<p>Your task is to select some walls and build gates in them. After that, both sides of every wall of the castle must be accessible from the exterior through gates. Different landscape imposes that you must spend different amounts of money to build gates through different wall. What is the minimum possible amount of money needed to accomplish your task?</p>

### 입력

<p>First line contains two numbers $n$, $m$ --- the number of towers and and the number of walls respectively ($1 \leq n, m \leq 10^5$).</p>

<p>Each of the next $n$ lines contains two integers $x_i$, $y_i$, denoting that the $i$-th tower is to be built at the point $(x_i, y_i)$. Coordinates do not exceed $10^6$ by absolute value.</p>

<p>Each of the next $m$ lines contains three integers $u_i$, $v_i$, $c_i$ ($1 \leq u_i, v_i \leq n$, $1 \leq c_i \leq 10^6$), denoting that there will be a wall between towers $u_i$ and $v_i$ and the price of building a gate through this wall is $c_i$.</p>

### 출력

<p>First, print a single number: minimum amount of money needed to build all necessary gates. Then print a number $k$, the number of gates to be built. Then print $k$ pairs of numbers denoting pairs of towers which are connected by walls with gates according to your plan.</p>