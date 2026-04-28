# [Silver V] The Very Greatest Common Divisor - 7487

[문제 링크](https://www.acmicpc.net/problem/7487)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 225, 정답: 160, 맞힌 사람: 121, 정답 비율: 74.233%

### 분류

수학, 정수론, 임의 정밀도 / 큰 수 연산, 유클리드 호제법

### 문제 설명

<p>You need to find greatest common divisor of two integers a and b. Each number a and b are determinants of the square matrix of the form:&nbsp;</p>

<p>\[\begin{pmatrix} 1 &amp; 1 &amp; 0 &nbsp;&amp; \cdots &amp; 0 \\ -1 &amp; 1 &amp; 1 &amp; \ddots &nbsp;&amp; \vdots \\ 0 &amp; -1 &amp; \ddots &amp; \ddots &amp; 0 \\ \vdots &amp; \ddots &amp; \ddots &amp; \ddots &amp; 1 \\ 0 &amp; \cdots &amp; 0 &amp; -1 &amp; 1 &nbsp;\end{pmatrix}\]</p>

### 입력

<p>The first line of the input file contains number n &lt; 250 of test cases. The description of a test case consists of two lines. The first line contains integer a (0 &lt; a &lt; 10<sup>12540</sup>), the second &ndash; integer b (0 &lt; b &lt; 10<sup>12540</sup>).&nbsp;</p>

### 출력

<p>For each test case print the greatest common divisor of integers a and b on a separate line.</p>