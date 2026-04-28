# [Platinum I] Walking in Manhattan - 31552

[문제 링크](https://www.acmicpc.net/problem/31552)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 130, 정답: 38, 맞힌 사람: 30, 정답 비율: 31.579%

### 분류

구현, 자료 구조, 이분 탐색, 많은 조건 분기, 희소 배열

### 문제 설명

<p>Farmer John and his $Q$ ($1 \leq Q \leq 2 \cdot 10^5$) cows are in Manhattan on vacation, but the cows have escaped and are now walking around freely in the city! Manhattan is huge &ndash; so huge that its $N$ ($1 \le N \le 2 \cdot 10^5$) roads stretch infinitely in the $x$-$y$ plane, but conveniently, those roads all run perfectly horizontally or vertically. Each horizontal and vertical road can be modeled by an equation of the form $y = c_i$ or $x = c_i$, where $c_i$ is an integer in the range $0$ to $10^9$ inclusive.</p>

<p>Farmer John knows exactly where each cow started walking and how long ago they escaped. Cows are very predictable, so each of them walks according to the following pattern:</p>

<ul>
	<li>They only walk north ($+y$) or east ($+x$) at one unit per second.</li>
	<li>If they are currently on a single road, they continue walking along the road&#39;s direction.</li>
	<li>If they are at the intersection of two roads, they walk north if they have been walking for an even number of seconds and east otherwise.</li>
</ul>

<p>Given the layout of Manhattan and the information for each cow, help Farmer John determine where his cows are now!</p>

### 입력

<p>The first line contains $N$ and $Q$.</p>

<p>The next $N$ lines describe the roads. Each road is described by a direction (H or V) and a coordinate $c_i$. It is guaranteed that the roads are unique.</p>

<p>The next $Q$ lines describe the cows. Each cow is described by three integers $(x_i, y_i, d_i)$, meaning that they started walking from $(x_i, y_i)$ exactly $d_i$ seconds ago. It is guaranteed that $(x_i, y_i)$ lies on some road, and $0 \le x_i, y_i, d_i \le 10^9$.</p>

### 출력

<p>Output $Q$ lines, where the $i$th line contains the current position of the $i$th cow.</p>