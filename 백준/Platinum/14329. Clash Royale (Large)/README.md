# [Platinum IV] Clash Royale (Large) - 14329

[문제 링크](https://www.acmicpc.net/problem/14329)

### 성능 요약

시간 제한: 20 초, 메모리 제한: 512 MB

### 통계

제출: 67, 정답: 17, 맞힌 사람: 9, 정답 비율: 23.077%

### 분류

자료 구조, 다이나믹 프로그래밍, 해시를 사용한 집합과 맵, 중간에서 만나기, 두 포인터, 집합과 맵

### 문제 설명

<p>Clash Royale is a real time strategy card game. Each card has an attack power and a level. Each player picks 8 cards to form a battle deck; the total attack power of a deck is the sum of the attack power of each of its cards. Players fight with each other by placing cards from their battle decks into the battle arena. The winner of a battle is rewarded with coins, which can be used to upgrade cards. Upgrading a card increases its attack power. &lt;p/&gt;</p>

<p>After days of arena fighting, Little Shawn has accumulated a total of&nbsp;M&nbsp;coins. He has decided to upgrade some of his cards. Little Shawn has&nbsp;N&nbsp;cards. The i-th card can have any level from 1 through&nbsp;K<sub>i</sub>; the attack power for the j-th level is&nbsp;A<sub>i,j</sub>. Cards must be upgraded one level at a time; the price to upgrade the i-th card from level j to level j+1 costs&nbsp;C<sub>i,j</sub>&nbsp;coins. The i-th card is currently at level&nbsp;L<sub>i</sub>&nbsp;before Little Shawn has upgraded any cards.</p>

<p>Little Shawn wants to use some or all of his coins to upgrade cards, and then form a deck of exactly 8 cards, so that the deck&#39;s total attack power is as large as possible. Can you help him do this? He can upgrade the same card more than once as long as he can afford it, and he does not have to upgrade every card.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each test case starts with 2 integers&nbsp;M&nbsp;and&nbsp;N, the number of coins and the number of cards that Little Shawn possesses. Then&nbsp;N&nbsp;blocks follow. The i-th block consists of 3 lines describing the i-th card. The first line contains two integers&nbsp;K<sub>i</sub>&nbsp;and&nbsp;L<sub>i</sub>, the maximum possible level and current level of the card. The second line contains&nbsp;K<sub>i</sub>&nbsp;integers&nbsp;A<sub>i,1</sub>,&nbsp;A<sub>i,2</sub>, ...,&nbsp;A<sub>i,K<sub>i</sub></sub>, the attack power of each level. The third line contains&nbsp;K<sub>i</sub>-1 integers&nbsp;C<sub>i,1</sub>,&nbsp;C<sub>i,2</sub>, ...,&nbsp;C<sub>i,K<sub>i</sub>-1</sub>, the number of coins required to upgrade a card that is currently at level 1, 2, ...,&nbsp;K<sub>i</sub>-1.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the maximal possible total attack power of a deck that Little Shawn can form, using the coins that he has.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;K<sub>i</sub>&nbsp;&le; 10.</li>
	<li>1 &le;&nbsp;L<sub>i</sub>&nbsp;&le;&nbsp;K<sub>i</sub>.</li>
	<li>A<sub>i,j</sub>&nbsp;&lt;&nbsp;A<sub>i,j+1</sub>.</li>
	<li>1 &le;&nbsp;M&nbsp;&le; 1,000,000,000.</li>
	<li>8 &le;&nbsp;N&nbsp;&le; 12.</li>
	<li>1 &le;&nbsp;A<sub>i,j</sub>&nbsp;&le; 1,000,000,000.</li>
	<li>1 &le;&nbsp;C<sub>i,j</sub>&nbsp;&le; 1,000,000,000.</li>
</ul>

### 힌트

<p>In sample case #1, you can upgrade the first 4 cards to level 3, upgrade the 5th and 6th card to level 2, keep the last 2 cards level 1. This will cost you (1+2)+(1+3)+(1+4)+(1+5)+1+1=20 coins and the total attack power is 100+100+100+100+10+10+1+1=422 which is the maximal possible we can get.&nbsp;</p>

<p>Sample case #2 would only appear in Large dataset.</p>