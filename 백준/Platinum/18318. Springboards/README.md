# [Platinum I] Springboards - 18318

[문제 링크](https://www.acmicpc.net/problem/18318)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 443, 정답: 154, 맞힌 사람: 119, 정답 비율: 31.903%

### 분류

다이나믹 프로그래밍, 자료 구조, 세그먼트 트리, 스위핑, 값 / 좌표 압축

### 문제 설명

<p>Bessie is in a 2D grid where walking is permitted only in directions parallel to one of the coordinate axes. She starts at the point $(0,0)$ and wishes to reach $(N,N)$ ($1\le N\le 10^9$). To help her out, there are $P$ ($1\le P\le 10^5$) springboards on the grid. Each springboard is at a fixed point $(x_1,y_1)$ and if Bessie uses it, she will land at a point $(x_2,y_2)$.</p>

<p>Bessie is a progress-oriented cow, so she only permits herself to walk up or right, never left nor down. Likewise, each springboard is configured to never go left nor down. What is the minimum distance Bessie needs to walk?</p>

### 입력

<p>The fist line contains two space-separated integers $N$ and $P$.</p>

<p>The next $P$ lines each contains four integers, $x_1$, $y_1$, $x_2$, $y_2$, where $x_1 \le x_2$ and $y_1 \le y_2.$</p>

<p>All springboard and target locations are distinct.</p>

### 출력

<p>Output a single integer, the minimum distance Bessie needs to walk to reach $(N,N)$.</p>

### 힌트

<p>Bessie&#39;s best path is:</p>

<ul>
	<li>Bessie walks from (0,0) to (0,1) (1 unit).</li>
	<li>Bessie springs to (0,2).</li>
	<li>Bessie walks from (0,2) to (1,2) (1 unit).</li>
	<li>Bessie springs to (2,3).</li>
	<li>Bessie walks from (2,3) to (3,3) (1 unit).</li>
</ul>

<p>The total walking length of Bessie&#39;s path is 3 units.</p>