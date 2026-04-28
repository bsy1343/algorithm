# [Platinum III] Route Calculator - 16819

[문제 링크](https://www.acmicpc.net/problem/16819)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 20, 맞힌 사람: 19, 정답 비율: 59.375%

### 분류

다이나믹 프로그래밍, 집합과 맵

### 문제 설명

<p>You have a grid with $H$ rows and $W$ columns. $H+W$ is even. We denote the cell at the $i$-th row from the top and the $j$-th column from the left by $(i, j)$. In any cell $(i, j)$, an integer between $1$ and $9$ is written if $i+j$ is even, and either <code>+</code> or <code>*</code> is written if $i+j$ is odd.</p>

<p>You can get a mathematical expression by moving right or down $H+W-2$ times from $(1,1)$ to $(H,W)$ and concatenating all the characters written in the cells you passed in order. Your task is to maximize the calculated value of the resulting mathematical expression by choosing an arbitrary path from $(1, 1)$ to $(H, W)$. If the maximum value is $10^{15}$ or less, print the value. Otherwise, print $-1$.</p>

### 입력

<p>The input consists of a single test case in the format below.</p>

<pre class="mathjax">$H$ $W$ $a_{1,1}$ $\cdots$ $a_{1,W}$ $\ldots$ $a_{H,1}$ $\cdots$ $a_{H,W}$</pre>

<p>The first line consists of two integers $H$ and $W$ ($1 \le H,W \le 50$). It is guaranteed that $H+W$ is even. The following $H$ lines represent the characters on the grid. $a_{i,j}$ represents the character written in the cell $(i,j)$. In any cell $(i, j)$, an integer between $1$ and $9$ is written if $i+j$ is even, and either <code>+</code> or <code>*</code> is written if $i+j$ is odd.</p>

### 출력

<p>Print the answer in one line.</p>