# [Platinum III] Painters' Duel - 23919

[문제 링크](https://www.acmicpc.net/problem/23919)

### 성능 요약

시간 제한: 40 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 8, 맞힌 사람: 8, 정답 비율: 50.000%

### 분류

구현, 그래프 이론, 백트래킹, 재귀

### 문제 설명

<p>A new art museum is about to open! It is a single-story building in the shape of a large equilateral triangle. That triangle is made up of many smaller identical equilateral-triangle-shaped rooms, and the side length of the museum is&nbsp;<b>S</b>&nbsp;times the side length of any one of the rooms. Each room has doors connecting it to all other rooms with which it shares a side (not just a vertex).</p>

<p>Each room is identified by two numbers: the row of the building it is in (counting from top to bottom, starting from 1), followed by its position within that row (counting from left to right, starting from 1). Here is an example of how the rooms are connected and labeled when&nbsp;<b>S</b>&nbsp;= 3:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/592b3162-f3b5-4c56-a5b7-65b89083f0ef/-/preview/" /></p>

<p>Alma and Berthe are artists who are painting the rooms of the museum. Alma starts in the room (<b>R<sub>A</sub></b>,&nbsp;<b>P<sub>A</sub></b>), and Berthe starts in a different room (<b>R<sub>B</sub></b>,&nbsp;<b>P<sub>B</sub></b>). Each of them has already painted their starting room.&nbsp;<b>C</b>&nbsp;of the other rooms of the museum are under construction, and neither Alma nor Berthe is allowed to enter these rooms or paint them.</p>

<p>Alma and Berthe are having a friendly competition and playing a turn-based game, with Alma starting first. On a painter&#39;s turn, if their current room is adjacent to at least one unpainted room that is not under construction, the painter must choose one of those rooms, move to it, and paint it. Otherwise, the painter cannot move and does nothing on their turn. Once both painters are unable to move, the game is over. The score of the game is the number of rooms painted by Alma minus the number of rooms painted by Berthe.</p>

<p>Both painters make optimal decisions, with Alma trying to maximize the score and Berthe trying to minimize the score. Given this, determine the best score Alma can guarantee for the game, regardless of what Berthe does.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each case begins with one line containing six integers&nbsp;<b>S</b>,&nbsp;<b>R<sub>A</sub></b>,&nbsp;<b>P<sub>A</sub></b>,&nbsp;<b>R<sub>B</sub></b>,&nbsp;<b>P<sub>B</sub></b>, and&nbsp;<b>C</b>. Respectively, these are the side length of the museum (as a multiple of the side length of a room), the row and position of Alma&#39;s starting room, the row and position of Berthe&#39;s starting room, and the number of rooms that are under construction. Then, there are&nbsp;<b>C</b>&nbsp;more lines. The i-th of these lines (counting starting from 1) contains two integers&nbsp;<b>R<sub>i</sub></b>&nbsp;and&nbsp;<b>P<sub>i</sub></b>, representing the row and position of the i-th room that is under construction.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the best score that Alma can guarantee for the game, as described above.</p>

### 제한

<ul>
	<li>0 &le;&nbsp;<b>C</b>&nbsp;&le;&nbsp;<b>S</b><sup>2</sup>&nbsp;- 2.</li>
	<li>1 &le;&nbsp;<b>R<sub>A</sub></b>&nbsp;&le;&nbsp;<b>S</b>.</li>
	<li>1 &le;&nbsp;<b>P<sub>A</sub></b>&nbsp;&le; 2 &times;&nbsp;<b>R<sub>A</sub></b>&nbsp;- 1.</li>
	<li>1 &le;&nbsp;<b>R<sub>B</sub></b>&nbsp;&le;&nbsp;<b>S</b>.</li>
	<li>1 &le;&nbsp;<b>P<sub>B</sub></b>&nbsp;&le; 2 &times;&nbsp;<b>R<sub>B</sub></b>&nbsp;- 1.</li>
	<li>(<b>R<sub>A</sub></b>,&nbsp;<b>P<sub>A</sub></b>) &ne; (<b>R<sub>B</sub></b>,&nbsp;<b>P<sub>B</sub></b>).</li>
	<li>1 &le;&nbsp;<b>R<sub>i</sub></b>&nbsp;&le;&nbsp;<b>S</b>, for all i.</li>
	<li>1 &le;&nbsp;<b>P<sub>i</sub></b>&nbsp;&le; 2 &times;&nbsp;<b>R<sub>i</sub></b>&nbsp;- 1, for all i.</li>
	<li>(<b>R<sub>i</sub></b>,&nbsp;<b>P<sub>i</sub></b>) &ne; (<b>R<sub>A</sub></b>,&nbsp;<b>P<sub>A</sub></b>), for all i.</li>
	<li>(<b>R<sub>i</sub></b>,&nbsp;<b>P<sub>i</sub></b>) &ne; (<b>R<sub>B</sub></b>,&nbsp;<b>P<sub>B</sub></b>), for all i.</li>
	<li>Either&nbsp;<b>R<sub>i</sub></b>&nbsp;&lt;&nbsp;<b>R<sub>i+1</sub></b>, or&nbsp;<b>R<sub>i</sub></b>&nbsp;=&nbsp;<b>R<sub>i+1</sub></b>&nbsp;and&nbsp;<b>P<sub>i</sub></b>&nbsp;&lt;&nbsp;<b>P<sub>i+1</sub></b>, for all i &lt;&nbsp;<b>C</b>.</li>
</ul>

### 힌트

<p>In Sample Case #1, the turns must proceed as follows:</p>

<ol>
	<li>Alma moves to room (2, 2).</li>
	<li>Berthe cannot move.</li>
	<li>Alma moves to room (2, 3).</li>
	<li>Berthe still cannot move.</li>
	<li>Alma cannot move. Since neither painter can move, the game is now over.</li>
</ol>

<p>Alma has painted 3 rooms and Berthe has painted 1 room, so the score is 3 - 1 = 2.</p>

<p>In Sample Case #2, neither painter can move. They only paint their starting rooms.</p>

<p>The following additional cases could not appear in Test Set 1, but could appear in Test Set 2.</p>

<pre>
2
3 3 4 2 1 2
2 3
3 1
3 3 2 2 3 2
2 1
3 1
</pre>

<p>The correct output for these two cases would be:</p>

<pre>
Case #1: 0
Case #2: -1
</pre>

<p>In Case #1, Alma can move to (3, 5) or (3, 3). She cannot move to (2, 3), which is under construction.</p>

<ul>
	<li>If she moves to (3, 5), she will have no more moves and Berthe will go on to paint two more rooms. Score: 2 - 3 = -1.</li>
	<li>If Alma moves to (3, 3), then Berthe can do one of the following:
	<ul>
		<li>Move to (3, 2), leaving neither painter with any future moves. Score: 2 - 2 = 0.</li>
		<li>Move to (2, 2). Then the rest of the game must play out as follows: Alma moves to (3, 2), Berthe moves to (1, 1). Score: 3 - 3 = 0.</li>
	</ul>
	</li>
</ul>

<p>So Alma knows that moving to (3, 3) guarantees a score of 0 no matter what Berthe does, which is better than the score of -1 that she would get by moving to (3, 5). Therefore, Alma moves to (3, 3). Notice that:</p>

<ul>
	<li>We do not know exactly how the rest of this game will play out, but we do know the best score that Alma can guarantee.</li>
	<li>It is possible that one or more rooms that are not under construction do not get painted.</li>
</ul>

<p>In Case #2, Alma must move to (3, 3), and then it is better for Berthe to move to (3, 4) than to (2, 2).</p>