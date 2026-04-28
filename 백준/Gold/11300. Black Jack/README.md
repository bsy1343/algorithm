# [Gold V] Black Jack - 11300

[문제 링크](https://www.acmicpc.net/problem/11300)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 27, 정답: 13, 맞힌 사람: 12, 정답 비율: 54.545%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Black Jack is a card game where the aim is to obtain a hand of cards with a value of no more than 21. The game is played in casinos where players bet money on the result, but this is a friendly version with no money at stake. Instead we are counting the number of wins for each player.</p>

<p>There are 52 cards in a standard pack, 4 of each of 13 values. In Black Jack, cards have the following values:</p>

<ul>
	<li>Picture cards (K, Q and J) have a value of 10.</li>
	<li>T (the 10) has a value of 10</li>
	<li>2 to 9 &ndash; face value</li>
	<li>A (ace) has a value of 1 or 11.</li>
</ul>

<p>In this version of Black Jack, these rules must be followed:</p>

<ol>
	<li>For each scenario, a sequence of games will be played, dealing cards in the order they are displayed in the input.</li>
	<li>To start a game, the players are dealt one card each in the order shown in the input, then the dealer (who is not one of the players) is dealt a card. A second card is then dealt in the same way.</li>
	<li>Players then play in turn. Their play is based at all times on the value of their hand, being the sum of the values of the cards in the hand. At first each A (ace) counts as 11, but later the value of one or more aces may drop to 1. Once dropped to 1, the ace&#39;s value will remain at 1.</li>
	<li>In a turn
	<ul>
		<li>If a player was dealt 2 aces (A), one ace&#39;s value must be dropped to 1 to give a hand value of 12, not 22.</li>
		<li>If a player has a hand value of 17 or more they must stick &ndash; their turn ends.</li>
		<li>If a player has a hand value of less than 17, they are dealt a new card. If they now have a hand value of 22 or more, they have &ldquo;busted&rdquo; and their turn ends, unless they have at least one A which is still valued at 11. In this case one ace&#39;s value is then dropped to 1 and their turn continues.</li>
		<li>A turn continues until a player sticks or busts.</li>
	</ul>
	</li>
	<li>Once all the players have played, if any player has not busted, the dealer plays in a similar way.</li>
	<li>If the dealer busts, all players who have not busted score 1 win.</li>
	<li>If the dealer sticks, he scores 1 win for every sticking player whose hand value he has beaten, plus 1 win for every busted player. A player who has not busted scores 1 win if he has a higher hand value than the dealer.</li>
	<li>The game in progress continues until a card must be dealt but there are none left in the pack. The game in progress stops and is not scored. At this point the scenario ends and the number of wins for each player are displayed.</li>
</ol>

### 입력

<p>A number of scenarios are presented, each beginning with 52 card values in a random order. The last line contains just # - this line is not to be processed. The second line of a scenario contains the names of from 1 to 5 players, separated by spaces.</p>

### 출력

<p>For each scenario, present a single line with the names of the players (in the same order as the input) each followed by their number of wins. Follow this with &ldquo;dealer&rdquo; and the dealer&#39;s number of wins. Names and wins are separated by single spaces.</p>