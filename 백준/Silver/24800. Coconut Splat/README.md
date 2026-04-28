# [Silver II] Coconut Splat - 24800

[문제 링크](https://www.acmicpc.net/problem/24800)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 20, 맞힌 사람: 19, 정답 비율: 100.000%

### 분류

자료 구조, 덱, 구현, 시뮬레이션

### 문제 설명

<p>Coconut Splat is one of Theta&#39;s favorite counting-out games. It goes like this: initially, all players stand in a circle with their hands folded together (like an intact coconut). &nbsp;In clockwise order, one player touches the hands of the other players and says the rhyme: &quot;Co-co-nut, Co-co-nut, Co-co-nut, Splat!&quot; &nbsp;At each syllable, the player touches a hand, and the player whose hand or hands is touched last takes one of the following actions:</p>

<ul>
	<li>If the player&#39;s hands are still folded, they are split into two fists (the coconut is cracked in two halves). The next round starts with the fist that is the first half of the coconut, then the second half, then going to the next player.</li>
	<li>If a fist is touched last, the hand is turned palm down (the milk spills out). The next round starts with the next hand in clockwise order, which could be the other hand&nbsp; of the same player, or it could be the hand or folded hands belonging to the next player.</li>
	<li>If a hand that is already turned palm down is touched last, the player to whom it belongs puts the hand behind their back and this hand won&#39;t be counted in the following rounds. The next round starts with the next hand in clockwise order as in the previous case.</li>
	<li>If a player has put both of their hands behind their back, that player is out of the game. &nbsp;The game ends when there is only one player left.</li>
</ul>

<p>The hand or hands of the player doing the counting are taken into account (for instance, the counting player touches their thigh when it would be her turn to be touched).</p>

<p>There are variations of this game, for instance, some kids say &quot;Coconut, coconut, crack your nut!&quot; instead, which has only $9$ instead of $10$ syllables.</p>

<p>There are $n$ players, and counting always starts with the folded hands of player $1$. For instance, in the first round, if the rhyme has $3$ syllables, player $3$ would be the one to first crack their coconut into two fists.</p>

<p>Write a program that determines the winner of the counting-out game based on the number of players and based on the number of syllables in the rhyme that is used!</p>

### 입력

<p>The input consists of a single test case with two numbers $s$ ($0 &lt; s \le 100$) and $n$ ($2 \le n \le 100$) denoting the number of syllables in the rhyme and the number of players, respectively.</p>

### 출력

<p>Output a single integer $p$ ($1 \le p \le n$), the number of the player who is left.</p>