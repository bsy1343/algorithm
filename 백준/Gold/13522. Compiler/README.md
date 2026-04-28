# [Gold II] Compiler - 13522

[문제 링크](https://www.acmicpc.net/problem/13522)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 77, 정답: 30, 맞힌 사람: 19, 정답 비율: 34.545%

### 분류

애드 혹, 백트래킹, 브루트포스 알고리즘, 다이나믹 프로그래밍, 그래프 이론

### 문제 설명

<p>One thing almost all computers have in common, whether it is a simple stack-based calculator, a&nbsp;6502 powered BBC Micro, or a brand new Android phone, every modern computer requires&nbsp;programs that turn either high-level languages or assembly language into machine code.</p>

<p>UKIEPC recently designed their own processor. While very easy to load programs onto, it is not&nbsp;as complex as some, since it has only one aim: show a number on an innovative laser display&nbsp;board!</p>

<p>The available memory consists of three 8-bit registers: A, X, and Y, plus an infinite stack. At&nbsp;program start these registers are initialised to unknown values, and the stack is empty.</p>

<p>The processor supports six unique instructions:</p>

<ul>
	<li>PH &lt;reg&gt;: push the contents of the register (i.e. A, X, or Y) onto the stack.</li>
	<li>PL &lt;reg&gt;: pop a value off the stack into the register. The program will terminate if this instruction is called when the stack is empty.</li>
	<li>AD: pop two values off the stack, and push the lowest 8 bits of their sum onto the stack.</li>
	<li>ZE &lt;reg&gt;: set the register equal to zero.</li>
	<li>ST &lt;reg&gt;: set the register equal to one.</li>
	<li>DI &lt;reg&gt;: send the value of the register to the laser display board and exit.</li>
</ul>

<p>Due to memory constraints, the maximum number of instructions that can be written to disk is&nbsp;40. Further instructions will not be executed.</p>

<p>Given a number, write a program to output the number on the laser display board.</p>

### 입력

<ul>
	<li>One line containing an integer N (0 &le; N &le; 255), the number to output.</li>
</ul>

### 출력

<ul>
	<li>At most 40 lines, each containing one valid instruction.</li>
</ul>

<p>When run in sequence the lines should output the number N. The last instruction should&nbsp;be a DI.</p>