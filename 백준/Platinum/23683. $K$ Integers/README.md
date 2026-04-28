# [Platinum V] $K$ Integers - 23683

[문제 링크](https://www.acmicpc.net/problem/23683)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 121, 정답: 23, 맞힌 사람: 16, 정답 비율: 19.512%

### 분류

자료 구조, 그리디 알고리즘, 문자열, 많은 조건 분기

### 문제 설명

<p>You are given a string $s$ of length $n$.</p>

<p>A sequence of integers $t$ is an <strong>index sequence</strong> if $1 \leq t_1 &lt; t_2 &lt; \ldots &lt; t_k \leq n$, where $k$ is the length of $t$.</p>

<p>A string corresponding to an index sequence $t$ is the the following string: $s_{t_1} s_{t_2} \ldots s_{t_k}$. Note that it is always a subsequence of $s$.</p>

<p>You are given an index sequence. Find the lexicographically smallest string which corresponds to some index sequence which contains the given one as a subsequence.</p>

### 입력

<p>The first line contains the string $s$ consisting of $n$ ($1 \leq n \leq 5 \cdot 10^5$) lowercase English letters.</p>

<p>The second line contains a single integer $k$ ($1 \leq k \leq n$), length of $t$.</p>

<p>The third line contains $k$ integers $t_i$ ($1 \leq t_i \leq n$). $t$ is an index sequence.</p>

### 출력

<p>Print a single string --- the answer to the problem.</p>