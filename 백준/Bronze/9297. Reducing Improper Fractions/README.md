# [Bronze III] Reducing Improper Fractions - 9297

[문제 링크](https://www.acmicpc.net/problem/9297)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 1035, 정답: 520, 맞힌 사람: 490, 정답 비율: 50.154%

### 분류

수학, 사칙연산

### 문제 설명

<p>You were invited to a St. Patrick&rsquo;s Day party, but you aren&rsquo;t allowed to leave until you finish your fraction reduction homework. You want to go to the party as soon as possible so you decide to write a program to do your homework for you. Given an improper fraction, calculate its reduced form.</p>

### 입력

<p>The first line of input is the number of test cases that follow. Each test case is a line containing two integer values. The first integer value will be the numerator n (0 &le; n &le; 10<sup>9</sup>), the second integer is the denominator d (0 &lt; d &le; 10<sup>9</sup>).</p>

### 출력

<p>For each case output the line &ldquo;Case x:&rdquo; where x is the case number, on a single line, followed by a space, and then proper fraction. Each fraction will be of the form &ldquo;I N/D&rdquo;, where I is the integer part, N is the numerator of the fractional part, and D is the denominator of the fractional part. If the integer value is equal&nbsp;to&nbsp;0, only output &ldquo;N/D&rdquo;. If both the integer value and the reduced numerator are zero, output &ldquo;0&rdquo;. If there is no fractional part, only output &ldquo;I&rdquo;.</p>