# [Gold I] Alice, Bob and Game - 33260

[문제 링크](https://www.acmicpc.net/problem/33260)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 13, 정답: 4, 맞힌 사람: 4, 정답 비율: 30.769%

### 분류

게임 이론, 구현, 다이나믹 프로그래밍, 많은 조건 분기

### 문제 설명

<p>Alice and Bob have recently played many complex games, so they want to play something simple to relax.</p>

<p>They remembered a very simple game called "Seven", which can be played with just a deck of cards. The traditional rules of Seven are a bit complex, so Alice and Bob are going to play a simplified version of Seven.</p>

<p>The playing cards used in the game include four suits: Spades, Hearts, Clubs, and Diamonds. Each suit has one card with each number from 1 to 13, totaling 52 cards.</p>

<p>The rules of the simplified game are as follows:</p>

<ol>
	<li>First, a deck of 52 cards is evenly split into two parts, with each part containing 26 cards, and Alice and Bob each take one of the parts;</li>
	<li>The player who has the 7 of Spades places their 7 of Spades on the table;</li>
	<li>Then, starting with the other player, they take turns playing. In each round, a player must choose one card from their hand to place on the table. The card that can be played must satisfy one of the following two conditions:
	<ul>
		<li>The card's point value is 7;</li>
		<li>There is a card on the table that has the same suit as the card to be played, and the point value differs by exactly 1.</li>
	</ul>
	</li>
	<li>If both players have played all their cards, the game is a draw. Otherwise, if the player whose turn it is cannot play a card according to the rules, this player loses, and the other player wins.</li>
</ol>

<p>Since the sequences of different suits in this game are independent, players often align different suits of 7 vertically and connect the sequences on either side of the 7, arranging the same suit cards in a row.</p>

<p>Given that Alice and Bob are both smart enough, now that Alice and Bob's initial hands are provided, please calculate the result of the game when both play optimally.</p>

### 입력

<p>Since one player's hand can be used to infer the other player's hand, the input only contains all of Alice's cards.</p>

<p>The input consists of a single line with 26 space-separated strings, each representing a card in Alice's hand. The cards are all distinct, and can be given in any order.</p>

<p>Each card is described by its suit and point value. The suit is represented by a character: <code>S</code> for Spades, <code>H</code> for Hearts, <code>C</code> for Clubs, and <code>D</code> for Diamonds. The point value is represented by a corresponding one or two-digit number, with the minimum being 1 and the maximum being 13, without leading zeros. For example, the 7 of Spades corresponds to the string <code>S7</code>.</p>

### 출력

<p>The output consists of a single line with a string that indicates the result of the game. If Alice will win this game when both players play optimally, output <code>Alice</code>; if Bob will win, output <code>Bob</code>; if it's a draw, output <code>Draw</code>.</p>