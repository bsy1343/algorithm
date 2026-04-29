# [Platinum IV] 2D Conveyor Belt - 33061

[문제 링크](https://www.acmicpc.net/problem/33061)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 159, 정답: 88, 맞힌 사람: 74, 정답 비율: 61.667%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 너비 우선 탐색, 오프라인 쿼리

### 문제 설명

<p>Farmer John's milk factory can be described by an $N$ by $N$ ($1 \le N \le 1000$) grid of cells that contain conveyor belts. Position ($a,b$) describes the cell that is in the $a$-th row from the top and $b$-th column from the left. There are $5$ types of cells:</p>

<ol>
	<li>"L" — the cell is a leftward facing conveyor belt which moves all items on it 1 cell left every time unit.</li>
	<li>"R" — the cell is a rightward facing conveyor belt which moves all items on it 1 cell right every time unit.</li>
	<li>"U" — the cell is an upward facing conveyor belt which moves all items on it 1 cell up every time unit.</li>
	<li>"D" — the cell is a downward facing conveyor belt which moves all items on it 1 cell down every time unit.</li>
	<li>"?" — Farmer John has not built a conveyor belt at that cell yet.</li>
</ol>

<p>Note that conveyor belts can also move items outside the grid. A cell $c$ is <em>unusable</em> if an item placed at cell $c$ will <strong>never</strong> exit the conveyor belt grid (i.e. it will move around in the grid forever).</p>

<p>Initially, Farmer John has not started building the factory so all cells start out as "?". For the next $Q$ ($1 \le Q \le 2 \cdot 10^5$) days starting from day $1$ and ending at day $Q$, Farmer John will choose a cell that does <strong>not</strong> have a conveyor belt and build a conveyor belt at the cell.</p>

<p>Specifically, during the $i$-th day, Farmer John will build a conveyor belt of type $t_i$ ($t_i \in {\text{{L,R,U,D}}}$) at position ($r_i,c_i$) ($1 \le r_i,c_i \le N$). It is guaranteed that there is no conveyor belt at position ($r_i,c_i$).</p>

<p>After each day, help Farmer John find the minimum number of unusable cells he can achieve by <strong>optimally</strong> building conveyor belts on all <strong>remaining</strong> cells without a conveyor belt.</p>

### 입력

<p>The first line contains $N$ and $Q$.</p>

<p>The $i$-th of the next $Q$ lines contains $r_i$, $c_i$, and $t_i$ in that order.</p>

### 출력

<p>$Q$ lines, the $i$-th of which describing the minimum number of unusable cells if Farmer John fills optimally builds conveyor belts on all remaining cells that do not currently have a conveyor belt.</p>