# [Gold I] Group the Numbers - 33339

[문제 링크](https://www.acmicpc.net/problem/33339)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 23, 정답: 11, 맞힌 사람: 11, 정답 비율: 47.826%

### 분류

많은 조건 분기, 수학, 애드 혹, 해 구성하기, 홀짝성

### 문제 설명

<p>Consider the set of all integers from $1$ to $n$. Split these integers into $k$ equal-sized groups in such a way that the difference between the maximum and minimum sums of integers among all groups is minimized. Formally, if $s_i$ is the sum of integers in $i$-th group, the following value should be minimized:</p>

<p>$$\max\limits_{i=1}^k s_i - \min\limits_{i=1}^k s_i\text{.}$$</p>

### 입력

<p>The first line contains two integers $n$ and $k$ ($1 \leq n, k \leq 100\,000$; $n$ is divisible by $k$).</p>

### 출력

<p>For each group, print a line with all the integers belonging to that group. If there are multiple optimal answers, output any one of them.</p>