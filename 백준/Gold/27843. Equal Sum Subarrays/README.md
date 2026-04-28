# [Gold I] Equal Sum Subarrays - 27843

[문제 링크](https://www.acmicpc.net/problem/27843)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 290, 정답: 144, 맞힌 사람: 120, 정답 비율: 48.193%

### 분류

브루트포스 알고리즘, 정렬

### 문제 설명

<p>FJ gave Bessie an array $a$ of length $N$ ($2\le N\le 500, -10^{15}\le a_i\le 10^{15}$) with all $\frac{N(N+1)}{2}$ contiguous subarray sums distinct. For each index $i\in [1,N]$, help Bessie compute the minimum amount it suffices to change $a_i$ by so that there are two different contiguous subarrays of $a$ with equal sum.</p>

### 입력

<p>The first line contains $N$.</p>

<p>The next line contains $a_1,\dots, a_N$ (the elements of $a$, in order).</p>

### 출력

<p>One line for each index $i\in [1,N]$.</p>