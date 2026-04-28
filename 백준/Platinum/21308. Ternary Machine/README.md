# [Platinum I] Ternary Machine - 21308

[문제 링크](https://www.acmicpc.net/problem/21308)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 7, 맞힌 사람: 4, 정답 비율: 36.364%

### 분류

자료 구조, 구현, 파싱, 시뮬레이션, 스택, 문자열

### 문제 설명

<p>A ternary numerical system (also called base 3) has three as its base. Just as a binary digit is called a bit in base 2, a ternary digit is surprisingly called a <em>trit</em>. The <em>trits</em> are 0, 1 and 2. For this problem, you will write an <strong>interpreter</strong> for a ternary machine that accepts as input a program consisting of a string of trits and executes it. Instructions for this machine consist of an opcode sometimes followed by a parameter. The opcodes for the machine follow. <strong>S1</strong> and <strong>S2</strong> refer to the item at the top of the stack and the 2nd item on the stack respectively. When these are used below, it implies they are removed from the stack for the given instruction (popped).</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th>Opcode</th>
			<th>Parameter</th>
			<th>Description</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><code>000</code></td>
			<td><em><strong>Number</strong></em></td>
			<td>Push positive <em><strong>Number</strong></em> onto stack</td>
		</tr>
		<tr>
			<td><code>001</code></td>
			<td><em><strong>Number</strong></em></td>
			<td>Push negative <em><strong>Number</strong></em> onto stack</td>
		</tr>
		<tr>
			<td><code>020</code></td>
			<td>&nbsp;</td>
			<td>Duplicate the top item on the stack</td>
		</tr>
		<tr>
			<td><code>021</code></td>
			<td>&nbsp;</td>
			<td>Swap the top two items on the stack</td>
		</tr>
		<tr>
			<td><code>022</code></td>
			<td>&nbsp;</td>
			<td>Discard the top item on the stack</td>
		</tr>
		<tr>
			<td><code>1000</code></td>
			<td>&nbsp;</td>
			<td>Add <strong>S1</strong> + <strong>S2</strong> and push result onto stack.</td>
		</tr>
		<tr>
			<td><code>1001</code></td>
			<td>&nbsp;</td>
			<td>Subtract <strong>S2</strong> &ndash; <strong>S1</strong> and push result onto stack.</td>
		</tr>
		<tr>
			<td><code>1002</code></td>
			<td>&nbsp;</td>
			<td>Multiply <strong>S1</strong> x <strong>S2</strong> and push result onto stack.</td>
		</tr>
		<tr>
			<td><code>1010</code></td>
			<td>&nbsp;</td>
			<td>Divide <strong>S2</strong> &divide; <strong>S1</strong> and push result onto stack.</td>
		</tr>
		<tr>
			<td><code>1011</code></td>
			<td>&nbsp;</td>
			<td>Compute module <strong>S2</strong> % <strong>S1</strong> and push result onto stack.</td>
		</tr>
		<tr>
			<td><code>110</code></td>
			<td>&nbsp;</td>
			<td>Store the <em>Value</em> <strong>S1</strong> at the machine&rsquo;s memory heap address specified by <strong>S2</strong>.</td>
		</tr>
		<tr>
			<td><code>111</code></td>
			<td>&nbsp;</td>
			<td>Push the <em>Value</em> from the machine&rsquo;s memory heap address specified by <strong>S1</strong> onto the stack.</td>
		</tr>
		<tr>
			<td><code>200</code></td>
			<td><em><strong>Label</strong></em></td>
			<td>Set a label <em>mark</em> at the point in the program after this instruction. This may the destination of a <em>Jump</em> or <em>Call</em>.</td>
		</tr>
		<tr>
			<td><code>201</code></td>
			<td><em><strong>Label</strong></em></td>
			<td>Call the subroutine at the specified label.</td>
		</tr>
		<tr>
			<td><code>202</code></td>
			<td><em><strong>Label</strong></em></td>
			<td>Jump to the specified label.</td>
		</tr>
		<tr>
			<td><code>210</code></td>
			<td><em><strong>Label</strong></em></td>
			<td>Jump to the label if <strong>S1</strong> is 0.</td>
		</tr>
		<tr>
			<td><code>211</code></td>
			<td><em><strong>Label</strong></em></td>
			<td>Jump to the label <strong>S1</strong> is negative.</td>
		</tr>
		<tr>
			<td><code>212</code></td>
			<td>&nbsp;</td>
			<td>End subroutine and transfer control back to the location where it was called from.</td>
		</tr>
		<tr>
			<td><code>222</code></td>
			<td>&nbsp;</td>
			<td>End the program and halt the machine.</td>
		</tr>
		<tr>
			<td><code>1200</code></td>
			<td>&nbsp;</td>
			<td>Output the character from <strong>S1</strong>.</td>
		</tr>
		<tr>
			<td><code>1201</code></td>
			<td>&nbsp;</td>
			<td>Output the decimal number from <strong>S1</strong>.</td>
		</tr>
		<tr>
			<td><code>1210</code></td>
			<td>&nbsp;</td>
			<td>Read a character from the input and place it in the machine&rsquo;s memory heap at the address specified by <strong>S1</strong>.</td>
		</tr>
		<tr>
			<td><code>1211</code></td>
			<td>&nbsp;</td>
			<td>Read a decimal number from the input and place it in the machine&rsquo;s memory heap at the address specified by <strong>S1</strong>.</td>
		</tr>
	</tbody>
</table>

<p>The machine you will implement must support a stack of precisely 1024 items. Items can only be <em><strong>Value</strong></em>s or characters. The memory heap is of arbitrary size, and possibly sparse. Addresses used to reference the heap are positive <em><strong>Value</strong></em>s.</p>

<p><em><strong>Number</strong></em> is a decimal integer from 1 to 31 bits in length. (Yes, it&rsquo;s in <strong>bits</strong> not <strong>trits</strong>.) The end of the value is indicated by the <em>trit</em> 2. Ex. 100112 = 19 (decimal).</p>

<p><em><strong>Value</strong></em> is a signed <em><strong>Number</strong></em>. Since <em><strong>Number</strong></em> is no more than 31 bits, a <em><strong>Value</strong></em> can be represented using a 32-bit quantity (-2147483647 &le; <em><strong>Value</strong></em> &le; 2147483647).</p>

<p><em><strong>Label</strong></em> is a string of 1 to 128 <em>trits</em> of value 0 or 1. Its end is always indicated by a <em>trit</em> of value 2. If an attempt is made to redefine a <em><strong>Label</strong></em> mark, that is a RUN-TIME ERROR.</p>

<p>Subroutines calls may be nested (and recursive) to a maximum depth of 1024 (the top-level execution depth is 0).</p>

<p>Any illegal character (non-<em>trit</em>) encountered during execution should cause a RUN-TIME ERROR.</p>

<p>Program execution starts with the first character in the program and continues until the opcode 222 is reached or there is a RUN-TIME ERROR.</p>

### 입력

<p>Input consists of one or more lines. The first line contains a string of up to 8192 characters representing the program to execute (the terminating line feed is not part of the program to execute). If the program requires input (for opcodes <code>1210</code> and <code>1211</code>), the input follows after the first line (after the line feed), on one or more lines as required by the program. If a program requires input, there will always be enough input supplied. Care should be taken when implementing the <code>1210</code> and <code>1211</code> opcodes so as to not consume too much input. Ex. For opcode <code>1211</code>, only an optional leading minus sign and decimal digits should be read until a non-decimal digit is reached.</p>

### 출력

<p>The output consists of at least one line which is the output of the supplied ternary program and/or the message &ldquo;RUN-TIME ERROR&rdquo; if an error occurred during execution of the ternary program. Some possible RUN-TIME ERRORs include invalid character, invalid opcode, stack underflow, stack overflow, division by 0, undefined label, etc. If a RUN-TIME ERROR does occur, be sure to flush all pending output from the ternary program prior to printing RUN-TIME ERROR. Attempting to access an address in the machine&rsquo;s heap that has not been previously set should retrieve a value of 0 &ndash; this is not a RUN-TIME error.</p>

<p>Note: It is possible that the ternary program will generate some output and then get a RUN-TIME ERROR. It is also possible that there are potential errors in the ternary program but these errors will not be reached during execution (ex. invalid character/opcode, missing label, redefined label, etc.). In this case, these RUN-TIME ERRORs will not be reported (which is correct).</p>