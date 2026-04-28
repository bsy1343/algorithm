# [Platinum V] Diophantine Equation - 31100

[문제 링크](https://www.acmicpc.net/problem/31100)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 67, 정답: 11, 맞힌 사람: 9, 정답 비율: 25.000%

### 분류

수학, 정수론, 백트래킹, 소인수분해

### 문제 설명

<p>Bikarp has a square of a positive integer $n^2$. He wants to split it into a sum of two cubes of positive integers. In other words, Bikarp wants to solve the following Diophantine equation</p>

<p>$$n^2 = x^3 + y^3$$</p>

<p>in positive integers, where $n$ is fixed.</p>

<p>Find a solution of this equation or determine that it doesn&#39;t exist.</p>

### 입력

<p>The first line contains integer $T$ --- the number of test samples ($1 \le T \le 3000$).</p>

<p>The $i$-th of the following $T$ lines contains a single integer $n$ ($1 \le n \le 10^9$).</p>

### 출력

<p>Output $T$ lines. The $i$-th of them should contain the answer for the $i$-th test sample: either &quot;<code>impossible</code>&quot;, if $n$ cannot be decomposed, or two positive integers $x$ and $y$.</p>

<p>If some test sample has several solutions --- output any of them.</p>