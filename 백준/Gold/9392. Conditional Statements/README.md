# [Gold II] Conditional Statements - 9392

[문제 링크](https://www.acmicpc.net/problem/9392)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 3, 맞힌 사람: 3, 정답 비율: 42.857%

### 분류

구현

### 문제 설명

<p>Bonjol is given a new tassk in his company. He is given a piece of code written in Pascal programming language for controlling a set of lights, and his task is to refactor the code an minimize its size while keeping the program logic exactly the same as before. The code is made up of several conditional statements. Each conditional statement is a line of the form</p>

<pre>
if &lt;variable&gt; &lt;comparison-operator&gt; &lt;comparison-value&gt; then turnOn( &lt;light-number&gt; );</pre>

<p>where</p>

<ul>
	<li><code>&lt;variable&gt;</code> is a string of at most 255 lowercase English letters which is the name of a Pascal integer variable;</li>
	<li><code>&lt;comparison-operator&gt;</code> is either &quot;&lt;&quot;, &quot;&gt;&quot;, or &quot;=&quot;;</li>
	<li><code>&lt;comparison-value&gt;</code> is a 32-bit integer constant to which the <code>&lt;variable&gt;</code> is compared;</li>
	<li><code>&lt;light-number&gt;</code> is another 32-bit integer constant which shows the number of the light which should be turned on if the condition &quot;<code>&lt;variable&gt; &lt;comparison-operator&gt; &lt;comparison-value&gt;</code>&quot; holds. (Nothing happens if the light is already turned on.)</li>
</ul>

<p>Here is an example of such a code:</p>

<pre>
if a &lt; 3 then turnOn( 5 );
if bcq &gt; -43 then turnOn( -117 );
if cc = 0 then turnOn( 200 );</pre>

<p>The only code modification which Bonjol is allowed is to delete a complete line. He wants to delete as many lines as possible such that the modified program remains completely equivalent to its original version. You are to help him and calculate the maximum number of lines which could be deleted.</p>

### 입력

<p>The input contains several test cases. Each test case starts with a line containing an integer n (1 &le; n &le; 500) which is the number of lines in the code. Each of the next n lines has a conditional statement. In each conditional statement, there is a single space after &quot;<code>if</code>&quot;, the &nbsp;<code>&lt;variable&gt;</code>, the &nbsp;<code>&lt;comparison-operator&gt;</code>, the&nbsp;<code>&lt;comparison-value&gt;</code>, &quot;<code>then</code>&quot;, &quot;<code>turnOn(</code>&quot;, and the <code>&lt;light-number&gt;</code>. The input terminates with a line containing &quot;0&quot; which should not be processed as a test case.</p>

<p>&nbsp;</p>

### 출력

<p>Write the rest of the i-th case, on the i-th line of output. You should just write one integer indicating the maximum number of lines that Bonjol can delete.</p>