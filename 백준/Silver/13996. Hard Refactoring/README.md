# [Silver II] Hard Refactoring - 13996

[문제 링크](https://www.acmicpc.net/problem/13996)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 163, 정답: 65, 맞힌 사람: 56, 정답 비율: 38.356%

### 분류

구현, 문자열, 브루트포스 알고리즘, 파싱

### 문제 설명

<p>Helen had come upon a piece of code that uses a lot of &ldquo;magical constants&rdquo;. She found a logical expression that checks if an integer x belongs to a certain set of ranges, like the one shown below:</p>

<pre>
<code>x &gt;= 5 &amp;&amp; x &lt;= 10 || 
x &gt;= 7 &amp;&amp; x &lt;= 20 || 
x &lt;= 2 || 
x &gt;= 21 &amp;&amp; x &lt;= 25 || 
x &gt;= 8 &amp;&amp; x &lt;= 10 || 
x &gt;= 100 </code></pre>

<p>Helen does not like &ldquo;magical constants&rdquo;, so she decided to refactor this expression and all similar ones in such a way, that the refactored expression still has the same Boolean result for all integers x, but it uses as few integer constants in its text as possible.</p>

<p>Integers in this problem, including integer x, come from the range of all signed 16 bit integers starting from &minus;2<sup>15</sup> (&minus;32 768) to 2<sup>15</sup> &minus; 1 (32 767) inclusive.</p>

### 입력

<p>The input file contains at most 1000 lines. Each line consists of either one comparison or two comparisons separated by logical and operator &ldquo;&amp;&amp;&rdquo;. Each comparison starts with &ldquo;x&rdquo;, followed by greater-or-equals operator &ldquo;&gt;=&rdquo; or less-or-equals operator &ldquo;&lt;=&rdquo;, followed by an integer constant. When two comparisons are in the same line, the first one is always greater-or-equals, followed by less-or-equals.</p>

<p>All lines, but the last one, are terminated by logical or operator &ldquo;||&rdquo;. All tokens in a line are separated by a single space and there are no trailing or leading spaces.</p>

### 출력

<p>Write the refactored expression to the output file in the same format as in the input. You can arrange lines in any order, as long as the resulting expression has the right format, produces the same Boolean result on all integers x, and contains the minimal possible number of integer constants in its text. Numbers must be formatted without leading zeros and there must be precisely one space between tokens on a line.</p>

<p>Write a single line with the word &ldquo;true&rdquo; if the expression is true on all integers. Write a single line with the word &ldquo;false&rdquo; if the expression is false on all integers.</p>