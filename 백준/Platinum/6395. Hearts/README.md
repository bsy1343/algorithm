# [Platinum V] Hearts - 6395

[문제 링크](https://www.acmicpc.net/problem/6395)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

구현

### 문제 설명

<p>There are 52 playing cards in a pack, divided into suits, and, within suits, into denominations. The suits are (in order, lowest to highest) Clubs, Diamonds, Hearts and Spades, abbreviated C, D, H and S. The 13 denominations (or face values) are (from lowest to highest): 2, 3, 4, 5, 6, 7, 8, 9, 10 (T), Jack (J), Queen (Q), King (K) and Ace(A). A higher card will beat a lower card in the same suit, but will not usually beat any other card in a different suit. An exception to this is the &#39;trump&#39; suit---if a suit is designated to be a trump suit (by whatever means the rules of the game allow), then any card of that suit will beat any card of any other suit.</p>

<p>A simplified version of an old card game called Hearts is played as follows. The dealer deals cards clockwise, one by one, face downward, to four other players and himself, starting with the player on his left, who thus gets the first card, followed by the sixth, and so on, while the dealer gets the fifth card, followed by the tenth, and so on. When each player has 10 cards there will be two left---these are exposed and the suit of the one of higher denomination determines the trump suit. If there is a tie, then the highest ranking suit becomes the trump suit.</p>

<p>A &#39;game&#39; consists of 10 &#39;tricks&#39;, each containing 5 cards, one from each player. For each trick, one player &#39;leads&#39;, i.e.\ plays a card face up on the table, the rest of the players then &#39;follow&#39;, in clockwise order. The player to the dealer&#39;s left leads to the first trick, thereafter the winner of each trick leads to the next trick. A player must follow suit if possible, i.e.\ play a card of the same suit as the one lead. If he cannot, then he must trump it (play a card of the designated trump suit). If he cannot trump it (because he has no cards in the trump suit), he discards a card. If a trick is trumped, then the person playing the highest trump wins the trick, otherwise the person playing the highest card of the correct suit wins it.</p>

<p>Strategies are as follows:</p>

<ul>
	<li>Leader: The leader always plays the highest card in his hand. If there is a tie and one of the cards is a trump card, then he leads the trump, otherwise he plays the highest ranking suit.</li>
	<li>Follower: If possible he must play the highest card in his hand of the correct suit. If he has no cards in that suit then he plays the highest trump he has. If he cannot trump it he plays the highest card in his hand, breaking ties as previously specified.</li>
</ul>

<p>When all the tricks have been played, each player examines the tricks he has taken and scores the face value of any Heart he has (Jack counts 11, Queen counts 12, King counts 13 and Ace counts 14). This score is recorded.</p>

<p>Write a program to simulate the playing of this game.</p>

### 입력

<p>Input will consist of a series of decks of cards, each deck spread over four lines as shown below. The file will be terminated by a line consisting of a single #.</p>

### 출력

<p>Output will consist of a series of lines, one for each deck in the input. Each line will consist of 5 numbers reflecting the scores of the individual players, starting with the dealer and proceeding clockwise through the rest of the players. Each score will consist of a number right justified in a field of width 3.</p>