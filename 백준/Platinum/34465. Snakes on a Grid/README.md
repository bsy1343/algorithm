# [Platinum V] Snakes on a Grid - 34465

[문제 링크](https://www.acmicpc.net/problem/34465)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

누적 합, 애드 혹

### 문제 설명

<p>On a rectangular grid, a <em>snake</em> of size $k$ is defined to be a subset of cells that is formed by taking the first $k$ numbered cells in the following figure, where cells are numbered along a path with alternating right and down steps:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34465.%E2%80%85Snakes%E2%80%85on%E2%80%85a%E2%80%85Grid/f162f5eb.png" data-original-src="https://boja.mercury.kr/assets/problem/34465-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 277px;"></p>

<p>Additionally, subsets that are <strong>rotations, translations, or reflections of these shapes are also considered snakes.</strong> A grid is considered <em>good</em> if every connected component consisting of equal values in the grid is a snake.</p>

<p>Busy Beaver has an $N \times M$ grid with rows numbered $0, \dots, N-1$ and columns numbered $0, \dots, M-1$, where each cell $(i, j)$ in row $i$, column $j$ has a value $a_{ij}$. Since he's afraid of snakes, he wants you to answer $Q$ of the following queries: given a contiguous subrectangle of the grid, determine whether or not the subgrid is good.</p>

### 입력

<p>The first line contains 2 integers, $N$ and $M$ ($1 \leq N, M \leq 1000$) --- the dimensions of the grid.</p>

<p>Each of the next $N$ rows contains $M$ integers, with the $j$-th element of the $i$-th row being $a_{i,j}$ ($1 \leq a_{i, j} \leq 10^6$) --- the number written in the $j$-th cell of the $i$-th row.</p>

<p>The next line contains a single integer, $Q$ ($1 \leq Q \leq 5 \cdot 10^5$) --- the number of queries.</p>

<p>The next $Q$ lines describe the queries, Each line contains 4 integers $x_1$, $y_1$, $x_2$, $y_2$ $(0 \leq x_1 \leq x_2 &lt; N,$ $ 0 \leq y_1 \leq y_2 &lt; M)$, representing a query asking whether the rectangular subgrid with top left corner at $(x_1, y_1)$ and bottom right corner at $(x_2, y_2)$ is good.</p>

### 출력

<p>For each query, output "<code>YES</code>" (without quotes) if the corresponding subgrid consists only of snakes, and "<code>NO</code>" (without quotes) otherwise.</p>

### 힌트

<p>If we color the sample grid with respect to the value in each cell, we get</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34465.%E2%80%85Snakes%E2%80%85on%E2%80%85a%E2%80%85Grid/82108a80.png" data-original-src="https://boja.mercury.kr/assets/problem/34465-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 181px; height: 200px;"></p>

<p>In the first query, all components are snakes.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34465.%E2%80%85Snakes%E2%80%85on%E2%80%85a%E2%80%85Grid/c0bc203a.png" data-original-src="https://boja.mercury.kr/assets/problem/34465-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 221px;"></p>

<p>In the second query, the component that is not a snake is colored in black.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34465.%E2%80%85Snakes%E2%80%85on%E2%80%85a%E2%80%85Grid/e33de37b.png" data-original-src="https://boja.mercury.kr/assets/problem/34465-4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 224px;"></p>

<p>In the third query, the component that is not a snake is colored in black.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34465.%E2%80%85Snakes%E2%80%85on%E2%80%85a%E2%80%85Grid/5fb997a8.png" data-original-src="https://boja.mercury.kr/assets/problem/34465-5.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 222px;"></p>

<p>In the fourth query, all components are snakes.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34465.%E2%80%85Snakes%E2%80%85on%E2%80%85a%E2%80%85Grid/ba42705f.png" data-original-src="https://boja.mercury.kr/assets/problem/34465-6.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 221px;"></p>

<p>In the fifth query, the component that is not a snake is colored in black.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34465.%E2%80%85Snakes%E2%80%85on%E2%80%85a%E2%80%85Grid/57de9bf4.png" data-original-src="https://boja.mercury.kr/assets/problem/34465-7.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 222px;"></p>