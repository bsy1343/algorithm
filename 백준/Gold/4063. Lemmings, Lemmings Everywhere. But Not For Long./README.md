# [Gold IV] Lemmings, Lemmings Everywhere. But Not For Long. - 4063

[문제 링크](https://www.acmicpc.net/problem/4063)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 7, 맞힌 사람: 6, 정답 비율: 60.000%

### 분류

구현, 그래프 이론, 그래프 탐색, 시뮬레이션

### 문제 설명

<p>On an n &times; m board there is a lemming on each square. Every second, the lemmings try to move either north, south, east or west, according to rules which are explained below. To determine which direction to move in, each lemming has an agenda, which is an ordering of the four possible directions (for example, one possible agenda might be NWES). The rules for lemming movement are the following:</p>

<ol>
	<li>Initially each lemming sets its direction of movement D to the first direction in its agenda.</li>
	<li>At each time step, each lemming tries to move in its direction D. Three things can happen to lemming L:
	<ol style="list-style-type:lower-alpha">
		<li>If L&rsquo;s current direction D causes it to move off the board, then the world has one less lemming in it. Otherwise, L&rsquo;s target destination will be to another square.</li>
		<li>If L&rsquo;s target square is empty or about to become empty as a result of another lemming leaving it, and no other lemming wants to move to the same square, then L moves into its target square. In this case, the lemming will use the same direction D in the next time step.</li>
		<li>Otherwise, if another lemming is trying to move into L&rsquo;s target square, or if the target square contains a lemming which cannot move, then L stays put. In this case, it will update its D by going to the next direction in its agenda (wrapping around to the beginning if necessary).</li>
	</ol>
	</li>
</ol>

<p>Two lemmings which want to exchange squares can do so, unless of course some other lemming is trying to move into one of their two squares (in which case all three of the lemmings would stay in their current squares). Lemmings being lemmings, they continue to move until all of them have moved off the board. Your job is to determine how long that takes.</p>

### 입력

<p>Input will consist of multiple test cases. Each test case will consist of multiple lines. The first line will contain two positive integers n m, specifying the number of rows and columns in the board. The maximum value for each of these is 100. The board is situated so that square (0, 0) is in the southwest corner, and square (0,m &minus; 1) is in the southeast corner. Following this will be several rows containing the agendas for the nm lemmings. Each agenda will be a permutation of the string NESW. There will be 16 agendas on each line (except perhaps the last), with a single space between each. The agendas are assigned row-wise to the lemmings, so that the first agenda is associated with the lemming on square (0, 0), the second with the lemming on square (0, 1), and so on. The last case will be followed by the line 0 0 which will terminate input.</p>

### 출력

<p>For each test case, output a single line containing the case number (using the format shown below) followed by the number of steps it takes until the last lemming(s) falls off the board. Use only single spaces to separate items on a line.</p>