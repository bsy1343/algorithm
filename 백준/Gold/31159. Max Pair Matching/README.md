# [Gold I] Max Pair Matching - 31159

[문제 링크](https://www.acmicpc.net/problem/31159)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 109, 정답: 55, 맞힌 사람: 49, 정답 비율: 51.579%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>You are given $2n$ pairs $(a_i, b_i)$ of integers. Consider a complete graph on $2n$ vertices and define the weight of the edge $(ij)$ to be $w_{ij} = max(|a_i-a_j|, |a_i-b_j|, |b_i-a_j|, |b_i-b_j|)$. </p>

<p>Determine the maximum weight of the matching in this graph.</p>

<p>In other words, consider all ways to select $n$ edges of this graph such that no two chosen edges have a common endpoint. What is the maximum possible total weight of these edges?</p>

### 입력

<p>The first line of the input contains a single integer $n$ ($1 \le n \le 10^5$).</p>

<p>The $i$-th of the next $2n$ lines contain two integers $a_i$ and $b_i$ ($0 \le a_i, b_i \le 10^9$).</p>

### 출력

<p>Print a single integer --- the maximum weight of the matching in this graph.</p>

### 힌트

<p>Adjacency matrix: $\begin{matrix}0  &amp; 7 &amp; 9  &amp; 15 \\ 7  &amp; 0 &amp; 3  &amp; 8  \\ 9  &amp; 3 &amp; 0  &amp; 11 \\ 15 &amp; 8 &amp; 11 &amp; 0 \end{matrix}$</p>