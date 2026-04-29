# [Gold II] Checker's Check - 7364

[문제 링크](https://www.acmicpc.net/problem/7364)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 3, 맞힌 사람: 3, 정답 비율: 42.857%

### 분류

구현

### 문제 설명

<p>The game of checkers is played on an 8 by 8 red-black board using alternate squares. Two players (Red and White) each start with 12 pieces which are set up in the starting position shown below:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7364.%E2%80%85Checker's%E2%80%85Check/cab4f63a.gif" data-original-src="%EB%B0%B1%EC%A4%80/Gold/7364.%E2%80%85Checker's%E2%80%85Check/02d93fa6.gif" data-original-src="https://boja.mercury.kr/assets/problem/7364-1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:260px; width:436px" /></p>

<p>Rules for movement and capture are as follows (Note: a forward move is one in which a piece moves towards the opponent&#39;s side of the board):</p>

<ol>
	<li>Players alternate moves.</li>
	<li>A piece may move one square forward diagonally to any empty square.</li>
	<li>A piece may jump forward over an opposing player&#39;s piece if the opposing piece is adjacent to the piece and the square directly beyond the opposing piece is empty. After a jump, the opposing piece is removed from the board (captured). If after a jump, the jumping piece can make another jump, it must do so. This continues until it can make no other jumps. This is called a multiple jump.</li>
	<li>A player must make a jump if possible. If several jumps are possible, the player may choose any, even choosing a single jump over a multiple jump. (However, if a multiple jump is chosen, it must be completed.)</li>
	<li>The last row on the opponent&#39;s side of the board (the row where the piece can make no more forward moves) is the player&#39;s promotion row. When a piece reaches the promotion row it is promoted to a king and may now move and capture backward as well as forward. Once a piece is promoted, its move ends-it cannot start to jump or continue a multiple jump after becoming a king until the next turn.</li>
	<li>&nbsp;A piece may be jumped at most once during a move (only a consideration when a king is doing the jumping).</li>
</ol>

<p>Games are recorded using the square numbering shown above. For example, a simple forward move for White might be 22-18; a single jump for Red might be 14{23 (capturing a White piece at square 18); and a multiple jump for a White king might be 22-31-24-15 (capturing Red pieces at 26, 27 and 19).</p>

<p>For this problem, you will be given a position of a game in progress and a set of moves to be applied starting at that position, and you must determine if all the moves are legal by writing an Advanced Checkers Machine.</p>

### 입력

<p>Input will consist of multiple problem instances. Each instance will start with two integers r and w, indicating the number of Red and White pieces on the board (values of r = w = 0 indicates end of input, otherwise 1 &le; r; w &le; 12). The next line will contain r square numbers indicating the Red piece positions and the next line will contain w square numbers for the White piece positions. Positive square values will indicate that a normal piece lies on that square, while a negative value -sq will indicate that a promoted piece lies on square sq. The next line will contain a single integer m &ge; 1 indicating the number of moves to make, followed by a space and then a single character (either R or W) indicating whose move it is. The next m lines will contain the m moves, using the notation described above. (You may assume that there are no more than 13 square numbers listed in any one move.)</p>

<p>All board positions will be legal positions (e.g., there will never be two pieces occupying the same square). You may assume that pieces that have advanced to their promotion row are indeed promoted; that is, there will be no pieces on their promotion row that are not kings.</p>

### 출력

<p>For each problem instance, output either All moves valid or Move n is invalid, where n=1 corresponds to the first move in the problem instance. If there are multiple illegal moves, you should list only the first such move.</p>

<p>&nbsp;</p>