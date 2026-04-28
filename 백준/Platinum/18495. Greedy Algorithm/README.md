# [Platinum I] Greedy Algorithm - 18495

[문제 링크](https://www.acmicpc.net/problem/18495)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 139, 정답: 33, 맞힌 사람: 25, 정답 비율: 22.523%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 정렬, 배낭 문제

### 문제 설명

<p>I&rsquo;m playing Super Mario Galaxy 3 (thanks for the copy, Nintendo). Most of the levels are small planets in a shape of sphere, but bonus levels are something different. They are in a shape of <strong>torus</strong>. You can imagine it as rectangle with both pairs of opposite sides glued together. As a tribute to 8-bit predecessors, the surface of the planet is a small rectangular grid. Each cell in the grid has its own height.</p>

<p>Playing the bonus level consists of two parts. In the first part I can terraform the level by applying zero or more operations. In one operation I choose a row or a column in the grid, and increase the heights of all the cells in that row or column by one. I can perform this operation any number of times with same or different rows and columns.</p>

<p>After the terraforming a coin appears at each common side of two cells of equal height, and I can collect them. I&rsquo;m good at platforming, so collecting all the coins is not a problem. Designing <em>algorithm</em> for terraforming the level so that the maximum possible number of coins appear &mdash; that&rsquo;s the problem. The problem for you, actually.</p>

### 입력

<p>The first line contains two integers n and m (2 &le; n, m &le; 50) &mdash; the dimensions of the rectangular grid.</p>

<p>The next n lines describe the initial heights of all cells. The i-th of them contains m integers h<sub>i1</sub>, h<sub>i2</sub>, . . . , h<sub>im</sub>, where h<sub>ij</sub> denotes the height of the cell with coordinates (i, j).</p>

<p>All the heights are between 0 and 500, inclusive. It is <strong>not required</strong> that this holds after the terraforming.</p>

### 출력

<p>Print a single integer &mdash; the maximum number of coins can appear if I terraform the level optimally.</p>

### 힌트

<p>The level from the first example after an optimal terraforming:&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18495.%E2%80%85Greedy%E2%80%85Algorithm/e5d6db4d.png" data-original-src="https://upload.acmicpc.net/b917a5e0-83af-44db-9c8f-c37e6c6ea489/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 110px; height: 81px;" /></p>