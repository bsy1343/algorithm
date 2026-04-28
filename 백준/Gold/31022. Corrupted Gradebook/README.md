# [Gold III] Corrupted Gradebook - 31022

[문제 링크](https://www.acmicpc.net/problem/31022)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 67, 정답: 23, 맞힌 사람: 18, 정답 비율: 48.649%

### 분류

다이나믹 프로그래밍, 문자열

### 문제 설명

<p>A gradebook has been corrupted so that the columns have been removed. Each student&#39;s record simply contains a single string of digits. Knowing that the string of digits must have come from <code>G</code> different assignments (each with a possible integer grade between 0 and 100, inclusive), parse the string so that the average of the <code>G</code> grades is maximized. No grade other than 0 will start with the digit 0 (i.e. there are no leading zeros in any grade). Print out the average for the given grades, rounded to the nearest integer.</p>

### 입력

<p>The first line of input contains the number of test cases, <code>C</code> (<code>1 &le; C &le; 100</code>). Each of the following <code>C</code> lines contains an integer <code>G</code> (<code>1 &le; G &le; 25</code>) indicating the number of grades, followed by a string of digits containing the corrupted grades.</p>

### 출력

<p>For each test case, output a single line containing the maximum average grade possible.</p>