# [Platinum III] House Numbering - 25999

[문제 링크](https://www.acmicpc.net/problem/25999)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 61, 정답: 29, 맞힌 사람: 29, 정답 비율: 52.727%

### 분류

깊이 우선 탐색, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>You are addicted to the latest world-simulation game: Building A Perfect City. In your current play-through, you have created a city that has an equal number of streets and intersections. All that is left is to number the houses in every street.</p>

<p>The city is represented by a connected graph with intersections and streets. Every street is a connection between two intersections $u$ and $v$, and has $h$ houses which are all on one side of the street. There is at most one street between two intersections. There are two ways to number the houses in this street: either you start with house number $1$ adjacent to intersection $u$ and end with house number $h$ at intersection $v$, or house number $1$ is adjacent to $v$ and house number $h$ is adjacent to $u$. To avoid confusion, you want to ensure that no intersection has two adjacent houses with the same number.</p>

<p>Find a way to number the houses in every street that satisfies this property (or report that it is impossible).</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($3\leq n\leq 10^5$), the number of intersections and number of streets.</li>
	<li>$n$ lines with three integers $u$, $v$, and $h$ ($u\neq v$, $1\leq u,v\leq n$, $2\leq h\leq 10^9$) representing a street between intersections $u$ and $v$ that has $h$ houses.</li>
</ul>

<p>It is guaranteed that every intersection is reachable from every other intersection. There is at most one street between any two intersections.</p>

### 출력

<p>If it is impossible, output &quot;<code>impossible</code>&quot;. Otherwise, output for each street (in the same order as the input) a number representing the intersection where the house numbering starts.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>