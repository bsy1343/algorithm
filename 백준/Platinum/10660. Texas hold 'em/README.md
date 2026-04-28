# [Platinum II] Texas hold 'em - 10660

[문제 링크](https://www.acmicpc.net/problem/10660)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 51, 정답: 23, 맞힌 사람: 15, 정답 비율: 60.000%

### 분류

브루트포스 알고리즘, 많은 조건 분기, 조합론, 구현, 수학, 확률론

### 문제 설명

<p><em>Texas hold &#39;em</em> is one of the standard poker games, originated in Texas, United States. It is played with a standard deck of 52 cards, which has 4 <em>suits</em> (spades, hearts, diamonds and clubs) and 13 <em>ranks</em> (A, K, Q, J and 10-2), without jokers.</p>

<p>With betting aside, a game goes as described below.</p>

<p>At the beginning each player is dealt with two cards face down. These cards are called <em>hole cards</em> or <em>pocket cards</em>, and do not have to be revealed until the showdown. Then the dealer deals three cards face up as <em>community cards</em>, i.e. cards shared by all players. These three cards are called the <em>flop</em>. The flop is followed by another community card called the <em>turn</em> then one more community card called the <em>river</em>.</p>

<p>After the river, the game goes on to the <em>showdown</em>. All players reveal their hole cards at this point. Then each player chooses five out of the seven cards, i.e. their two hole cards and the five community cards, to form a <em>hand</em>. The player forming the strongest hand wins the game. There are ten possible kinds of hands, listed from the strongest to the weakest:</p>

<ul>
	<li><em>Royal straight flush</em>: A, K, Q, J and 10 of the same suit. This is a special case of straight flush.</li>
	<li><em>Straight flush</em>: Five cards in sequence (e.g. 7, 6, 5, 4 and 3) and of the same suit.</li>
	<li><em>Four of a kind</em>: Four cards of the same rank.</li>
	<li><em>Full house</em>: Three cards of the same rank, plus a pair of another rank.</li>
	<li><em>Flush</em>: Five cards of the same suit, but not in sequence.</li>
	<li><em>Straight</em>: Five cards in sequence, but not of the same suit.</li>
	<li><em>Three of a kind</em>: Just three cards of the same rank.</li>
	<li><em>Two pairs</em>: Two cards of the same rank, and two other cards of another same rank.</li>
	<li><em>One pair</em>: Just a pair of cards (two cards) of the same rank.</li>
	<li><em>High card</em>: Any other hand.</li>
</ul>

<p>For the purpose of a sequence, J, Q and K are treated as 11, 12 and 13 respectively. A can be seen as a rank either next above K or next below 2, thus both A-K-Q-J-10 and 5-4-3-2-A are possible (but not 3-2-A-K-Q or the likes).</p>

<p>If more than one player has the same kind of hand, ties are broken by comparing the ranks of the cards. The basic idea is to compare first those forming sets (pairs, triples or quads) then the rest cards one by one from the highest-ranked to the lowest-ranked, until ties are broken. More specifically:</p>

<ul>
	<li><em>Royal straight flush</em>: (ties are not broken)</li>
	<li><em>Straight flush</em>: Compare the highest-ranked card.</li>
	<li><em>Four of a kind</em>: Compare the four cards, then the remaining one.</li>
	<li><em>Full house</em>: Compare the three cards, then the pair.</li>
	<li><em>Flush</em>: Compare all cards one by one.</li>
	<li><em>Straight</em>: Compare the highest-ranked card.</li>
	<li><em>Three of a kind</em>: Compare the three cards, then the remaining two.</li>
	<li><em>Two pairs</em>: Compare the higher-ranked pair, then the lower-ranked, then the last one.</li>
	<li><em>One pair</em>: Compare the pair, then the remaining three.</li>
	<li><em>High card</em>: Compare all cards one by one.</li>
</ul>

<p>The order of the ranks is A, K, Q, J, 10, 9, ..., 2, from the highest to the lowest, except for A next to 2 in a straight regarded as lower than 2. Note that there are exceptional cases where ties remain. Also note that the suits are not considered at all in tie-breaking.</p>

<p>Here are a few examples of comparison (note these are only intended for explanatory purpose; some combinations cannot happen in Texas Hold &#39;em):</p>

<ul>
	<li>
	<p>J-J-J-6-3 and K-K-Q-Q-8.</p>
	</li>
</ul>

<p>The former beats the latter since three of a kind is stronger than two pairs.</p>

<ul>
	<li>
	<p>J-J-J-6-3 and K-Q-8-8-8.</p>
	</li>
</ul>

<p>Since both are three of a kind, the triples are considered first, J and 8 in this case. J is higher, hence the former is a stronger hand. The remaining cards, 6-3 and K-Q, are not considered as the tie is already broken.</p>

<ul>
	<li>
	<p>Q-J-8-6-3 and Q-J-8-5-3.</p>
	</li>
</ul>

<p>Both are high cards, assuming hands not of a single suit (i.e. flush). The three highest-ranked cards Q-J-8 are the same, so the fourth highest are compared. The former is stronger since 6 is higher than 5.</p>

<ul>
	<li>
	<p>9-9-Q-7-2 and 9-9-J-8-5.</p>
	</li>
</ul>

<p>Both are one pair, with the pair of the same rank (9). So the remaining cards, Q-7-2 and J-8-5, are compared from the highest to the lowest, and the former wins as Q is higher than J.</p>

<p>Now suppose you are playing a game of Texas Hold &#39;em with one opponent, and the hole cards and the flop have already been dealt. You are surprisingly telepathic and able to know the cards the opponent has. Your ability is not, however, as strong as you can predict which the turn and the river will be.</p>

<p>Your task is to write a program that calculates the probability of your winning the game, assuming the turn and the river are chosen uniformly randomly from the remaining cards. You and the opponent always have to choose the hand strongest possible. Ties should be included in the calculation, i.e. should be counted as losses.</p>

### 입력

<p>The input consists of multiple datasets, each of which has the following format:</p>

<pre>
YourCard<sub>1</sub> YourCard<sub>2</sub>
OpponentCard<sub>1</sub> OpponentCard<sub>2</sub>
CommunityCard<sub>1</sub> CommunityCard<sub>2</sub> CommunityCard<sub>3</sub>
</pre>

<p>Each dataset consists of three lines. The first and second lines contain the hole cards of yours and the opponent&#39;s respectively. The third line contains the flop, i.e. the first three community cards. These cards are separated by spaces.</p>

<p>Each card is represented by two characters. The first one indicates the suit: <code>S</code> (spades), <code>H</code> (hearts), <code>D</code> (diamonds) or <code>C</code> (clubs). The second one indicates the rank: <code>A</code>, <code>K</code>, <code>Q</code>, <code>J</code>, <code>T</code> (10) or <code>9</code>-<code>2</code>.</p>

<p>The end of the input is indicated by a line with <code>#</code>. This should not be processed.</p>

### 출력

<p>Print the probability in a line. The number may contain an arbitrary number of digits after the decimal point, but should not contain an absolute error greater than 10<sup>-6</sup>.</p>