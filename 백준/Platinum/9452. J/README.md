# [Platinum III] J - 9452

[문제 링크](https://www.acmicpc.net/problem/9452)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 74, 정답: 12, 맞힌 사람: 10, 정답 비율: 17.544%

### 분류

파싱, 문자열

### 문제 설명

<blockquote>
<p>The J programming language, developed in the early 1990s by Kenneth E. Iverson and Roger Hui, is a synthesis of APL (also by Iverson) and the FP and FL function-level languages created by John Backus.</p>

<hr />
<p style="text-align:right">Wikipedia. J (programming language)</p>
</blockquote>

<p>APL language family is famous for its support of advanced operations on vectors and arrays, and J is not an exception. For example, all unary and binary numeric operations in these languages by default are applicable to vectors and arrays of different dimensions. Plus operation (&lsquo;+&rsquo;) can add not only scalars, like in other languages, but also scalars and vectors (the scalar is added to each component of the vector), or vectors and vectors (the vectors are added component-wise).</p>

<p>The expressive power of J is amazing (as well as its cryptic syntax), but for this problem we need just a small subset of the language. We consider a single expression, where we may use one vector variable X, one scalar variable N &mdash; the length of the vector X, and the following operations:</p>

<ul>
	<li>We can add (&lsquo;+&rsquo;), subtract (&lsquo;-&rsquo;) or multiply (&lsquo;*&rsquo;) two vectors, vector and scalar, or two scalars.</li>
	<li>We can use unary minus (&lsquo;-&rsquo;) and unary squaring operations (&lsquo;*:&rsquo;) for scalars and vectors (component-wise).</li>
	<li>We can fold a vector with plus operation (&lsquo;+/&rsquo;) &mdash; that is, compute the sum of a vector (unary operation).</li>
</ul>

<p>Operations are evaluated right-to-left, natural precedence of operations is ignored in J. The order of evaluation can be altered by parentheses. More precisely the syntax is specified in the following BNF.</p>

<pre>
&lang;expression&rang; ::= &lang;term&rang; | &lang;term&rang; (&lsquo;+&rsquo; | &lsquo;-&rsquo; | &lsquo;*&rsquo;) &lang;expression&rang; | (&lsquo;-&rsquo; | &lsquo;*:&rsquo; | &lsquo;+/&rsquo;) &lang;expression&rang;
      &lang;term&rang; ::= &lsquo;(&rsquo;&lang;expression&rang;&lsquo;)&rsquo; | &lsquo;X&rsquo; | &lsquo;N&rsquo; | &lang;number&rang;
    &lang;number&rang; ::= (&lsquo;0&rsquo; | &lsquo;1&rsquo; | . . . | &lsquo;9&rsquo;)<sup>+</sup></pre>

<p>To correctly impose one more limitation on expression syntax, let us define complexity of an expression:</p>

<ul>
	<li>complexity of scalars (numbers, &lsquo;N&rsquo;, and result of fold) is zero;</li>
	<li>complexity of &lsquo;X&rsquo; is one;</li>
	<li>complexity of addition and subtraction is the maximum of their operands&rsquo; complexities;</li>
	<li>complexity of multiplication is the sum of its operands&rsquo; complexities;</li>
	<li>complexity of unary squaring is twice the complexity of its operand.</li>
</ul>

<p>For example, the complexity of expression &ldquo;(3-+/*:*:X)-X**:X&rdquo; is 3, while the complexity of its subexpression &ldquo;*:*:X&rdquo; is 4.</p>

<p>Your program is given a scalar-valued expression and a value of the vector X, and it should compute the expression result modulo 10<sup>9</sup>. The complexity of each subexpression in the given expression does not exceed 10.</p>

### 입력

<p>The first line contains one integer number N (1 &le; N &le; 10<sup>5</sup>) &mdash; the length of the vector X.</p>

<p>The second line contains N integers &mdash; components of the vector X (0 &le; X<sub>i</sub> &lt; 10<sup>9</sup>).</p>

<p>The third line contains the expression to be computed, a non-empty string of not more than 105 symbols. Each number in the expression is less than 10<sup>9</sup>. The fold is never applied to a scalar.</p>

### 출력

<p>Output a single integer number &mdash; the expression result modulo 10<sup>9</sup>.</p>

### 힌트

<p>The first expression computes squared length of the vector X in Euclidean metrics.</p>

<p>The second expression result does not depend on X and always equals to zero.</p>

<p>The actual result of the third expression is &minus;35397485.</p>