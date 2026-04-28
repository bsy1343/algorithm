# [Platinum IV] Blackjack - 5412

[문제 링크](https://www.acmicpc.net/problem/5412)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 43, 정답: 2, 맞힌 사람: 2, 정답 비율: 11.111%

### 분류

구현, 다이나믹 프로그래밍

### 문제 설명

<p>In the game of blackjack you play against the dealer. Blackjack is played with a regular deck of playing cards containing the cards 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen, king and ace of various suits. (However the suits do not influence the game in any way.) The cards 2 through 10 have value 2 through 10. The jack, queen, and king cards have value 10. Each individual ace can count as either 1 or 11. We define the low value of a player as the lowest possible sum of the values of all the cards of a player, thus counting all aces as 1. The high value of a hand is the highest possible sum of the values that is still below 22, counting aces as 1 or 11 accordingly.</p>

<p>In this problem a basic blackjack variant is considered; there is no splitting, doubling, insurance or&nbsp;&quot;blackjack&quot;.&nbsp;</p>

<p>The goal of the game is to maximize your (expected) profit or minimize your (even more expected) losses. One hand of the game is played as follows:</p>

<ul>
	<li>You place a bet of x euros;</li>
	<li>You get one card, then the dealer gets one card;&nbsp;</li>
	<li>You get a second card, and finally the dealer gets a second card;</li>
	<li>As long as your low value is below 22, you have two options:
	<ul>
		<li>&quot;Hit&quot;- take one extra card from the deck;</li>
		<li>&quot;Stand&quot;- take no more cards.</li>
	</ul>
	</li>
	<li>If your low value is above 21, you lose bet and the hand ends immediately.</li>
	<li>Now the dealer will play his cards;</li>
	<li>As long as the high value of the dealer is below 17, the dealer takes an extra card from the deck;</li>
	<li>If the low value of the cards of the dealer is above 21, you receive 2x euros, making a profit of x euros;</li>
	<li>If the high value of the dealer is greater than than your high value, you lose the bet;</li>
	<li>If the high value of the dealer equals your high value, the bet is returned to you;</li>
	<li>If the high value of the dealer is less than than your high value, you receive 2x euros, making a profit of x euros;</li>
	<li>At the end of the hand, all used cards are placed on a &quot;discard pile&quot; and will not return into play.</li>
</ul>

<p>If at any time there are no cards left in the deck and the dealer has to get another card or you choose to get another card then the current hand is disregarded and the bet is returned to you.</p>

<p>In this problem, the sequence of cards left in the deck is known to you. You have to write a program to help yourself play optimally (ie. maximize profit).</p>

### 입력

<ul>
	<li>The first line of input consists of the integer number n, the number of test cases;&nbsp;</li>
	<li>Then, for each test case:
	<ul>
		<li>One line with three integers 0 &lt;=c&lt;=10,000 and 0 &lt;= p &lt;= q&lt;=100: the number of cards left in the deck, the minimum bet and the maximum bet respectively;</li>
		<li>[c/60] lines with a total of c characters (&#39;2&#39;-&#39;9&#39;, &#39;T&#39;, &#39;J&#39;, &#39;Q&#39;, &#39;K&#39;, &#39;A&#39;), representing the sequence of cards in the deck. The first character on the first line represents the first card that will come off the deck. Only the last line may contain less than 60 characters.</li>
	</ul>
	</li>
</ul>

### 출력

<p>For each test case, the output contains one line with one number: the highest possible profit.</p>