# [Silver I] Halt and Catch Fire - 33245

[문제 링크](https://www.acmicpc.net/problem/33245)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 53, 정답: 20, 맞힌 사람: 8, 정답 비율: 30.769%

### 분류

구현, 시뮬레이션, 자료 구조, 트리를 사용한 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Research has led to the creating of a new super fast CPU called the Fast Processing Chip (FPC). This product has a never-before seen debugging function: an instruction called <code>hcf</code>, providing debugging power unmatched by any previously designed CPU.</p>

<p>With the product becoming popular fast, companies can't wait to get their hands on the chip to start development immediately. One problem, however, is the chip is too expensive to just hand over to every developer all willy-nilly.</p>

<p>You have been hired to design a program that runs as if it were a processor, so the programmers can write programs and easily test these programs without needing the hardware.</p>

### 입력

<ul>
	<li>One line with one integer: $1 \leq n \leq 1000$, the number of lines in the program.</li>
	<li>$n$ lines with three sections, separated with spaces:
	<ul>
		<li>The operation, always 3 characters</li>
		<li>An argument: Either an integer $-2^{31} \leq a \leq 2^{31}-1$ or a variable prepended with <code>$</code></li>
		<li>An argument: Either an integer $-2^{31} \leq b \leq 2^{31}-1$ or a variable prepended with <code>$</code></li>
	</ul>
	</li>
</ul>

<p>There are five possible operations:</p>

<ul>
	<li><code>mov</code> -- Move value from the first argument to the second</li>
	<li><code>add</code> -- Add value from the second argument to the first and store in <code>$acc</code></li>
	<li><code>sub</code> -- Subtract value of the second argument from the first and store in <code>$acc</code></li>
	<li><code>jeq</code> -- Jump to the instruction on the value of the second argument if the value of the first argument equals <code>$cmp</code></li>
	<li><code>hcf</code> -- Halt and Catch Fire: Stop the program immediately, takes only integer arguments</li>
</ul>

<p>An argument can be noted as an integer immediate or a variable reference, in which case it's prepended by <code>$</code>. All variable names consist of at most 20 lowercase characters from the English alphabet (<code>a-z</code>) or underscores (<code>_</code>).</p>

<p>There are four predefined variables:</p>

<ul>
	<li><code>$acc</code> -- Contains the value of an <code>add</code> or <code>sub</code> operation</li>
	<li><code>$pc </code> -- Contains the address of the currently processed operation</li>
	<li><code>$cmp</code> -- Used to compare with the <code>jeq</code> operation</li>
	<li><code>$out</code> -- Should be output when the program finishes</li>
</ul>

<p>Any other variables are defined as soon as a value is moved to them.</p>

<p>Assume any given input program to be syntactically correct.</p>

<p>Integers will never over- or underflow.</p>

### 출력

<p>The program exits either when the value of the <code>$pc</code> variable reaches out of the bounds of the program, or when an <code>hcf</code> instruction is reached.</p>

<ul>
	<li>In the first case, output one line containing the value of <code>$out</code> at the end of the program.</li>
	<li>In the second case, output the following:
	<ul>
		<li>One line containing the <code>hcf</code> instruction that was called.</li>
		<li>One line containing the content of the <code>$acc</code> variable.</li>
		<li>One line containing the content of the <code>$cmp</code> variable.</li>
		<li>One line containing the content of the <code>$out</code> variable.</li>
	</ul>
	</li>
</ul>