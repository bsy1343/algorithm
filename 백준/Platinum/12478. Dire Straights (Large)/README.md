# [Platinum V] Dire Straights (Large) - 12478

[문제 링크](https://www.acmicpc.net/problem/12478)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 63, 정답: 40, 맞힌 사람: 28, 정답 비율: 63.636%

### 분류

자료 구조, 그리디 알고리즘

### 문제 설명

<p>You are playing a card game, where each card has an integer number written on it.</p>

<p>To play the game, you are given some cards &mdash; your&nbsp;<em>hand</em>. Then you arrange the cards in your hand into&nbsp;<em>straights</em>. A straight is a set of cards with consecutive values; e.g. the three cards {3, 4, 5}, or the single card {7}. You then receive a number of dollars equal to the length of the shortest straight. If you have no cards, you can form no straights, so you get zero dollars.</p>

<p>You will be given a series of test cases, each of which describes the cards you will have in your hand. Find the maximum number of dollars you can receive for each test case.</p>

### 입력

<p>The first line of the input contains the number of test cases,&nbsp;<strong>T</strong>. Each test case consists of one line. Each line contains&nbsp;<strong>N</strong>, the number of cards in your hand, followed by&nbsp;<strong>N</strong>&nbsp;integers giving the numbers on those cards. These numbers are all space-separated.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100</li>
	<li>The numbers on the cards are between 1 and 10000.</li>
	<li>0 &le;&nbsp;<strong>N</strong>&nbsp;&le; 1000</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the maximum number of dollars you can receive.</p>

### 힌트

<p>In case 1, you have ten cards numbered 1 to 10, so you make one straight of length 10, and get 10 dollars.</p>

<p>In case 2, you could make two straights {101,102,103,104,105,106} and {103,104} and get 2 dollars. But it would be better to make {101,102,103,104} and {103,104,105,106} and get 4 dollars.</p>

<p>In case 4, the card with the number 9 must be in a straight containing only that card. So you get 1 dollar.</p>

<p>In case 3, you have zero cards, so you get zero dollars. You don&#39;t get money for nothing.</p>