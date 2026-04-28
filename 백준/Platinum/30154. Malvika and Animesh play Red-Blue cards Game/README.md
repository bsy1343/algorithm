# [Platinum II] Malvika and Animesh play Red-Blue cards Game - 30154

[문제 링크](https://www.acmicpc.net/problem/30154)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 53, 정답: 25, 맞힌 사람: 16, 정답 비율: 50.000%

### 분류

수학, 애드 혹, 게임 이론, 불변량 찾기

### 문제 설명

<p>After 2 hours of Mathematics and chill, Malvika and Animesh got bored of solving problems and decided to play a game. They have n cards with them, each of which is red on one side and blue on the other. They initially put them in a row, from left to right. They then takes turns, with Malvika going first.</p>

<p>In a single turn, the player should choose a card which has its red face up. The player also chooses zero or more consecutive blue faced cards, with the sequence starting immediately on the right of the chosen red card. All the chosen cards are then flipped. That is, the red faced card will now be blue. The zero or more blue faced cards will now be red. Then the turn ends, and it&#39;s the other player&#39;s turn.</p>

<p>You will be given the initial arrangement of the n cards as a string of R&#39;s and B&#39;s, which imply red facing-up and blue facing-up, respectively. They will be given in order, from left to right.</p>

<p>The player who is not able to make any move in his/her turn loses. Find out the winner, assuming that both Malvika and Animesh play optimally.</p>

### 입력

<p>The first line of input contains a single integer T denoting the number of test cases.</p>

<p>The only line of each test case contains a string of &#39;R&#39;s and &#39;B&#39;s.</p>

### 출력

<p>For each test case, output a single line. It should be &quot;Malvika&quot; (without quotes) if Malvika is the winner, and &quot;Animesh&quot; (without quotes) if Animesh is the winner.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100</li>
	<li>1 &le; n &le; 500, where n refers to the length of each string.</li>
</ul>

### 힌트

<p>In the first example, Malvika will flip the red faced card in the first move, so it will now be blue faced. Now Animesh can&#39;t make any move, so he will lose. Hence Malvika is the winner.</p>

<p>In the second example, Malvika can not make any move in the first turn itself, and therefore she loses. Hence Animesh is the winner.</p>