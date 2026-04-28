# [Gold II] The Assembly Code - 18341

[문제 링크](https://www.acmicpc.net/problem/18341)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 12, 맞힌 사람: 9, 정답 비율: 39.130%

### 분류

구현, 자료 구조, 브루트포스 알고리즘, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Jamshid is working with a special computing machine. The machine only supports operations on 32-bit unsigned integers and its memory is an array M of length 2<sup>32</sup> (for 0 ⩽ i &lt; 2<sup>32</sup>, M<sub>i</sub> is a 32-bit unsigned integer).</p>

<p>The assembly code for the machine supports the following addressing modes:</p>

<ul>
	<li>Immediate addressing: <code>#&lang;number&rang;</code> This type of addressing is used to refer constant values. So, <code>#3</code> means the constant value 3.</li>
	<li>Direct addressing: <code>$&lang;index&rang;</code> This mode is used to directly address a memory cell. For example, <code>$7</code> refers to cell M<sub>7</sub>.</li>
	<li>Indirect addressing: <code>@&lang;index&rang;</code> This addressing mode is used for supporting pointers. It first looks up the value of the memory cell specified by <code>&lang;index&rang;</code>, and then refers to the cell specified by that value. For example, if M<sub>5</sub> = 9, then <code>@5</code> refers to M<sub>9</sub>.</li>
</ul>

<p>All the memory cells are initialized with 0 when a program starts running.</p>

<p>An assembly code for the machine is a sequence of commands. Each command consists of an operation followed by a number of addresses. The current assembly language for the machine supports a limited number of operations:</p>

<ul>
	<li><code>MOVE &lang;dest&rang; &lang;source&rang;</code>: It copies the value of <code>&lang;source&rang;</code> to the memory cell referred by <code>&lang;dest&rang;</code>. For example, <code>MOVE $9 #13</code> sets M<sub>9</sub> to 13, and <code>MOVE @4 $6</code> sets M<sub>M<sub>4</sub></sub> to the value of M<sub>6</sub>.</li>
	<li><code>INPUT &lang;address&rang;</code>: It reads a number from the input and stores it in the memory cell referred by <code>&lang;address&rang;</code>. For example, <code>INPUT $2</code> stores the input value in M<sub>2</sub>, and <code>INPUT @1</code> stores the input value in M<sub>M<sub>1</sub></sub>.</li>
	<li><code>OUTPUT &lang;address&rang;</code>: It prints the value of <code>&lang;address&rang;</code> to the output.</li>
	<li><code>ADD &lang;dest&rang; &lang;arg1&rang; &lang;arg2&rang;</code>: It puts the sum of the values referred by <code>&lang;arg1&rang;</code> and <code>&lang;arg2&rang;</code> to the memory cell specified by <code>&lang;dest&rang;</code>. In case of arithmetic overflow, the remainder of the result modulo 2<sup>32</sup> is stored in the destination. For example, <code>ADD @10 #4294967290 #10</code> sets M<sub>M<sub>10</sub></sub> to 4, and <code>ADD $20 @8 $9</code> sets M<sub>20</sub> to M<sub>M<sub>8</sub></sub> + M<sub>9</sub>.</li>
	<li><code>MULT &lang;dest&rang; &lang;arg1&rang; &lang;arg2&rang;</code>: It performs the multiplication similar to the <code>ADD</code> operation. It has the same behavior in case of arithmetic overflow.</li>
	<li><code>AND &lang;dest&rang; &lang;arg1&rang; &lang;arg2&rang;</code>: It puts the bit-wise AND of the values referred by <code>&lang;arg1&rang;</code> and <code>&lang;arg2&rang;</code> to the memory cell specified by <code>&lang;dest&rang;</code>. For example, <code>AND $15 $33 #7</code> puts the remainder of M<sub>33</sub> modulo 8 in M<sub>15</sub>.</li>
	<li><code>OR &lang;dest&rang; &lang;arg1&rang; &lang;arg2&rang;</code>: It applies the bit-wise OR similar to the AND operation. For example, <code>OR $121 $121 #1</code> increments M<sub>121</sub> if it is even.</li>
	<li><code>XOR &lang;dest&rang; &lang;arg1&rang; &lang;arg2&rang;</code>: It applies the bit-wise XOR similar to the AND operation. For example, <code>XOR @11 #52 #37</code> sets M<sub>M<sub>11</sub></sub> to 17.</li>
</ul>

<p>Except the <code>OUTPUT</code> operation, the first address given to all the operations must be direct or indirect addresses. Using the above operations, Jamshid wrote an assembly code for the machine. The code reads some numbers from the input and writes a single integer to the output (there is exactly one <code>OUTPUT</code> command in the program). Jamshid has executed the program with k different sets of inputs and saved the results. Later, he ran a formatting script on his code, but due to a bug in the script, some parts of the assembly program became corrupt. More&nbsp;specifically, the 5 arithmetic/bit-wise operations (<code>ADD</code>, <code>MULT</code>, <code>AND</code>, <code>OR</code>, and <code>XOR</code>) were replaced by 5 distinct ASCII characters <code>A</code>, <code>B</code>, <code>C</code>, <code>D</code>, <code>E</code>. The problem is that it&rsquo;s not clear which operation is represented by each ASCII character. Given the corrupted program together with the k input sets and their results, your job is to help Jamshid find the correspondence of the 5 assembly operations to the 5 ASCII characters.</p>

### 입력

<p>The input starts with the corrupted assembly program. Each line of the program contains a single command as specified before. The program contains at most 100 commands. It is guaranteed that the last command is the only output operation of the program. The next line contains the single integer k (1 ⩽ k ⩽ 100). Each of the next k lines is a space-separated sequence of integers specifying an execution log of the program. It is the sequence of input numbers given to the program appended by the program output. All numbers in the input are non-negative integers less than 2<sup>32</sup>.</p>

### 출력

<p>You should print a single integer in the first line of output denoting the different number of ways to assign the 5 assembly operations to the 5 ASCII characters. The result may be any number between 1 and 120. If the result is unique, you have to print the correspondence in the second line. It should be printed as a space-separated permutation of the operators <code>ADD</code>, <code>MULT</code>, <code>AND</code>, <code>OR</code>, and <code>XOR</code>, in the order which they are respectively replaced by the ASCII characters <code>A</code>, <code>B</code>, <code>C</code>, <code>D</code>, <code>E</code>.</p>