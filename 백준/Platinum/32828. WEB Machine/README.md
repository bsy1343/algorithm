# [Platinum III] WEB Machine - 32828

[문제 링크](https://www.acmicpc.net/problem/32828)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 37, 정답: 14, 맞힌 사람: 11, 정답 비율: 39.286%

### 분류

애드 혹, 정렬

### 문제 설명

<p>Tim has a machine for sorting balls, namely <em>WEB machine</em>. The WEB machine has a wheel with $n$ slots. Each slot may have a white ball (<code>W</code>), a blue ball (<code>B</code>), or it can be empty (<code>E</code>). Over a certain slot, the machine has a head to identify the status of the slot. The head can determine the color of the ball in the slot. It can also pick the ball in the slot or drop the ball into the slot. The head, however, can hold at most one ball at a time. The WEB machine can rotate the wheel of slots clockwise or counterclockwise. Fig. 1 shows an example of WEB machine.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32828.%E2%80%85WEB%E2%80%85Machine/ec1488d8.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32828-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 160px; height: 250px;"></p>

<p style="text-align: center;">Fig 1. An example of a WEB machine</p>

<p>The WEB machine operates according to the control instructions, namely <em>WEB instructions</em>, and one can write a program as a sequence of the WEB instructions. The set of WEB instructions and their meaning is defined as follows:</p>

<ul>
	<li><code>Pick</code>: picks up and holds the ball in the current slot under the head,</li>
	<li><code>Drop</code>: drops the ball of the head to the current slot,</li>
	<li><code>Left</code>: rotates the wheel clockwise by a slot,</li>
	<li><code>Right</code>: rotates the wheel counterclockwise by a slot,</li>
	<li><code>LeftStar</code> $C$: rotates the wheel clockwise while condition $C$ holds and returns the number of slots rotated,</li>
	<li><code>RightStar</code> $C$: rotates the wheel counterclockwise while condition $C$ holds and returns the number of slots rotated,</li>
	<li><code>Jump</code> $n$: jumps to the next $n$th instruction (If $n$ is $2$, the next instruction is skipped and the next of the next instruction is executed),</li>
	<li><code>Jump</code> $n$ <code>if</code> $C$: jumps to the next $n$th instruction if condition $C$ holds and do nothing otherwise,</li>
	<li>$X = E$: evaluates the expression $E$ and stores it to variable $X$, and</li>
	<li><code>Stop</code>: stops the machine.</li>
</ul>

<p>Executing <code>Pick</code> or <code>Drop</code>, the machine does nothing for improper conditions: the slot is empty while executing <code>Pick</code> or the slot is not empty while executing <code>Drop</code>. The variable $X$ should be a capital letter other than <code>W</code>, <code>E</code>, and <code>B</code>. The condition $C$ in <code>LeftStar</code> $C$, <code>RightStar</code> $C$, or <code>Jump</code> $n$ <code>if</code> $C$ is either one of <code>W</code>, <code>E</code>, <code>B</code>, and $X$ (a variable) or one of the negated forms (<code>!W</code>, <code>!E</code>, <code>!B</code>, and <code>!</code>$X$). The condition <code>W</code> implies that the ball in the current slot under the head is white, <code>B</code> does it is blue, and <code>E</code> does the slot is empty. The condition $X$ holds if $X$ is nonzero ($X \ne 0$). The negated condition holds if the unattributed condition does not hold, say <code>!E</code> is true when <code>E</code> does not hold. For instance, when executing <code>RightStar</code> <code>!E</code>, the head searches for an empty slot by rotating the wheel counterclockwise. As a result, there will be an empty slot under the head if the machine has at least one empty slot. The instruction incurs an infinite loop if the machine has no empty slot.</p>

<p>The number $n$ in unconditional jump (<code>Jump</code> $n$) and conditional jump (<code>Jump</code> $n$ <code>if</code> $C$) can be a negative integer. For instance, <code>Jump -1</code> branches to the previous instruction. Beware that you should not execute <code>Jump 0</code> which incurs an infinite loop.</p>

<p>The assignment instruction $X = E$ evaluates the integral expression $E$ and stores the value in variable $X$. The expression’s value is in the range between $-200$ and $+200$ inclusive ($|E| ≤ 200$). The expression can use any variable that has been defined before. For example, <code>K = K + 1</code> will increase the variable <code>K</code> by one if <code>K</code> is defined before; it is an error, otherwise. The expression can be a star instruction, either <code>LeftStar</code> or <code>RightStar</code>; the assignment will store the number of slots rotated in the target variable. For example, executing the following assignment:</p>

<pre>X = RightStar B</pre>

<p>on the machine of the state in Fig. 1 will make the state in Fig. 2, and the value of variable <code>X</code> will be two.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32828.%E2%80%85WEB%E2%80%85Machine/139fc509.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32828-2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 160px; height: 249px;"></p>

<p style="text-align: center;">Fig 2. After <code>RightStar</code> <code>B</code> is executed</p>

<p>As another example, the following code will restore the state in Fig. 1 from the state in Fig. 2:</p>

<pre>LeftStar !W
Right
Pick
Drop
Stop</pre>

<p>where the third and fourth instructions are listed to demonstrate the relationship between them; <code>Pick</code> and <code>Drop</code> are the inverse operations of one another.</p>

<p>Note that the expression cannot be nested, i.e. it can include at most one binary arithmetic operator (either <code>+</code> or <code>-</code>) or the star instruction. From the arithmetic operators, only the addition (<code>+</code>) and subtraction (<code>-</code>) operators are allowed; the multiplication, division, and modulus operators are invalid in the WEB expressions. The assignment and arithmetic operators should be separated from their operands by space. A space should not follow the sign symbol for an integer literal, say “<code>-12</code>” is valid but “<code>- 12</code>” is not.</p>

<p>Tim wants to sort the balls in the WEB machine using a WEB program, a sequence of WEB instructions ending with <code>Stop</code>. Initially, the balls are mixed in any order though they are grouped in the wheel. Tim wants the balls to be sorted into a group of white balls and blue ones separated by a group of empty slots reading clockwise starting from the head. Though the groups of balls are separated by a group of empty slots clockwise, they are not separated counterclockwise since they are in the wheel of the machine. Let’s help Tim by writing a sequence of WEB instructions to make the balls in the wheel sorted in <code>W</code>, <code>E</code>, and <code>B</code> order reading clockwise starting from the head.</p>

<p>The WEB program consists of several lines, each of which contains a single WEB instruction. Therefore, the above WEB programs are valid, but the following one is invalid, i.e. a syntax error:</p>

<pre>RightStar E X
= 10 + 2</pre>

<p>since the assignment is spanned over two lines; the first instruction has an extra variable at the end and the second instruction is missing the target variable of the assignment.</p>

<p>Make a WEB program to sort the balls as Tim wanted and submit the WEB program. Your WEB program should convert the initial configuration of a WEB machine into the final one with the balls sorted by color and must end with <code>Stop</code>. The initial configuration is given as input and the final one is given as output. In the initial configuration, assume that the wheel of the WEB machine has at least two empty slots. <strong>Initially, all empty slots are grouped in a sequence over the slots.</strong> Assume also that the machine has at least one white ball and one blue ball. In the final configuration, the white and blue balls should be separated by a sequence of empty slots with the head located over the leftmost white ball assuming the clockwise reading of the slots.</p>

### 입력



### 출력

