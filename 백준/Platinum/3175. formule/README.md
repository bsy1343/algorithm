# [Platinum I] formule - 3175

[문제 링크](https://www.acmicpc.net/problem/3175)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 4, 맞힌 사람: 4, 정답 비율: 36.364%

### 분류

파싱, 문자열

### 문제 설명

<p>Consider mathematical formulas defined as follows:</p>

<ul>
	<li>a <strong>constant</strong> is a lowercase letter of the English alphabet (&#39;<code>a</code>&#39;-&#39;<code>z</code>&#39;)</li>
	<li>a <strong>variable</strong> is the digit &#39;<code>0</code>&#39; or &#39;<code>1</code>&#39;</li>
	<li>a <strong>function</strong> is an uppercase letter of the English alphabet (&#39;<code>A</code>&#39;-&#39;<code>Z</code>&#39;)</li>
	<li>a <strong>formula</strong> is a constant <strong>or</strong> a variable <strong>or</strong> a function(formula,formula)</li>
</ul>

<p>For example &#39;<code>a</code>&#39;, &#39;<code>0</code>&#39;, &#39;<code>F(a,F(a,a))</code>&#39; and &#39;<code>G(F(0,1),G(a,1))</code>&#39; are formulas, while &#39;<code>A</code>&#39;, &#39;<code>a(9)</code>&#39; and &#39;<code>F(G(),a)</code>&#39; are not.</p>

<p>Formulas that <strong>don&#39;t contain</strong> any variables are called <strong>basic formulas</strong>.</p>

<p>You are given two formulas. Write a program that will <strong>substitute</strong> every occurrence (in both formulas) of some variable with some <strong>basic formula</strong> so that, after substitution, the two formulas become <strong>identical</strong>.</p>

<p>If a variable appears more than once in one or both formulas then <strong>each occurrence</strong> has to be substituted with <strong>the same</strong> basic formula.&nbsp;</p>

### 입력

<p>Two lines of input contain two formulas. Each will contain at most 100 characters.</p>

### 출력

<p>The first line of output should contain the substitution for the variable &#39;<code>0</code>&#39;, and the second line should contain the substitution for the variable &#39;<code>1</code>&#39;.</p>

<p>In both lines the format should be &#39;<code>variable=basic formula</code>&#39;. Even if a variable doesn&#39;t appear in formulas at all, you should still output a substitution for it.</p>

<p>Note: the test data will be such that a solution, although not necessarily unique, always exists.&nbsp;</p>