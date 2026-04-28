# [Platinum V] Seven Up - 30554

[문제 링크](https://www.acmicpc.net/problem/30554)

### 성능 요약

시간 제한: 13 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 구현, 수학, 확률론

### 문제 설명

<p>The one-player game of <em>Seven Up</em> is played with a standard deck of 52 cards - each card has one of thirteen possible <em>faces</em> which we denote by <code>A</code>, <code>2</code>, <code>3</code>, <code>4</code>, <code>5</code>, <code>6</code>, <code>7</code>, <code>8</code>, <code>9</code>, <code>T</code>, <code>J</code>, <code>Q</code>, and <code>K</code>. There are exactly four cards of each face.</p>

<p>Initially, seven cards are dealt face down in positions numbered 1 through 7. The ace (<code>A</code>) has value $1$, the cards with faces <code>2</code>--<code>7</code> have corresponding values $2$ through $7$, and the remaining cards do not have any value.</p>

<p>A single turn consists of the player drawing a card from the top of the deck (initially having $52-7 = 45$ cards). The following steps are repeated until the turn is <strong>ended</strong>:</p>

<ul>
	<li>if the card has no value (i.e. the face is not one of <code>A</code>, <code>2</code>, <code>3</code>, <code>4</code>, <code>5</code>, <code>6</code>, or <code>7</code>), the turn has <strong>ended</strong>,</li>
	<li>otherwise if the card in the position corresponding to the value of the card held by the player is already face up, the turn has <strong>ended</strong>,</li>
	<li>otherwise the player swaps the card they are holding with the card in the corresponding position except the card they placed in this position is now face up, the current turn continues</li>
</ul>

<p>At the end of a turn, if all seven positions have a face-up card, the game ends.</p>

<p>If the remaining $45$ cards are randomly permuted so each ordering is equally likely, what is the expected number of turns until the game completes?</p>

<p>More specifically, if for any $1 \leq k \leq 45$ we let $p_k$ denote the probability (over the random ordering of the remaining $45$ cards) the game finishes after $k$ turns are completed. You should compute $\sum_{k = 1}^{45} k \cdot p_k$.</p>

### 입력

<p>Input consists of a single string consisting of exactly 7 characters from <code>A23456789TJQK</code> denoting the faces of the 7 cards that were dealt face down into their corresponding positions. No face will appear more than four times in this string.</p>

### 출력

<p>Output a single value giving the expected number of turns until the game completes. Your answer should have an absolute or relative error of less than $10^{-6}$.</p>