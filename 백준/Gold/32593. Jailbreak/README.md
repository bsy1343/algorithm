# [Gold III] Jailbreak - 32593

[문제 링크](https://www.acmicpc.net/problem/32593)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 10, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

격자 그래프, 그래프 이론, 그래프 탐색, 깊이 우선 탐색, 너비 우선 탐색

### 문제 설명

<p>You are one of the greatest computer scientists of the 21st century, and just discovered a polynomial-time algorithm for integer factorization. Unfortunately, the secret service noticed your work. They confiscated the algorithm and put you in an underground jail, the Federal Prison for Criminals. You are determined to escape, publish your findings,<sup>1</sup> and seek justice.</p>

<p>The only exits in the jail through which you can escape are in the top storey of the jail, while you currently are in the leftmost cell of the bottom storey in the jail, $h$ storeys below the ground. To climb up through holes in the ceiling, you need a ladder. However, since you have practiced breaking a fall, and there are no two holes directly below each other, you can jump down through a hole without a ladder. Given the layout of the jail, determine whether it is possible to escape the jail.</p>

<p>The ladders can be found in the jail. You cannot carry another ladder up or down through a hole, or retrieve a ladder from a different storey, but you can carry them to different cells on the same (wall-enclosed) part of the same storey. You can jump over (arbitrarily many) holes in the floor/ceiling.</p>

<p>As an example, consider the first sample input. You can use the ladder next to you to go up one storey. Then you cannot go up again: although there is a hole, you have no ladder. But you can go down and then up twice, and finally escape.</p>

<hr>
<p><sup>1</sup>No worries: while the algorithm runs in polynomial time, it is not fast in practice.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $w$ and $h$ ($3 \leq w \leq 10^5$, $1 \leq h \leq 10^5$, $w\cdot h \leq 3 \cdot 10^5$), the width and height of the jail.</li>
	<li>$2h+1$ lines with $w$ characters:
	<ul>
		<li>On odd-numbered lines, the characters are either '<code>-</code>'  or '<code>.</code>', representing the ceiling or a hole in the ceiling, respectively. The last line will only contain '<code>-</code>', to represent the floor.</li>
	</ul>
	</li>
	<li>On even-numbered lines, the characters are either '<code>|</code>', '<code>.</code>', or '<code>L</code>', representing a wall, an empty space, or a ladder, respectively. The first and last character will always be a wall.</li>
</ul>

<p>It is guaranteed that there is not a wall in the cell in a storey (even-numbered line) directly above and below a hole in a ceiling (odd-numbered line). It is guaranteed that there are no two holes in the ceilings directly below each other. It is guaranteed that the starting cell (bottom left cell) is not a wall.</p>

### 출력

<p>If it is possible to escape the jail, output "<code>possible</code>". Otherwise, output "<code>impossible</code>".</p>