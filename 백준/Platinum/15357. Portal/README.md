# [Platinum III] Portal - 15357

[문제 링크](https://www.acmicpc.net/problem/15357)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 90, 정답: 29, 맞힌 사람: 24, 정답 비율: 40.678%

### 분류

너비 우선 탐색, 데이크스트라, 그래프 이론, 그래프 탐색, 최단 경로

### 문제 설명

<p>The protagonist of this task, Chell, must solve a new puzzle GLaDOS has come up with. Chell is in a room whose layout that can be represented as a matrix of dimensions N rows and M columns. Each field can be one of the following:</p>

<ul>
	<li>Obstructed field - there is a wall in it (denoted as &lsquo;#&rsquo;),</li>
	<li>The field where Chell is initially (denoted as &lsquo;C&rsquo;),</li>
	<li>The field where Chell must get to in order to solve the puzzle (denoted as &lsquo;F&rsquo;), or</li>
	<li>An empty field (denoted as &lsquo;.&rsquo;).</li>
</ul>

<p>Chell is carrying a so-called portal gun, a gun with which you can create portals in the walls. In each move, she can do one of the following:</p>

<ul>
	<li>Move to an adjacent field using one move up, down, left or right (she cannot move to the field with a wall in it). This move lasts one unit of time.</li>
	<li>Create a portal in the wall by turning towards a wall, not necessarily an adjacent one, in the direction up, down, left or right and shooting. The portal will be created only on the side of the wall it was hit from. In each moment, at most two portals can be active​. If a new portal is being created in the moment when two portals are already active, the one that was created earlier will disappear. It is not possible to create a new portal at the position of another existing portal. This move lasts a negligible amount of time, i.e. zero amounts of time.</li>
	<li>If she&rsquo;s at a field that is adjacent to a wall and there&rsquo;s a portal on her side of the wall, she can step into the portal and exit to a non-obstructed field with another portal. This move is possible if there are two active portals and lasts one unit of time.</li>
</ul>

<p>Chell wants to know the minimal amount of time it takes for her to solve the puzzle, i.e. to reach the field denoted as &lsquo;F&rsquo;.</p>

<p>Please note: The room will always have walls on the sides, and letters &lsquo;C&rsquo; and &lsquo;F&rsquo; will appear only once in the matrix.</p>

### 입력

<p>The first line of input contains the positive integers N and M (4 &le; N, M &le; 500), the numbers from the task.</p>

<p>Each of the following N lines contains M characters that describe the layout of the room.</p>

### 출력

<p>You must output the minimal amount of time it takes to solve the puzzle, or &ldquo;nemoguce&rdquo; (without quotation marks, Croatian for impossible) if it is not possible to solve it.</p>

### 힌트

<p>Clarification of the second test case:</p>

<p>The puzzle can be solved in 8 moves, illustrated in the pictures below.</p>

<p>In the first move, we turn towards the left wall, shoot and create a portal that appears on the wall in the 3rd row and 1st column (coordinates (3,1)) from the right side.</p>

<p>In the second move, we create a portal from the upper side of the wall at coordinates (6,2).&nbsp;</p>

<p>In the third move, we step into the portal at coordinates (3,1) and exit at coordinates (5,2) - a non-obstructed field with the second portal.</p>

<p>In the fourth move, we turn right and create a portal from the left side of the wall at coordinates (5,7). Since there are already two portals, the one at field (3,1) disappears.</p>

<p>In the fifth move, we step into the portal at coordinates (6,2) and exit at coordinates (5,6) with the second portal.</p>

<p>In the sixth move, we create a new portal from the lower side of the wall at coordinates (1,6), making the portal at coordinates (6,2) disappear.</p>

<p>In the seventh move, we step into the portal at coordinates (5,7) and exit at coordinates (2,6).</p>

<p>Finally, in the eighth move, we move one place to the right to end the game.</p>

<p>The portal creation in moves 1, 2, 4 and 6 lasts zero amounts of time, whereas the rest of the move last one unit of time, so the total time needed to solve the puzzle is 4 units of time.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15357/1.png" style="height:272px; width:597px" /></p>