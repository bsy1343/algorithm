# [Gold IV] The Game - 26197

[문제 링크](https://www.acmicpc.net/problem/26197)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 60, 정답: 45, 맞힌 사람: 40, 정답 비율: 83.333%

### 분류

구현

### 문제 설명

<p>Vladimir is the loneliest child in the neighbourhood. No other kid likes to play with him. His parents decided to cheer him up so they bought him a card game called <em>The Game</em>. This card game is for up to 5 players, but it can also be played in the <em>solo</em> (i.e. single-player) mode.</p>

<p>The package contains 98 <em>regular</em> playing cards that are labeled by integers $2, 3, \ldots, 99$. In addition to these, there are 4 special <em>direction</em> cards. Two of them are labeled with the number $1$ (followed by an up arrow) and the other two are labeled with $100$ (followed by a down arrow).</p>

<p>In the initial phase of the game, the pile of regular cards is shuffled and placed face down on the table &ndash; this will be the <em>draw</em> pile. The four direction cards are placed in a column; the two cards labeled $1$ have to be at the top. There should also be enough space on the right-hand side of each direction card &ndash; this is where regular cards will be laid during the play. The card labeled $1$ initiates an <em>ascending row</em>, while a card labeled $100$ initiates a <em>descending row</em>. In the solo mode, the player draws the top 8 cards from the draw pile, one by one, and puts them in his hand.</p>

<p>After the initial phase the game starts. On each turn the player has to play two cards from his hand according to the following rules:</p>

<ul>
	<li>A card may be placed at the end of an ascending row if it is larger than the last (i.e. right-most) card in the row.</li>
	<li>A card may be placed at the end of a descending row if it is smaller than the last card in the row.</li>
	<li>A card with a smaller label may be placed at the end of an ascending row, or a card with a larger label may be place at the end of a descending row, if the absolute difference between its value and the value of the last card in the row is exactly $10$. This move is called the <em>backwards trick</em>. Note that because of this extra rule, the values of the cards in an <em>ascending row</em> are not necessarily ascending (and similarly, the values of the cards in a <em>descending row</em> are not necessarily descending).</li>
</ul>

<p>After playing two cards from the hand, the player should draw two new cards from the draw pile, one by one. This concludes his turn. If the draw pile is empty, he continues playing in the same way without drawing new cards. The game ends when the player has no cards left in his hand (in that case the player <em>beats the game</em>) or if he cannot play any of the remaining cards in his hand (in that case the player has <em>lost the game</em>).</p>

<p><strong>Example</strong>: Suppose that the player&#39;s initial hand (i.e. the first 8 cards which he has drawn) is:</p>

<blockquote>
<p>69, 17, 59, 32, 31, 77, 87, 89</p>
</blockquote>

<p>He may decide to play the card $89$ (putting it in the first descending row) and the card $17$ (putting it in the second ascending row). The state of all four rows after the move is:</p>

<blockquote>
<p>1 -&gt; 1 -&gt; 17 100 &lt;- 89 100 &lt;-</p>
</blockquote>

<p>Then he has to pick up two more cards from the draw pile &ndash; suppose these two cards are $84$ and $3$ &ndash; and his hand becomes:</p>

<blockquote>
<p>69, 59, 32, 31, 77, 87, 84, 3</p>
</blockquote>

<p>In the second turn he might want to play the card $3$ (in the first ascending row) and card $87$ (in the first descending row, after card $89$). The state of all four rows after the move:</p>

<blockquote>
<p>1 -&gt; 3 1 -&gt; 17 100 &lt;- 89, 87 100 &lt;-</p>
</blockquote>

<p>Vladimir played the game for a few times and he could not always beat the game. Since he hates losing the game, you should write a computer program that will inspect the draw pile and predict the outcome of the game. This will help Vladimir to decide whether he wants to play it or not.</p>

<p>You should also know that Vladimir is a very logical and predictable person. He plays according to the following rules.</p>

<ul>
	<li>When he draws a card, he places it in his hand on the far-right side.</li>
	<li>He will always play a card from his hand according to his list of priorities:
	<ol>
		<li>If one or more cards allow him to do the backward trick, he will use the leftmost such card. If that card can be used for the backward trick in different rows, he will use the top-most amongst these rows.</li>
		<li>Otherwise, he plays a card in the regular way. He will select the card to play, and the row in which to put it, in such a way as to minimize the absolute value of the difference between the value of the card that is being played and the last card in the row. If several cards attain the minimum, he will use the left-most amongst these cards. Finally, if there are several choices of where to play this card, he will choose the top-most row.</li>
	</ol>
	</li>
</ul>

<p>Your program should find the final state of the game.</p>

### 입력

<p>The first (and only) line of the input contains $98$ space-separated integers, i.e. some permutation of the set $\{2, 3, \ldots, 99\}$ that represents the initial draw pile. The cards are listed in order from top to bottom of the draw pile.</p>

### 출력

<p>The output contains six lines. The first four lines describe the four rows of cards on the table. The fifth line lists the cards that remained in the player's hand (if any) while the last line lists the cards that remained in the draw pile (if any). Print an empty line in case of an empty list. Cards in the four rows and in the hand should be ordered from left to right, while the cards in the last line, which represents the remainder of the draw pile, should be ordered from top to bottom as in the input data. See also the sample outputs.</p>