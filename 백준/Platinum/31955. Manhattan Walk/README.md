# [Platinum III] Manhattan Walk - 31955

[문제 링크](https://www.acmicpc.net/problem/31955)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB (추가 메모리 없음)

### 통계

제출: 48, 정답: 44, 맞힌 사람: 43, 정답 비율: 91.489%

### 분류

수학, 다이나믹 프로그래밍, 확률론

### 문제 설명

<p>It&#39;s a grid system! You begin at the top left corner and want to walk to the bottom right corner. Every location is at integer coordinates, and has an arrow pointing down or right and a timer that, every few seconds, flips the arrow from down to right, or from right to down. When you begin your walk, every arrow is pointing down or right with equal probability, and every timer has a real value chosen uniformly in the range from zero to its maximum wait time.</p>

<p>At any moment in time, if you are at a given location, you can:</p>

<ul>
	<li>Move down one location if the new location is on the grid and the arrow is pointing down.</li>
	<li>Move right one location if the new location is on the grid and the arrow is pointing right.</li>
	<li>Wait for the timer to finish its countdown so that the arrow flips from down to right, or from right to down.</li>
</ul>

<p>When you arrive at a new location, you are able to see the timer and can therefore take that into account when deciding which action to take. However, you are not able to look ahead---you can only see the timer and arrow for the exact grid point you occupy. You hate waiting, and want to minimize the total amount of time you&#39;re waiting for an arrow to flip.</p>

<p>What is the expected amount of time you have to wait if you make decisions optimally?</p>

### 입력

<p>The single line of input contains three integers $r$, $c$ ($1 \leq r, c \leq 10^3$), and $p$ ($1 \leq p \leq 10^9$), where $r$ is the number of rows in the grid, $c$ is the number of columns in the grid, and $p$ is the maximum value a timer can show.</p>

### 출력

<p>Output a single number, which is the expected time you have to wait if you make optimal decisions. Your answer will be accepted if the absolute or relative error is within $10^{-6}$ of the judge&#39;s answer.</p>