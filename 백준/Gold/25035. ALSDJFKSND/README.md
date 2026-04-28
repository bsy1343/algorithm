# [Gold II] ALSDJFKSND - 25035

[문제 링크](https://www.acmicpc.net/problem/25035)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 11, 맞힌 사람: 11, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 게임 이론, 물리학

### 문제 설명

<p>Alice and Bob are playing the two-player computer game called ALSDJFKSND. In this game, there is a ball on the screen. Initially, the ball is located at $x$ metres westward from the goal. Its initial velocity is $v$ metres per second eastward, and its acceleration is zero for the first one second. At $t$ seconds after the game begins, where $t$ is a positive integer,</p>

<ul>
	<li>If $t$ is odd, then it&#39;s Alice&#39;s turn.</li>
	<li>If $t$ is even, then it&#39;s Bob&#39;s turn.</li>
</ul>

<p>Each player should press either <code>A</code> or <code>B</code> immediately at their turn.</p>

<ul>
	<li>If <code>A</code> is pressed, then the ball&#39;s acceleration is set to zero for one second from that time.</li>
	<li>If <code>B</code> is pressed, then the ball&#39;s acceleration is set to $a$ metres per second squared eastward for one second from that time.</li>
</ul>

<p>A player loses and the game finishes when the ball is located at the goal or in the east of the goal at their turn. Assume that each player uses their optimal strategy to win. You want to help Alice win. Determine whether Alice can win or not, possibly depending on Alice&#39;s first move.</p>

<p>Write a function <u><code>ALSDJFKSND</code></u>:</p>

<ul>
	<li>input parameter: three <code>int</code>-type objects whose values are $x$, $v$, and $a$, respectively, where $0&lt;v&lt;x\le100$ and $0&lt;a\le 100$</li>
	<li>return value: the <code>str</code>-type object of length 1
	<ul>
		<li>return <code>A</code> if Alice can win only when Alice presses <code>A</code> at their first turn.</li>
		<li>return <code>B</code> if Alice can win only when Alice presses <code>B</code> at their first turn.</li>
		<li>return <code>C</code> if Alice can win in both cases.</li>
		<li>return <code>D</code> if Alice can win in neither case.</li>
	</ul>
	</li>
</ul>

### 입력



### 출력

