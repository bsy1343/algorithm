# [Gold V] Inverting bits (Easy) - 18774

[문제 링크](https://www.acmicpc.net/problem/18774)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 549, 정답: 146, 맞힌 사람: 122, 정답 비율: 32.190%

### 분류

해 구성하기, 비트마스킹

### 문제 설명

<p>The wannabe scientist Kleof&aacute;&scaron; has recently developed a new processor. The processor has got 26 registers, labeled&nbsp;<code>A</code>&nbsp;to&nbsp;<code>Z</code>. Each register is an 8-bit unsigned integer variable.</p>

<p>This new processor is incredibly simple. It only supports the instructions specified in the table below. (In all instructions,&nbsp;<code>R</code>&nbsp;is a name of a register,&nbsp;<code>C</code>&nbsp;is a constant, and&nbsp;<code>X</code>&nbsp;is either the name of a register or a constant. All constants are 8-bit unsigned integers, i.e., numbers from 0 to 255.)</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<td>syntax</td>
			<td>semantics</td>
		</tr>
		<tr>
			<td><code>and R X</code></td>
			<td>Compute the bitwise and of the values&nbsp;<code>R</code>&nbsp;and&nbsp;<code>X</code>, and store it in&nbsp;<code>R</code>.</td>
		</tr>
		<tr>
			<td><code>or R X</code></td>
			<td>Compute the bitwise or of the values&nbsp;<code>R</code>&nbsp;and&nbsp;<code>X</code>, and store it in&nbsp;<code>R</code>.</td>
		</tr>
		<tr>
			<td><code>not R</code></td>
			<td>Compute the bitwise not of the value&nbsp;<code>R</code>, and store it in&nbsp;<code>R</code>.</td>
		</tr>
		<tr>
			<td><code>shl R C</code></td>
			<td>Take the value in&nbsp;<code>R</code>, shift it to the left by&nbsp;<code>C</code>&nbsp;bits, and store the result in&nbsp;<code>R</code>.</td>
		</tr>
		<tr>
			<td><code>shr R C</code></td>
			<td>Take the value in&nbsp;<code>R</code>, shift it to the right by&nbsp;<code>C</code>&nbsp;bits, and store the result in&nbsp;<code>R</code>.</td>
		</tr>
		<tr>
			<td><code>mov R X</code></td>
			<td>Store the value&nbsp;<code>X</code>&nbsp;into&nbsp;<code>R</code>.</td>
		</tr>
		<tr>
			<td><code>get R</code></td>
			<td>Read an 8-bit unsigned integer and store it in&nbsp;<code>R</code>.</td>
		</tr>
		<tr>
			<td><code>put R</code></td>
			<td>Output the content of the register&nbsp;<code>R</code>&nbsp;as an 8-bit unsigned integer.</td>
		</tr>
	</tbody>
</table>

<p>Notes:</p>

<ul>
	<li>After any instruction other than&nbsp;not, if the second argument was a register name, its content remains unchanged.</li>
	<li>Whenever&nbsp;<code>shl</code>&nbsp;or&nbsp;<code>shr</code>&nbsp;is called, the shifted value of the first argument is truncated on one end and padded with zeroes on the other end. For example, if&nbsp;<code>X</code>&nbsp;equals to binary 10110110, then&nbsp;<code>X shr 2</code>&nbsp;equals to 00101101.</li>
</ul>

<p><strong>Example task</strong></p>

<p>Assume that the input contains an arbitrary two 8-bit unsigned integers&nbsp;a&nbsp;and&nbsp;b. Write a program that will read these numbers and produce an integer&nbsp;z&nbsp;such that&nbsp;z&nbsp;= 0 if and only if&nbsp;a&nbsp;=&nbsp;b. (That is, if&nbsp;a&nbsp;and&nbsp;b&nbsp;differ,&nbsp;z&nbsp;must be positive.)</p>

<p><strong>Problem specification</strong></p>

<p>For each data set, you have to write a program for Kleof&aacute;&scaron;&rsquo;s processor that solves the following task: The input for your program is a sequence of integers, each of them a 0 or a 1. The output of your program must be a sequence of their negations, in order. (That is, change each 0 into a 1 and vice versa.)</p>

<p>The sequence contains&nbsp;exactly 7&nbsp;integers. In your program, you may only use the instruction&nbsp;not&nbsp;at most&nbsp;once. Your program must have at most 100 instructions.</p>

<p>Note that you have to use each of the instructions&nbsp;<code>get</code>&nbsp;and&nbsp;<code>put</code>&nbsp;exactly 7 times.</p>

### 입력

<p>This problem has no input.</p>

### 출력

<p>Send us your program as a plain ASCII text. Each line of the text may either contain one complete instruction, or just whitespace. If you submit anything that is not a proper program, it will be judged &ldquo;Wrong answer&rdquo; and you will get an appropriate error message.</p>

### 힌트

<p>There are many possible solutions. In our solution, we read the input to registers&nbsp;A&nbsp;and&nbsp;B, compute their bitwise xor in register&nbsp;Z&nbsp;and output it.</p>

<p>However, we do not have an instruction for xor. We have to assemble it from ands, ors, and nots. First, we create (not-A&nbsp;and&nbsp;B) in&nbsp;C&nbsp;and (not-B&nbsp;and&nbsp;A) in&nbsp;D. Finally, we store (C&nbsp;or&nbsp;D) in&nbsp;Z&nbsp;and we are done.</p>

<p>Why does it work? If the two numbers are identical, then&nbsp;C&nbsp;and&nbsp;D&nbsp;will both be zero, and so will&nbsp;Z. If the two numbers are not identical, consider a digit&nbsp;d&nbsp;where the two numbers differ in their binary representations. If this digit is 0 in&nbsp;A, it has to be 1 in&nbsp;B. But then it is 1 in&nbsp;C&nbsp;and therefore it is 1 in&nbsp;Z. And if the digit is 1 in&nbsp;A, it has to be 0 in&nbsp;B, 1 in&nbsp;D, and 1 in&nbsp;Z.</p>