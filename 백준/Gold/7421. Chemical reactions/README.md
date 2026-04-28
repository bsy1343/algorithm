# [Gold V] Chemical reactions - 7421

[문제 링크](https://www.acmicpc.net/problem/7421)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 9, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

파싱, 문자열

### 문제 설명

<p>Bill teaches chemistry in the school and has prepared a number of tests for his students. Each test has a chemical formula and a number of possible reaction outcomes that his students are to choose one correct from. However, Bill wants to make sure that he has not made any typos while entering his tests into a computer and that his students won&#39;t easily throw away wrong answers simply by counting a number of chemical elements on the left and on the right side of the equation, which should be always equal in a valid reaction.</p>

<p>You are to write a program that will help Bill. The program shall read the description of the test for the students that consists of the given left side of the equation and a number of possible right sides, and determines if the number of chemical elements on each right side of the equation is equal to the number of chemical elements on the given left side of the equation.</p>

<p>To help you, poor computer folks, that are unaware of the complex world of chemistry, Bill has formalized your task. Each side of the equation is represented by a string of characters without spaces, and consists of one or more chemical sequences separated by a &#39;+&#39; (plus) characters. Each sequence has an optional preceding integer multiplier that applies to the whole sequence and a number of elements. Each element is optionally followed by an integer multiplier that applies to it. An element in this equation can be either distinct chemical element or a whole sequence that is placed in round parenthesis. Every distinct chemical element is represented by either one capital letter or a capital letter that is followed by a small letter.</p>

<p>Even more formally, using notation that is similar to BNF, we can write:</p>

<ul>
	<li>&lt;formula&gt; ::= [&lt;number&gt;] &lt;sequence&gt; { &#39;+&#39; [&lt;number&gt;] &lt;sequence&gt; }</li>
	<li>&lt;sequence&gt; ::= &lt;element&gt; [&lt;number&gt;] { &lt;element&gt; [&lt;number&gt;] }</li>
	<li>&lt;element&gt; ::= &lt;chem&gt; | &#39;(&#39; &lt;sequence&gt; &#39;)&#39;</li>
	<li>&lt;chem&gt; ::= &lt;uppercase_letter&gt; [ &lt;lowercase_letter&gt; ]</li>
	<li>&lt;uppercase_letter&gt; ::= &#39;A&#39;..&#39;Z&#39;</li>
	<li>&lt;lowercase_letter&gt; ::= &#39;a&#39;..&#39;z&#39;</li>
	<li>&lt;number&gt; ::= &#39;1&#39;..&#39;9&#39; { &#39;0&#39;..&#39;9&#39; }</li>
</ul>

<p>Every distinct chemical element is said to occur in the given formula for some total number X, if X is the sum of all separate occurrences of this chemical element multiplied to all numbers that apply to it. For example, in the following chemical formula:</p>

<p>C2H5OH+3O2+3(SiO2)</p>

<ul>
	<li>C occurs for a total of 2 times.</li>
	<li>H occurs for a total of 6 times (5 + 1).</li>
	<li>O occurs for a total of 13 times (1 + 3*2 + 3*2).</li>
	<li>Si occurs for a total of 3 times.</li>
</ul>

<p>All multipliers in the formula are integer numbers that are at least 2 if explicitly specified and are 1 by default. Each chemical formula is at most 100 characters long, and every distinct chemical element is guaranteed to occur for a total of no more than 10000 times in each formula.</p>

### 입력

<p>The first line of the input file represents a chemical formula that is to be tested as the left side of the equation. The second line of the input file contains a single integer number N (1 &le; N &le; 10), which is the number of right sides of the equation that are to be tested. Each one of the following N lines represents one such formula.</p>

### 출력

<p>You are to write to the output file N lines - one line per each possible answer of the chemical test for Bill&#39;s students that is given in the input file. For each right-hand side formula that is encountered in the input file, write to the output file:</p>

<pre>
&lt;left_formula&gt;==&lt;right_formula&gt;</pre>

<p>if the total number of occurrences of each distinct chemical element on the left-hand side equals to the total number of occurrences of this chemical element on the right-hand side. Otherwise write:</p>

<pre>
&lt;left_formula&gt;!=&lt;right_formula&gt;</pre>

<p>Here &lt;left_formula&gt; must be replaced exactly (character by character) with the original left-hand side formula as it is given in the first line of the input file, and &lt;right_formula&gt; must be replaced exactly with each right-hand side formula as they are given in the input file. Do not place any spaces in the lines you write to the output file.</p>

### 힌트

<p>The sample input and output do not contain digit &#39;0&#39; because it looks the same as the symbol for the chemical element oxygen. The actual tests may contain any allowed characters.</p>