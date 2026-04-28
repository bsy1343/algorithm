# [Platinum II] Square Math (Small) - 12647

[문제 링크](https://www.acmicpc.net/problem/12647)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 9, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

(분류 없음)

### 문제 설명

<p>Say we have a square that has&nbsp;<strong>W</strong>&nbsp;cells on each side and, therefore,&nbsp;<strong>W</strong><sup>2</sup>&nbsp;cells total. Let&#39;s go further and fill each cell with one of the following:</p>

<ul>
	<li>A digit from 0 to 9;</li>
	<li>The addition sign (+);</li>
	<li>The subtraction sign (-).</li>
</ul>

<p>If, finally, we add a constraint that no 2 digits are horizontally or vertically adjacent and no 2 operators (+ or -) are horizontally or vertically adjacent, then our square can be called an &quot;arithmetic square&quot;.</p>

<p>Square Math is the name of a puzzle where, given an arithmetic square, we start from any numeric cell and move either horizontally or vertically a cell at a time, finally ending in a numerical cell. The mathematical expression we get from the traversal is evaluated to get a single value. For example:</p>

<pre>
2+3
+4-
1+0
</pre>

<p>The above is a valid arithmetic square of size&nbsp;<strong>W</strong>&nbsp;= 3. If we start from &quot;2&quot;, move horizontally right, then vertically down, we&#39;ll get &quot;2+4&quot;, which gives a value of &quot;6&quot;. If we further move horizontally right, then vertically up, we&#39;ll get &quot;2+4-3&quot;, which is equal to &quot;3&quot;.</p>

<p>In Square Math, there is no limit to how many times you can use a particular cell. It is perfectly legal to move from a cell to its neighbor, then back to the original cell. Given an arithmetic square and a list of queries, your task is to find a Square Math expression which evaluates to each query.</p>

### 입력

<p>The first line of input contains a single integer,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. The first line of each test case contains 2 integers,&nbsp;<strong>W</strong>&nbsp;and&nbsp;<strong>Q</strong>.&nbsp;<strong>W</strong>&nbsp;lines follow, each containing&nbsp;<strong>W</strong>&nbsp;characters, representing the arithmetic square. Don&#39;t worry, all arithmetic squares in the input are well-formed. The following line contains a space separated list of&nbsp;<strong>Q</strong>&nbsp;integers, representing the values which need to be computed by using Square Math (the queries). You can assume that all given values will have at least one possible Square Math solution.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 60</li>
	<li>2 &le;&nbsp;<strong>W</strong>&nbsp;&le; 10</li>
	<li>1 &le;&nbsp;<strong>Q</strong>&nbsp;&le; 20</li>
	<li>1 &le; each query &le; 50</li>
</ul>

### 출력

<p>For each test case, begin output with &quot;Case #<strong>X</strong>:&quot; on a line by itself, where&nbsp;<strong>X</strong>&nbsp;is the test case number, starting from 1. Then, for each query within the test case, print the Square Math expression which evaluates to the query on a line by itself.</p>

<p>In the case where there are multiple possible Square Math expressions, print the one that is shortest. If there is still a tie, print the lexicographically smallest expression. Remember that &#39;+&#39; is lexicographically smaller than &#39;-&#39;.</p>