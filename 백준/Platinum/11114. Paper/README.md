# [Platinum III] Paper - 11114

[문제 링크](https://www.acmicpc.net/problem/11114)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 29, 정답: 8, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

파싱, 문자열

### 문제 설명

<p>Nils is preparing his Master&rsquo;s thesis, and wants to include the source code for his new logarithmic-time halting problem solver. To minimize the environmental impact of the inevitable millions of printouts of his revolutionary paper around the world, he wants to make his program as short as possible.</p>

<p>You will help by designing an expression optimizer for boolean expressions. The input will be a fully parenthesized expression, using the standard one-character boolean operators (&amp;, | and !).</p>

<p>For each expression, print the length of the shortest equivalent expression (not including spaces).</p>

<pre>
expression ::= variable
             | &rsquo;(&rsquo; expression &rsquo; &rsquo; operator &rsquo; &rsquo; expression &rsquo;)&rsquo;
             | &rsquo;!&rsquo; expression
operator ::= &rsquo;&amp;&rsquo; | &rsquo;|&rsquo;
variable ::= &rsquo;x&rsquo; | &rsquo;y&rsquo; | &rsquo;z&rsquo;</pre>

<p>Note in particular that parentheses are required for all operators. This means that each operator will contribute three characters to the length, whereas NOTs and variable references contribute one character each.</p>

### 입력

<p>The input has 1 &le; n &le; 50 cases, where n is given by the first line of input. Each test case is given by a line with an expression as decribed earlier. Each expression will be no more than 500 characters long (including spaces).</p>

### 출력

<p>For each test case output the length of the shortest equivalent expression.</p>

### 힌트

<p>In the example, the first expression is never true. It can be written as (x &amp; !x), which has a length of 6. The third example can be simplified by applying De Morgan&rsquo;s law twice (after which it becomes equivalent to the second example).</p>