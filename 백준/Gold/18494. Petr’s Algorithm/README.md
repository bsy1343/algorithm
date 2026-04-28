# [Gold I] Petr’s Algorithm - 18494

[문제 링크](https://www.acmicpc.net/problem/18494)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 92, 정답: 59, 맞힌 사람: 46, 정답 비율: 69.697%

### 분류

애드 혹, 무작위화

### 문제 설명

<p>Petr is well-known for his unusual contests which shuffle well-established standings a lot. Each of his contests has a positive integer parameter k: its unusualness.</p>

<p>To predict results of such a contest with n participants, we can use the following <em>algorithm</em>: take an identity permutation of length n: p<sub>1</sub> = 1, p<sub>2</sub> = 2, . . . , p<sub>n</sub> = n and then sequentially shuffle all segments of length k from left to right.</p>

<p>In other words, we perform (n &minus; k + 1) operations, where on the i-th operation we permute elements p<sub>i</sub>, p<sub>i+1</sub>, . . . , p<sub>i+k&minus;1</sub> in random order so that all the permutations of these elements are equiprobable.</p>

<p>Given the resulting permutation p, can you recover the unusualness parameter k of this particular Petr&rsquo;s contest? To make things easier, we will only give you such tests that 20k &le; n holds.</p>

### 입력

<p>The first line contains a single integer n (40 &le; n &le; 10<sup>5</sup>) &mdash; the length of the permutation.</p>

<p>The second line contains n distinct integers p<sub>1</sub>, p<sub>2</sub>, . . . , p<sub>n</sub> (1 &le; p<sub>i</sub> &le; n) &mdash; the resulting permutation. It is guaranteed that this permutation was generated using the algorithm described above for some k such that 20k &le; n.</p>

### 출력

<p>Print a single integer &mdash; the unusualness parameter k of this particular Petr&rsquo;s contest.</p>