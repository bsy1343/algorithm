# [Platinum II] Card game - 30331

[문제 링크](https://www.acmicpc.net/problem/30331)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 154, 정답: 3, 맞힌 사람: 3, 정답 비율: 2.174%

### 분류

휴리스틱, 런타임 전의 전처리

### 문제 설명

<p>Adam and Bill are playing cards. There are K cards in the deck, numbered 1 to K. The game consists of N rounds, during which each player is trying to score points. The winner is the one who has the most points at the end of the game.</p>

<p>Before each round, the deck is shuffled. During the first round players draw one card each. Then Bill shows his card, and Adam, knowing both cards, decides what action to take:</p>

<ul>
	<li>show his card;</li>
	<li>keep his card.</li>
</ul>

<p>If Adam decides to show his card the round is won by the player who has the higher card. The number of points won is equal to the product of the numbers written on the cards.</p>

<p>For example, if Adam&rsquo;s card shows 7 and Bill&rsquo;s card shows 10, Bill wins this round and gets 70 points. The loser does not get any points for the round. Cards are then returned to the deck and shuffled, and the round ends.</p>

<p>If Adam decides to keep his card, Bill&rsquo;s card is returned to the deck and the deck is shuffled. In the next round (if any are left) Bill will draw a new card while Adam will use the card he has decided to keep.</p>

<p>The game continues in this way. Bill always shows his card while Adam can choose what to do. The game ends after N rounds are played and both players sum their points up.</p>

<p>Let&rsquo;s take an example when N = 4 and K = 10. The game could go like this:</p>

<ul>
	<li>In the first round, Bill gets a card with 2, while Adam &ndash; 6. Adam decides to show his card. Since his card is greater, he gets 6 &middot; 2 = 12 points for this round.</li>
	<li>In the second round, Bill gets a 9, Adam &ndash; 3. This time Adam decides to keep his card. No one gets any points for this round.</li>
	<li>In the third round, Bill gets a 5, Adam still has his old card &ndash; 3. This time, Adam decides to show his card. Bill gets 5 &middot; 3 = 15 points.</li>
	<li>In the fourth round, Adam gets 8, o Bill &ndash; 4. Adam opens his card and gets 8 &middot; 4 = 32 points.</li>
	<li>Since N = 4, the game ends here. Adam has 12 + 32 = 44 points, Bill &ndash; 15 points. Adam wins the game by 29 points.</li>
</ul>

<p>Adam wants to win this game by as large margin as possible. Your task is to help him. Write a program that would play this game and make decisions for Adam. It has to make sure that Adam wins and try to win by as large margin as possible.</p>

### 입력



### 출력

