# [Gold IV] Worst Case Scenario - 9432

[문제 링크](https://www.acmicpc.net/problem/9432)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 11, 맞힌 사람: 11, 정답 비율: 44.000%

### 분류

그래프 이론, 그래프 탐색

### 문제 설명

<p>The disease is spreading quickly, and the government has requested a map of infected regions. They would like to see what certain regions would look like, worst-case scenario, given some series of events. There are four stages of infection that the feds are interested in.</p>

<ul>
	<li>Stage A
	<ul>
		<li>The infection has not yet reached this zone. It is still possible for such zones to advance in infection stage due to an infection event.</li>
	</ul>
	</li>
	<li>Stage B
	<ul>
		<li>This zone is in the early stages of infection. There are reports of erratic behavior in individual citizens, quarantines are starting, and the municipal authorities still have things under control.</li>
	</ul>
	</li>
	<li>Stage C
	<ul>
		<li>This zone is dealing with mobs of zombies in a few areas. Quarantines are occurring on the scale of towns and small cities. The infection is contained to the zone but growing out of control.</li>
	</ul>
	</li>
	<li>Stage D
	<ul>
		<li>This zone has lost control of its borders. It is only a matter of time before the infection spreads to neighboring zones.</li>
	</ul>
	</li>
</ul>

<p>An infection event is anything that causes a zone to advance towards a higher stage of infection. This is usually the result of a quarantine breach, virus mutation, or biological terrorism. When an infection event occurs in a zone, it will, worst-cast scenario, cause the zone to advance in stage. A zone in stage D cannot advance in stage any further and will, worst-case scenario, result in an outbreak for each additional infection event it experiences. When an outbreak occurs, all neighboring zones experience an additional infection event. An outbreak can cause a chain reaction of outbreaks, but an outbreak can only cause a maximum of one outbreak in each zone.</p>

<p>Zones marked with an X character are impassible and unpopulated areas that cannot become infected. An adjacent zone is one zone above, below, to the left, or to the right on the grid of zones. During an outbreak, the infection cannot spread diagonally.</p>

<p>You will receive a grid of zones with their starting stages and a sequence of infection events with the coordinates of the zones in which they occur. Each infection event should be processed before calculating the result of the next infection event.</p>

### 입력

<p>The first line of input will contain the number of test cases, N (1 &lt;= N &lt;= 50). Each test case will begin with a line giving the width, W (1 &lt;= W &lt;= 100) and height, H (1 &lt;= H &lt;= 100) of the grid, followed by the grid itself. Each zone in the grid will be marked by the stage that the zone is currently in, or the character X if the zone is impassable.</p>

<p>Following the grid will be a line with the number of infection events I (0 &lt;= I &lt;= 1000). I lines will follow each giving an X and Y coordinate of a zone. Each line represents an infection event that occurs on the Xth column (the left most column being X = 0) and the Yth row (the top row being Y = 0).</p>

### 출력

<p>Your output should show each grid with its states if the worst-case scenario occurs.</p>