# [Silver II] Bridge Hands - 6678

[문제 링크](https://www.acmicpc.net/problem/6678)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 100, 정답: 17, 맞힌 사람: 16, 정답 비율: 41.026%

### 분류

구현, 정렬

### 문제 설명

<p>Drivers of Advanced Cargo Movement, Ltd. usually have to wait quite a long time when waiting at border crossings for duty clearance. They are used to play various (card) games to have some fun. One of the games is Bridge. Playing Bridge involves dealing a standard deck of 52 cards to 4 players, so that each player receives 13 cards. Good players can then play with the hand as it is dealt, but most ordinary players will need to sort it, firstly by suit and then by rank within suit. There is no fixed ranking of the suits for this purpose, but it is useful to alternate the colors, so we will presume the following ordering: &clubs; (club) &lt; &diams; (diamond) &lt; &spades; (spade) &lt; &hearts; (heart). (Note that because most character sets do not recognize these symbols, from now on we will use the more conventional C, D, S, and H). Within a suit, Ace is high, so the ordering is&nbsp;</p>

<p style="text-align: center;">2 &lt; 3 &lt; 4 &lt; 5 &lt; 6 &lt; 7 &lt; 8 &lt; 9 &lt; T &lt; J &lt; Q &lt; K &lt; A .</p>

<p>The players are usually called North, South, East, and West as they sit at the points of the compass. One player is designated the dealer and she deals one card to each player starting with the player on her left and proceeding clockwise until she deals the last card to herself.</p>

<p>Write a program that will read in a representation of a deck of cards, deal them, sort them, and then display four sorted hands in the format shown below.</p>

### 입력

<p>The input consists of a series of deals. Each deal begins with a line containing a single letter representing the dealer (&quot;N&quot;, &quot;E&quot;, &quot;S&quot;, &quot;W&quot;) followed by two lines representing the deck, card by card, as shown below. The first card given in the input is the first one to be dealt. The file is be terminated by a line consisting of a single hash character (&quot;#&quot;).</p>

### 출력

<p>Output should consist of a series of sets of 24 lines, one set for each deal, separated by blank lines. Each set will consist of four groups of six lines displaying the sorted hands, in the order of their suit and rank. Use the format shown below. South player always goes first.</p>