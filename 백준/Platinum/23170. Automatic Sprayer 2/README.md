# [Platinum II] Automatic Sprayer 2 - 23170

[문제 링크](https://www.acmicpc.net/problem/23170)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 90, 정답: 45, 맞힌 사람: 42, 정답 비율: 56.757%

### 분류

애드 혹, 해 구성하기, 그리디 알고리즘, 수학

### 문제 설명

<p>A farm is divided into $n \times n$ unit squares of $n$ rows and $n$ columns. Let&#39;s define $(i, j)$ as the unit square in the $i$-th row and the $j$-th column ($1 \le i \le n$, $1 \le j \le n$).</p>

<p>The distance between two squares $(i_1, j_1)$ and $(i_2, j_2)$ is defined to be $d\left(\left(i_1, j_1\right), \left(i_2, j_2\right)\right) = |i_1 - i_2| + |j_1 - j_2|$, the Manhattan distance between those two squares.</p>

<p>There are automatic sprayers on this farm that spray fertilizer solution or herbicide so that the owner can produce grain efficiently.</p>

<p>Each sprayer lies entirely in a unit square. The sprayer in $(x,y)$ sprays $A_{x,y}$ liters of solution to all unit squares. $A_{x,y}$ can be any nonnegative integer.</p>

<p>The energy required for the sprayer in $(x, y)$ to spray solution to $(i, j)$ is exactly $d((x, y), (i, j)) \times A_{x,y}$. For each square $(i, j)$, we compute $E_{i,j}$, the sum of energies needed for all sprayers to spray the square $(i, j)$.</p>

<p>Given the matrix $E$, write a program that generates <em>any possible</em> matrix $A$ that corresponds to matrix $E$. $E$ will be given such that there exists such a matrix $A$ of nonnegative integers whose sum is at most $10^{12}$.</p>

### 입력

<p>The first line contains a single positive integer $n$ ($2 \le n \le 1\,000$).</p>

<p>The next $n$ lines each contain $n$ integers. The $j$-th ($1 \le j \le n$) integer in the $i$-th ($1 \le i \le n$) line is $E_{i,j}$ ($0 \le E_{i,j} \le 10^{16})$.&nbsp;</p>

<p>The input is designed such that a matrix $A$ consisting of only non-negative integers whose sum is at most $10^{12}$ exists which can yield $E$.</p>

### 출력

<p>Output $n$ lines, each containing $n$ integers. The $y$-th ($1 \le y \le n$) integer in the $x$-th ($1 \le x \le n$) line should be $A_{x,y}$.&nbsp;</p>