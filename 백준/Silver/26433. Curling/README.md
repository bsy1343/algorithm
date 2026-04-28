# [Silver IV] Curling - 26433

[문제 링크](https://www.acmicpc.net/problem/26433)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 27, 맞힌 사람: 27, 정답 비율: 81.818%

### 분류

수학, 구현, 정렬, 기하학

### 문제 설명

<p>2022 is a year of the Winter Olympics! Curling has been one of the most popular winter sports as it requires skill, strategy, and sometimes a bit of luck.</p>

<p>In a curling game, two teams compete by sliding heavy granite stones on a long ice sheet. We call the teams the <i>red</i> team and the <i>yellow</i> team, as their stones are usually distinguished by the red and the yellow handle color. A curling game consists of several <i>ends</i> (subgames); in every end, the teams, each owning $8$ stones, take turns to slide them across the long ice sheet toward a circular target area called the <i>house</i>. A stone may hit existing stones to change its own moving direction and other stones&#39; position (including knocking them out of play). Roughly speaking, the goal for a team is to make their stones as close to the center of the house as possible.</p>

<p>Geometrically, a house and a stone can be modeled as a circle and a disk (the region bounded by a circle), respectively, and the scoring rules at the conclusion of each end are formally summarized as follows.</p>

<ul>
	<li>Each stone can be viewed as a disk of radius $\mathbf{R_s}$ on a $2$-dimensional plane.</li>
	<li>The house is a circle of radius $\mathbf{R_h}$ centered at $(0, 0)$.</li>
	<li>Only stones <i>in the house</i> are considered in the scoring. A stone is in the house if any portion of the stone lies on or within the circle representing the house. Tangency also counts.</li>
	<li>A team is awarded $1$ point for each of their own stones in the house such that no opponent&#39;s stone is closer (in Euclidean distance) to the center than it. We assume in this problem that no two stones are equally close to the center $(0,0)$.</li>
</ul>

<p>Two teams are playing and have just delivered all their stones. The red team has $\mathbf{N}$ stones remaining on the curling sheet, centered at $(\mathbf{X_1}, \mathbf{Y_1}), (\mathbf{X_2}, \mathbf{Y_2}), \dots, (\mathbf{X_N}, \mathbf{Y_N})$, while the yellow team has $\mathbf{M}$ stones remaining, centered at $(\mathbf{Z_1}, \mathbf{W_1}), (\mathbf{Z_2}, \mathbf{W_2}), \dots, (\mathbf{Z_M}, \mathbf{W_M})$. Now you are asked to figure out the scores of both teams.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow.</p>

<p>Each test case begins with a line containing the two space-separated integers $\mathbf{R_s}$ and $\mathbf{R_h}$.</p>

<p>The next line contains the integer $\mathbf{N}$. Then $\mathbf{N}$ lines follow, the $i$-th line of which containing the two space-separated integers $\mathbf{X_i}$ and $\mathbf{Y_i}$.</p>

<p>After that, similarly, the next line contains the integer $\mathbf{M}$. In the next $\mathbf{M}$ lines, the $i$-th line contains the two space-separated integers $\mathbf{Z_i}$ and $\mathbf{W_i}$.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y z</code>, where $x$ is the test case number (starting from 1), $y$ is the score of the red team, and $z$ is the score of the yellow team.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$1 \le \mathbf{R_s} \lt \mathbf{R_h} \le 10^4$.</li>
	<li>$0 \le \mathbf{N} \le 8$.</li>
	<li>$-2 \times 10^4 \le \mathbf{X_i} \le 2 \times 10^4$, for all $i$.</li>
	<li>$-2 \times 10^4 \le \mathbf{Y_i} \le 2 \times 10^4$, for all $i$.</li>
	<li>$-2 \times 10^4 \le \mathbf{Z_i} \le 2 \times 10^4$, for all $i$.</li>
	<li>$-2 \times 10^4 \le \mathbf{W_i} \le 2 \times 10^4$, for all $i$.</li>
	<li>The distances between the center of each stone and the center of the house $(0, 0)$ are distinct, i.e., no two stones are equally close to the center of the house.</li>
	<li>No two stones overlap (but two stones can be tangent).</li>
</ul>