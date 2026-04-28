# [Silver II] Easy Arithmetic - 11470

[문제 링크](https://www.acmicpc.net/problem/11470)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 208, 정답: 63, 맞힌 사람: 52, 정답 비율: 36.620%

### 분류

그리디 알고리즘, 문자열

### 문제 설명

<p>Eva is a third-grade elementary school student. She has just learned how to perform addition and subtraction of arbitrary-precision integers. Her homework is to evaluate some expressions. It is boring, so she decided to add a little trick to the homework. Eva wants to add some plus and minus signs to the expression to make its value as large as possible.</p>

### 입력

<p>The single line of the input file contains the original arithmetic expression. It contains only digits, plus (&lsquo;+&rsquo;) and minus (&lsquo;-&rsquo;) signs.</p>

<p>The original expression is correct, that is:</p>

<ul>
	<li>numbers have no leading zeroes;</li>
	<li>there are no two consecutive signs;</li>
	<li>the last character of the expression is a digit.</li>
</ul>

<p>The length of the original expression does not exceed 1000 characters.</p>

### 출력

<p>Output a single line &mdash; the original expression with some plus and minus signs added. Output expression must satisfy the same correctness constraints as the original one. Its value must be as large as possible.</p>