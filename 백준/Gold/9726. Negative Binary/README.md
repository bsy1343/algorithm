# [Gold III] Negative Binary - 9726

[문제 링크](https://www.acmicpc.net/problem/9726)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 34, 정답: 24, 맞힌 사람: 23, 정답 비율: 85.185%

### 분류

수학, 애드 혹

### 문제 설명

<p>Number bases have place values that start at 1 (base to the 0 power) and proceed right-to-left to base-1, base-2, and so on. In base-2, the place values are 1, -2, 4, -8, 16, -32, ... (reading from right to left). Thus, counting increasingly from 1 goes like this: 1, 110, 111, 100, 101, 11010, 11011, 11000, 11001, and so on. The advantage of base-2 representation is that you do not have to maintain a sign bit. Your task is to print the given decimal number in base-2.&nbsp;</p>

### 입력

<p>The first line has a positive integer T, T &lt;= 100000, denoting the number of test cases. This is followed by each test case per line.&nbsp;</p>

<p>Each test case contains a single integer decimal number N between -10<sup>17</sup> to 10<sup>17</sup> inclusive.&nbsp;</p>

### 출력

<p>For each test case, the output contains a line in the format Case #x: M, where x is the case number (starting from 1) and M is the base-2 representation of the given decimal number.&nbsp;</p>