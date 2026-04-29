# [Silver III] Sequence - 34452

[문제 링크](https://www.acmicpc.net/problem/34452)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 16, 정답: 14, 맞힌 사람: 13, 정답 비율: 86.667%

### 분류

구현, 시뮬레이션, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>The board and card game <em>Sequence</em> is played with two standard decks of cards (not including Jokers or any special cards: only two of each suit, hearts, clubs, diamonds, and spades, consisting of cards $2$, $3$, $4$, $5$, $6$, $7$, $8$, $9$, $10$, Jack, Queen, King and Ace) and a board with each of the cards on it, <em>except</em> for the Jacks. Tokens are placed on the board by each player to claim a spot as theirs.</p>

<p>Each card may only be played on one of its two corresponding spots on the board, and a token is placed on that spot. Each spot may only contain one token: so a card cannot be played on a particular spot on the board if there is already a token on that spot. The exception is the Jacks, since the Jacks are not represented on the board. The Jack of diamonds and clubs can be played anywhere where there is not already a token, and the Jack of hearts and spades can remove any token on the board.</p>

<p>Assume you have an empty starting board and are given an ordered list of moves made by the players. Each move contains information on which card was played, whether that card was used to place or remove a token, and which token on the board was placed or removed. Using this information, determine if there was an invalid move, or if the list of moves was valid.</p>

### 입력

<p>Input starts with a single integer on it's own line, $N$ ($1 \le N \le 104$), which indicates the number of moves. The next $N$ lines contain four values, separated by spaces:</p>

<ul>
	<li>An integer $1 \le n \le N$ indicating the turn number. You are guaranteed that the turns will be given in input in order, and that each turn number is unique.</li>
	<li>The card played, represented as two characters: a number or letter and a suit. The card number or letter is <code>2</code>, <code>3</code>, <code>4</code>, <code>5</code>, <code>6</code>, <code>7</code>, <code>8</code>, <code>9</code>, <code>X</code> (representing $10$), <code>J</code> (representing Jack), <code>Q</code> (representing Queen), <code>K</code> (representing King), or <code>A</code> (representing Ace). The suit is a lowercase <code>h</code> (for hearts), <code>c</code> (for clubs), <code>d</code> (for diamonds), or</li>
	<li><code>s</code> (for spades). You are guaranteed that each card will be seen at most twice, as there are only two decks in play.</li>
	<li>A character <code>P</code> or <code>R</code> indicating whether a token was placed or removed.</li>
	<li>A card, in the same format as the card played, indicating where the token was placed or removed on the board. You are guaranteed that this card will not be a Jack, since Jacks are not on the board.</li>
</ul>

### 출력

<p>If the list of moves is valid, output <code>VALID GAME</code>.</p>

<p>If the list of moves is invalid, output <code>INVALID</code>, followed by the first move number that makes it invalid.</p>

### 힌트

<ul>
	<li><strong>Input 1:</strong> This game is valid. On move $4$, the Jack of hearts was used to remove the $5$ of spades, so a card can be played on this token again using either a Jack of diamonds or a Jack of clubs.</li>
	<li><strong>Input 2:</strong> A Jack of spades is allowed to remove tokens, but there was never a token played on the $3$ of hearts.</li>
	<li><strong>Input 3:</strong> Both $2$ of spades on the board already have a token on them, so another $2$ of spades cannot be played.</li>
	<li><strong>Input 4:</strong> The Jack of clubs is not allowed to remove tokens.</li>
</ul>