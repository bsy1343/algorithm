# [Platinum IV] Orko - 6902

[문제 링크](https://www.acmicpc.net/problem/6902)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 5, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

다이나믹 프로그래밍, 자료 구조, 집합과 맵, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Orko is a two-player card game. Each card has a colour <code>(Red, Yellow, Green, or Black)</code> and a value <code>(1, 2, 3, 4, or 5)</code>. The deck contains twenty cards; one card having each distinct combination of colour and value.</p>

<p>Each player is dealt ten of the twenty cards. The game is played in ten rounds, and the objective is to win as many rounds as possible. In each round, one player, the player with &#39;the lead&#39;, plays one of his cards. The other player must play a card of the same colour, if he has one. If not, he may play any of his cards. The player with the lead wins the round if the other player has no card of the same colour, or if his card has a higher value. Otherwise the other player wins the round.</p>

<p>The objective of the game is to win as many rounds as possible. The lead for the first round is chosen arbitrarily; the lead for each subsequent round is given to the winner of the previous round.</p>

<p>Your job is to determine how many rounds each player will win, assuming that each player employs the strategy that maximizes his advantage.</p>

### 입력

<p>The input contains several test cases. Each test case consists of one line of input, identifying the cards dealt to one of the players, Player $A$. Each card is identified by a letter <code>(R,Y,G,B)</code> denoting its colour followed by a digit denoting its value <code>(1,2,3,4,5)</code>. The other player, Player $B$ receives the remaining cards in the deck. A line containing</p>

<pre>
* * * * * * * * * * *</pre>

<p>($10$ stars, separated by spaces) follows the last test case.</p>

### 출력

<p>For each test case, output a single line giving an integer between $0$ and $10$, the number of rounds won by Player $A$. Assume that Player $A$ has the lead for the first round.</p>