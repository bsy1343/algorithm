# [Gold III] Longest Increasing Subsequence - 19321

[문제 링크](https://www.acmicpc.net/problem/19321)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 124, 정답: 91, 맞힌 사람: 77, 정답 비율: 77.778%

### 분류

정렬, 해 구성하기

### 문제 설명

<p>Given $f_1, f_2, \ldots, f_n$, find a permutation $p_1, p_2, \ldots, p_n$ of integers $1, 2, \ldots, n$ such that, for each $i$, the length of the longest strictly increasing subsequence ending with $p_i$ is $f_i$.</p>

### 입력

<p>The first line contains an integer $n$ ($1 \leq n \leq 10^5$).</p>

<p>The second line contains $n$ integers $f_1, f_2, \ldots, f_n$ ($1 \leq f_i \leq n$). It is guaranteed that, for the given input, at least one such permutation $p_1, p_2, \ldots, p_n$ exists.</p>

### 출력

<p>On the first line, print $n$ integers $p_1, p_2, \ldots, p_n$. These numbers must form a permutation of integers $1, 2, \ldots, n$. If there are several possible answers, print any one of them.</p>