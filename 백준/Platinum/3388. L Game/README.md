# [Platinum I] L Game - 3388

[문제 링크](https://www.acmicpc.net/problem/3388)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 6, 맞힌 사람: 3, 정답 비율: 37.500%

### 분류

구현, 그래프 이론, 자료 구조, 집합과 맵, 비트마스킹, 게임 이론, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>The L Game was designed by Edward de Bono who enjoys playing games and yet hates to concentrate on a large number of pieces. The intention was to produce the simplest possible game that could be played with a high degree of skill. The L game was the result.</p>

<p>Each player has only one piece, an &lsquo;L piece&rsquo;. There are also two neutral square pieces. The board is four squares by four squares. The object of the game is to manoeuvre the other player into a position on the board where he cannot move his L piece.</p>

<p>Proceeding from the starting position, the first player (and each player on each move thereafter) must move the L piece first. When moving, a player may slide, turn or pick up and flip the L piece into any open position other than the one it occupied prior to the move. When the L piece has been moved, a player may move either one (but only one) of the neutral square pieces to any open square on the board. It is not required that a neutral piece be moved, this is up to the player!</p>

<table class="table" style="width:100%">
	<tbody>
		<tr>
			<td style="text-align:center; width:33%"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3388.%E2%80%85L%E2%80%85Game/87dcd182.png" data-original-src="https://www.acmicpc.net/upload/images2/lgame1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:78px; width:78px" /></td>
			<td style="text-align:center; width:34%"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3388.%E2%80%85L%E2%80%85Game/29426f8f.png" data-original-src="https://www.acmicpc.net/upload/images2/lgame2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:78px; width:78px" /></td>
			<td style="text-align:center; width:33%"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3388.%E2%80%85L%E2%80%85Game/a4085e90.png" data-original-src="https://www.acmicpc.net/upload/images2/lgame3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:78px; width:78px" /></td>
		</tr>
	</tbody>
</table>

<p>From any of the three positions above, the player with the checkered L can move his L piece to two new locations (the other two of the three positions above). After moving the L piece, he can move one of the neutral pieces to any of the 6 remaining empty squares or decide not to move any of the neutral pieces. All in all, there are 2 * (6 + 6 + 1) possible moves.</p>

<p>A player wins the game when his opponent cannot move his L piece. In the position below, if the player with the checkered L is to move, he loses, as he cannot move his L to a new, unoccupied position on the board.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3388.%E2%80%85L%E2%80%85Game/2b3a1aca.png" data-original-src="https://www.acmicpc.net/upload/images2/lgame4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:78px; width:78px" /></p>

<p>The game is simple, yet hard as there are so many moves. There are over 18,000 positions for the pieces on the small board and at any moment there may be as many as 195 different moves of which only one is successful.</p>

<p>Write a program that given the position of the pieces and which player is to move, decides if the player has a winning move and output such a move if it exist. If there exist several winning moves, output any one of them. If no winning move exists, you should decide whether the game will end in a draw (assuming perfect play from both players), or if the player to move will in fact lose.</p>

<p>A winning move is defined as a move that, no matter how the opponent plays, he cannot avoid losing the game if the player who is about to move continues the game playing perfectly.</p>

<p>A player is losing the game if, no matter which move he plays, he cannot avoid losing if the opponent continues to play the game perfectly.</p>

<p>If neither of these conditions hold (that is, none of the players can force a win), we say the game position is a draw.</p>

### 입력

<p>The input consists of four lines describing the position of a game in progress. A dot (&lsquo;.&rsquo;) represents an empty square, an &lsquo;x&rsquo; (lowercase X) represents a neutral square piece, &lsquo;#&rsquo; represents the L piece of the player A and &lsquo;*&rsquo; represents the L piece of the player B. The player A is about to move. You may assume that the position is legal and that the player to move has at least one legal move from the current position.</p>

### 출력

<p>Output data should be written to the standard output. If a winning move exists, output the position after the winning move, using the same format as the input. Otherwise output No winning move on a line by itself, and on the next line either Draw if the game will end in a draw (assuming perfect play) or Losing if the player to move will lose the game.</p>