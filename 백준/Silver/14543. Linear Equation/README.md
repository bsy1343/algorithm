# [Silver I] Linear Equation - 14543

[문제 링크](https://www.acmicpc.net/problem/14543)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 742, 정답: 121, 맞힌 사람: 96, 정답 비율: 16.931%

### 분류

수학, 문자열, 파싱, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>You have been asked to write a program that can solve a simple linear equation.</p>

### 입력

<p>The first line of input contains a single integer P, (1 &le; P &le; 100), which is the number of data sets that follow. Each data set consists of a single line containing one simple linear equation. Each equation will be in the form of ax, followed by a single space, followed by a sign &ldquo;+&rdquo;, followed by b, followed by a single space, followed by a sign &ldquo;=&rdquo;, followed by a single space, followed by c.</p>

<p style="text-align: center;">ax + b = c</p>

<p>where x is the variable, and a, b, c are non-negative integers (a, b, c&nbsp;&le; 10<sup>9</sup>).</p>

### 출력

<p>For each data set, generate two lines of output. The first line will contain &ldquo;Equation n&rdquo; where n is the number of the data set. The second line will contain the following answer:</p>

<ul>
	<li>If the equation has no solution, print &quot;No solution.&quot;.</li>
	<li>If the equation has infinitely many solutions, print &quot;More than one solution.&quot;.</li>
	<li>If the equation has exactly one solution, print &quot;x = solution&quot; where solution is replaced by the appropriate real number,&nbsp;<strong>truncated</strong>&nbsp;to six digits after the decimal point.</li>
</ul>

<p>Print a blank line after each data set case.</p>