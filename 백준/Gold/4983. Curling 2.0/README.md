# [Gold IV] Curling 2.0 - 4983

[문제 링크](https://www.acmicpc.net/problem/4983)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 50, 정답: 28, 맞힌 사람: 22, 정답 비율: 57.895%

### 분류

구현, 그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 시뮬레이션, 깊이 우선 탐색, 백트래킹

### 문제 설명

<p>On Planet MM-21, after their Olympic games this year, curling is getting popular. But the rules are somewhat different from ours. The game is played on an ice game board on which a square mesh is marked. They use only a single stone. The purpose of the game is to lead the stone from the start to the goal with the minimum number of moves.</p>

<p>Fig. D-1 shows an example of a game board. Some squares may be occupied with blocks. There are two special squares namely the start and the goal, which are not occupied with blocks. (These two squares are distinct.) Once the stone begins to move, it will proceed until it hits a block. In order to bring the stone to the goal, you may have to stop the stone by hitting it against a block, and throw again.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4983.%E2%80%85Curling%E2%80%852.0/e61a8250.gif" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4983.%E2%80%85Curling%E2%80%852.0/e61a8250.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4983/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:220px; width:216px" /></p>

<p style="text-align:center">Fig. D-1: Example of board (S: start, G: goal)</p>

<p>The movement of the stone obeys the following rules:</p>

<ul>
	<li>At the beginning, the stone stands still at the start square.</li>
	<li>The movements of the stone are restricted to x and y directions. Diagonal moves are prohibited.</li>
	<li>When the stone stands still, you can make it moving by throwing it. You may throw it to any direction unless it is blocked immediately(Fig. D-2(a)).</li>
	<li>Once thrown, the stone keeps moving to the same direction until one of the following occurs:
	<ul>
		<li>The stone hits a block (Fig. D-2(b), (c)).
		<ul>
			<li>The stone stops at the square next to the block it hit.</li>
			<li>The block disappears.</li>
		</ul>
		</li>
		<li>The stone gets out of the board.
		<ul>
			<li>The game ends in failure.</li>
		</ul>
		</li>
		<li>The stone reaches the goal square.
		<ul>
			<li>The stone stops there and the game ends in success.</li>
		</ul>
		</li>
	</ul>
	</li>
	<li>You cannot throw the stone more than 10 times in a game. If the stone does not reach the goal in 10 moves, the game ends in failure.</li>
</ul>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4983.%E2%80%85Curling%E2%80%852.0/909887cc.gif" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4983.%E2%80%85Curling%E2%80%852.0/909887cc.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4983/2.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:166px; width:579px" /></p>

<p style="text-align:center">Fig. D-2: Stone movements</p>

<p>Under the rules, we would like to know whether the stone at the start can reach the goal and, if yes, the minimum number of moves required.</p>

<p>With the initial configuration shown in Fig. D-1, 4 moves are required to bring the stone from the start to the goal. The route is shown in Fig. D-3(a). Notice when the stone reaches the goal, the board configuration has changed as in Fig. D-3(b).</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4983.%E2%80%85Curling%E2%80%852.0/7983c80d.gif" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4983.%E2%80%85Curling%E2%80%852.0/7983c80d.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4983/3.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:215px; width:453px" /></p>

<p style="text-align:center">Fig. D-3: The solution for Fig. D-1 and the final board configuration&nbsp;</p>

### 입력

<p>The input is a sequence of datasets. The end of the input is indicated by a line containing two zeros separated by a space. The number of datasets never exceeds 100.</p>

<p>Each dataset is formatted as follows.</p>

<pre>
the width(=w) and the height(=h) of the board 
First row of the board 
... 
h-th row of the board 
</pre>

<p>The width and the height of the board satisfy: 2 &lt;= w &lt;= 20, 1 &lt;= h &lt;= 20.&nbsp;</p>

<p>Each line consists of w decimal numbers delimited by a space. The number describes the status of the corresponding square.</p>

<pre>
0	vacant square
1	block
2	start position
3	goal position
</pre>

<p>The dataset for Fig. D-1 is as follows:</p>

<pre>
6 6 
1 0 0 2 1 0 
1 1 0 0 0 0 
0 0 0 0 0 3 
0 0 0 0 0 0 
1 0 0 0 0 1 
0 1 1 1 1 1 
</pre>

### 출력

<p>For each dataset, print a line having a decimal integer indicating the minimum number of moves along a route from the start to the goal. If there are no such routes, print -1 instead. Each line should not have any character other than this number.</p>