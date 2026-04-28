# [Platinum V] Connecting Cables - 25728

[문제 링크](https://www.acmicpc.net/problem/25728)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 139, 정답: 74, 맞힌 사람: 62, 정답 비율: 50.820%

### 분류

정렬, 누적 합, 스위핑

### 문제 설명

<p>Recently, RUN was asked to connect cables between all pairs of the $N$ areas of KAIST.</p>

<p>We treat the areas as regions on the $2$-dimensional plane. The boundary of each region is a $4$-sided polygon with $2$ edges parallel to the $x$-axis, and $2$ edges parallel to the $y$-axis. In other words, each region has a rectangular boundary with $(x_1^i,y_1^i)$ as a lower left corner and $(x_2^i,y_2^i)$ as a upper right corner. The regions <strong>may overlap</strong>.</p>

<p>The cables must be constructed along the $x$-axis or the $y$-axis, due to safety issues. So the cost of constructing a cable from $(x_1,y_1)$ to $(x_2,y_2)$ is $\left |x_1-x_2\right |+\left |y_1-y_2\right |$ won.</p>

<p>A cable connecting two areas $A$ and $B$ should connect two points, one from each region.</p>

<p>Find the minimum sum of the cost for connecting $\binom{N}{2}$ cables between all pairs of the areas.</p>

<p>Note that the cables must be constructed for all $\binom{N}{2}$ pairs of areas. This means, for example, even if two endpoints of a cable belong to more than one pair of areas, we do not consider it as connecting all such pairs.</p>

<p>Since the answer can be large, output it modulo $998\, 244\, 353$. It can be proved that the answer is always a non-negative integer.</p>

### 입력

<p>The first line contains one integer, $N$.</p>

<p>The $i$-th of the following $N$ lines contain space-separated four integers $x_1^i$, $y_1^i$, $x_2^i$, and $y_2^i$ &mdash; indicating the positions of the lower left and the upper right corners of the region representing the $i$-th area.</p>

### 출력

<p>Output a single integer &mdash; the minimum cost to construct all cables in the unit of won, modulo $998\, 244\, 353$. $998\, 244\, 353=119\times 2^{23}+1$ is a prime number.</p>

### 제한

<ul>
	<li>$2\le N\le 300\, 000$</li>
	<li>$0\le x_1^i&lt;x_2^i\le 998\, 244\, 352$ ($1\le i\le N$)</li>
	<li>$0\le y_1^i&lt;y_2^i\le 998\, 244\, 352$ ($1\le i\le N$)</li>
</ul>