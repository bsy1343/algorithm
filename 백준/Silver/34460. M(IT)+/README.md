# [Silver V] M(IT)+ - 34460

[문제 링크](https://www.acmicpc.net/problem/34460)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 74, 정답: 50, 맞힌 사람: 46, 정답 비율: 65.714%

### 분류

구현, 문자열, 정규 표현식

### 문제 설명

<p>Busy Beaver is bored in class one day and decides to write several strings. He calls a string <em>repetitive</em> if it is the character <code>M</code> suffixed with one or more repetitions of <code>IT</code>. For example, the shortest repetitive strings are <code>MIT</code>, <code>MITIT</code>, <code>MITITIT</code>, $\dots$.</p>

<p>You are given a string $S$. Determine whether it can be expressed as the concatenation of one or more repetitive strings.</p>

### 입력

<p>The first line contains a single integer $T$ ($1 \leq T \leq 1000$) --- the number of test cases.</p>

<p>The first line of each test case contains a single integer $|S|$ ($3 \leq |S| \leq 2 \cdot 10^5$) --- the length of $S$.</p>

<p>The second line of each test case contains the string $S$ consisting of uppercase Latin characters.</p>

<p>The sum of $|S|$ over all test cases does not exceed $2 \cdot 10^5$.</p>

### 출력

<p>For each test case, output a single string "<code>YES</code>" or "<code>NO</code>" (without the quotes) denoting if the string $S$ is a concatenation of repetitive strings.</p>

### 힌트

<p>In the first test case, the entire string <code>MITIT</code> is repetitive.</p>

<p>In the second test case, it can be shown that the string is not a concatenation of repetitive strings.</p>

<p>In the third test case, the string is the following concatenation of repetitive strings: <code>MITIT</code> + <code>MIT</code> + <code>MITITIT</code>.</p>