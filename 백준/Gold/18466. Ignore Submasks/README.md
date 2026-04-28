# [Gold III] Ignore Submasks - 18466

[문제 링크](https://www.acmicpc.net/problem/18466)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 22, 맞힌 사람: 22, 정답 비율: 59.459%

### 분류

수학, 정수론, 누적 합, 조합론, 비트마스킹

### 문제 설명

<p>You are given an array of n integers, a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub>. Each integer is between 0 and 2<sup>k</sup> &minus; 1, inclusive.</p>

<p>Let&rsquo;s say that f(x) is the smallest i, such that (a<sub>i</sub>&amp;x) &ne; a<sub>i</sub>, or 0, if there are no such i. (a&amp;b) is the bitwise AND operation.</p>

<p>Find f(0) + f(1) + . . . + f(2<sup>k</sup> &minus; 1). As this value may be very large, find it modulo 998 244 353.</p>

### 입력

<p>The first line contains two integers: n, k (1 &le; n &le; 100, 1 &le; k &le; 60).</p>

<p>The next line contains n integers: a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> (0 &le; a<sub>i</sub> &lt; 2<sup>k</sup>).</p>

### 출력

<p>Print one integer: f(0) + f(1) + . . . + f(2<sup>k</sup> &minus; 1), modulo 998 244 353.</p>

### 힌트

<p>In the first example, f(0) = 2, f(1) = 0.</p>

<p>In the second example, f(0) = 1, f(1) = 1, f(2) = 2, f(3) = 0.</p>