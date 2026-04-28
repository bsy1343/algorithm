# [Gold III] It's My Derivative - 4554

[문제 링크](https://www.acmicpc.net/problem/4554)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 12, 맞힌 사람: 12, 정답 비율: 32.432%

### 분류

미적분학, 많은 조건 분기, 구현, 수학, 파싱, 문자열

### 문제 설명

<p>As an unnamed space agency endured the ridicule following their now-infamous metric/English unit conversion, they made a vow to never let that error happen again. Unfortunately, they over-hired poor college students with excellent metric/English unit conversion skills but not calculus skills. In fact, nobody at this agency can now remember how to calculate the derivative of a polynomial, let alone evaluate the derivative of a polynomial for a given value of x.</p>

<p>As any good government agency would do in this case, they&#39;ve decided to outsource the task...to you. And not only do they want you to do the work, they want you to show how you did each step of your calculation so that they might re-learn the skill.</p>

### 입력

<p>Input to this problem will begin with a line containing a single integer n indicating the number of input polynomials. Each of the following n lines contain:</p>

<ol>
	<li>a value of x at which the first derivative of the polynomial is to be evaluated;</li>
	<li>and the polynomial.</li>
</ol>

<p>All polynomials are expressed in terms of x, with single-digit integer coefficients (positive or negative) and non-negative single-digit integer powers of x. Polynomials do not contain spaces. Coefficients and powers of 1 (and powers of 0) are omitted from the notation, as is any &quot;+&quot; sign that might apply to the leading term. The leading term has the highest order, and is followed by the one (if any) with the next-highest order and so on.</p>

### 출력

<p>For each polynomial in the input, output the following lines:</p>

<ol>
	<li>The string &quot;POLYNOMIAL N&quot; where N is 1 for the first polynomial, 2 for the second, etc.;</li>
	<li>The polynomial, exactly as in the input;</li>
	<li>The first derivative of the polynomial from line 2;</li>
	<li>The polynomial in line 3 with x replaced by its value in parenthesis (e.g., if x is 6, &quot;2x^3&quot; becomes &quot;2(6)^3&quot;);</li>
	<li>The polynomial in step 4 with each term fully evaluated;</li>
	<li>and the resulting integer, which is equivalent to f&#39;(x) evaluated at the given value of x.</li>
</ol>