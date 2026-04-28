# [Gold V] Interpreter - 4385

[문제 링크](https://www.acmicpc.net/problem/4385)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 180, 정답: 75, 맞힌 사람: 64, 정답 비율: 47.761%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>A certain computer has 10 registers and 1000 words of RAM. Each register or RAM location holds a 3-digit integer between 0 and 999. Instructions are encoded as 3-digit integers and stored in RAM. The encodings are as follows:</p>

<ul>
	<li>100 means halt</li>
	<li>2dn means set register d to n (between 0 and 9)</li>
	<li>3dn means add n to register d</li>
	<li>4dn means multiply register d by n</li>
	<li>5ds means set register d to the value of register s</li>
	<li>6ds means add the value of register s to register d</li>
	<li>7ds means multiply register d by the value of register s</li>
	<li>8da means set register d to the value in RAM whose address is in register a</li>
	<li>9sa means set the value in RAM whose address is in register a to the value of register s</li>
	<li>0ds means goto the location in register d unless register s contains 0</li>
</ul>

<p>All registers initially contain 000. The initial content of the RAM is read from standard input. The first instruction to be executed is at RAM address 0. All results are reduced modulo 1000.</p>

### 입력

<p>The input to your program consists of up to 1000 3-digit unsigned integers, representing the contents of consecutive RAM locations starting at 0. Unspecified RAM locations are initialized to 000.</p>

### 출력

<p>The output from your program is a single integer: the number of instructions executed up to and including the halt instruction. You may assume that the program does halt.</p>

<p>You may assume that the program halts in at most 100,000 instructions.</p>