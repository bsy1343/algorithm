# [Platinum II] Calculator Language - 6400

[문제 링크](https://www.acmicpc.net/problem/6400)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 55, 정답: 7, 맞힌 사람: 7, 정답 비율: 29.167%

### 분류

파싱, 문자열

### 문제 설명

<p>Calculator Language (CL) supports assignment, positive and negative integers and simple arithmetic. The allowable characters in a CL statement are thus:</p>

<table class="table table-bordered" style="width:50%">
	<tbody>
		<tr>
			<th><code>A..Z</code></th>
			<td>variable names</td>
		</tr>
		<tr>
			<th><code>0..9</code></th>
			<td>digits</td>
		</tr>
		<tr>
			<th><code>+</code></th>
			<td>addition operator</td>
		</tr>
		<tr>
			<th><code>-</code></th>
			<td>subtraction operator</td>
		</tr>
		<tr>
			<th><code>*</code></th>
			<td>multiplication operator</td>
		</tr>
		<tr>
			<th><code>/</code></th>
			<td>integer division operator</td>
		</tr>
		<tr>
			<th><code>=</code></th>
			<td>assignment operator</td>
		</tr>
		<tr>
			<th><code>()</code></th>
			<td>bracket</td>
		</tr>
		<tr>
			<th><code>_</code></th>
			<td>negative sign</td>
		</tr>
	</tbody>
</table>

<p>All operators have the same precedence and are right associative, thus 15 - 8 - 3 = 15 - (8 - 3) = 10. As one would expect, brackets will force the expression within them to be evaluated first. Brackets may be nested arbitrarily deeply. An expression never has two operators next to each other (even if separated by a bracket), an assignment operator is always immediately preceded by a variable and the leftmost operator on a line is always an assignment. For readability, spaces may be freely inserted into an expression, except between a negative sign and a number. A negative sign will appear right before an integer only. All variables are initialized to zero (0) and retain their values until changed explicitly. In addition, The second operand must be evaluated first; for example, an expression (A = 10) / (A = 5) evaluates (A = 5) first, then evaluates (A = 10), and finally evaluates 10 / 5. All integer divisions follow the C/C++ integer division rule and there is no division by zero.</p>

<p>Write a program that will accept and evaluate expressions written in this language. Each expression occupies one line and contains at least one assignment operator, and maybe more.</p>

### 입력

<p>Input will consist of a series of lines, each line containing a correct CL expression. No line will be longer than 100 characters. The file will be terminated by a line consisting of a single #.</p>

### 출력

<p>Output will consist of a series of lines, one for each line of the input. Each line will consist of a list of the final values of all variables whose value changes as a result of the evaluation of that expression. If more than one variable changes value, they should be listed in alphabetical order, separated by commas. If a variable changes value more than once in an expression, only the final value is output. A variable is said to change value if its value after the expression has been evaluated is different from its value before the expression was evaluated. If no variables change value, then print the message `No Change&#39;. Follow the format shown below exactly.</p>