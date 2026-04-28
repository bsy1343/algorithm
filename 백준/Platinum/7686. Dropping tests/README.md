# [Platinum V] Dropping tests - 7686

[문제 링크](https://www.acmicpc.net/problem/7686)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 156, 정답: 65, 맞힌 사람: 61, 정답 비율: 45.865%

### 분류

그리디 알고리즘, 정렬, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>In a certain course, you take n tests. If you get \(a_i\) out of \(b_i\)&nbsp;questions correct on test i, your cumulative average is defined to be</p>

<p style="text-align:center">\(100 \cdot \dfrac{\sum_{i=1}^{n}{a_i}}{\sum_{i=1}^{n}{b_i}}\).</p>

<p>Given your test scores and a positive integer k, determine how high you can make your cumulative average if you are allowed to drop any k of your test scores.</p>

<p>Suppose you take 3 tests with scores of 5/5, 0/1, and 2/6. Without dropping any tests, your cumulative average is 100&middot;(5+0+2)/(5+1+6) = 50. However, if you drop the third test, your cumulative average becomes 100&middot;(5+0)/(5+1) &asymp; 83.33 &asymp; 83.</p>

### 입력

<p>4.3 Input The input test file will contain multiple test cases, each containing exactly three lines. The first line contains two integers, 1 &le; n &le; 1000 and 0 &le; k &lt; n. The second line contains n integers indicating \(a_i\) for all i. The third line contains n positive integers indicating \(b_i\) for all i. It is guaranteed that 0 &le; \(a_i\) &le; \(b_i\) &le; 1, 000, 000, 000. The end-of-file is marked by a test case with n = k = 0 and should not be processed.</p>

### 출력

<p>For each test case, write a single line with the highest cumulative average possible after dropping k of the given test scores. The average should be rounded to the nearest integer.</p>

### 힌트

<p>To avoid ambiguities due to rounding errors, the judge tests have been constructed so that all answers are at least 0.001 away from a decision boundary (i.e., you can assume that the average is never 83.4997).</p>