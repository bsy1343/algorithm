# [Platinum I] When - 4838

[문제 링크](https://www.acmicpc.net/problem/4838)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 6, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

파싱, 문자열

### 문제 설명

<p>&quot;When&quot; is an event driven language for machine control. It only has three statements: Set, Print, and the compound When clause. The (case insensitive) grammar is as follows&nbsp;</p>

<pre>
PROGRAM := WHEN | PROGRAM WHEN
WHEN := &#39;when &#39; EXPRESSION EOL STATEMENTS &#39;end when&#39; EOL
STATEMENTS := STATEMENT | STATEMENTS STATEMENT
STATEMENT := PRINT | SET
PRINT := &#39;print &#39; &nbsp;EXPRESSION_LIST EOL
SET := &#39;set &#39; ASSIGNMENT_LIST EOL
EXPRESSION_LIST := EXPRESSION | EXPRESSION_LIST &#39;,&#39; EXPRESSION
ASSIGNMENT_LIST := ASSIGNMENT | ASSIGNMENT_LIST &#39;,&#39; ASSIGNMENT
ASSIGNMENT := VARIABLE &#39;=&#39; EXPRESSION
EXPRESSION := &#39;(&#39; EXPRESSION OP EXPRESSION &#39;)&#39; | VARIABLE | NUMBER&nbsp;
OP := &nbsp;&#39;&lt;&#39; | &#39;+&#39; | &#39;-&#39; | &#39;and&#39; | &#39;or&#39; | &#39;xor&#39;
VARIABLE := &#39;$&#39; NOT_DOLLAR_STRING &#39;$&#39;
NUMBER := DIGIT | NUMBER DIGIT
DIGIT := &#39;0&#39; | .. | &#39;9&#39;
NOT_DOLLAR_STRING := any sequence of printing characters (including blanks)
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;that does not contain a $ symbol.</pre>

<p>In the above, any string enclosed in single quotes are to be treated literally. EOL is the end of line.</p>

<p>In words, a program consists of a list of when blocks, which themselves contain set and print statements. Case is ignored for key words and variable names. Spaces are allowed before or after any literal except inside a number. Spaces are allowed in variable names, and each non-empty sequence of spaces is treated as a single underscore, so the following refer to the same variable&nbsp;</p>

<pre>
$Remote Switch#1$
$Remote_Switch#1$
$Remote   switch#1$</pre>

<p>All variable and literal values are integers between -1000000000 and 1000000000, inclusively. All variables are global and initially zero. The when programs you will be tested on will never have an EXPRESSION that evaluates to a value outside of this range. The logical operators evaluate to 0 for false and 1 for true, and treat any nonzero value as true.</p>

<p>Running the When program amounts to executing all the active when clauses until none are active. More specifically, the active list of when clauses is initially empty, then the following steps are repeated:&nbsp;</p>

<ul>
	<li>In the order they appear in the program, the conditions of all when clauses that are not currently active are evaluated. If true, the clause is added to the end of the active list, with its first statement marked as &quot;ready&quot;. Each active when clause has one &quot;ready&quot; statement.</li>
	<li>If the active list is empty after this step, the program terminates.</li>
	<li>The &quot;ready&quot; statement from the &quot;current&quot; when clause (initially the first clause in the active list) is executed.</li>
	<li>The statement marked as &quot;ready&quot; is advanced, removing the when clause from the active list if this is the last statement in the &quot;current&quot; when clause.</li>
	<li>The when clause marked as &quot;current&quot; is advanced, cycling to the beginning of the active list if the end is reached.&nbsp;</li>
</ul>

<p>In other words, inactive when conditions are evaluated to determine if these clauses are added to the active list. Then one statement (set or print) is executed from the current active when clause. If this is the last statement in that clause, it is removed from the active list. One the next iteration, one statement is executed from the next active when clause, etc.</p>

<p>A set statement executes all the assignments concurrently, so that&nbsp;</p>

<pre>
set $x$=$y$,$y$=$x$</pre>

<p>swaps the values of $x$ and $y$. The same variable cannot appear twice on the left hand part of the same set statement (so set $x$=1,$x$=2 is illegal).</p>

<p>A print statement evaluates and prints the given expressions in the output, separated by commas and followed by a new line. So</p>

<pre>
print 1,(2+3)</pre>

<p>results in the line</p>

<pre>
1,5</pre>

<p>in the output.&nbsp;</p>

### 입력

<p>The input consists of a single syntactically correct program. You may assume that the program will not execute more than 100000 set statements and 100000 print statements.</p>

### 출력

<p>Print the output produced by executing the given program.</p>