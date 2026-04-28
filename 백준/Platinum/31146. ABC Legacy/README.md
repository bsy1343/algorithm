# [Platinum V] ABC Legacy - 31146

[문제 링크](https://www.acmicpc.net/problem/31146)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 52, 정답: 28, 맞힌 사람: 26, 정답 비율: 52.000%

### 분류

그리디 알고리즘

### 문제 설명

<p>You are given a string $S$ of length $2n$, consisting of the characters <code>A</code>, <code>B</code> and <code>C</code>. Determine if $S$ can be split into $n$ non-intersecting subsequences, each of which forms one of the strings &quot;<code>AB</code>&quot;, &quot;<code>AC</code>&quot;, &quot;<code>BC</code>&quot;. If it is possible, find such a splitting.</p>

### 입력

<p>The first line of input contains one integer $n$ ($1 \le n \le 10^5$).</p>

<p>The second line of input contains a string $S$ of length $2n$, consisting of the characters <code>A</code>, <code>B</code> and <code>C</code>.</p>

### 출력

<p>If the splitting is not possible, print &quot;<code>NO</code>&quot; (without quotes).</p>

<p>If the splitting is possible, print &quot;<code>YES</code>&quot; (without quotes), followed by $n$ lines, each describing two indices for the $i$-th subsequence ($1 \le l_i &lt; r_i \le 2n$).</p>