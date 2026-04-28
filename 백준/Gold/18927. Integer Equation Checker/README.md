# [Gold I] Integer Equation Checker - 18927

[문제 링크](https://www.acmicpc.net/problem/18927)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 63, 정답: 25, 맞힌 사람: 22, 정답 비율: 51.163%

### 분류

구현, 문자열, 브루트포스 알고리즘, 많은 조건 분기, 파싱

### 문제 설명

<p>In this task you need to create a checker for integer equations with error correction.</p>

<p>The integer equation is given in the form:</p>

<pre>
&lt;number1&gt;&lt;operation&gt;&lt;number2&gt;=&lt;number3&gt;</pre>

<p>wherein &quot;<code>&lt;numberI&gt;</code>&quot;&nbsp;denotes any positive integer less than or equal to $10^9$ without leading zeros, and&nbsp; &quot;<code>&lt;operation&gt;</code>&quot; is one of the signs &#39;<code>+</code>&#39;, &#39;<code>-</code>&#39;, &#39;<code>*</code>&#39; or &#39;<code>/</code>&#39; that represents&nbsp; one of the four basic math operations (note that unary plus and unary minus are <strong>not allowed</strong>). An expression that satisfies these properties is called <em>well-formatted</em>.&nbsp;</p>

<p>The checker shall read the equations and give the outcome in the next way:</p>

<ul>
	<li><code>Correct</code>&nbsp;--- a well-formatted mathematically correct equation is given.</li>
	<li><code>Format Error</code>&nbsp;--- the given equation does not match the default format.</li>
	<li><code>Typo: &lt;equation1&gt; instead of &lt;equation2&gt;</code>&nbsp;--- the given equation (<code>&lt;equation1&gt;</code>) is well-formatted but not mathematically correct and is is enough to replace up to two characters in it to obtain a mathematically correct and well-formatted equation (<code>&lt;equation2&gt;</code>).</li>
	<li><code>Math Error</code>&nbsp;--- the given equation is well-formatted, mathematically incorrect, and it is impossible to correct two or less characters and obtain a well-formatted and mathematically correct equation.</li>
</ul>

<p>Note that characters can be only replaced, they cannot be inserted or deleted.</p>

### 입력

<p>The first line of the input contains a non-empty string of up to 30 characters that represents the equation to be checked. This word consists only of decimal digits (&#39;<code>0</code>&#39; - &#39;<code>9</code>&#39;), arithmetic&nbsp; operators (&#39;<code>+</code>&#39;, &#39;<code>-</code>&#39;, &#39;<code>*</code>&#39;, and &#39;<code>/</code>&#39;) and equality signs (&#39;<code>=</code>&#39;).</p>

### 출력

<p>Print the result of evaluation. Refer to the samples for clarity.</p>