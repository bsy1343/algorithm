# [Silver II] Important Wires - 3579

[문제 링크](https://www.acmicpc.net/problem/3579)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 33, 정답: 19, 맞힌 사람: 17, 정답 비율: 60.714%

### 분류

해 구성하기

### 문제 설명

<p>Nick bought a new motherboard for his computer and it seems that it does not work properly. The motherboard is pretty complicated but it has only few important wires that have binary states: live or dead. Nick wants to know the states of these wires.</p>

<p>Unfortunately, important wires are not directly accessible. But Nick found a maintenance socket. Each output pin of this socket is connected to some of important wires via an integrated circuit. Fortunately, Nick found the circuit layout in the Internet. To specify it, he marked important wires by lowercase letters and socket&rsquo;s output pins by uppercase letters. After that he wrote down Boolean formula for each output pin. In these formulae live wires and pins are represented by true and dead wires &mdash; by <em>false</em>.</p>

<p>Nick used following notation for formulae (operations are listed from the highest priority to the lowest):</p>

<ul>
	<li>Pin names &mdash; letters from &lsquo;<code>a</code>&rsquo; to &lsquo;<code>k</code>&rsquo;;</li>
	<li>Parentheses &mdash; if <em>E</em> is a formula, then (<em>E</em>) is another;</li>
	<li>Negation &mdash; &not;<em>E</em> is a formula for any formula <em>E</em>;</li>
	<li>Conjunction &mdash; <em>E</em><sub>1</sub> &and;<em>E</em><sub>2</sub> &and;&middot;&middot;&middot;&and;<em>E<sub>n</sub></em>;</li>
	<li>Disjunction &mdash; <em>E</em><sub>1</sub> &or;<em>E</em><sub>2</sub> &or;&middot;&middot;&middot;&or;<em>E<sub>n</sub></em>;</li>
	<li>Implication &mdash; <em>E</em><sub>1</sub> &rArr; <em>E</em><sub>2</sub> &rArr; &middot; &middot; &middot; &rArr; <em>E<sub>n</sub></em>. Implication is evaluated from right to left: <em>E</em><sub>1</sub> &rArr; <em>E</em><sub>2</sub> &rArr; <em>E</em><sub>3</sub>&nbsp;means <em>E</em><sub>1</sub> &rArr; (<em>E</em><sub>2</sub> &rArr;<em>E</em><sub>3</sub>);</li>
	<li>Equivalence &mdash; <em>E</em><sub>1</sub> &equiv; <em>E</em><sub>2</sub> &equiv; &middot;&middot;&middot; &equiv; <em>E<sub>n</sub></em>. This expression is by definition computed as follows: (<em>E</em><sub>1</sub> &equiv; <em>E</em><sub>2</sub>) &and; (<em>E</em><sub>2</sub> &equiv; <em>E</em><sub>3</sub>) &and; &middot;&middot;&middot; &and; (<em>E</em><sub><em>n</em>&minus;1</sub> &equiv; <em>E<sub>n</sub></em>).</li>
</ul>

<p>Nick has lots of various gates at hand, so he can build a new circuit that implements any formula. The variables of this formula are states of maintenance socket&rsquo;s pins. First of all, Nick wants to construct a circuit that takes all maintenance socket&rsquo;s pins as inputs and has a single output wire that is always live. Write a program to help him.</p>

### 입력

<p>The first line of the input file contains a single integer number <em>n</em> &mdash; the number of pins in the maintenance socket (1 &le; <em>n</em> &le; 10). The following n lines contain description of one pin each.</p>

<p>Each pin description consists of a pin name and corresponding formula delimited by &lsquo;<code>:=</code>&rsquo; token. Pin name is a uppercase English letter. Formula is represented by a string consisting of tokens &lsquo;<code>a</code>&rsquo;..&lsquo;<code>k</code>&rsquo;, &lsquo;<code>(</code>&rsquo;, &lsquo;<code>)</code>&rsquo;, &lsquo;<code> </code>&rsquo;, &lsquo;<code>&amp;</code>&rsquo;, &lsquo;<code>|</code>&rsquo;, &lsquo;<code>=&gt;</code>&rsquo;, and &lsquo;<code>&lt;=&gt;</code>&rsquo;. The last five tokens stand for &not;, &and;, &or;, &rArr; and &equiv; respectively. Tokens can be separated by an arbitrary number of spaces. Each pin description contains 1 000 characters at most.</p>

### 출력

<p>The first line of the output file must contain &ldquo;Yes&rdquo; if there exists a circuit which output wire is always live and &ldquo;No&rdquo; otherwise.</p>

<p>In the former case the following line must contain the formula for the constructed circuit in the same format as in the input file. Remember that the formula must contain each of pin names at least once and it must not contain the wire names. The line must not exceed 1 000 characters.</p>