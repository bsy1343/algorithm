# [Gold III] Do Not Hex My Numbers! - 11314

[문제 링크](https://www.acmicpc.net/problem/11314)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 115, 정답: 12, 맞힌 사람: 9, 정답 비율: 8.911%

### 분류

수학, 그래프 이론, 그래프 탐색, 정수론, 너비 우선 탐색, 역추적

### 문제 설명

<p>Given an integer N and list of D hexadecimal digits, what is the smallest positive integer X, whose representation in base 16 consists only of given digits, such that X is divisible by N?</p>

### 입력

<p>The first line of the input file starts with the integer T, the number of test cases (1 &le; T &le; 100). Each test case consists of two lines, in the following format:</p>

<pre>
N D
d<sub>1</sub> d<sub>2</sub> . . . d<sub>D</sub></pre>

<p>N(1 &le; N &le; 200, 000) and D(1 &le; D &le; 16) are as described in the problem statement (both given here in base 10) and d<sub>i</sub>(1 &le; i &le; D) are heximal digits allowed to be used in the result. You can assume that digits are sorted.</p>

### 출력

<p>For each test case, output the smallest positive number X in base 16 such that X is divisible by N and it contains only digits provided. If there is no such number, output &rdquo;no solution&rdquo; instead.</p>