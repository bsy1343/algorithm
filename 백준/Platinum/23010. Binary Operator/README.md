# [Platinum II] Binary Operator - 23010

[문제 링크](https://www.acmicpc.net/problem/23010)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 11, 정답: 7, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

파싱, 무작위화, 문자열

### 문제 설명

<p>You are given a list of valid arithmetic expressions using non-negative integers, parentheses&nbsp;<code>()</code>, plus&nbsp;<code>+</code>, multiply&nbsp;<code>*</code>, and an extra operator&nbsp;<code>#</code>. The expressions are fully parenthesized and in&nbsp;<a href="https://en.wikipedia.org/wiki/Infix_notation" target="_blank">infix</a>&nbsp;notation.</p>

<p>A fully parenthesized expression is an expression where every operator and its operands are wrapped in a single parenthesis. For example, the expression $x+y$&nbsp;becomes&nbsp;$(x+y)$&nbsp;when fully parenthesized, and&nbsp;$x+y+z$&nbsp;becomes&nbsp;$((x+y)+z)$. However,&nbsp;$0$&nbsp;is still&nbsp;$0$&nbsp;when fully parenthesized, because it consists of a single number and no operators.&nbsp;$((x+y))$&nbsp;is not considered fully parenthesized because it has redundant parentheses.</p>

<p>The operators&nbsp;<code>+</code>&nbsp;and&nbsp;<code>*</code>&nbsp;denote addition and multiplication, and&nbsp;<code>#</code>&nbsp;can be any&nbsp;<a href="https://mathworld.wolfram.com/TotalFunction.html" target="_blank">total function</a>.</p>

<p>You want to group the expressions into&nbsp;<a href="https://en.wikipedia.org/wiki/Equivalence_class" target="_blank">equivalence classes</a>, where expressions are in the same equivalence class if and only if they are guaranteed to result in the same numeric value, regardless of which function&nbsp;<code>#</code>&nbsp;represents.</p>

<p>You can assume that&nbsp;<code>#</code>&nbsp;represents the same function across all expressions in a given test case. That might mean that&nbsp;<code>#</code>&nbsp;represents some known function like addition&nbsp;<em>or</em>&nbsp;subtraction, but not both in different parts of the same test case.</p>

<p>For example, consider the following expressions:</p>

<ul>
	<li><code>F<sub>1</sub>=((1#(1+1))+((2#3)*2))</code></li>
	<li><code>F<sub>2</sub>=(((2#3)+(1#2))+(2#3))</code></li>
	<li><code>F<sub>3</sub>=((2*(2#3))+(1#2))</code>.</li>
</ul>

<p>Let&nbsp;<code>A = 1#2</code>, and let&nbsp;<code>B = 2#3</code>. Then we can say&nbsp;<code>F<sub>1</sub>=F<sub>2</sub>=F<sub>3</sub></code>, regardless of the function&nbsp;<code>#</code>&nbsp;represents because the expressions can be rewritten as:</p>

<ul>
	<li><code>F1=((1#2)+((2#3)*2))=(A+(B*2))=(A+2B)</code></li>
	<li><code>F2=(((2#3)+(2#3))+(1#2))=((B+B)+A)=(A+2B)</code></li>
	<li><code>F<sub>3</sub>=((2*(2#3))+(1#2))=((2*B)+A)=(A+2B)</code>.</li>
</ul>

<p>However, consider the expressions&nbsp;<code>F<sub>4</sub>=((0#0)+(0#0))</code>&nbsp;and&nbsp;<code>F<sub>5</sub>=(0#0)</code>. If&nbsp;<code>#</code>&nbsp;represents addition, then&nbsp;<code>F<sub>4</sub>=F<sub>5</sub></code>. However, if&nbsp;<code>#</code>&nbsp;is&nbsp;<code>f(x,y)=C</code>, such that&nbsp;$C$&nbsp;is a non-zero integer, then&nbsp;<code>F<sub>4</sub>&ne;F<sub>5</sub></code>&nbsp;since&nbsp;<code>2C&ne;C</code>. Therefore&nbsp;<code>F<sub>4</sub></code>&nbsp;and&nbsp;<code>F<sub>5</sub></code>&nbsp;are not in the same equivalence class.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$.&nbsp;$T$&nbsp;test cases follow. Each test case begins with a line containing the integer&nbsp;$N$. $N$ lines follow.&nbsp;$i$-th line contains one expression, <code>E<sub>i</sub></code>.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;Y<sub>1</sub>,Y<sub>2</sub>,&hellip;,Y<sub>N</sub></code>, where $x$ is the test case number (starting from 1) and&nbsp;$Y_i$&nbsp;is the&nbsp;<a href="https://en.wikipedia.org/wiki/Lexicographic_order" target="_blank">lexicographically smallest</a>&nbsp;sequence satisfying the conditions below:</p>

<ol>
	<li>$1 \le Y_i \le Z$, where $Z$ denotes the total number of equivalence classes in a given test case.</li>
	<li>$Y_i=Y_j$&nbsp;if and only if&nbsp;$E_i$&nbsp;and&nbsp;$E_j$&nbsp;are in the same equivalence class.</li>
</ol>

### 제한

<ul>
	<li>$1 \le T \le 100$</li>
	<li>$1 \le N \le 100$</li>
	<li>The length of&nbsp;$E_i$&nbsp;is at most&nbsp;$100$, for all&nbsp;$i$.</li>
	<li>$E_i$&nbsp;will be valid, for all&nbsp;$i$.</li>
</ul>