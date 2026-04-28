# [Silver I] Biology - 15450

[문제 링크](https://www.acmicpc.net/problem/15450)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 16, 맞힌 사람: 15, 정답 비율: 65.217%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Vera has A &times; B cards. Each card has a rank, an integer between 0 and A &minus; 1, and a suit, an integer between 0 and B &minus; 1. All cards are distinct. A set of five different cards is known as a hand. Each hand is in exactly one of nine categories numbered from 1 to 9. If a hand satisfies the conditions for membership in multiple categories, it is considered to be in the lowest-numbered such category. The rules for each category are:</p>

<ol>
	<li>Straight flush: is a Straight and a Flush.</li>
	<li>Four of a kind: four of the cards have the same rank.</li>
	<li>Full house: three of the cards have the same rank and the remaining two have the same rank.</li>
	<li>Flush: all five cards have the same suit.</li>
	<li>Straight: the ranks of the cards in increasing order are x, x + 1, x + 2, x + 3, x + 4 for some integer x.</li>
	<li>Three of a kind: three of the cards have the same rank.</li>
	<li>Two pair: two cards have the same rank and two other cards have the same rank.</li>
	<li>One pair: two cards have the same rank.</li>
	<li>High card: if a hand does not satisfy any other category.</li>
</ol>

<p>Currently, Vera has two cards with ranks a<sub>1</sub>, a<sub>2</sub> and suits b<sub>1</sub>, b<sub>2</sub>. Of the remaining cards, Vera will choose three more cards and form a hand with her two current cards. Compute the number of different hands formed in this way that belong in each category.</p>

### 입력

<p>Line 1 contains integers A and B (5 &le; A &le; 25, 1 &le; B &le; 4).</p>

<p>Line 2 contains integers a<sub>1</sub>, b<sub>1</sub>, a<sub>2</sub>, b<sub>2</sub> (0 &le; a<sub>1</sub>, a<sub>2</sub> &le; A &minus; 1, 0 &le; b<sub>1</sub>, b<sub>2</sub> &le; B &minus; 1, (a<sub>1</sub>, b<sub>1</sub>) &ne; (a<sub>2</sub>, b<sub>2</sub>)).</p>

### 출력

<p>Print one line with nine integers, the number of different of hands that belong in each category in increasing order of categories (from Straight flush to High card).</p>

### 힌트

<p>Let (a, b) denote a card with rank a and suit b.</p>

<p>For the first example, Vera currently has cards (1, 0) and (3, 1). If she chooses additional cards (3, 0),(4, 0),(4, 1), her hand will be a Two pair as there are two cards with rank 3 and two other cards with rank 4. Note that this hand also satisfies being a One pair, but Two pair is the lower-numbered category.</p>