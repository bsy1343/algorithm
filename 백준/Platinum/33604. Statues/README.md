# [Platinum I] Statues - 33604

[문제 링크](https://www.acmicpc.net/problem/33604)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 42, 정답: 15, 맞힌 사람: 15, 정답 비율: 35.714%

### 분류

기하학, 해 구성하기

### 문제 설명

<p>The mayor of a city wants to place $n$ statues at intersections around the city. The intersections in the city are at all points $(x, y)$ with integer coordinates. Distances between intersections are measured using Manhattan distance, defined as follows:</p>

<p style="text-align: center;">$\text{distance}((x_1, y_1),(x_2, y_2)) = |x_1 - x_2| + |y_1 - y_2|$.</p>

<p>The city council has provided the following requirements for the placement of the statues:</p>

<ul>
	<li>The first statue is placed at $(0, 0)$;</li>
	<li>The $n$-th statue is placed at $(a, b)$;</li>
	<li>For $i = 1, \dots , n - 1$, the distance between the $i$-th statue and the $(i + 1)$-th statue is $d_i$.</li>
</ul>

<p>It is allowed to place multiple statues at the same intersection.</p>

<p>Help the mayor find a valid arrangement of the $n$ statues, or determine that it does not exist.</p>

### 입력

<p>The first line contains an integer $n$ ($3 ≤ n ≤ 50$) — the number of statues.</p>

<p>The second line contains two integers $a$ and $b$ ($0 ≤ a, b ≤ 10^9$) — the coordinates of the intersection where the $n$-th statue must be placed.</p>

<p>The third line contains $n - 1$ integers $d_1, \dots , d_{n-1}$ ($0 ≤ d_i ≤ 10^9$) — the distance between the $i$-th statue and the $(i + 1)$-th statue.</p>

### 출력

<p>Print <code>YES</code> if there is a valid arrangement of the $n$ statues. Otherwise, print <code>NO</code>.</p>

<p>If there is a valid arrangement, print a valid arrangement in the following $n$ lines. The $i$-th of these lines must contain two integers $x_i$ and $y_i$ — the coordinates of the intersection where the $i$-th statue is placed. You can print any valid arrangement if multiple exist.</p>