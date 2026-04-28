# [Gold III] Agents - 8052

[문제 링크](https://www.acmicpc.net/problem/8052)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 50, 정답: 12, 맞힌 사람: 10, 정답 비율: 45.455%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Because of the latest mishaps of their agents, Central Intelligence Agency of Byteland resolved to improve their activity. So far the biggest trouble has been a preparation of safe meetings of agents. Your program has to help in solving this. For a given description of the net of roads in Byteland and the initial positions of two agents, it should answer if their safe meeting is possible.</p>

<p>To consider a meeting safe the agents must hold to the following precautions:</p>

<ul>
	<li>the agents move during the day and the meetings take place at evening,</li>
	<li>an agent must change his place of stay each day,</li>
	<li>the agents can travel only along the roads connecting cities (unfortunately another encuberance is that in Byteland, there are one-way roads),</li>
	<li>an agent cannot move too fast (it could look very suspicious) - during one day he cannot travel farther than to a neighbouring city),</li>
	<li>the distance between two connected cities is so short, that an agent setting off from one city in the morning will reach another one before evening,</li>
	<li>a meeting is said to be done if two agents are in the same city at the same evening.</li>
</ul>

<p>
Write a program which:</p>

<ul>
	<li>reads the number of cities and the description of the net of roads in Byteland and the starting positions of agents from the standard input,</li>
	<li>checks if there is a safe meeting, and if so, then how many days it takes to arrange it,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input, there are two integers a<sub>1</sub> and a<sub>2</sub> separated by a single space, where 1 &le; n &le; 250, 0 &le; m &le; n*(n-1).</p>

<p>In the second line there are two integers &nbsp;and &nbsp;separated by a single space, 1 &le; a<sub>1</sub>, a<sub>2</sub> &le; n and a<sub>1</sub>&ne;a<sub>2</sub>, denoting respectively the starting positions of agents No 1 and No 2.</p>

<p>In the m following lines there are pairs of natural numbers a and b separated by single spaces, 1 &le; a,b &le; n and a&ne;b, denoting that there is a road from city a to city b.</p>

### 출력

<p>There should be exactly one line in the standard input and it should contain:</p>

<ul>
	<li>exactly one positive integer which is the minimal time (in days) needed to arrange a safe meeting of two agents - if such meeting is possible,</li>
	<li>a word NIE (which is NO in Polish) - if such meeting is not possible.</li>
</ul>