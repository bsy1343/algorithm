# [Gold V] Rhythm Flow - 32506

[문제 링크](https://www.acmicpc.net/problem/32506)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 71, 정답: 42, 맞힌 사람: 41, 정답 비율: 66.129%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You are designing a scoring algorithm for the new hit rhythm game <em>Rhythm Flow</em> where players must press a button in time to the music. During a round of Rhythm Flow, there are points in time when a visual indicator flashes on the screen. Players are <em>expected</em> to press the button at those times (and only at those times). However, since human reaction time is not instantaneous, the game gives the player some leeway and accepts a button press a few milliseconds earlier or later than expected. More accurate presses are worth more points.</p>

<p>The following table lists how many points a player gets depending on how far away the <em>actual</em> button press is from the <em>expected</em> button press, in milliseconds:</p>

<table class="table table-bordered table-center-30">
	<tbody>
		<tr>
			<td>Time Difference (ms)</td>
			<td>Points</td>
		</tr>
		<tr>
			<td>$[0,15]$</td>
			<td>7</td>
		</tr>
		<tr>
			<td>$(15,23]$</td>
			<td>6</td>
		</tr>
		<tr>
			<td>$(23,43]$</td>
			<td>4</td>
		</tr>
		<tr>
			<td>$(43,102]$</td>
			<td>2</td>
		</tr>
	</tbody>
</table>

<p>Wildly inaccurate presses with a difference of $103$ milliseconds or more score no points.</p>

<p>During gameplay, the player presses the button some number of times. To score the game, match each actual button press with at most one expected button press, with the following restriction: if one actual button press happens before another actual button press and both button presses are matched with expected button presses, then the expected button press for the first must be strictly before the expected button press for the second.</p>

<p>Because you are generous, you decide to compute the matching that maximizes the number of points the player earns. Compute the final score of the round of Rhythm Flow under this matching.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ ($1≤n,m≤2\,000$), where $n$ is the number of expected button presses and $m$ is the number of actual button presses.</p>

<p>Each of the next $n$ lines contains a single integer $e$ ($1≤e≤10^9$). These are the times of the expected button presses in milliseconds from the start of the round. It is guaranteed that these values are unique and in sorted order.</p>

<p>Each of the next $m$ lines contains a single integer $a$ ($1≤a≤10^9$). These are the times of the actual button presses in milliseconds from the start of the round. It is guaranteed that these values are unique and in sorted order.</p>

### 출력

<p>Output a single integer: the total number of points the player earns given a maximally-generous scoring engine.</p>