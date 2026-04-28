# [Gold I] Joke - 19312

[문제 링크](https://www.acmicpc.net/problem/19312)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 10, 맞힌 사람: 9, 정답 비율: 75.000%

### 분류

애드 혹, 게임 이론

### 문제 설명

<p>A card game, often called &quot;Fool&#39;s Game&quot;, is quite popular in Russia. We will describe a modification of this game for two players and a deck of 54 cards (52 standard cards along with two jokers, black and red).</p>

<p>All spades and clubs are assumed to have black color. All hearts and diamonds are assumed to have red color. Jokers have no rank or suit, just color. One suit is declared to be a <em>trump</em>.</p>

<p>Initially, both players have six cards. The other 42 cards, in some order, constitute a <em>deck</em>.</p>

<p>A game consists of rounds. Before the round each player has several cards, one of the players is <em>starting</em>, the other one is <em>covering</em>. The starting player starts by laying one or several cards of the same rank down on the table. Jokers can never be laid down by the starting player. The number of cards must not exceed the number of cards the covering player has. The covering player in turn <em>covers</em>&nbsp;all the cards with some of her cards, laying them on the table above the uncovered cards. A card can cover another if at least one of the following is true:</p>

<ul>
	<li>it has the same suit and higher rank (the order of ranks is 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A, where 2 is the lowest rank and A is the highest rank);</li>
	<li>it is a trump and the card to cover is not a trump (a trump can only be covered by a higher trump);</li>
	<li>it is a joker and its color matches the color of the card to cover;</li>
	<li>it is a joker and its color matches the color of the trump suit.</li>
</ul>

<p>After the cards on the table are all covered, the starting player can <em>toss</em>&nbsp;some more cards to be covered. Similarly, jokers can never be tossed by the starting player. The rank of each card tossed must be among the ranks of the cards already on the table at the moment. Now the newly added cards must be covered by the covering player, after that the starting player can toss more cards, and so on. The starting player cannot toss more cards than the covering player has at the moment.</p>

<p>The round ends when either the covering player cannot or does not want to cover all uncovered cards on the table, or when the starting player cannot or does not want to toss more cards. In the first case, when the covering player declares that she does not want to cover all uncovered cards on the table, the starting player is given a chance to toss in more cards. The ranks of the cards tossed must be among the ranks of the cards already on the table. The number of uncovered cards on the table cannot exceed the number of cards that the covering player has at the moment. After that, the covering player loses the round and takes all the cards from the table, adding them to her cards. Starting player keeps her starting role and moves again in the next round.</p>

<p>In the second case, when all cards on the table are covered and the starting player cannot or does not want to toss more cards, the covering player wins the round and the cards on the table are removed from the game. The players&#39; roles for the next round are swapped: the covering player becomes the starting one and vice versa.</p>

<p>Between rounds, if the starting player of the previous round has less than six cards, she draws additional cards from the top of the deck one by one until she has exactly six cards. After that, similarly, if the covering player of the previous round has less than six cards, she draws additional cards from the top of the deck one by one until she has exactly six cards.</p>

<p>If, before the start of a round, one of the players has no cards, and the other one has one or more cards, then the player with no cards wins the game. If both players have no cards, then the game ends in a draw. If both players have at least one card, but all cards of the starting player of the upcoming round are jokers, then the starting player cannot make a move and lay down any cards, the game ends and the covering player of the upcoming round wins the game.</p>

<p>Two players, Johann and Sebastian, are going to play a game by the rules described above. Johann is the starting player of the first round.</p>

<p>Given the trump suit, the cards the players initially have, and the order of the remaining cards in the deck, find out who wins the game if both play optimally. Both players have full information about cards in the game and the order of cards in the deck.</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 10^4$) --- the number of test cases.</p>

<p>Each test case is described in four lines. The first line contains six card descriptions --- the cards of Johann. The second line contains six card descriptions --- the cards of Sebastian. The third line contains 42 card descriptions --- the cards in the deck, from top to bottom. The fourth line contains a single character --- the trump suit.</p>

<p>Each card except jokers is specified by its rank (&#39;<code>2</code>&#39;...&#39;<code>9</code>&#39;, &#39;<code>T</code>&#39; for 10, &#39;<code>J</code>&#39; for Jack, &#39;<code>Q</code>&#39; for Queen, &#39;<code>K</code>&#39; for King, &#39;<code>A</code>&#39; for Ace) followed by its suit (&#39;<code>S</code>&#39; for spades, &#39;<code>C</code>&#39; for clubs, &#39;<code>D</code>&#39; for diamonds, &#39;<code>H</code>&#39; for hearts). Red joker is specified by two characters, &quot;\texttt{RJ}&quot;. Black joker is specified by two characters, &quot;\texttt{BJ}&quot;.</p>

<p>All 54 cards in every test case are different.</p>

### 출력

<p>For each test case, output a single line containing the name of the winner of the game, or &quot;<code>Bach</code>&quot; if the game ends in a draw.</p>