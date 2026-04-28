# [Platinum V] Simplified λ-evaluations - 6720

[문제 링크](https://www.acmicpc.net/problem/6720)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

구현, 문자열, 파싱, 재귀

### 문제 설명

<p>Lambda calculus is the main theoretical core of functional languages. It is based on evaluating &lambda;-expressions.</p>

<p>A &lambda;-expression is a string of characters consisting either of 1) a single constant (for example <em>t</em>), or 2) a function definition written as <em>L</em>&lt;<em>var</em>&gt;.&lt;<em>body</em>&gt;, where <em>L</em> denotes &lambda;, &lt;<em>var</em>&gt; is always some variable (for example <em>x</em>) that can occur in the &lt;<em>body</em>&gt;, which is again some &lambda;-expression, or 3) an application of some &lt;<em>function</em>&gt; (for example <em>f</em>) to an &lt;<em>argument</em>&gt; (for example <em>x</em>), in our case written as (<em>f</em>)<em>x</em>, both &lt;<em>function</em>&gt; and &lt;<em>argument</em>&gt; are &lambda;-expressions.</p>

<p>The occurences of variable &lt;<em>var</em>1&gt; in an expression <em>E</em> are called bound, if they are inside of the &lt;<em>body</em>&gt; of some sub-expression <em>L</em>&lt;<em>var</em>1&gt;.&lt;<em>body</em>&gt; of <em>E</em>. Variable occurences that are not bound are called unbound.</p>

<p>Evaluation of &lambda;-expression results in another &lambda;-expression and is performed using the following rules:</p>

<ol>
	<li>Constant is evaluated to itself,</li>
	<li>Function definition evaluates to itself,</li>
	<li>Function application (&lt;<em>function</em>&gt;)&lt;<em>argument</em>&gt; is evaluated as follows: first, the &lt;<em>function</em>&gt; is evaluated to <em>L</em>&lt;<em>var</em>&gt;.&lt;<em>body</em>&gt; or something else. In the latter case, the &lt;<em>argument</em>&gt; is evaluated, and the whole function application evaluates to (&lt;<em>evaluated function</em>&gt;)&lt;<em>evaluated argument</em>&gt;. If the &lt;<em>function</em>&gt; evaluates to <em>L</em>&lt;<em>var</em>&gt;.&lt;<em>body</em>&gt;, the &lt;<em>argument</em>&gt; is not evaluated, but all unbound occurences of variable &lt;<em>var</em>&gt; inside of the expression &lt;<em>body</em>&gt; are directly replaced by (substituted with) the argument &lt;<em>argument</em>&gt;. The result of the whole evaluation of function application is then the evaluated &lt;<em>body</em>&gt;, after the substitution was performed.</li>
</ol>

<p>We limit the expressions to contain a single-character lowercase (<em>a</em> ... <em>z</em>) variables and constants only. Sometimes the evaluation never stops. Your program should perform at most 1000 function applications when evaluating any &lambda;-expression. During all evaluation steps, the evaluated &lambda;-expression will not exceed 10000 characters.</p>

<p>Here are some examples of evaluation of simple &lambda;-expressions (shown in several steps, the text behind ; is a comment):</p>

<pre>
<code>1.
  (Lx.x)y                        ; x &lt;- y
  y

2.
  ((Lx.Ly.(x)y)Lz.z)Lq.q         ; x &lt;- Lz.z
  (Ly.(Lz.z)y)Lq.q               ; y &lt;- Lq.q
  (Lz.z)Lq.q                     ; z &lt;- Lq.q
  Lq.q
</code></pre>

<p>Note that the scope of the variable next to &lambda; covers only the body of the lambda expression, and the same variable can occur at other places of the expression, for example:</p>

<pre>
<code>3.
  ((Lx.x)(Ly.y)Lx.x)x
  ((Ly.y)Lx.x)x
  (Lx.x)x
  x
</code></pre>

<p>The body of the &lambda;-expression can contain unbound variables - constants:</p>

<pre>
<code>4.
  (((Lx.Ly.q)Lz.t)r)u      ; x &lt;- Lz.t
  ((Ly.q)r)u               ; y &lt;- r
  (q)u
</code></pre>

<p>Finally note that our evaluation is simplified as compared to the real &lambda;-calculus: when the argument is substituted for all unbound occurences of some variable during function application, some of the variable occurences in the argument that were previously unbound can become bound... This is normally solved by renaming all the variables in the argument before the function application, and keeping track of correct substitutions. In this problem, you don&#39;t need to take care of this.</p>

<pre>
<code>5.
  ((Ly.Lx.y)x)w            ; y &lt;- x
  (Lx.x)w
  w
</code></pre>

<p>The Department of Programming Languages decided to implement a new functional language. However, they first need a core engine that will evaluate &lambda;-expressions. Write a program that will read a set of expressions from the input and output their evaluations.</p>

### 입력

<p>The input contains set of &lambda;-expressions, one per line. Only the last line contains the expression consisting of a single constant z. You can assume that the input is correct.</p>

### 출력

<p>The output should contain the result of evaluation of the expressions on the input in the same order as they appear in the input including the last line. If the expression leads to more than 1000 function applications, the line should contain single word &ldquo;unterminated&quot;.</p>