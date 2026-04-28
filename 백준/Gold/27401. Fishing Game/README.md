# [Gold I] Fishing Game - 27401

[문제 링크](https://www.acmicpc.net/problem/27401)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 2, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

많은 조건 분기, 다이나믹 프로그래밍

### 문제 설명

<p>Fishing is a card game that is played with a deck of cards consisting of 3N (1 &le; N &lt; 100) pairs of cards, numbered from 1 to 3N (the deck contains 6N cards overall).</p>

<p>Three friends (A, B and C) play Fishing. The rules are as follows:</p>

<ol>
	<li>Initially, each player receives 2N cards.</li>
	<li>Then, each player discards all same-value pairs of cards they have.</li>
	<li>Rounds consisting of three steps are played until all remaining cards get discarded:
	<ol style="list-style-type:lower-alpha;">
		<li>A passes one of his cards to B (unless A doesn&#39;t have any). If B now has a pair of same-value cards, it gets discarded.</li>
		<li>B passes one of his cards to C (unless B doesn&#39;t have any). If C now has a pair of same-value cards, it gets discarded.</li>
		<li>C passes one of his cards to A (unless C doesn&#39;t have any). If A now has a pair of same-value cards, it gets discarded.</li>
	</ol>
	</li>
</ol>

<p>You are given the hands of the three players at the end of step (1). It&#39;s known that at least one pair of same-value cards has to be discarded during each round described at point (3).</p>

<p>Compute the number of different ways the game can play out. Since this number can be quite large, output it modulo 1 000 000 007.</p>

<p>Two ways the game can play out are considered different if during one step the current player chooses to pass a different card.</p>

### 입력

<p>The first line of input contains two integers N and T (1 &le; T &le; 10), where T is the number of game scenarios to analyse.</p>

<p>The description of T game scenarios follows. Each game scenario consists of three lines:</p>

<p>The first line contains 2N card values - player A&#39;s hand at the end of step (1).</p>

<p>The second line contains 2N card values - player B&#39;s hand at the end of step (1).</p>

<p>The third line contains 2N card values - player C&#39;s hand at the end of step (1).</p>

### 출력

<p>For each game scenario, print the number of different ways the game can play out modulo 1 000 000 007 on a separate line.</p>

### 힌트

<p>First, during step (2), player B discards all their cards. At this point, the players&#39; hands are:</p>

<ul>
	<li>A : 1, 2</li>
	<li>B : no cards</li>
	<li>C : 1, 2</li>
</ul>

<p>There are two ways the game can play out from this point:</p>

<ol>
	<li>A passes card 1 to B. Then, B passes it to C. This way, C discards the pair of cards with value 1. Then, C has to pass his remaining card to A, who discards it.</li>
	<li>A passes card 2 to B. Then, B passes it to C. This way, C discards the pair of cards with value 2. Then, C has to pass his remaining card to A, who discards it.</li>
</ol>