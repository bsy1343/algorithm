# [Gold III] Build The Grid - 24654

[문제 링크](https://www.acmicpc.net/problem/24654)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 118, 정답: 77, 맞힌 사람: 73, 정답 비율: 68.868%

### 분류

해 구성하기

### 문제 설명

<p>Given is a square grid of $N \times N$ squares. Your task is to paint each square of the grid either white or black such that:</p>

<ul>
	<li>The white squares are connected: for any two white squares, you can go from one to the other by moving only between white squares that share a side.</li>
	<li>Each black square shares a side with at least one white square.</li>
	<li>Denote the number of black cells in the $i$-th row as $p_i$. The sequence $P = (p_1, p_2, \ldots, p_N)$ is then a permutation of integers between $0$ and $N-1$, inclusive.</li>
	<li>Denote the number of black cells in the $j$-th column as $q_j$. The sequence $Q = (q_1, q_2, \ldots, q_N)$ is then a permutation of integers between $0$ and $N-1$, inclusive.</li>
</ul>

<p>It can be shown that such a construction always exists.</p>

### 입력

<p>The input consists of one integer $N$ ($2 \le N \le 500$).</p>

### 출력

<p>Print $N$ lines. On the $i$-th line, print a string of length $N$ consisting of characters &#39;<code>B</code>&#39; and &#39;<code>W</code>&#39;. The $j$-th character in the $i$-th string corresponds to the square in $i$-th row and $j$-th column: &#39;<code>B</code>&#39; denotes black squares and &#39;<code>W</code>&#39; denotes white squares.</p>