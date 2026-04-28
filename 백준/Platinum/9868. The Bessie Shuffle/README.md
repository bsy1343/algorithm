# [Platinum II] The Bessie Shuffle - 9868

[문제 링크](https://www.acmicpc.net/problem/9868)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 153, 정답: 46, 맞힌 사람: 32, 정답 비율: 31.068%

### 분류

자료 구조, 희소 배열, 순열 사이클 분할

### 문제 설명

<p>Bessie is practicing her card tricks. She has already mastered the Bessie- shuffle -- a shuffle on M (2 &lt;= M &lt;= 100,000) cards that reorganizes the cards so the i-th card from the top is now the P[i]-th card from the top.</p>

<p>Now Bessie is practicing shuffles on larger decks. She has a deck of N cards (M &lt;= N &lt;= 1,000,000,000) conveniently labeled 1 to N. She shuffles this deck by taking the first M cards and performing the Bessie-shuffle on them, placing the shuffled cards back on top of the deck. She then removes the top card from the deck and places it face down. She repeats this process, placing the top cards successively on top of each other, until she is out of cards. When Bessie has less than M cards left, she no longer performs the Bessie-shuffle, but continues to place the top card on top of the others.</p>

<p>Bessie knows that the deck initially started in sorted order, with 1 on top, 2 next, and N on the bottom. Given the description of the Bessie-shuffle, help Bessie compute which cards end up located at Q different specified positions (1 &lt;= Q &lt;= N, Q &lt;= 5,000) in the deck.</p>

<p>50% of test cases will have N &lt;= 100,000.</p>

### 입력

<ul>
	<li>Line 1: A single line containing N, M and Q separated by a space.</li>
	<li>Lines 2..1+M: Line i+1 indicates the position from the top, P[i], of the i-th card in the Bessie-shuffle (1 &lt;= P[i] &lt;= M).</li>
	<li>Lines 2+M..1+M+Q: Line i+1+M contains a single integer q_i describing the i-th query. You are to compute the label on the card located in position q_i from the top (1 &lt;= q_i &lt;= N).</li>
</ul>

### 출력

<ul>
	<li>Lines 1..Q: On the i-th line, print a single integer indicating the card at position q_i from the top.</li>
</ul>

### 힌트

<h4>Input Details</h4>

<p>Bessie has a deck of 5 cards initially ordered as [1, 2, 3, 4, 5]. Her shuffle is on 3 cards and has the effect of moving the top card to the bottom. There are 5 queries querying each position in the deck.</p>

<h4>Output Details</h4>

<p>The shuffle proceeds as:</p>

<ul>
	<li>[1, 2, 3, 4, 5] -&gt; [2, 3, 1, 4, 5] (put 2 face down)</li>
	<li>[3, 1, 4, 5] -&gt; [1, 4, 3, 5] (put 1 face down)</li>
	<li>[4, 3, 5] -&gt; [3, 5, 4] (put 3 face down)</li>
	<li>[5, 4] (put 5 face down)</li>
	<li>[4] (put 4 face down)</li>
</ul>

<p>This produces the final order of [4, 5, 3, 1, 2]</p>