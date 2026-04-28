# [Platinum I] Route Calculator Returns - 20632

[문제 링크](https://www.acmicpc.net/problem/20632)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 10, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You have a grid with $H$ rows and $W$ columns. Each cell contains one of the following 11 characters: an addition operator &#39;<code>+</code>&#39;, a multiplication operator &#39;<code>*</code>&#39;, or a digit between <code>1</code> and <code>9</code>.</p>

<p>There are paths from the top-left cell to the bottom-right cell by moving right or down $H+W-2$ times. Let us define the value of a path by the evaluation result of the mathematical expression you can obtain by concatenating all the characters contained in the cells on the path in order. Your task is to compute the sum of values of any possible paths. Since the sum can be large, find it modulo $M$.</p>

<p>It is guaranteed the top-left cell and the bottom-right cell contain digits. Moreover, if two cells share an edge, at least one of them contains a digit. In other words, each expression you can obtain from a path is mathematically valid.</p>

### 입력

<p>The first line of the input consists of three integers $H$, $W$ and $M$ ($1 \le H,W \le 2000$, $2 \le M \le 10^9$). The following $H$ lines represent the characters on the grid. $a_{i,j}$ represents the character contained in the cell at the $i$-th row and $j$-th column. Each $a_{i,j}$ is either &#39;<code>+</code>&#39;, &#39;<code>*</code>&#39;, or a digit between 1 and 9. $a_{1,1}$ and $a_{H,W}$ are both digits. If two cells share an edge, at least one of them contain a digit.</p>

### 출력

<p>Print the sum of values of all possible paths modulo $M$.</p>