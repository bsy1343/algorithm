# [Platinum III] Checker Board - 7003

[문제 링크](https://www.acmicpc.net/problem/7003)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 33, 정답: 8, 맞힌 사람: 7, 정답 비율: 30.435%

### 분류

게임 이론, 스프라그–그런디 정리

### 문제 설명

<p>After capturing Gandalf, Bilbo, and the dwarfs while they were trying to make their way through the Misty Mountains, the Great Goblin makes Gandalf an o&crarr;er. The two of them play a game that the goblin has devised. If Gandalf wins, they can all go free, but if the Great Goblin wins, then Gandalf must help him recover the treasures of Moria. Your goal is to help Gandalf decide whether there is a way he can win the game.</p>

<p>The game is played on a rectangular checkerboard (the size of the board varies), that contains white and black checkers (corresponding to the two players) in a given arbitrary placement. In each row, there can be at most one white checker and at most one black checker. Starting with the white player, the two players take turns sliding their checkers. In each turn, a player can choose one of his checkers and slide it along its row (there is no movement across rows) to any empty position; however, you cannot jump any other checker (if there is another checker on the board) or go outside of the board.</p>

<p>The player who cannot slide on his turn loses the game.</p>

<p>As an example, consider the initial placement as shown in the figure on the left below. With the first move, the first player can slide the white checker in the first row all the way to the right, thus preventing the second player from being able to move, and winning. On the other hand, in the second game, though it looks highly favorable to the first player, he loses because each of his moves creates a move for the second player, and eventually all his white checkers will get blocked on the other (left) side of the board.</p>

<table class="table table-bordered td-center th-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7003.%E2%80%85Checker%E2%80%85Board/66733039.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/7003.%E2%80%85Checker%E2%80%85Board/66733039.png" data-original-src="https://upload.acmicpc.net/29bcfd75-f92c-49b3-879f-73f30cba6764/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 209px; height: 75px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7003.%E2%80%85Checker%E2%80%85Board/5c1eff0b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/7003.%E2%80%85Checker%E2%80%85Board/5c1eff0b.png" data-original-src="https://upload.acmicpc.net/66eab842-cdf2-42e0-a97a-4c80e7953269/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 212px; height: 72px;" /></td>
		</tr>
	</tbody>
	<tfoot>
		<tr>
			<td>White can win by moving first checker all the way to the right</td>
			<td>Every move by white creates a move for black, and black eventually wins</td>
		</tr>
	</tfoot>
</table>

### 입력

<p>The first line in the test data file contains the number of test cases (&le; 20). Each of the test cases is continued one after another. Each test case begins with 4 numbers M (the number of rows), N (the number of columns), P (number of white checkers), and Q (number of black checkers) on a line. Assume that 0 &le; M,N &le; 300, and 0 &le; P, Q &le; M. Next P lines describe the positions of the white checkers: the i th line contains two numbers, 1 &le; r<sub>i</sub> &le; M, 1 &le; c<sub>i</sub> &le; N, that describe the position of i th white checker. Thus the i th checker is located in rth i row, in the cth i column. Similarly the next Q lines describe the positions of the black checkers.</p>

### 출력

<p>Print &ldquo;W&rdquo; if the player with the white checkers can win the game (assuming the player makes the best possible moves), and print &ldquo;B&rdquo; if other player can win the game. Print &ldquo;T&rdquo; if the game can continue forever without either player being able to force the other player to lose.</p>