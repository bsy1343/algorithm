# [Silver I] Making Mexes - 33736

[문제 링크](https://www.acmicpc.net/problem/33736)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 106, 정답: 78, 맞힌 사람: 70, 정답 비율: 74.468%

### 분류

그리디 알고리즘, 누적 합

### 문제 설명

<p>You are given an array $a$ of $N$ non-negative integers $a_1, a_2, \dots, a_N$ ($1\le N\le 2\cdot 10^5, 0\le a_i\le N$). In one operation, you can change any element of $a$ to any non-negative integer.</p>

<p>The <em>mex</em> of an array is the minimum non-negative integer that it does not contain. For each $i$ in the range $0$ to $N$ inclusive, compute the minimum number of operations you need in order to make the mex of $a$ equal $i$.</p>

### 입력

<p>The first line contains $N$.</p>

<p>The next line contains $a_1,a_2,\dots, a_N$.</p>

### 출력

<p>For each $i$ in the range $0$ to $N$, output the minimum number of operations for $i$ on a new line. Note that it is always possible to make the mex of $a$ equal to any $i$ in the range $0$ to $N$.</p>