# [Silver I] Code Formatting - 7399

[문제 링크](https://www.acmicpc.net/problem/7399)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 43, 정답: 20, 맞힌 사람: 18, 정답 비율: 50.000%

### 분류

구현, 문자열, 파싱

### 문제 설명

<p>Programmers are known to wage religious wars when issues of proper code formatting are discussed. When new team of programmers starts working on a project, it often brings slightly different code formatting style and wants to reformat old source code according to their own style. Moreover, inexperienced programmers often neglect the importance of good and consistent code style, thus complicating the work of their teammates and themselves. This situation creates thriving market for code formatting tools.&nbsp;</p>

<p>You are taking part in a proof-of-concept project for a new code formatting tool code named Salvation. This is only a pilot project aimed not for a practical usefulness, but to demonstrate your ability to parse and format code of a high-level language. Your task is to write code formatter for a language called TRIVIAL (The Rival Implementation-Agnostic Language). This language has trivial lexical and grammatical structures. It does not have any keywords and control structures, because all constructs of the language are represented as function calls and closures.</p>

<p>The lexical structure consists of identifiers, opening and closing parenthesis and curly braces, commas, and semi-colons. Identifiers consist only of digits &#39;0&#39;--&#39;9&#39; and Latin letters &#39;a&#39;--&#39;z&#39;, &#39;A&#39;--&#39;Z&#39;. Lexical terms may be separated by whitespaces, leading and trailing whitespaces in the file are also allowed. Whitespace may consist of spaces, tab characters (ASCII code 9), and line separators (a pair of ASCII 13, 10).&nbsp;</p>

<p>The structure of the valid trivial program is derived from the following productions:</p>

<ul>
	<li>Program ::= Block</li>
	<li>Block ::= &#39;{&#39; Statements &#39;}&#39;</li>
	<li>Statements ::= Statement $|$ Statement Statements</li>
	<li>Statement ::= Expression &#39;;&#39;</li>
	<li>Expression ::= <em>identifier</em> [&#39;(&#39; Arguments &#39;)&#39;] [Block]</li>
	<li>Arguments ::= Expression $|$ Expression &#39;,&#39; Arguments</li>
</ul>

<p>Properly formatted trivial program additionally conforms to the following rules:</p>

<ul>
	<li>There are no empty lines.</li>
	<li>Tab characters are not used.</li>
	<li>The first character of the file is opening curly brace &#39;{&#39; (no preceding whitespaces),&nbsp;and the last character of the file is closing curly brace &#39;}&#39; (no trailing whitespaces).</li>
	<li>Each line is preceded by $4N$ space characters, where $N$ is called <em>indentation level</em>.</li>
	<li>The first and the last lines of the program have zero indentation level.</li>
	<li>Lines that constitute block body and are enclosed in curly braces &#39;{&#39;...&#39;}&#39; have one more indentation level.</li>
	<li>No whitespace is allowed inside the line with the exception of the following&nbsp;two cases where a single space character is mandatory: before opening curly brace character &#39;{&#39; and after comma &#39;,&#39;.</li>
	<li>Lines (with the only exception of the last line) end with semicolon &#39;;&#39; or opening curly brace &#39;{&#39; characters. These characters cannot appear in the middle or at the beginning of any line&nbsp;(including the last one).</li>
	<li>Closing curly brace &#39;}&#39; characters appear only at the beginning of lines after indentation spaces.</li>
</ul>

<p>See sample output section for an example of properly formatted trivial program.</p>

### 입력

<p>The input file contains valid trivial program. Size of the input file does not exceed 2000 bytes.</p>

### 출력

<p>Write to the output file properly formatted trivial code for the program given in the input file.</p>