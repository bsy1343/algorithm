# [Platinum I] Peter's Calculator - 6446

[문제 링크](https://www.acmicpc.net/problem/6446)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 100, 정답: 11, 맞힌 사람: 7, 정답 비율: 9.091%

### 분류

(분류 없음)

### 문제 설명

<p>Unfortunately, Peter&#39;s Calculator broke down last week. Now Peter is left with his computer, which has no calculator application, and paper and pencil, which is too tiresome for an engineer. As one of Peter&#39;s friends, you are asked to write him a calculator application. After talking to him, you figure out the following:</p>

<ul>
	<li>Peter does only integer arithmetic. The operations he needs are addition, subtraction and multiplication.</li>
	<li>He would like to use an arbitrary number of variables whose names are not longer than 50 characters.</li>
	<li>His main way of doing calculations are to type in a few formulas and to assign them to variables. Some formulas are complicated expressions, which can refer to yet undefined variables, while other formulas consist of a single number. Then Peter asks for the value of some variables, i.e. he evaluates the formulas.</li>
	<li>Peters wants to redefine some variables and then to reevaluate formulas that depend on these variables.</li>
</ul>

<p>The input strictly adheres to the following syntax (given in EBNF):</p>

<pre>
file = line { line } .
line = [ assignment | print | reset ] .
assignment = var &quot;:=&quot; expression.
print = &quot;PRINT&quot; var.
reset = &quot;RESET&quot;.
expression = term { addop term }.
term = factor { mulop factor }.
factor = &quot;(&quot; expression &quot;)&quot; | var | number.
addop = &quot;+&quot; | &quot;-&quot;.
mulop = &quot;*&quot;. 
</pre>

<p>In the Extended Backus-Naur Formalism (EBNF), <code>A = B C</code> declares that the grammatical construct <code>A</code> consists of a <code>B</code> followed by a <code>C</code>. <code>A = B | C</code> means that <code>A</code> consists of a <code>B</code> or, alternatively, of a <code>C</code>. <code>A = [ B ]</code> defines construct <code>A</code> to be either a <code>B</code> or nothing and <code>A = { B }</code> tells you that <code>A</code> consists of the concatenation of any number of <code>B</code>s (including none).</p>

<p>The production <code>var</code> stands for the name of a variable, which starts with a letter followed by up to 49 letters or digits. Letters may be uppercase or lowercase. The production number stands for a integer number. The precise syntax for these productions are given below. The case of letters is important for both variables and statements.</p>

<pre>
var = letter { letter | digit }.
number = [ &quot;-&quot; ] digit { digit }.
letter = &quot;A&quot; | &quot;B&quot; | ... | &quot;Z&quot; | &quot;a&quot; | &quot;b&quot; | ... | &quot;z&quot;.
digit = &quot;0&quot; | &quot;1&quot; | ... | &quot;8&quot; | &quot;9&quot;.
</pre>

<p>Between the parts of a grammatical construct but not within the names of variables or integer numbers, any number of spaces may appear. &lt;EOF&gt; stands for the end of the input file and &lt;CR&gt; stands for the new-line character. All lines in the input file are shorter than 200 characters.</p>

<p>The value of a variable is said to be undefined:</p>

<ul>
	<li>if it has not yet been defined or it refers to a variable, which has not yet been defined;</li>
	<li>if the definition of the variable contains a cycle.</li>
</ul>

<p>Your are to write a program that implements Peter&#39;s calculator. It should store all variable definitions and for each &quot;PRINT&quot; statement evaluate the specified variable based on the latest variable definitions. If your program encounters a &quot;RESET&quot; statement, it should delete all stored variables so that all variables become undefined.</p>

### 입력

<p>The input file contains calculations adhering to the syntax given above. Each line contains either an assignment to a variable, a &quot;PRINT&quot; statement, a &quot;RESET&quot; statement or nothing.</p>

### 출력

<p>For each &quot;PRINT&quot; statement found in the input file, your program should output a line containing the numerical value of the specified variable or the word &quot;UNDEF&quot; if the variable is undefined.</p>