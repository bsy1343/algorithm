# [Platinum I] Card Game - 27624

[문제 링크](https://www.acmicpc.net/problem/27624)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 9, 맞힌 사람: 9, 정답 비율: 56.250%

### 분류

다이나믹 프로그래밍, 게임 이론, 런타임 전의 전처리, 스프라그–그런디 정리, 순열 사이클 분할

### 문제 설명

<p>Two brothers, Aldo and Bondan, are stuck in their home as their city is going into lockdown again due to the worsening situation of the COVID-19 pandemic. They have finished their semester and are on holiday, but what kind of holiday can you enjoy if you cannot get out of your house. However, boredom does spark creativity. They created a new card game during their boring holiday.</p>

<p>This game is played by two players on N cards (both players play the same set of cards). Each card has two faces, the front and the back. A number P<sub>i</sub> is written on the front face while a number Q<sub>i</sub> is written on the back face of the i<sup>th</sup> card. All written numbers are between 1 and N. There are no two cards with the same number P<sub>i</sub> written on their front face, and there are no two cards with the same number Q<sub>i</sub> written on their back face.</p>

<p>Two opposing players play alternatingly. In their turn, the player picks a card among those that can be picked (initially, any cards can be picked). Let the picked card be the c<sup>th</sup> card. The player then ends their turn by choosing a number from the picked card, either P<sub>c</sub> or Q<sub>c</sub>. Let the chosen number be x. Then, from this moment until the end of the game, any card that contains the number x on either face cannot be picked. The game continues to the opposing player. A player who cannot make any move loses.</p>

<p>Aldo and Bondan are both equally good at such a game. They will always play the game optimally; it means that if there exists a move that guarantees their win, then they will always choose that move.</p>

<p>Your task in this problem is to determine who will win the game if both players play optimally.</p>

<p>For example, let there be N = 4 cards where the cards faces (P<sub>i</sub>, Q<sub>i</sub>) are {(2, 3),(3, 1),(1, 2),(4, 4)}. In this example, there is a way for the first player to win the game. The following are two example plays.</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<th>Chosen Numbers</th>
			<th>Available Cards</th>
			<th>Turn</th>
			<th>Move</th>
		</tr>
		<tr>
			<td>{}</td>
			<td>(2, 3), (3, 1), (1, 2), (4, 4)</td>
			<td>1st player</td>
			<td>pick card (4, 4) choose number 4</td>
		</tr>
		<tr>
			<td>{4}</td>
			<td>(2, 3), (3, 1), (1, 2), <s>(4, 4)</s></td>
			<td>2nd player</td>
			<td>pick card (2, 3) choose number 2</td>
		</tr>
		<tr>
			<td>{4, 2}</td>
			<td><s>(2, 3)</s>, (3, 1), <s>(1, 2)</s>, <s>(4, 4)</s></td>
			<td>1st player</td>
			<td>pick card (3, 1) choose number 1</td>
		</tr>
		<tr>
			<td>{4, 2, 1}</td>
			<td><s>(2, 3)</s>, <s>(3, 1)</s>, <s>(1, 2)</s>, <s>(4, 4)</s></td>
			<td>2nd player</td>
			<td>cannot pick any card</td>
		</tr>
	</tbody>
</table>

<table class="table table-bordered">
	<tbody>
		<tr>
			<th>Chosen Numbers</th>
			<th>Available Cards</th>
			<th>Turn</th>
			<th>Move</th>
		</tr>
		<tr>
			<td>{}</td>
			<td>(2, 3), (3, 1), (1, 2), (4, 4)</td>
			<td>1st player pick card (3, 1)</td>
			<td>choose number 1</td>
		</tr>
		<tr>
			<td>{1}</td>
			<td>(2, 3), <s>(3, 1)</s>, <s>(1, 2)</s>, (4, 4)</td>
			<td>2nd player pick card (4, 4)</td>
			<td>choose number 4</td>
		</tr>
		<tr>
			<td>{1, 4}</td>
			<td>(2, 3), <s>(3, 1)</s>, <s>(1, 2)</s>, <s>(4, 4)</s></td>
			<td>1st player pick card (2, 3)</td>
			<td>choose number 3</td>
		</tr>
		<tr>
			<td>{1, 4, 3}</td>
			<td><s>(2, 3)</s>, <s>(3, 1)</s>, <s>(1, 2)</s>, <s>(4, 4)</s></td>
			<td>2nd player</td>
			<td>cannot pick any card</td>
		</tr>
	</tbody>
</table>

### 입력

<p>Input begins with a line containing an integer N (1 &le; N &le; 100 000) representing the number of cards. The second line contains N integers P<sub>i</sub> (1 &le; P<sub>i</sub> &le; N) representing the number on the front face of the i<sup>th</sup> card. The third line contains N integers Q<sub>i</sub> (1 &le; Q<sub>i</sub> &le; N) representing the number on the back face of the i<sup>th</sup> card. It is guaranteed that all numbers on the front face of all cards are unique. It is also guaranteed that all numbers on the back face of all cards are unique.</p>

### 출력

<p>Output a string &ldquo;First&rdquo; in a line if the first player will win the game assuming both players play the game optimally. Otherwise, output a string &ldquo;Second&rdquo; in a line.</p>