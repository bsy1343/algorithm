# [Silver IV] Ladder - 19179

[문제 링크](https://www.acmicpc.net/problem/19179)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 125, 정답: 64, 맞힌 사람: 26, 정답 비율: 37.143%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>You have got $n$ sticks of lengths $d_1, d_2, \ldots, d_n$. To build a ladder, you need $k+2$ sticks: two sticks of length $x$ and $k$ sticks of length $y$. You may shorten the sticks you already have, but you cannot divide one stick into two. Can you make a ladder?</p>

### 입력

<p>The first line of the input contains a single integer $z$, the number of test cases. The descriptions of the test cases follow.</p>

<p>Each test case consists of four integers $n$, $k$, $x$, $y$ ($1 \leq n \leq 10^5$, $0 \leq k \leq 10^5$, $1 \leq x, y \leq 10^9$) followed by $n$ integers $d_1$, $d_2$, $\ldots$, $d_n$ ($1 \leq d_i \leq 10^9$).</p>

### 출력

<p>For each test case, output a single line containing a single word &quot;<code>YES</code>&quot; if making a ladder is possible, or &quot;<code>NO</code>&quot; otherwise.</p>