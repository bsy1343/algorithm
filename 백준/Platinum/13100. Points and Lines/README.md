# [Platinum V] Points and Lines - 13100

[문제 링크](https://www.acmicpc.net/problem/13100)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 22, 맞힌 사람: 20, 정답 비율: 64.516%

### 분류

구현, 자료 구조, 문자열, 기하학, 파싱, 스택

### 문제 설명

<p>One day, you found an old scroll with strange texts on it.</p>

<p>You revealed that the text was actually an expression denoting the position of treasure. The expression consists of following three operations:</p>

<ul>
	<li>From two points, yield a line on which the points lie.</li>
	<li>From a point and a line, yield a point that is symmetric to the given point with respect to the line.</li>
	<li>From two lines, yield a point that is the intersection of the lines.</li>
</ul>

<p>The syntax of the expression is denoted by following BNF:</p>

<pre>
<code>&lt;expression&gt;      ::= &lt;point&gt;
&lt;point&gt;           ::= &lt;point-factor&gt; | &lt;line&gt; &quot;@&quot; &lt;line-factor&gt; | &lt;line&gt; &quot;@&quot; &lt;point-factor&gt; | &lt;point&gt; &quot;@&quot; &lt;line-factor&gt;
&lt;point-factor&gt;    ::= &quot;(&quot; &lt;number&gt; &quot;,&quot; &lt;number&gt; &quot;)&quot; | &quot;(&quot; &lt;point&gt; &quot;)&quot;
&lt;line&gt;            ::= &lt;line-factor&gt; | &lt;point&gt; &quot;@&quot; &lt;point-factor&gt;
&lt;line-factor&gt;     ::= &quot;(&quot; &lt;line&gt; &quot;)&quot;
&lt;number&gt;          ::= &lt;zero-digit&gt; | &lt;positive-number&gt; | &lt;negative-number&gt;
&lt;positive-number&gt; ::= &lt;nonzero-digit&gt; | &lt;positive-number&gt; &lt;digit&gt;
&lt;negative-number&gt; ::= &quot;-&quot; &lt;positive-number&gt;
&lt;digit&gt;           ::= &lt;zero-digit&gt; | &lt;nonzero-digit&gt;
&lt;zero-digit&gt;      ::= &quot;0&quot;
&lt;nonzero-digit&gt;   ::= &quot;1&quot; | &quot;2&quot; | &quot;3&quot; | &quot;4&quot; | &quot;5&quot; | &quot;6&quot; | &quot;7&quot; | &quot;8&quot; | &quot;9&quot;</code></pre>

<p>Each &lt;point&gt; or &lt;point-factor&gt; denotes a point, whereas each &lt;line&gt; or &lt;line-factor&gt; denotes a line. The former notion of &lt;point-factor&gt; (X,Y) represents a point which has X for x-coordinate and Y for y-coordinate on the 2-dimensional plane. &quot;@&quot; indicates the operations on two operands. Since each operation is distinguishable from others by its operands&#39; types (i.e. a point or a line), all of these operations are denoted by the same character &quot;@&quot;. Note that &quot;@&quot; is left-associative, as can be seen from the BNF.</p>

<p>Your task is to determine where the treasure is placed.</p>

### 입력

<p>The input consists of multiple datasets. Each dataset is a single line which contains an expression denoting the position of treasure.</p>

<p>It is guaranteed that each dataset satisfies the following conditions:</p>

<ul>
	<li>The length of the string never exceeds 10<sup>2</sup>.</li>
	<li>If both operands of &quot;@&quot; are points, their distance is greater than 1.</li>
	<li>If both operands of &quot;@&quot; are lines, they are never parallel.</li>
	<li>The absolute values of points&#39; coordinates never exceed 10<sup>2</sup> at any point of evaluation.</li>
</ul>

<p>You can also assume that there are at most 100 datasets.</p>

<p>The input ends with a line that contains only a single &quot;#&quot;.</p>

### 출력

<p>For each dataset, print the X and Y coordinates of the point, denoted by the expression, in this order.</p>

<p>The output will be considered correct if its absolute or relative error is at most 10<sup>&minus;2</sup>.</p>