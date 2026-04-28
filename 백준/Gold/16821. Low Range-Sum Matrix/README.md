# [Gold II] Low Range-Sum Matrix - 16821

[문제 링크](https://www.acmicpc.net/problem/16821)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 51, 정답: 23, 맞힌 사람: 16, 정답 비율: 51.613%

### 분류

누적 합, 백트래킹

### 문제 설명

<p>You received a card at a banquet. On the card, a matrix of $N$ rows and $M$ columns and two integers $K$ and $S$ are written. All the elements in the matrix are integers, and an integer at the $i$-th row from the top and the $j$-th column from the left is denoted by $A_{i,j}$.</p>

<p>You can select up to $K$ elements from the matrix and invert the sign of the elements. If you can make a matrix such that there is no vertical or horizontal contiguous subsequence whose sum is greater than $S$, you can exchange your card for a prize.</p>

<p>Your task is to determine if you can exchange a given card for a prize.</p>

### 입력

<p>The input consists of a single test case of the following form.</p>

<pre class="mathjax">
$N$ $M$ $K$ $S$
$A_{1,1}$ $A_{1,2}$ $\cdots$  $A_{1,M}$
$\vdots$
$A_{N,1}$ $A_{N,2}$ $\cdots$  $A_{N,M}$</pre>

<p>The first line consists of four integers $N$, $M$, $K$, and $S$ ($1 \le N, M \le 10$, $1 \le K \le 5$, $1 \le S \le 10^6$). The following $N$ lines represent the matrix in your card. The $(i+1)$-th line consists of $M$ integers $A_{i,1}$, $A_{i,2}$, $\ldots$, $A_{i,M}$ ($-10^5 \le A_{i,j} \le 10^5$).</p>

### 출력

<p>If you can exchange your card for a prize, print <code>Yes</code>. Otherwise, print <code>No</code>.</p>