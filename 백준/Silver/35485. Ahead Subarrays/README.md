# [Silver II] Ahead Subarrays - 35485

[문제 링크](https://www.acmicpc.net/problem/35485)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 23, 맞힌 사람: 21, 정답 비율: 72.414%

### 분류

누적 합, 슬라이딩 윈도우

### 문제 설명

<p>You are given two integer arrays $A$ and $B$, each of length $N$.</p>

<p>You want to select one contiguous subarray of length $K$ from each array to maximize the sum of the elements in the two chosen subarrays. However, the starting position of the subarray chosen from array $A$ must be <strong>strictly earlier</strong> than the starting position of the subarray from array $B$.</p>

<p>Formally, for integers $a$, $b$ satisfying $1 \le a &lt; b \le N-K+1$ define</p>

<p>\[S(a, b) = \sum_{i = a}^{a + K - 1} A_i + \sum_{i = b}^{b + K - 1} B_i.\]</p>

<p>Your task is to find the maximum possible value of $S(a, b)$</p>

### 입력

<p>The first line contains two integers $N$ and $K$, the length of the arrays and the length of each subarray. ($2 \le N \le 100\,000, 1 \le K \le N-1$)</p>

<p>The second line contains $N$ integers $A_1, A_2, \ldots, A_N$. ($-1\,000 \le A_i \le 1\,000$)</p>

<p>The third line contains $N$ integers $B_1, B_2, \ldots, B_N$. ($-1\,000 \le B_i \le 1\,000$)</p>

### 출력

<p>Print a single integer: the maximum possible value of $S(a, b)$ under the given conditions.</p>