# [Platinum II] Know When to Hold 'em - 4559

[문제 링크](https://www.acmicpc.net/problem/4559)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 1, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

구현

### 문제 설명

<p>Poker is played with a standard deck of cards (no jokers). Every card has rank and suit. Possible card ranks in ascending order are: A,2,3,4,5,6,7,8,9,T,J,Q,K,A (Note that &#39;A&#39; can be either high or low). Possible card suits in ascending order (the order of suits is for display purposes only and should not be used in determining hand or card value) are: Clubs (c), Diamonds (d), Hearts (h), Spades (s). This yields a total of 13 x 4 = 52 cards in a deck.</p>

<p>Poker hands consist of five cards. The possible poker hands are listed below from best to worst. Examples for each type of hand are given in bold.</p>

<ul>
	<li><i>Royal Flush</i>&nbsp;-- Ace, King, Queen, Jack, Ten; all of the same suit. Ex:&nbsp;<b>Ad Kd Qd Jd Td</b></li>
	<li><i>Straight Flush</i>&nbsp;-- Five cards with sequential rank, all of the same suit. Ace can be high or low, but not both. When there are two or more straight flushes, the straight flush with the highest ranked card wins. Ex:&nbsp;<b>Ah 5h 4h 3h 2h</b></li>
	<li><i>Four of a Kind</i>&nbsp;-- Four cards of the same rank. If there are two or more hands that qualify, the hand with the higher ranking four of a kind wins. If there are two four of a kinds with the same rank, then the one with the high card outside the four of the kind wins. Ex:&nbsp;<b>Kc 8s 8h 8d 8c</b></li>
	<li><i>Full House</i>&nbsp;-- Three cards of the same rank plus two cards sharing a different rank. When comparing full houses, the rank of the three cards determines which is higher. If the threes of a kind were equal, the rank of the pairs would decide. For example&nbsp;<b>9s 9h 9d 4d 4c</b>&nbsp;beats&nbsp;<b>As Ah 8s 8h 8d</b>. Ex:&nbsp;<b>Ts Th 3s 3h 3d</b></li>
	<li><i>Flush</i>&nbsp;-- Five cards of the same suit, any rank. When comparing two flushes, the highest card determines which is higher. If the highest cards are equal then the second highest cards are compared; if those are equal too, then the third highest cards, and so on. Ex:&nbsp;<b>Kc 9c 8c 5c 2c</b></li>
	<li><i>Straight</i>&nbsp;-- Five cards with sequential rank, mixed suits. Ace can be high or low, but not both. When there are two straights, the straight with the highest ranked card wins. Ex:&nbsp;<b>9s 8h 7h 6c 5d</b></li>
	<li><i>Three of a Kind</i>&nbsp;-- Three cards with the same rank. The highest three of a kind rank wins. If both three of a kinds are the same rank, then the one with the highest cards outside the three of the kind wins. Ex:&nbsp;<b>Ks 8h 6h 6d 6c</b></li>
</ul>

<p>&quot;Texas Hold &#39;em&quot; is a variation of poker that has gained popularity recently due to frequent national TV exposure. Each player receives two cards face down, known as &quot;hole cards&quot;. Five cards, known as &quot;the board&quot;, are then placed face up in the middle of the table. A player wins by making the best five-card poker hand possible using any combination of their two &quot;hole cards&quot; and the five cards on &quot;the board&quot;. A useful skill for a Hold &#39;em player is to be able to tell the best possible hand an opponent might have. All the player knows are the five face up cards and his/her two hole cards. If an opponent can&#39;t make a better hand than the player, then the player knows to bet as much as possible.</p>

### 입력

<p>The first line contains a single integer&nbsp;<i>n</i>&nbsp;indicating the number of data sets.</p>

<p>Each data set is a line consisting of seven two-character strings separated from each other by single spaces. Each string represents a playing card. The first character will be the card&#39;s rank; the second character will be the card&#39;s suit. The first five cards represent &quot;the board&quot; while the last two represent the player&#39;s &quot;hole cards&quot;. These cards are not in any specific order.</p>

### 출력

<p>For each line of input, output the best five-card hand an opponent might make. If there are two or more cards of different suits that can be used to form the best hand (i.e., there is a tie), display those cards&#39; suits as &#39;*&#39;. The cards should be listed in descending order based on rank first (Aces always considered high for display purposes) then suit (with &#39;*&#39; being lowest in the suit order). On the same line, output the name of the hand after the card list. Poker hand names: ROYAL FLUSH, STRAIGHT FLUSH, FOUR OF A KIND, FULL HOUSE, FLUSH, STRAIGHT, THREE OF A KIND.</p>