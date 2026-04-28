# [Platinum II] Bacterial Tactics - 27782

[문제 링크](https://www.acmicpc.net/problem/27782)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 6, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

다이나믹 프로그래밍, 게임 이론, 스프라그–그런디 정리

### 문제 설명

<p>Becca and Terry are microbiologists who have a friendly rivalry. When they need a break from their research, they like to play a game together. The game is played on a matrix of unit cells with <b>R</b> rows and <b>C</b> columns. Initially, each cell is either empty, or contains radioactive material.</p>

<p>On each player&#39;s turn, if there are no empty cells in the matrix, that player loses the game. Otherwise, they choose an empty cell and place a colony of bacteria there. Bacteria colonies come in two types: H (for &quot;horizontal&quot;) and V (for &quot;vertical&quot;).</p>

<ul>
	<li>When a type H colony is placed into an empty cell, it occupies that cell (making it non-empty), and also tries to spread into the cell immediately to the west (if there is one) and the cell immediately to the east (if there is one).</li>
	<li>When a type V colony is placed into an empty cell, it occupies that cell (making it non-empty), and also tries to spread into the cell immediately to the south (if there is one) and the cell immediately to the north (if there is one).</li>
</ul>

<p>Whenever a colony (of either type) tries to spread into a cell:</p>

<ul>
	<li>If the cell contains radioactive material, the colony mutates and the player who placed the colony loses the game.</li>
	<li>If that cell is empty, the colony occupies that cell (making it non-empty), and then the rule above is triggered again (i.e. the colony will try to spread further).</li>
	<li>If the cell already contains bacteria (of any type), the colony does not spread into that cell.</li>
</ul>

<p>Notice that it may be possible that all of a player&#39;s available moves would cause them to lose the game, and so they are doomed. See the sample case explanations below for examples of how the game works.</p>

<p>Becca makes the first move, and then the two players alternate moves until one of them loses the game. If both players play optimally, who will win? And, if Becca will win, how many distinct winning opening moves does she have? (Two opening moves are distinct if and only if they either use different cells, or different kinds of colony, or both.)</p>

### 입력

<p>The first line of the input gives the number of test cases, <b>T</b>. <b>T</b> test cases follow. Each case begins with one line containing two integers <b>R</b> and <b>C</b>: the number of rows and columns, respectively, in the matrix. Then, there are <b>R</b> more rows of <b>C</b> characters each. The j-th character on the i-th of these lines represents the j-th column of the i-th row of the matrix. Each character is either <code>.</code> (an empty cell) or <code>#</code> (a cell with radioactive material).</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where <code>x</code> is the test case number (starting from 1), and <code>y</code> is an integer: either <code>0</code> if Becca will not win, or, if Becca will win, the number of distinct winning opening moves she can make, as described above.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 100.</li>
</ul>

### 힌트

<p>In Sample Case #1, Becca cannot place an H colony in the southwest empty cell or a V colony in the northeast empty cell, because those would spread onto a radioactive cell and Becca would lose. She has only two possible strategies that do not cause her to lose immediately:</p>

<ol>
	<li>Place an H colony in the northwest or northeast empty cells. The colony will also spread to the other of those two cells.</li>
	<li>Place a V colony in the northwest or southwest empty cell. The colony will also spread to the other of those two cells.</li>
</ol>

<p>If Becca chooses strategy 1, Terry can place a V colony in the southwest empty cell. If Becca chooses strategy 2, Terry can place an H colony in the northeast empty cell. Either way, Becca has no empty cells to choose from on her next turn, so she loses and Terry wins.</p>

<p>In Sample Case #2, any of Becca&#39;s opening moves would cause a mutation.</p>

<p>In Sample Case #3, five of Becca&#39;s possible opening moves would cause a mutation, but the other seven are winning. She can place an H colony in any of the cells of the second row, or she can place a V colony in any of the cells of the second column. In either case, she leaves two disconnected sets of 1 or 2 cells each. In each of those sets, only one type of colony can be played, and playing it consumes all of the empty cells in that set. So, whichever of those sets Terry chooses to consume, Becca can consume the other, leaving Terry with no moves.</p>

<p>In Sample Case #4, both of Becca&#39;s two distinct possible opening moves are winning.</p>

<p>In Sample Case #5, Becca has no possible opening moves.</p>