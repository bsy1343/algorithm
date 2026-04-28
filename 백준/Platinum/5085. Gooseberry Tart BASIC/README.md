# [Platinum II] Gooseberry Tart BASIC - 5085

[문제 링크](https://www.acmicpc.net/problem/5085)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 55, 정답: 9, 맞힌 사람: 2, 정답 비율: 6.452%

### 분류

파싱, 문자열

### 문제 설명

<p>Many fondly remember the Commodore 64 personal computer and its implementation of the BASIC programming language. Recently there has been a surge of nostalgic development effort &ndash; as teams of engineers and programmers compete to create modern versions of this iconic system. You have been asked to support team &lsquo;Gooseberry Tart&rsquo; by building them a BASIC interpreter (GTB1). Of course now that computers have more memory and are expected to process video streams in real time, it is vital that your system run fast. Your task is to build a super fast interpreter for a limited subset of the language as specified below.</p>

<p>The GTB1 Language</p>

<ul>
	<li>There is only one type of variable &ndash; the 32 bit signed integer. All &lt;expression&gt;s are integer valued. There is a comparison (Boolean) syntax in the IF statement.</li>
	<li>Variable names start with a letter (A .. Z, a..z) and may continue with letters or digits.</li>
	<li>Variable names can be of any length, but only the first two characters matter. Names are not case sensitive. For example the variables Fred, Fr, Freda and fRE are all the same.</li>
	<li>Reserved words are not case sensitive. No variable name may have the same first two characters as any reserved word. Only the first two characters of a reserved word are required. The reserved words are: LET, GOTO, IF, FOR, TO, NEXT, OUT and COMMENT</li>
	<li>Arithmetic expressions allow () brackets and binary operators + - * / and % (addition, subtraction, multiplication, integer division and modulo) with the usual precedence.</li>
	<li>Arithmetic expressions allow unary minus at the start of an expression or bracketed sub-expression. It has the same precedence as binary + and -.</li>
	<li>A programme consists of a series of instruction lines.</li>
	<li>Each instruction line begins with a number. Line numbers are always in ascending sequence in a programme. A line number must be in the range 1 to 10000 inclusive.</li>
	<li>Each instruction line can be: an Assignment statement; a GOTO statement; an IF statement; a FOR statement, a NEXT statement, an OUT statement or a comment</li>
</ul>

<p>The Assignment statement takes the form: LET &lt;variable&gt; = &lt;expression&gt;</p>

<p>The GOTO statement takes the form: GOTO &lt;line number&gt;</p>

<p>The IF statement takes the form: IF &lt;expression&gt; &lt;comparison&gt; &lt;expression&gt; GOTO &lt;line number&gt; where &lt;comparison&gt; can be =, &lt;, &gt;, &lt;=, &gt;= or &lt;&gt; (equal, less than, greater than, less than or equal to, greater than or equal to and not equal.</p>

<p>A looping construct requires matching (same &lt;variable&gt;) FOR and NEXT statements. It starts with the FOR statement, follows with some statements to form the body of the loop, and ends with the NEXT statement. It is possible to have nested FOR/NEXT structures. Such nesting must be proper in that the inner FOR NEXT structure must be between the FOR and NEXT instructions of the outer.</p>

<p>A FOR statement takes the form: FOR &lt;variable&gt; = &lt;start expression&gt; TO &lt;end expression&gt;</p>

<p>A NEXT statement takes the form: NEXT &lt;variable&gt;</p>

<p>Loop execution begins by assigning the &lt;start expression&gt; to the &lt;variable&gt;. The body of the loop executes at least once. The NEXT statement adds 1 to the value in the variable. If the value is less than or equal to the &lt;end expression&gt; the body of the loop executes again. Note that &lt;end expression&gt; is evaluated on every occurrence of the NEXT statement.</p>

<p>NOTE: It is permissible to GOTO into or out of a FOR/NEXT structure.</p>

<p>Statements are normally executed in numerical order (ie: the sequence in which they are written), starting with the first line of the programme. This order can be altered by GOTO or IF statements. A programme finishes when it runs off the end.</p>

<p>Variables need not be declared. They come into existence when first assigned or referenced. If a variable is referenced before it is assigned, it will have the value zero.</p>

<p>A COMMENT statement takes the form: COMMENT &lt;any text&gt;</p>

<p>An OUT statement takes the form: OUT &lt;expression&gt;</p>

<p>The OUT statement outputs one line of output, being the value of the expression</p>

### 입력

<p>Input takes the form of a sequence of programmes. Each programme starts with a number N, being the number of lines in the programme: 1 &le; N &le; 1000. This is followed by N lines of statements. No statement is longer than 80 characters. Tokens may be separated by more than one space. There may be spaces at the start or end of lines. There are no tabs. There need be no spaces around operators or parentheses in an expression. Each line has a line number and a statement. End of input is signalled by N being zero. You may assume that all programmes are syntactically correct and will terminate (in reasonable time if your interpreter runs fast)</p>

### 출력

<p>For each programme output &ldquo;Programme &lt;i&gt;&rdquo; (where i is 1, 2, 3, etc.), followed by any lines of output generated by the execution of the programme.</p>

<p>Note: Test data may require execution of up to 10<sup>9</sup> (10 to the power 9) instructions.</p>