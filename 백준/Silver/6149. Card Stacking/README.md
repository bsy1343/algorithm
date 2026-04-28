# [Silver IV] Card Stacking - 6149

[문제 링크](https://www.acmicpc.net/problem/6149)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 224, 정답: 121, 맞힌 사람: 106, 정답 비율: 69.281%

### 분류

구현, 자료 구조, 시뮬레이션, 큐

### 문제 설명

<p>Bessie is playing a card game with her N-1 (2 &lt;= N &lt;= 100) cow friends using a deck with K (N &lt;= K &lt;= 100,000; K is a multiple of N) cards. &nbsp;The deck contains M = K/N &quot;good&quot; cards and K-M &quot;bad&quot; cards. Bessie is the dealer and, naturally, wants to deal herself all of the &quot;good&quot; cards. She loves winning.</p>

<p>Her friends suspect that she will cheat, though, so they devise a dealing system in an attempt to prevent Bessie from cheating. They tell her to deal as follows:</p>

<ol>
	<li>Start by dealing the card on the top of the deck to the cow to her right</li>
	<li>Every time she deals a card, she must place the next P (1 &lt;= P &lt;= 10) cards on the bottom of the deck; and</li>
	<li>Continue dealing in this manner to each player sequentially in a counterclockwise manner</li>
</ol>

<p>Bessie, desperate to win, asks you to help her figure out where she should put the &quot;good&quot; cards so that she gets all of them. Notationally, the top card is card #1, next card is #2, and so on.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers: N, K, and P</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..M: Positions from top in ascending order in which Bessie should place &quot;good&quot; cards, such that when dealt, Bessie will obtain all good cards.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>Bessie is playing cards with two cow friends and a deck of 9 cards. She must place two cards on the bottom of the deck each time she deals one.</p>

<p>Bessie should put the &quot;good&quot; cards in positions 3, 7, and 8. The cards will be dealt as follows; the card numbers are &quot;position in original deck&quot;:</p>

<pre>
                                      Card Deck         P1      P2    Bessie
 Initial configuration           1 2 3 4 5 6 7 8 9  - - -   - - -   - - -
 Deal top card [1] to Player 1   2 3 4 5 6 7 8 9    1 - -   - - -   - - -
 Top card to bottom (#1 of 2)    3 4 5 6 7 8 9 2    1 - -   - - -   - - -
 Top card to bottom (#2 of 2)    4 5 6 7 8 9 2 3    1 - -   - - -   - - -
 Deal top card [4] to Player 2   5 6 7 8 9 2 3      1 - -   4 - -   - - -
 Top card to bottom (#1 of 2)    6 7 8 9 2 3 5      1 - -   4 - -   - - -
 Top card to bottom (#2 of 2)    7 8 9 2 3 5 6      1 - -   4 - -   - - -
 Deal top card [7] to Bessie     8 9 2 3 5 6        1 - -   4 - -   7 - -
 Top card to bottom (#1 of 2)    9 2 3 5 6 8        1 - -   4 - -   7 - -
 Top card to bottom (#2 of 2)    2 3 5 6 8 9        1 - -   4 - -   7 - -
 Deal top card [2] to Player 1   3 5 6 8 9          1 2 -   4 - -   7 - -
 Top card to bottom (#1 of 2)    5 6 8 9 3          1 2 -   4 - -   7 - -
 Top card to bottom (#2 of 2)    6 8 9 3 5          1 2 -   4 - -   7 - -
 Deal top card [6] to Player 2   8 9 3 5            1 2 -   4 6 -   7 - -
 Top card to bottom (#1 of 2)    9 3 5 8            1 2 -   4 6 -   7 - -
 Top card to bottom (#2 of 2)    3 5 8 9            1 2 -   4 6 -   7 - -
 Deal top card [3] to Bessie     5 8 9              1 2 -   4 6 -   7 3 -
 Top card to bottom (#1 of 2)    8 9 5              1 2 -   4 6 -   7 3 -
 Top card to bottom (#2 of 2)    9 5 8              1 2 -   4 6 -   7 3 -
 Deal top card [9] to Player 1   5 8                1 2 9   4 6 -   7 3 -
 Top card to bottom (#1 of 2)    8 5                1 2 9   4 6 -   7 3 -
 Top card to bottom (#2 of 2)    5 8                1 2 9   4 6 -   7 3 -
 Deal top card [5] to Player 2   8                  1 2 9   4 6 5   7 3 -
 Top card to bottom (#1 of 2)    8                  1 2 9   4 6 5   7 3 -
 Top card to bottom (#1 of 2)    8                  1 2 9   4 6 5   7 3 -
 Deal top card [8] to Bessie     -                  1 2 9   4 6 5   7 3 8</pre>

<p>Bessie will end up with the &quot;good cards&quot; that have been placed in positions 3, 7, and 8 in the original deck.</p>