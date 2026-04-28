# [Gold III] Know When to Hold Them - 4519

[문제 링크](https://www.acmicpc.net/problem/4519)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

구현, 정렬

### 문제 설명

<p>In the game of poker, each player holds 5 playing cards in their hand. At the end of the final round each player reveals their cards, and the player with the most valuable hand wins the game. Your goal is to write a program that reads in the poker hands of each player, determines their relative worth, and then prints them back out in sorted order from most to least valuable.</p>

<p>Poker is played with a deck of 52 cards, evenly divided into 4 suits: <em>hearts</em> (&hearts;), <em>spades</em> (&spades;), <em>diamonds</em> (&diams;), and <em>clubs</em> (&clubs;). Each suit has 13 cards, and each card within the suit has a unique rank that determines the relative worth of the card. From highest to lowest (i.e. from most to least valuable) these ranks are: <em>ace</em> (high), <em>king</em>, <em>queen</em>, <em>jack</em>, <em>10</em>, <em>9</em>, <em>8</em>, <em>7</em>, <em>6</em>, <em>5</em>, <em>4</em>, <em>3</em>, <em>2</em>, <em>ace</em> (low). Although only one <em>ace</em> card exists within each suit, and it is usually ranked as the highest card, under some circuimstances the <em>ace</em> card will be treated as the lowest. The suit itself has no bearing on the worth of the card and is only used to determine which category a particular hand belongs to (in particular the <em>flush</em> and <em>straight flush</em> categories; see below).</p>

<p>Each poker hand can be classified into one of nine categories depending on the combination of cards within that hand. A higher category hand always beats any other lower category hand regardless of the individual card ranks within either hand. If both hands belong to the same category, then the individual card ranks are used to decide which hand is more valuable. Note that each category has slightly different rules about how the individual card ranks break the tie. Also note that the category classification does not depend on the permutation of cards within a hand (i.e. the position of individual cards within a hand does not matter). The possible hand categories are listed below from most to least valuable:</p>

<ol>
	<li><em>Straight Flush</em><br />
	All cards are of the same suit and have sequential rank. Between two straight flushes, the hand with the highest card wins. Note that the low ace rule applies to this category when a hand consists of the following cards: <em>5</em>, <em>4</em>, <em>3</em>, <em>2</em>, <em>ace</em> (i.e. the <em>ace</em> has the lowest rank in this hand and the <em>5</em> has the highest). Example:<br />
	A&hearts; K&hearts; Q&hearts; J&hearts; 10&hearts; beats K&spades; Q&spades; J&amp;spspades; 10&spades; 9&spades; and 6&diams; 5&diams; 4&diams; 3&diams; 2&diams; beats 5&clubs; 4&clubs; 3&clubs; 2&clubs; A&clubs;.</li>
	<li><em>Four Of a Kind</em><br />
	Four cards of the same rank (i.e. a quad) with a fifth card of a different rank. Between two hands in this category, the hand containing the higher ranking quad wins. If both quads have equally ranked cards, then the hand with a higher unmatched card wins. Example:<br />
	8&clubs; 8&hearts; 8&spades; 8&diams; Q&clubs; beats 2&clubs; 2&hearts; 2&spades; 2&diams; A&diams; and 4&clubs; 4&hearts; 4&spades; 4&diams; A&hearts; beats 4&clubs; 4&hearts; 4&spades; 4&diams; J&hearts;.</li>
	<li><em>Full House</em><br />
	Three matching cards of one rank plus two matching cards (i.e. a pair) of a different rank. Between two full houses, the hand with a higher ranked group of three wins. If both groups of three have equal ranking, then the hand with the higher ranked pair wins. Example:<br />
	4&diams; 4&hearts; 4&clubs; Q&spades; Q&clubs; beats 3&clubs; 3&spades; 3&hearts; K&diams; K&hearts; and Q&hearts; Q&diams; Q&spades; J&diams; J&clubs; beats Q&hearts; Q&diams; Q&spades; 10&hearts; 10&spades;.</li>
	<li><em>Flush</em><br />
	All cards are of the same suit. Between two flushes, the hand with the highest card wins. If the highest card in both hands is the same rank, then the second highest card decides the winner, and so on. Example:<br />
	Q&diams; 8&diams; K&diams; J&diams;diams; 2&diams; beats J&spades; 10&spades; 9&spades; 2&spades; 8&spades; and Q&hearts; J&hearts; 9&hearts; 8&hearts; 3&hearts; beats Q&clubs; J&clubs; 7&clubs; 3&clubs; 2&clubs;.</li>
	<li><em>Straight</em><br />
	All cards have sequential rank. Between two straights the hand with the highest card wins. Note that the low ace rule applies to this category when a hand consists of the following cards: <em>5</em>, <em>4</em>, <em>3</em>, <em>2</em>, <em>ace</em>. Example:<br />
	Q&spades; J&clubs; 10&spades; 9&hearts; 8&diams; beats 7&hearts; 6&diams; 5&hearts; 4&spades; 3&diams; and A&clubs; K&spades; Q&clubs; J&clubs; 10&hearts; beats 5&diams; 4&hearts; 3&clubs; 2&spades; A&hearts;.</li>
	<li><em>Three Of a Kind</em><br />
	Three matching cards of the same rank plus two unmatched cards (known as the <em>kickers</em>) whose rank doesn&#39;t match each other or the group of three. Between two such hands, the hand with a higher group of three wins. If both groups of three have equal rank, than the hand with the highest kicker wins (if the highest kicker cards in both hands are equal than compare the other two kickers). Example:<br />
	7&hearts; 7&clubs; 7&spades; J&diams; 10&spades; beats 4&hearts; 4&spades; 4&diams; 7&clubs; Q&diams; and 8&spades; 8&hearts; 8&diams; 3&spades; 6&diams; beats 8&clubs; 8&diams; 8&spades; 3&diams; 5&hearts;.</li>
	<li><em>Two Pair</em><br />
	Two matching cards of one rank, two matching cards of a different rank (which match each other but not the first pair), and a fifth card (the <em>kicker</em>) whose rank does not match either pair. Between hands in this category, the hand with the higher ranked pair wins. If the highest pairs in each hand have equal ranking, then compare using the other pairs in each hand. If both pairs in one hand match both pairs in the other hand, then the hand with the highest kicker (the fifth unmatched card) wins. Example:<br />
	K&hearts; K&clubs; 3&diams; 3&clubs; 2&spades; beats J&diams; J&hearts; Q&spades; Q&clubs; K&spades; and 8&spades; 8&clubs; 5&diams; 5&clubs; 3&hearts; beats 8&hearts; 8&diams; 4&spades; 4&diams; 3&clubs;.</li>
	<li><em>One Pair</em><br />
	One matching pair of cards with the same rank, plus three cards (<em>kickers</em>) whose rank matches neither the pair nor each other. Between these categories, the hand with the highest pair wins. If both hands have equally ranked pairs, then compare using the highest unmatched kicker card (or second highest, or third highest). Example:<br />
	4&hearts; 4&diams; 8&hearts; 10&diams; J&spades; beats 3&hearts; 3&spades; Q&clubs; 8&hearts; 2&diams; and 9&spades; 9&diams; 10&hearts; J&hearts; 4&clubs; beats 9&hearts; 9&clubs; J&spades; 7&hearts; 8&diams;.</li>
	<li><em>High Card</em><br />
	If a poker hand does not fall into any other category above, then it is classified as this category. In other words, each card is of a different rank, all the cards are not of the same suit, and are not in ranked sequence. Between two hands in this category, the hand with the highest ranked card wins (or second highest, or third highest, and so on). Example:<br />
	8&clubs; K&spades; 3&hearts; J&diams; 2&hearts; beats 10&hearts; J&spades; 8&clubs; 7&hearts; 6&diams; and A&spades; 3&diams; 4&hearts; Q&hearts; J&clubs; beats K&spades; 8&clubs; Q&hearts; 10&diams; 9&hearts;.</li>
</ol>

### 입력

<p>Input to this problem will begin with a line containing a single integer <em>N</em> (1 &le; <em>N</em> &le; 100) indicating the number of data sets. Each data set will consist of a line with an integer <em>M</em> (1 &le; <em>M</em> &le; 100) specifying the number of poker hands in this data set, followed by a description of the cards in each player&#39;s hand with each hand specified on a separate line. Each playing card is described by a two character string, and a poker hand consists of five such strings separated by spaces:</p>

<ol>
	<li>The first character specifies the card&#39;s rank as follows:
	<ul>
		<li>The letters &ldquo;<code>A</code>&rdquo;, &ldquo;<code>K</code>&rdquo;, &ldquo;<code>Q</code>&rdquo;, and &ldquo;<code>J</code>&rdquo; respectively specifying <em>ace</em>, <em>king</em>, <em>queen</em>, and <em>jack</em>.</li>
		<li>A &ldquo;<code>0</code>&rdquo; (number zero) specifying a card of rank <em>10</em>.</li>
		<li>The numbers &ldquo;<code>2</code>&rdquo; through &ldquo;<code>9</code>&rdquo; specifying a card of the same numeric rank.</li>
	</ul>
	</li>
	<li>The second charater gives the card&#39;s suit with &ldquo;<code>H</code>&rdquo;, &ldquo;<code>S</code>&rdquo;, &ldquo;<code>D</code>&rdquo;, and &ldquo;<code>C</code>&rdquo; respectively specifying <em>hearts</em>, <em>spades</em>, <em>diamonds</em>, and <em>clubs</em>.</li>
</ol>

<p>You may assume that in the input the same card (i.e. having the same rank and suit) will never appear more than once within a single poker hand.</p>

### 출력

<p>For each data set in the input, output the heading &ldquo;<code>Data Set #<em>k</em></code>&rdquo; where <em>k</em> is 1 for the first data set, 2 for the second, etc. Following the heading, output the poker hands (one per line) from the input in sorted order from the most to least valuable. You may assume that no two poker hands in the input have the same relative worth, therefore a unique sorted order will exist for each data set. The individual cards within each hand must be printed in the same order as read in from the input.</p>