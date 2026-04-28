# [Platinum II] Hands of Poker - 3525

[문제 링크](https://www.acmicpc.net/problem/3525)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 66, 정답: 32, 맞힌 사람: 20, 정답 비율: 45.455%

### 분류

수학, 구현, 조합론

### 문제 설명

<p>The standard 52-card deck consists of 52 cards divided into 4 suits: clubs, diamonds, hearts and spades. For each suit there are 13 ranks: 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen, king and ace, listed from the lowest to the highest.</p>

<p>A card is denoted by its rank (&lsquo;2&rsquo;. . . &lsquo;9&rsquo; for 2. . . 9, &lsquo;T&rsquo; for 10, &lsquo;J&rsquo; for jack, &lsquo;Q&rsquo; for queen, &lsquo;K&rsquo; for king, and &lsquo;A&rsquo; for ace) followed by its suit (&lsquo;C&rsquo; for clubs, &lsquo;D&rsquo; for diamonds, &lsquo;H&rsquo; for hearts, and &lsquo;S&rsquo; for spades). Cards are partially ordered by their ranks. The suit does not play a role in the cards ordering.</p>

<p>A Poker hand is a set of five distinct cards. Each hand is said to have a certain ranking. A hand with a higher ranking beats a hand with a lower one. Two hands of the same ranking are compared using a tie-breaking rule specific for their ranking &mdash; either one of them beats the other or they are tied.</p>

<p>The list of poker rankings is given below, from the worst ranking to the best ranking. If a hand satisfies several rankings, only the best one is considered.</p>

<ul>
	<li>High Card &mdash; Does not fit into any ranking below. When comparing with another High Card hand, the ranks of the highest cards in the two hands are first compared. If there is a tie, the second highest cards in each hand are compared, and so on. (Example: QS, JH, 9C, 7H, 3D)</li>
	<li>One Pair &mdash; Two cards of the same rank. Pair with higher rank beats the lower pair. In case of a tie, the remaining three cards are used as tie-breakers, compared in the descending order of their ranks (as in High Card). (Example: 6D, 6H, QD, 9H, 4S)</li>
	<li>Two Pairs &mdash; Two pairs of cards of the same rank. When comparing with another Two Pairs hand, the higher pair is first compared, then the lower pair, and finally the rank of the fifth remaining card. (Example: JH, JS, TS, TD, 8S)</li>
	<li>Three of a Kind &mdash; Three cards of the same rank. Three-of-a-kind with the higher rank beats the lower one. In case of a tie, the remaining two cards are used as tie-breakers, compared in the descending order. (Example: 5S, 5H, 5D, JH, 6D)</li>
	<li>Straight &mdash; Five cards in consecutive rank. An ace can either be accounted above a king or below a two, but not both, so wrapping is not allowed. Two straights are compared using the rank of the highest card (in the case of A, 2, 3, 4, 5, the highest card is considered to be 5). (Example: QH, JC, TH, 9D, 8D)</li>
	<li>Flush &mdash; Five cards of the same suit. When comparing two Flushes, the rank of the highest card is first considered, then the second highest and so on (as in High Card). (Example: AS, JS, 8S, 6S, 5S)</li>
	<li>Full House &mdash; Three cards of the same rank, and two cards of same rank. When comparing with another Full House, the rank of the three cards is first compared, then the rank of the two cards. (Example: 7S, 7H, 7C, JC, JH)</li>
	<li>Four of a Kind &mdash; Four cards of the same rank. Two four-of-a-kinds are first compared by the ranks of the four cards. In case of a tie, the rank of the fifth card is used as a tie-breaker. (Example: 4C, 4D, 4H, 4S, TD)</li>
	<li>Straight Flush &mdash; A hand that is both a Straight and a Flush. Same tie-breaker as for a Straight. (Example: TH, 9H, 8H, 7H, 6H)</li>
</ul>

<p>Consider the set H of all Poker hands. Let us introduce an evaluation function v : H &rarr; {1, . . . , 7462}, such that for any two Poker hands a and b, a beats b if and only if v(a) &gt; v(b). There exists exactly one such evaluation function v.</p>

<p>Given a Poker hand a, find the value of v(a).</p>

### 입력

<p>The input file contains space-separated list of five distinct card descriptions. Each card is described with two characters denoting its rank and suit, respectively. The ranks are denoted by &lsquo;2&rsquo;. . . &lsquo;9&rsquo;, &lsquo;T&rsquo;, &lsquo;J&rsquo;, &lsquo;Q&rsquo;, &lsquo;K&rsquo;, and &lsquo;A&rsquo; (listed here in the ascending order). The suits are denoted by &lsquo;C&rsquo;, &lsquo;D&rsquo;, &lsquo;H&rsquo;, and &lsquo;S&rsquo;.</p>

### 출력

<p>Output the value of the evaluation function v(a) for the given hand a.</p>