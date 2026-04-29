# [Silver IV] Farmer John's Cheese Block - 33063

[문제 링크](https://www.acmicpc.net/problem/33063)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 430, 정답: 219, 맞힌 사람: 183, 정답 비율: 56.308%

### 분류

구현, 애드 혹

### 문제 설명

<p>Farmer John has a block of cheese in the shape of a cube. It lies on the 3-dimensional coordinate plane, extending from $(0,0,0)$ to $(N, N, N)$ ($2 \leq N \leq 1000$). Farmer John will perform a series of $Q$ ($1 \leq Q \leq 2 \cdot 10^5$) update operations to his cheese block.</p>

<p>For each update operation, FJ will carve out the $1$ by $1$ by $1$ block of cheese extending from integer coordinates $(x, y, z)$ to $(x+1, y+1, z+1)$, where $0\le x,y,z&lt;N$. It is guaranteed that there will exist a $1$ by $1$ by $1$ block of cheese at the location FJ carves. Since FJ is playing Moocraft, gravity does not cause parts of the cheese to fall if cheese below is carved.</p>

<p>After each update, output the number of distinct configurations that FJ can stick a $1$ by $1$ by $N$ brick in the cheese block such that no part of the brick overlaps with any remaining cheese. Every vertex of the brick must have integer coordinates in the range $[0,N]$ for all three axes. FJ may rotate the brick however he wants.</p>

### 입력

<p>The first line contains $N$ and $Q$.</p>

<p>The following $Q$ lines contain $x$, $y$, and $z$, the coordinates to be carved.</p>

### 출력

<p>After each update operation, output an integer, the number of configurations.</p>

### 힌트

<p>After the first three updates, the $1\times 2 \times 1$ brick spanning $[0, 1]\times [0, 2]\times [0, 1]$ does not overlap with the remaining cheese, so it contributes toward the answer.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/33063.%E2%80%85Farmer%E2%80%85John's%E2%80%85Cheese%E2%80%85Block/6169b33e.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33063-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>