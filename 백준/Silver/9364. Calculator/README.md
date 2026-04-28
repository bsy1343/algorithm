# [Silver I] Calculator - 9364

[문제 링크](https://www.acmicpc.net/problem/9364)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 168, 정답: 79, 맞힌 사람: 65, 정답 비율: 52.419%

### 분류

수학, 구현, 문자열, 사칙연산, 많은 조건 분기, 파싱

### 문제 설명

<p>The users feedback for your most beloved open-source operating system is gathered, and guess what the most required feature turned out to be? Yes it is finally what we all have been waiting for so long, extending the built-in calculator functionality! On of the suggested extensions is adding the capability of evaluating polynomials, and that&rsquo;s what you are thrilled to participate with!&nbsp;</p>

<p>In this problem you&rsquo;re given a polynomial entered by the user in the calculator and are asked to evaluate it for a certain value.&nbsp;</p>

### 입력

<p>The first line of input contains T (0 &lt; T &lt;= 100) the number of polynomials, each test cases consists of two lines, the first line contains an integer (-1000 &lt;= X &lt;= 1000), the value for the variable X for which the polynomial is evaluated.&nbsp;</p>

<p>The second line contains a polynomial P with integer coefficients. P is a sum of terms of the form CX^E , where the coefficient C and the exponent E satisfy the following conditions:&nbsp;</p>

<ol>
	<li>E is an integer satisfying (0 &lt;= E &lt;= 30). If E is 0, then CX^E is expressed as C. If E is 1, then CX^E is expressed as CX, unless C is 1 or -1. In those instances, CX^E is expressed as X or -X.&nbsp;</li>
	<li>C is an integer. If C is 1 or -1 and E is not 0 or 1, then the CX^E will appear as X^E or -X^E.&nbsp;</li>
	<li>Only non-negative C values that are not part of the first term in the polynomial are preceded by +.&nbsp;</li>
	<li>Exponents in consecutive terms are strictly decreasing.&nbsp;</li>
	<li>C fits in a 32-bit signed integer.&nbsp;</li>
	<li>The calculated value of each term CX^E also fits in a 32-bit signed integer.</li>
</ol>

### 출력

<p>For each test case, print the value of polynomial evaluation. The result will fit in a 32-bit signed integer. Follow the output format below.&nbsp;</p>