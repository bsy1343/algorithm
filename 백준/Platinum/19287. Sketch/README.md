# [Platinum II] Sketch - 19287

[문제 링크](https://www.acmicpc.net/problem/19287)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 11, 맞힌 사람: 9, 정답 비율: 56.250%

### 분류

해 구성하기, 다이나믹 프로그래밍, 그리디 알고리즘, 수학

### 문제 설명

<p>Given a sequence $a$ consisting of integers $a_1, \ldots, a_n$, consider all its non-decreasing subsequences of length $k$. Among all of these take the one with smallest last element. We denote the value of this element with $s_k$.</p>

<p>The sequence $s(a) = s_1, \ldots, s_{l}$ is a <em>sketch</em>&nbsp;for sequence $a$, where $l$ is the length of the longest non-decreasing subsequence of $a$.</p>

<p>Building a sketch of the sequence is a standard task while finding the length of the longest non-decreasing subsequence. Here we consider an opposite problem: given a sketch with some missing entries, find any sequence producing this sketch.</p>

<p>Formally, you are given a sequence $t_1, \ldots, t_k$ where each element is either a positive integer or $-1$. You have to find a sequence $a_1, \ldots, a_n$ with each element being an integer between $1$ and $m$, inclusive, satisfying the following properties: length of the sketch of $a$ should be equal to $k$, and for each index $i$ between $1$ and $k$, if $t_i \neq -1$, then $s_i = t_i$ should hold.</p>

### 입력

<p>First line contains three integers $k$, $n$, $m$ ($1 \leq k \leq 300\,000$, $1 \leq n \leq 300\,000$, $1 \leq m \leq 10^9$), the length of the sketch, the length of the desired sequence and the upper bound on element values respectively.</p>

<p>Next line contains $k$ numbers $t_1, \ldots, t_k$ ($1 \leq t_i \leq m$ or $t_i = -1$), the sketch itself.</p>

### 출력

<p>If a sequence with such sketch exists, output the elements of a desired sequence. In case of multiple answers you may output any of them.</p>

<p>If no valid sequence exists, output a single integer $-1$.</p>

### 힌트

<p>Sketch of the answer sequence in example 2: $3\ 4\ 7$.</p>