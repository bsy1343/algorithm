# [Gold II] MIT and TIM - 34903

[문제 링크](https://www.acmicpc.net/problem/34903)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 13, 정답: 13, 맞힌 사람: 12, 정답 비율: 100.000%

### 분류

문자열, 애드 혹

### 문제 설명

<p>Busy Beaver is studying Archaeology and Materials at MIT! He has been studying ancient inscriptions made only of the letters <code>M</code>, <code>I</code>, and <code>T</code> and notices the following rule: any time the substring <code>MIT</code> appears, it may be rearranged into <code>TIM</code>, and any time <code>TIM</code> appears, it may be rearranged back into <code>MIT</code>.</p>

<p>Now Busy Beaver wants to form as many occurrences as possible of his favorite pattern, <code>MITIT</code>, in the string. Help him determine the maximum number of contiguous substrings equal to <code>MITIT</code> that can appear after performing any number of operations (possibly zero).</p>

### 입력

<p>The first line contains an integer $T$ $(1 \le T \le 10^5)$ --- the number of test cases.  </p>

<p>The only line of each test case contains a string of length at most $10^5$ consisting of the characters <code>M</code>, <code>I</code>, and <code>T</code>.  </p>

<p>The total length of all strings does not exceed $10^5$.</p>

### 출력

<p>For each test case, output a single integer --- the maximum number of substrings <code>MITIT</code> that can appear after performing any number of operations.</p>

### 힌트

<p>In the first test case, we can do the following operations: <code>TITIMMIT</code> $\to$ <code>TIMITMIT</code> and <code>TIMITMIT</code> $\to$ <code>MITITMIT</code>. We can prove that it is impossible to construct two copies of <code>MITIT</code> inside this string.</p>