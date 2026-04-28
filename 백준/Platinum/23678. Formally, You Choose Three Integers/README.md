# [Platinum III] Formally, You Choose Three Integers - 23678

[문제 링크](https://www.acmicpc.net/problem/23678)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 65, 정답: 11, 맞힌 사람: 8, 정답 비율: 16.667%

### 분류

수학, 순열 사이클 분할

### 문제 설명

<p>You are given two arrays $a$ and $b$ of the same length $n$.</p>

<p>You are allowed to perform zero or more operations on $a$ of the following kind:</p>

<p>Choose a contiguous subarray of even length and cyclically shift it by an even number of positions. Formally, you choose three integers $i, j$ and $k$ ($0 \leq i &lt; j &lt; k \leq n$, $j - i$ is even, $k - i$ is even) and $a$ becomes equal to $a_{0:i} + a_{j:k} + a_{i:j} + a_{k:n}$, where $a_{l:r}$ denotes a slice with Python indexing. Precisely, it contains elements in the range of indices $[l,r)$ in 0-indexing and $(l,r]$ in 1-indexing.</p>

<p>Is it possible to transform $a$ into $b$?</p>

### 입력

<p>The first line contains a single integer $n$ ($1 \leq n \leq 3 \cdot 10^5$), the length of $a$ and $b$.</p>

<p>The second line contains $n$ integers $a_i$ ($1 \leq a_i \leq n$), elements of $a$.</p>

<p>The third line contains $n$ integers $b_i$ ($1 \leq b_i \leq n$), elements of $b$.</p>

### 출력

<p>Print <code>1</code> if it is possible to transform $s$ into $t$ and <code>0</code> otherwise.</p>