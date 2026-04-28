# [Platinum II] Maximum Subsequence - 21103

[문제 링크](https://www.acmicpc.net/problem/21103)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 94, 정답: 43, 맞힌 사람: 38, 정답 비율: 53.521%

### 분류

다이나믹 프로그래밍, 이분 탐색, 비트마스킹, 매개 변수 탐색, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>For a sequence $a_{1...n}$, define $f(a)$ as $$f(a) = \max\limits_{1 \le l \le r \le n} \sum\limits_{i = l}^{r} a_i\text{.}$$</p>

<p>Given a sequence $b_{1...n}$, you need to permute $b_{1...n}$ to get $b&#39;_{1...n}$ and minimize $f(b&#39;)$.</p>

### 입력

<p>The first line contains a single integer $n$ ($1 \le n \le 16$).</p>

<p>The second line contains $n$ integers $a_{1...n}$ ($|a_i| \le 10^5$).</p>

### 출력

<p>Output the minimum possible $f(b&#39;)$.</p>