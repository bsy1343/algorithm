# [Gold II] Corrupted Order - 33262

[문제 링크](https://www.acmicpc.net/problem/33262)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

해 구성하기

### 문제 설명

<p>This world is in imminent danger! Order has completely fallen into chaos.</p>

<p>Order can be abstracted as an $n \times n$ matrix, where the matrix contains a permutation of numbers from $1$ to $n^2$. You want to save the world, so you called upon a deity to help restore order. However, the deity is not omnipotent; it can only swap two numbers in the same row or the same column of the matrix. Moreover, it does not know how to swap to restore order, and must rely on your guidance.</p>

<p>Fortunately, you do not necessarily need to complete the restoration in the minimum number of swaps. You only need to ensure that your number of swaps is not worse than the worst-case scenario. In other words, if your number of swaps is $k$, and the maximum minimum number of swaps for all permutations from $1$ to $n^2$ is $k_0$, you only need to satisfy $k \leq k_0$.</p>

<p>Restoration refers to transforming the matrix into the following matrix:</p>

<p>$\begin{matrix} 1 &amp; 2 &amp; 3 &amp; \cdots &amp; n \\ n+1 &amp; n+2 &amp; n+3 &amp; \cdots &amp; 2n \\ 2n+1 &amp; 2n+2 &amp; 2n+3 &amp; \cdots &amp; 3n\\ \vdots &amp; \vdots &amp; \vdots &amp; \ddots &amp; \vdots \\ (n-1)n+1 &amp; (n-1)n+2 &amp; (n-1)n+3 &amp; \cdots &amp; n^2 \end{matrix}$</p>

### 입력

<p>The first line of input contains a positive integer $n$ ($1 \le n \le 1000$).</p>

<p>Each of the next $n$ lines contains $n$ positive integers. Together, they represent the $n \times n$ matrix. It is guaranteed that each number from $1$ to $n^2$ appears in the matrix exactly once.</p>

### 출력

<p>The first line should contain a non-negative integer $k$: the number of swaps you made. This number should not be greater than the minimum number of swaps for the worst possible case of $n \times n$ matrix.</p>

<p>The next $k$ lines should each contain four positive integers: $x_1$, $y_1$, $x_2$, $y_2$. They indicate that you swapped the number in row $x_1$, column $y_1$ with the number in row $x_2$, column $y_2$.</p>

<p>You need to ensure that $x_1 = x_2$ or $y_1 = y_2$.</p>

<p>If there is more than one solution, print any one of them.</p>

### 힌트

<p>For Sample 1, it can be proven that this is one of the solutions with the minimum number of swaps, and it clearly meets the conditions.</p>

<p>For Sample 2, the sample output's solution is not the one with the minimum number of swaps, but we know that there exists a permutation from $1$ to $n^2$ (the previous example) that requires at least $3$ swaps, so this solution is also feasible.</p>

<p>For Sample 3, we allow the case where $(x_1, y_1) = (x_2, y_2)$.</p>

<p>For Sample 4, note that $k$ can be equal to $0$.</p>