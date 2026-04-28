# [Platinum I] Bit Operations - 19373

[문제 링크](https://www.acmicpc.net/problem/19373)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 8, 맞힌 사람: 8, 정답 비율: 20.000%

### 분류

애드 혹, 해 구성하기, 비트마스킹

### 문제 설명

<p>You are given $N$ pairs of integers $(x_i, y_i)$. Construct a function $f$ that satisfies $y_i = f(x_i)$ for each $i$. It must be possible to write the function $f$ in the C programming language in the following form:</p>

<pre>
uint32_t f(uint32_t x) {
  return Expression;
}</pre>

<p>Here, <code>uint32_t</code> is an unsigned 32-bit integer. The Expression must satisfy the following BNF:</p>

<pre>
&lt;expr&gt; ::= &quot;x&quot;
         | &lt;num&gt;
         | &quot;(~&quot; &lt;expr&gt; &quot;)&quot;
         | &quot;(&quot; &lt;expr&gt; &lt;op2&gt; &lt;expr&gt; &quot;)&quot;
&lt;op2&gt; ::= &quot;&amp;&quot; | &quot;|&quot; | &quot;^&quot; | &quot;+&quot; | &quot;-&quot; | &quot;*&quot;
</pre>

<p>Here, <code>&lt;num&gt;</code>&nbsp;is an unsigned 32-bit integer represented as a decimal number. It must not contain leading zeroes, except if it is zero itself which must be represented as $0$.</p>

### 입력

<p>The first line contains an integer $N$ ($1 \le N \le 8$).</p>

<p>The $i$-th of the next $N$ lines contains two integers $x_i$ and $y_i$ ($0 \le x_i, y_i &lt; 256$).</p>

### 출력

<p>Print an expression that satisfies the conditions.</p>

<p>The output must strictly follow the BNF format in the statement. Extra whitespaces, newlines, parentheses, etc.~are not allowed. The output must contain at most $10^5$ characters. It is guaranteed that the answer exists for the given input.</p>