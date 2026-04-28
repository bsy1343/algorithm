# [Gold I] Rhinoceros Beetle - 6610

[문제 링크](https://www.acmicpc.net/problem/6610)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

구현

### 문제 설명

<p>Given a big strength, Rhinoceros Beetles have a natural tendency to fight. Because of that, they are even used for gambling fights in some countries, especially in Asia. Two male beetles fight against each other and the people watch them and bet which one would win. Recently, animal protection groups protested against such gambling events. Therefore, many gamblers started to play different games instead, like Texas Hold&rsquo;em Poker. In this game, it may be hard to pick the winner among many players. Since a big tournament called the Arthropoda Card Marathon will be organized soon, please write a program to decide which hand is the strongest.</p>

### 입력

<p>The input consists of several instances. The first line of each instance contains one integer N (1 &le; N &le; 10), the number of players. The second line contains exactly five cards separated by a space &mdash; these are the Texas Hold&rsquo;em &ldquo;community&rdquo; cards shared by all the players. Each of the following N lines contains two cards separated by a space &mdash; the cards held by individual players, the first such line being cards of Player 1, second line the cards of Player 2, etc.</p>

<p>Each card is described by exactly 2 characters, first character being the card rank, one of {&ldquo;2&rdquo;,&ldquo;3&rdquo;,&ldquo;4&rdquo;,&ldquo;5&rdquo;,&ldquo;6&rdquo;,&ldquo;7&rdquo;,&ldquo;8&rdquo;,&ldquo;9&rdquo;,&ldquo;X&rdquo;,&ldquo;J&rdquo;,&ldquo;Q&rdquo;,&ldquo;K&rdquo;,&ldquo;A&rdquo;}, where &ldquo;X&rdquo; stands for the 10, second character being the card suit (sometimes called color), one of {&ldquo;c&rdquo;,&ldquo;d&rdquo;,&ldquo;h&rdquo;,&ldquo;s&rdquo;} for Clubs, Diamonds, Hearts, or Spades. For example, &ldquo;Xh&rdquo; is the Ten of Hearts and &ldquo;As&rdquo; is the Ace of Spades.</p>

### 출력

<p>For each input instance, output one single line containing numbers of all winners in ascending order, separated by a space. More specifically, output an ordered ascending sequence of indexes of players that hold the strongest hand for that given configuration of cards.</p>

### 힌트

<p><strong>Rules of Texas Hold&rsquo;em Poker</strong></p>

<p>Five cards (the community cards) are shared by all the players and each player holds 2 other cards that may be combined with the community cards, meaning that each player has 7 cards available, out of which 5 cards are chosen to make the best possible hand.</p>

<p>Note that no more than 5 cards can be counted as a hand under any circumstances. For instance, if all players make the same hand using all 5 community cards, the two cards they are holding do not count.</p>

<p>The hands in Texas Hold&rsquo;em Poker are the usual poker hands (&ldquo;figures&rdquo;). Listed from strongest to the weakest figure, these are:</p>

<ul>
	<li>Royal Flush
	<ul>
		<li>a Flush that is also a Straight</li>
	</ul>
	</li>
	<li>Poker
	<ul>
		<li>also known as Four of a kind &mdash; four cards of the same rank</li>
	</ul>
	</li>
	<li>Full House
	<ul>
		<li>A Three and a Pair together</li>
	</ul>
	</li>
	<li>Flush
	<ul>
		<li>five cards of the same suit (color)</li>
	</ul>
	</li>
	<li>Straight
	<ul>
		<li>5 consecutive cards (such as 7,8,9,X,J), where Ace may be the highest or lowest card, but not both &mdash; for example, A,2,3,4,5 or X,J,Q,K,A are Straights, but Q,K,A,2,3 is not</li>
	</ul>
	</li>
	<li>Three
	<ul>
		<li>3 cards of the same rank (value)</li>
	</ul>
	</li>
	<li>Two pairs
	<ul>
		<li>two pairs of cards of the same rank</li>
	</ul>
	</li>
	<li>Pair
	<ul>
		<li>two cards of the same rank</li>
	</ul>
	</li>
	<li>One card
	<ul>
		<li>anything else (no two cards of the same rank, and no Straight)</li>
	</ul>
	</li>
</ul>

<p>If two or more players have the same figure, the following tie-breaker rules are applied, in order:</p>

<ol>
	<li>With Full House, the highest card of the Three wins (3,3,Q,Q,Q &gt; 9,9,9,K,K).</li>
	<li>If Ace plays low in a Straight, it is weaker than other Straights (5,6,7,8,9 &gt; A,2,3,4,5).</li>
	<li>The highest card of the figure wins (2,2,4,K,K &gt; X,X,Q,Q,A), or the other cards of the figure if necessary (4,4,5,K,K &gt; 3,3,K,K,A).</li>
	<li>Otherwise, the highest card that is not used in the figure decides (2,2,6,X,A &gt; 2,2,X,Q,K; 2,2,6,X,A &gt; 2,2,3,4,A; and 3,4,7,8,A &gt; 8,X,J,Q,K).</li>
</ol>

<p>If no tie-breaker can be used, both hands have the same strength. Specifically, all four suits have the same strength.</p>