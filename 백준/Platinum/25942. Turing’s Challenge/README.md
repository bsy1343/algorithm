# [Platinum II] Turing’s Challenge - 25942

[문제 링크](https://www.acmicpc.net/problem/25942)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 12, 맞힌 사람: 10, 정답 비율: 50.000%

### 분류

애드 혹, 조합론, 수학, 정수론

### 문제 설명

<p>Knuth was looking through some of Turing&#39;s memoirs and found a rather interesting challenge that Turing had left for one of his successors. Naturally, Knuth has slyly decided to ask you, his best student, to write a computer program to solve the challenge, but plans on taking credit for the work. Since you know that co-authoring a paper with Knuth is to computer scientists what co-authoring a paper with Erdos is to mathematicians, you&#39;ve decided to take the bait. Help Knuth solve Turing&#39;s problem!</p>

<p>The challenge is as follows:</p>

<p>Given positive integer values for $X$ and $N$, define the set $T$ as follows:</p>

<p style="text-align: center;">$T = \left\{ T_i | 1 \le i \le N + 1\right\}$, where $T_i = \binom{N}{i-1}X^{i-1}$</p>

<p>The goal of the challenge is to pick a set $S$ of maximal sum with $S &sube; \left\{i|1 &le; i &le; N + 1\right\}$, such that $&prod;_{i&isin;S}{T_i} &equiv; 2 \pmod{4}$.</p>

<p>In other words, we seek a subset of terms in the binomial expansion of $(1 + X)^N$ such that the product of the terms leaves a remainder of $2$ when divided by $4$ and the sum of the indices of those terms is maximal.</p>

<p>The goal of Turing&#39;s challenge is to determine this maximal sum.</p>

<p>As an example, consider $X = 3$ and $N = 5$. The corresponding terms are $T_1 = 1$, $T_2 = 15$, $T_3 = 90$, $T_4 = 270$, $T_5 = 405$, and $T_6 = 243$.</p>

<p>The product, $T_1T_2T_4T_5T_6 = 1 &times; 15 &times; 270 &times; 405 &times; 243 = 398580750 &equiv; 2 \pmod{4}$, thus the solution to this specific challenge is $1 + 2 + 4 + 5 + 6 = 18$, since no other product of terms with a higher sum of indices is congruent to $2 \pmod{4}$.</p>

### 입력

<p>The first input line contains a positive integer, $q$ ($1 &le; q &le; 500$), indicating the number of queries. Each of the next $q$ lines will contain a pair of space-separated integers, where the first integer is $X$ ($1 &le; X &lt; 2^{31}$), and the second integer is $N$ ($1 &le; N &lt; 2^{31}$), for that query.</p>

### 출력

<p>For each query, output on a line by itself, the desired maximal sum of indices. If no such subset of terms exists, output $0$ instead.</p>