# [Platinum III] Sum of Numbers - 28171

[문제 링크](https://www.acmicpc.net/problem/28171)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 236, 정답: 26, 맞힌 사람: 22, 정답 비율: 13.333%

### 분류

임의 정밀도 / 큰 수 연산, 백트래킹, 다이나믹 프로그래밍

### 문제 설명

<p>Given $n$ digits from &#39;<code>1</code>&#39; to &#39;<code>9</code>&#39;, you can add $k$ &#39;<code>+</code>&#39; to turn it into an expression. Find the minimum value of the expression.</p>

### 입력

<p>There are multiple test cases.</p>

<p>The first line of the input contains one integer $T$ ($1\le T\le 2\cdot 10^4$) --- the number of test cases.</p>

<p>For each test case:</p>

<p>The first line contains two integers $n$ ($2\le n\le 2\cdot 10^5$) and $k$ ($1\le k\le 6$, $k&lt;n$) --- the number of digits and the number of &#39;<code>+</code>&#39;.</p>

<p>The second line contains a string of length $n$, which consists of digits from &#39;<code>1</code>&#39; to &#39;<code>9</code>&#39;.</p>

<p>The sum of $n$ over all test cases does not exceed $2\cdot 10^5$.</p>

### 출력

<p>For each test case, output the answer in one line.</p>