# [Silver IV] Range Sum Query - 9780

[문제 링크](https://www.acmicpc.net/problem/9780)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 229, 정답: 144, 맞힌 사람: 122, 정답 비율: 64.550%

### 분류

누적 합

### 문제 설명

<p>Given a list L containing n integers, find the Range Sum Query (RSQ) between index i and j, inclusive, i.e. RSQ(i, j) = L[i] + L[i+1] + L[i+2] + ... + L[j].</p>

### 입력

<p>The input starts with an integer t in the first line that denotes the number of test cases in this problem (1 &le; t &le; 5).</p>

<p>Each test case starts with a blank line, followed by a line that contains 2 integers: n and q (1 &le; n, q &le; 100,000).</p>

<p>Then, the next line contains n non-negative integers up to 1,000,000,000.</p>

<p>Then q lines follow.</p>

<p>Each line contains two integers, i and j (0 &le; i, j &lt; 10,000).</p>

### 출력

<p>For each query, print a line containing the value of RSQ(i, j). Separate two test cases with a blank line.</p>