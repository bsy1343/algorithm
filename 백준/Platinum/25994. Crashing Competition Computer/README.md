# [Platinum IV] Crashing Competition Computer - 25994

[문제 링크](https://www.acmicpc.net/problem/25994)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 85, 정답: 53, 맞힌 사람: 50, 정답 비율: 63.291%

### 분류

수학, 다이나믹 프로그래밍, 확률론

### 문제 설명

<p>You are writing code for a hackathon where you need to decode Binary ALGOL Punch Cards. You have already come up with the optimal solution and only need to type it out. The solution consists of $c$ characters, and your typing speed is $1$ character per time unit. However, your computer is prone to sudden crashes: after every character you type there is a probability of $p$ that your computer crashes and you need to start over again. Recovering after a crash costs $r$ time units, and you can then continue typing from the last point where you saved your code.</p>

<p>You can click &quot;Save&quot; at any time (which costs $t$ time units) to save your code and to be able to restart from this point after crashes. Clicking &quot;Save&quot; will not cause your computer to crash.</p>

<p>Determine how many (expected) time units you need to complete the code. Note that the code should be saved after typing the last character.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with three integers $c$, $t$, and $r$ ($1 \leq c \leq 2000$, $0 \leq t, r \leq 10^9$), indicating the number of characters, the time cost of clicking &quot;Save&quot;, and the time cost of recovering after a crash.</li>
	<li>One line with a floating-point number $p$ ($0.001 \leq p \leq 0.999$, with at most $10$ digits after the decimal point), the probability that your computer crashes after a character press.</li>
</ul>

### 출력

<p>Output the expected number of time units you need to complete the code.</p>

<p>Your answer should have an absolute or relative error of at most $10^{-6}$.</p>