# [Platinum I] Circles - 18909

[문제 링크](https://www.acmicpc.net/problem/18909)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 20, 정답: 15, 맞힌 사람: 15, 정답 비율: 75.000%

### 분류

(분류 없음)

### 문제 설명

<p>Given an array of non-negative integers $s_1, \ldots, s_n$ with $n \geq 3$, let&#39;s call a sequence of $n$ non-negative numbers (not necessarily integers) $x_1, x_2, \ldots, x_n$ \textit{balanced} if for each $i$, the constraint $x_i + x_{i+1} \leq s_i$ is satisfied, where $x_{n+1}=x_1$.</p>

<p>Let&#39;s denote $f(s_1, s_2, \ldots, s_n)$ as the largest $x_1 + x_2 + \ldots + x_n$ among all balanced configurations of weights.</p>

<p>You are given an array of non-negative integers $a_1, a_2, \ldots, a_n$.&nbsp;</p>

<p>Find $n-2$ numbers: $f(a_1, a_2, a_3), f(a_1, a_2, a_3, a_4), \ldots, f(a_1, a_2, a_3, \ldots, a_n)$.</p>

### 입력

<p>The first line contains one integer $n$ ($3 \leq n \leq 100\,000)$.</p>

<p>The second line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($0 \leq a_i \leq 100\,000$).</p>

### 출력

<p>Print $n-2$ numbers: $f(a_1, a_2, a_3), f(a_1, a_2, a_3, a_4), \ldots, f(a_1, a_2, a_3, \ldots, a_n)$.</p>

<p>Your answer will be considered correct if the relative or absolute error of all values in it is at most $10^{-9}$.</p>

### 힌트

<p>In the first example, for the prefix with three elements we can set values $\{10, 10, 10\}$, for the next prefix we can set values $\{10.1, 9.9, 10.1, 4.9\}$.</p>