# [Platinum I] Mosaic - 32268

[문제 링크](https://www.acmicpc.net/problem/32268)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 91, 정답: 33, 맞힌 사람: 32, 정답 비율: 37.647%

### 분류

구현, 애드 혹, 누적 합

### 문제 설명

<p>Salma plans to colour a clay mosaic on a wall. The mosaic is an $N \times N$ grid, made of $N$ initially uncoloured $1 \times 1$ square tiles. The rows of the mosaic are numbered from $0$ to $N - 1$ from top to bottom, and the columns are numbered from $0$ to $N - 1$ from left to right. The tile in row $i$ and column $j$ ($0 &le; i &lt; N$, $0 &le; j &lt; N$) is denoted by $(i, j)$. Each tile must be coloured either white (denoted by $0$) or black (denoted by $1$).</p>

<p>To colour the mosaic, Salma first picks two arrays $X$ and $Y$ of length $N$, each consisting of values $0$ and $1$, such that $X[0] = Y [0]$. She colours the tiles of the topmost row (row $0$) according to array $X$, such that the colour of tile $(0, j)$ is $X[j]$ ($0 &le; j &lt; N$). She also colours the tiles of the leftmost column (column $0$) according to array $Y$, such that the colour of tile $(i, 0)$ is $Y [i]$ ($0 &le; i &lt; N$).</p>

<p>Then she repeats the following steps until all tiles are coloured:</p>

<ul>
	<li>She finds any <em>uncoloured</em> tile $(i, j)$ such that its up neighbor (tile $(i - 1, j)$) and left neighbor (tile $(i, j - 1)$) are both <em>already coloured</em>.</li>
	<li>Then, she colours tile $(i, j)$ black if both of these neighbors are white; otherwise, she colours tile $(i, j)$ white.</li>
</ul>

<p>It can be shown that the final colours of the tiles do not depend on the order in which Salma is colouring them.</p>

<p>Yasmin is very curious about the colours of the tiles in the mosaic. She asks Salma $Q$ questions, numbered from $0$ to $Q - 1$. In question $k$ ($0 &le; k &lt; Q$), Yasmin specifies a subrectangle of the mosaic by its:</p>

<ul>
	<li>Topmost row $T[k]$ and bottommost row $B[k]$ ($0 &le; T[k] &le; B[k] &lt; N$),</li>
	<li>Leftmost column $L[k]$ and rightmost column $R[k]$ ($0 &le; L[k] &le; R[k] &lt; N$).</li>
</ul>

<p>The answer to the question is the number of black tiles in this subrectangle. Specifically, Salma should find how many tiles $(i, j)$ exist, such that $T[k] &le; i &le; B[k]$, $L[k] &le; j &le; R[k]$, and the colour of tile $(i, j)$ is black.</p>

<p>Write a program that answers Yasmin&#39;s questions.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$1 &le; N &le; 200\, 000$</li>
	<li>$1 &le; Q &le; 200\, 000$</li>
	<li>$X[i] &isin; \{0, 1\}$ and $Y [i] &isin; \{0, 1\}$ for each $i$ such that $0 &le; i &lt; N$</li>
	<li>$X[0] = Y [0]$</li>
	<li>$0 &le; T[k] &le; B[k] &lt; N$ and $0 &le; L[k] &le; R[k] &lt; N$ for each $k$ such that $0 &le; k &lt; Q$</li>
</ul>