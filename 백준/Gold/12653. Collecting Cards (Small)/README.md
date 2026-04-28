# [Gold II] Collecting Cards (Small) - 12653

[문제 링크](https://www.acmicpc.net/problem/12653)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 33, 정답: 20, 맞힌 사람: 20, 정답 비율: 71.429%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>You&#39;ve become addicted to the latest craze in collectible card games, PokeCraft: The Gathering. You&#39;ve mastered the rules! You&#39;ve crafted balanced, offensive, and defensive decks! You argue the merits of various cards on Internet forums! You compete in tournaments! And now, as they just announced their huge new set of cards coming in the year 2010, you&#39;ve decided you&#39;d like to collect every last one of them! Fortunately, the one remaining sane part of your brain is wondering: how much will this cost?</p>

<p>There are&nbsp;<strong>C</strong>&nbsp;kinds of card in the coming set. The cards are going to be sold in &quot;booster packs&quot;, each of which contains&nbsp;<strong>N</strong>&nbsp;cards of different kinds. There are many possible combinations for a booster pack where no card is repeated. When you pay for one pack, you will get any of the possible combinations with equal probability. You buy packs one by one, until you own all the&nbsp;<strong>C</strong>&nbsp;kinds. What is the expected (average) number of booster packs you will need to buy?</p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow, each consisting of a line containing&nbsp;<strong>C</strong>&nbsp;and&nbsp;<strong>N</strong>.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le;&nbsp;<strong>C</strong>&nbsp;&le; 10</li>
</ul>

### 출력

<p>For each test case, output one line in the form</p>

<pre>
Case #x: E
</pre>

<p>where&nbsp;<strong>x</strong>&nbsp;is the case number,starting from 1, and&nbsp;<strong>E</strong>&nbsp;is the expected number of booster packs you will need to buy. Any answer with a relative or absolute error at most 10<sup>-5</sup>&nbsp;will be accepted.</p>