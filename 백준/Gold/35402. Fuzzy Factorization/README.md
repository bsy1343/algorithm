# [Gold IV] Fuzzy Factorization - 35402

[문제 링크](https://www.acmicpc.net/problem/35402)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 2048 MB

### 통계

제출: 43, 정답: 25, 맞힌 사람: 22, 정답 비율: 68.750%

### 분류

소인수분해, 수학, 애드 혹, 정수론, 해 구성하기

### 문제 설명

<p>Finding the prime factorization of big numbers is a challenging task. It is so difficult that the security of almost our entire digital world, from online banking to private messages, is built upon how hard it is. In this problem, you are asked to perform such a factorization, but some relative error is allowed in your answer.</p>

<p>More formally, you are given an integer $X$, and you have to provide the prime factorization of any number $Y = p_1^{e_1} \cdot p_2^{e_2} \cdots p_k^{e_k}$ such that</p>

<ul>
<li>the relative error of the factorization does not exceed $10^{-9}$ (that is, $\frac{|X - Y|}{X} \le 10^{-9}$), and</li>
<li>each prime factor $p_i$ of $Y$ does not exceed $10^{18}$ (that is, $p_i \le 10^{18}$ for $i = 1, 2, ..., k$).</li>
</ul>

### 입력

<p>The input consists of a single line that contains an integer $X$ ($2 \le X \le 10^{1000}$).</p>

### 출력

<p>The first line must contain a positive integer $k$ indicating the number of different prime factors in the prime factorization of $Y = p_1^{e_1} \cdot p_2^{e_2} \cdots p_k^{e_k}$.</p>

<p>The $i$-th of the next $k$ lines must contain the two positive integers $p_i$ and $e_i$, representing that $p_i$ is a prime factor of $Y$ with multiplicity $e_i$.</p>

<p>It can be proven that a valid answer exists under the given constraints. If there are multiple solutions, output any of them.</p>