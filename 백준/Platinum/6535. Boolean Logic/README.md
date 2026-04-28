# [Platinum II] Boolean Logic - 6535

[문제 링크](https://www.acmicpc.net/problem/6535)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 39, 정답: 29, 맞힌 사람: 12, 정답 비율: 54.545%

### 분류

구현, 파싱, 문자열

### 문제 설명

<p>Propositions are logical formulas consisting of proposition symbols and connecting operators. They are recursively defined by the following rules:</p>

<ol>
	<li>All proposition symbols (in this problem, lower-case alphabetic characters, e.g., <code>a</code> and <code>z</code>) are propositions.</li>
	<li>If <em>P</em> is a proposition, <code>(!</code><em>P</em><code>)</code> is a proposition, and <em>P</em> is a direct subformula of it.</li>
	<li>If <em>P</em> and <em>Q</em> are propositions, <code>(</code><em>P</em><code>&amp;</code><em>Q</em><code>)</code>, <code>(</code><em>P</em><code>|</code><em>Q</em><code>)</code>, <code>(</code><em>P</em><code>--&gt;</code><em>Q</em><code>)</code>, and <code>(</code><em>P</em><code>&lt;-&gt;</code><em>Q</em><code>)</code> are propositions, and <em>P</em> and <em>Q</em> are direct subformulas of them.</li>
	<li>Nothing else is a proposition.</li>
</ol>

<p>The operations <code>!</code>, <code>&amp;</code>, <code>|</code>, <code>--&gt;</code>, and <code>&lt;-&gt;</code> denote logical negation, conjunction, disjunction, implication, and equivalence, respectively. A proposition <em>P</em> is a subformula of a proposition <em>R</em> if <em>P=R</em> or <em>P</em> is a direct subformula of a proposition <em>Q</em> and <em>Q</em> is a subformula of <em>R</em>.</p>

<p>Let <em>P</em> be a proposition and assign boolean values (i.e., <em>0</em> or <em>1</em>) to all proposition symbols that occur in <em>P</em>. This induces a boolean value to all subformulas of <em>P</em> according to the standard semantics of the logical operators:</p>

<table class="table table-bordered" style="width:50%">
	<tbody>
		<tr>
			<td>negation</td>
			<td>conjunction</td>
			<td>disjunction</td>
			<td>implication</td>
			<td>equivalence</td>
		</tr>
		<tr>
			<td><code>!</code><em>0</em>=<em>1</em></td>
			<td><em>0</em><code>&amp;</code><em>0</em>=<em>0</em></td>
			<td><em>0</em><code>|</code><em>0</em>=<em>0</em></td>
			<td><em>0</em><code>--&gt;</code><em>0</em>=<em>1</em></td>
			<td><em>0</em><code>&lt;-&gt;</code><em>0</em>=<em>1</em></td>
		</tr>
		<tr>
			<td><code>!</code><em>1</em>=<em>0</em></td>
			<td><em>0</em><code>&amp;</code><em>1</em>=<em>0</em></td>
			<td><em>0</em><code>|</code><em>1</em>=<em>1</em></td>
			<td><em>0</em><code>--&gt;</code><em>1</em>=<em>1</em></td>
			<td><em>0</em><code>&lt;-&gt;</code><em>1</em>=<em>0</em></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td><em>1</em><code>&amp;</code><em>0</em>=<em>0</em></td>
			<td><em>1</em><code>|</code><em>0</em>=<em>1</em></td>
			<td><em>1</em><code>--&gt;</code><em>0</em>=<em>0</em></td>
			<td><em>1</em><code>&lt;-&gt;</code><em>0</em>=<em>0</em></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td><em>1</em><code>&amp;</code><em>1</em>=<em>1</em></td>
			<td><em>1</em><code>|</code><em>1</em>=<em>1</em></td>
			<td><em>1</em><code>--&gt;</code><em>1</em>=<em>1</em></td>
			<td><em>1</em><code>&lt;-&gt;</code><em>1</em>=<em>1</em></td>
		</tr>
	</tbody>
</table>

<p>This way, a value for <em>P</em> can be calculated. This value depends on the choice of the assignment of boolean values to the proposition symbols. If <em>P</em> contains <em>n</em> different proposition symbols, there are <em>2<sup>n</sup></em> different assignments. To evaluate all possible assignments we may use truth tables.</p>

<p>A truth table contains one line per assignment (i.e., <em>2<sup>n</sup></em> lines in total). Every line contains the values of all subformulas under the chosen assignment. The value of a subformula is aligned with the proposition symbol, if the subformula is a proposition symbol, and with the center of the operator otherwise.</p>

### 입력

<p>The input contains several test cases, each on a separate line. Every test case denotes a proposition and may contain arbitrary amounts of spaces in between. The input file terminates immediately after the newline symbol following the last test case.</p>

### 출력

<p>For each test case generate a truth table for the denoted proposition. Start the truth table by repeating the input line. Evaluate the proposition (and its subformulas) for all assignments to its variables, and output one line for each assignment. The line must have the same length as the corresponding input line and must consist only of spaces and the characters <code>0</code> and <code>1</code>. Output an empty line after each test case.</p>

<p>Let <em>s<sub>1</sub>,...,s<sub>n</sub></em> be the proposition symbols in the denoted proposition sorted in alphabetic order. Then, all assignments of <em>0</em> to <em>s<sub>1</sub></em> must precede the assignments of <em>1</em> to <em>s<sub>1</sub></em>. Within each of these blocks of assignments, all assignments of <em>0</em> to <em>s<sub>2</sub></em> must precede the assignments of <em>1</em> to <em>s<sub>2</sub></em>, and so on.</p>