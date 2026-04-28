# [Bronze II] Greedily Increasing Subsequence - 17931

[문제 링크](https://www.acmicpc.net/problem/17931)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 263, 정답: 184, 맞힌 사람: 159, 정답 비율: 72.603%

### 분류

구현, 그리디 알고리즘

### 문제 설명

<p>Given a permutation $A = (a_1, a_2, \dots, a_N)$ of the integers $1, 2, \dots, N$, we define the <em>greedily increasing subsequence</em>&nbsp;(GIS) in the following way.</p>

<p>Let $g_1 = a_1$. For every $i &gt; 1$, let $g_i$ be the leftmost integer in $A$ that is strictly larger than $g_{i-1}$. If there for a given $i$ is no such integer, we say that the GIS of the sequence is the sequence $(g_1, g_2, ..., g_{i - 1})$.</p>

<p>Your task is to, given a permutation $A$, compute the GIS of $A$.</p>

### 입력

<p>The first line of input contains an integer $1 \le N \le 10^6$, the number of elements of the permutation $A$. The next line contains $N$ distinct integers between $1$ and $N$, the elements $a_1, \dots, a_N$ of the permutation $A$.</p>

### 출력

<p>First, output a line containing the length $l$ of the GIS of $A$. Then, output $l$ integers, containing (in order) the elements of the GIS.</p>