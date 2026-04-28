# [Platinum IV] Symbolic Logic Mechanization - 4488

[문제 링크](https://www.acmicpc.net/problem/4488)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 5, 정답 비율: 50.000%

### 분류

브루트포스 알고리즘, 많은 조건 분기, 자료 구조, 구현, 파싱, 스택, 문자열

### 문제 설명

<p>Marvin, the robot with a brain the size of a planet, followed some . . . markedly less successful robots as the product line developed. One such was Monroe, the robot &mdash; except, to help him recognize his name, he was referred to as Moe. He is sufficiently mentally challenged that he needs external assistance to handle symbolic logic.</p>

<p>Polish notation is the prefix symbolic logic notation developed by Jan Łukasiewicz (1929). [Hence postfix expressions are referred to as being in Reverse Polish Notation &mdash; RPN.] The notation developed by Łukasiewicz (referred to as PN below) uses upper-case letters for the logic operators and lower-case letters for logic variables (which can only be true or false). Since prefix notation is self-grouping, there is no need for precedence, associativity, or parentheses, unlike infix notation. In the following table the PN operator is shown, followed by its operation. Operators not having exactly equivalent C/C++/Java operators are shown in the truth table (using 1 for true and 0 for false). [The operator J is not found in Łukasiewicz&rsquo; original work but is included from A.N.Prior&rsquo;s treatment.]</p>

<table class="table table-bordered" style="width:50%">
	<tbody>
		<tr>
			<td style="text-align:center"><strong>PN Operator</strong></td>
			<td style="text-align:center"><strong>Operation</strong></td>
		</tr>
		<tr>
			<td style="text-align:center">Cpq</td>
			<td style="text-align:center">conditional</td>
		</tr>
		<tr>
			<td style="text-align:center">Np</td>
			<td style="text-align:center">not</td>
		</tr>
		<tr>
			<td style="text-align:center">Kpq</td>
			<td style="text-align:center">and</td>
		</tr>
		<tr>
			<td style="text-align:center">Apq</td>
			<td style="text-align:center">(inclusive) or</td>
		</tr>
		<tr>
			<td style="text-align:center">Dpq</td>
			<td style="text-align:center">nand</td>
		</tr>
		<tr>
			<td style="text-align:center">Epq</td>
			<td style="text-align:center">equivalence</td>
		</tr>
		<tr>
			<td style="text-align:center">Jpq</td>
			<td style="text-align:center">exclusive or</td>
		</tr>
	</tbody>
</table>

<p>&nbsp;</p>

<table class="table table-bordered" style="width:50%">
	<tbody>
		<tr>
			<td colspan="5" style="text-align:center"><strong>Truth Tables</strong></td>
		</tr>
		<tr>
			<td style="text-align:center">p</td>
			<td style="text-align:center">q</td>
			<td style="text-align:center">Cpq</td>
			<td style="text-align:center">Dpq</td>
			<td style="text-align:center">Epq</td>
		</tr>
		<tr>
			<td style="text-align:center">0</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">1</td>
		</tr>
		<tr>
			<td style="text-align:center">0</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">0</td>
		</tr>
		<tr>
			<td style="text-align:center">1</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">0</td>
		</tr>
		<tr>
			<td style="text-align:center">1</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">1</td>
		</tr>
	</tbody>
</table>

<p>For every combination of PN operators and variables, an expression is a &ldquo;well-formed formula&rdquo; (WFF) if and only if it is a variable or it is a PN operator followed by the requisite number of operands (WFF instances). A combination of symbols will fail to be a &ldquo;well-formed formula&rdquo; if it is composed of a WFF followed by extraneous text, it uses an unrecognized character [upper- case character not in the above table or a non-alphabetic character], or it has insufficient operands for its operators. For invalid expressions, report the first error discovered in a left-to- right scan of the expression. For instance, immediately report an error on an invalid character. If a valid WFF is followed by extraneous text, report that as the error, even if the extraneous text has an invalid character.</p>

<p>In addition, every WFF can be categorized as a tautology (true for all possible variable values), a contradiction (false for all possible variable values), or a contingent expression (true for some variable values, false for other variable values).</p>

<p>The simplest contingent expression is simply &ldquo;p&rdquo;, true when p is true, false when p is false. One very simple contradiction is &ldquo;KpNp&rdquo;, both p and not-p are true. Similarly, one very simple tautology is &ldquo;ApNp&rdquo;, either p is true or not-p is true. For a more complex tautology, one expression of De Morgan&rsquo;s Law is &ldquo;EDpqANpNq&rdquo;.</p>

### 입력

<p>Your program is to accept lines until it receives an empty character string. Each line will contain only alphanumeric characters (no spaces or punctuation) that are to be parsed as potential &ldquo;WFFs&rdquo;. Each line will contain fewer than 256 characters and will use at most 10 variables. There will be at most 32 non-blank lines before the terminating blank line.</p>

<p>&nbsp;</p>

### 출력

<p>For each line read in, echo it back, followed by its correctness as a WFF, followed (if a WFF) with its category (tautology, contradiction, or contingent). In processing an input line, immediately terminate and report the line as not a WFF if you encounter an unrecognized operator (even though it may fail to be well-formed in another way as well). If it has extraneous text following the WFF, report it as incorrect. If it has insufficient operands, report that. Use exactly the format shown in the <strong><u>Sample Output</u></strong> below.</p>