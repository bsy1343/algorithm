# [Gold III] The Game - 6339

[문제 링크](https://www.acmicpc.net/problem/6339)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 9, 맞힌 사람: 8, 정답 비율: 50.000%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로, 데이크스트라

### 문제 설명

<p>One morning, you wake up and think: &quot;I am such a good programmer. Why not make some money?&quot; So you decide to write a computer game.</p>

<p>The game takes place on a rectangular board consisting of &nbsp;w &times;&nbsp;h&nbsp;squares. Each square might or might not contain a game piece, as shown in the picture.</p>

<p>One important aspect of the game is whether two game pieces can be connected by a path which satisfies the two following properties:</p>

<ol>
	<li>It consists of straight segments, each one being either horizontal or vertical.</li>
	<li>It does not cross any other game pieces.</li>
</ol>

<p>It is allowed that the path leaves the board temporarily.</p>

<p>Here is an example:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6339.%E2%80%85The%E2%80%85Game/826f73cd.png" data-original-src="https://www.acmicpc.net/upload/images2/game.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:200px; width:189px" /></p>

<p>The game pieces at (1,3) and at (4, 4) can be connected. The game pieces at (2, 3) and (3, 4) cannot be connected; each path would cross at least one other game piece.</p>

<p>The part of the game you have to write now is the one testing whether two game pieces can be connected according to the rules above.</p>

### 입력

<p>The input file contains descriptions of several different game situations. The first line of each description contains two integers w and h (1 &le; w, h &le; 75), the width and the height of the board. The next h lines describe the contents of the board; each of these lines contains exactly w characters: a &quot;X&quot; if there is a game piece at this location, and a space if there is no game piece.</p>

<p>Each description is followed by several lines containing four integers x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub> each satisfying 1 &le; x<sub>1</sub>, x<sub>2</sub> &le; w, 1 &le; y<sub>1</sub>, y<sub>2</sub>&nbsp;&le;&nbsp;h. These are the coordinates of two game pieces. (The upper left corner has the coordinates (1, 1).) These two game pieces will always be different. The list of pairs of game pieces for a board will be terminated by a line containing &quot;0 0 0 0&quot;.</p>

<p>The entire input is terminated by a test case starting with w=h=0. This test case should not be procesed.</p>

### 출력

<p>For each board, output the line &quot;Board #n:&quot;, where n is the number of the board. Then, output one line for each pair of game pieces associated with the board description. Each of these lines has to start with &quot;Pair m: &quot;, where m is the number of the pair (starting the count with 1 for each board). Follow this by &quot;k segments.&quot;, where k is the minimum number of segments for a path connecting the two game pieces, or &quot;impossible.&quot;, if it is not possible to connect the two game pieces as described above.</p>

<p>Output a blank line after each board.</p>