# [Platinum III] Increasing Sequence Card Game - 23018

[문제 링크](https://www.acmicpc.net/problem/23018)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 97, 정답: 67, 맞힌 사람: 46, 정답 비율: 66.667%

### 분류

수학, 조합론, 미적분학

### 문제 설명

<p>You&#39;re playing a card game as a single player.</p>

<p>There are N cards. The i-th card has integer i written on it.</p>

<p>You first shuffle N cards randomly and put them in a pile. Take the card at the top of the pile to your hand. Then repeat the following process until the pile becomes empty:</p>

<ol>
	<li>Check the card on the top of the pile.</li>
	<li>If the number on the card is larger than the number on the last card you took, take the card.</li>
	<li>Otherwise, discard the card.</li>
</ol>

<p>The score of the game is the number of cards in your hand at the end. With the given number of cards N, what is the expected score of the game?</p>

### 입력

<p>The first line of the input contains the number of test cases, T. T lines follow. Each line contains a single integer N, the number of cards in the pile.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the expected score at the end of the game.</p>

<p><code>y</code>&nbsp;will be considered correct if it is within an absolute or relative error of 10<sup>-6</sup>&nbsp;of the correct answer.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
</ul>