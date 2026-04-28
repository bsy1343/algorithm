# [Gold IV] Jar of Water Game - 17538

[문제 링크](https://www.acmicpc.net/problem/17538)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 60, 정답: 19, 맞힌 사람: 16, 정답 비율: 30.769%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>The schedule of the day for a programming contest usually follows the same pattern: warmup in the morning, followed by lunch time, some rest time, final adjustments of the competition environment and then the start of the contest.</p>

<p>At rest time some contestants prefer to relax, others prefer to socialize and some have a habit of playing some game of cards. Luciano and his friends enjoy playing a game known as &ldquo;Jar of Water&rdquo;. Tired of not being the winner, Luciano wants to write a program that, given the initial cards of all players (don&rsquo;t ask me how he knows it), determines whether he will win or not. If he is not going to win, he can then make up any excuse and ask not to participate in that round.</p>

<p>The game works as follows:</p>

<ul>
	<li>The deck used has the cards: &ldquo;A23456789DQJK&rdquo; (in this order, from lowest to highest value), where suits are ignored. In addition, the deck has one more extra card: a wildcard.</li>
	<li>N contestants sit side by side in a circle. Contestant 1 is immediately to the left of contestant 2, which is immediately to the left of contestant 3, and so on until completing the circle with the N-th contestant immediately to the left of contestant 1. A contestant K is selected randomly to start the game.</li>
	<li>In a game with N contestants there will be four cards of each of N different values and one wildcard. At the beginning of the game, the contestant K receives the wildcard; The remaining cards are shuffled and distributed among the players so that each player receives four of them.</li>
	<li>In each round, the contestant in turn chooses one of his cards and passes it to the contestant to his right. The contestant who received the card will be the next contestant in turn.</li>
	<li>We say a contestant is in a winning state if he has exactly four cards in hand and they all have the same value. The game ends as soon as at least one competitor is in the winning state. In this case, the competitor with lowest number in winning state will be declared the winner of the game.</li>
</ul>

<p>The card that will be passed from one competitor to the next is selected by the following rule:</p>

<ul>
	<li>The wildcard can never be passed as soon after being received. This also applies to the starting player who received the card dealer&rsquo;s wildcard just before the first round.</li>
	<li>The contestant will, whenever possible, pass the wildcard to the next.</li>
	<li>If the contestant can not pass the wildcard, the contestant will choose the card that appears least in his hand and move that card to the next competitor. If there is more than one card that appears less often, the contestant will select, among these, the one with lowest value in the order described above.</li>
</ul>

<p>Knowing the rules, help Luciano write a program that, given the initial setup of the game, tells which player will be declared the winner of the game.</p>

### 입력

<p>The first line of input contains two integer numbers N and K (2 &le; N &le; 13, 1 &le; K &le; N) representing the number of contestants in the game and the contestant who will start the game, respectively. Each of the following N lines contains four characters, representing the initial cards for the i-th contestant (not considering the wildcard).</p>

### 출력

<p>Your program must output a single line, containing an integer number, representing the contestant who will be declared winner of the game.</p>