# [Platinum I] Multiplying Digits - 13468

[문제 링크](https://www.acmicpc.net/problem/13468)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 176, 정답: 28, 맞힌 사람: 25, 정답 비율: 26.316%

### 분류

다이나믹 프로그래밍, 수학, 정수론

### 문제 설명

<p>For every positive integer we may obtain a non-negative&nbsp;integer by multiplying its digits. This defines a function&nbsp;f, e.g. f(38) = 24.</p>

<p>This function gets more interesting if we allow for other&nbsp;bases. In base 3, the number 80 is written as 2222, so:&nbsp;f3(80) = 16.</p>

<p>We want you to solve the reverse problem: given a base B and a number N, what is the&nbsp;smallest positive integer X such that fB(X) = N?</p>

### 입력

<p>The input consists of a single line containing two integers B and N, satisfying 2 &lt; B &le; 10 000&nbsp;and 0 &lt; N &lt; 2<sup>63</sup>.</p>

### 출력

<p>Output the smallest positive integer solution X of the equation fB(X) = N. If no such X&nbsp;exists, output the word &ldquo;impossible&rdquo;. The input is carefully chosen such that X &lt; 2<sup>63&nbsp;</sup>holds (if X exists).</p>