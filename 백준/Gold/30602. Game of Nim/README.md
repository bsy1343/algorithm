# [Gold I] Game of Nim - 30602

[문제 링크](https://www.acmicpc.net/problem/30602)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 61, 정답: 29, 맞힌 사람: 25, 정답 비율: 46.296%

### 분류

다이나믹 프로그래밍, 비트마스킹

### 문제 설명

<p>Georgiy and Gennady are playing a new game they have just invented after learning about the classical game of Nim. This game is played with $n$ stones and consists of two stages.</p>

<p>In the setup stage, Georgiy chooses a positive integer $p &lt; n$ and puts a pile of $p$ stones on a game field. After that, Gennady forms an arbitrary number of piles, each containing an arbitrary number of stones, using all $(n - p)$ stones not used by Georgiy.</p>

<p>For example, if $n = 10$ and $p = 2$, Gennady can form:</p>

<ul>
	<li>$8$ piles of $1$ stone each,</li>
	<li>or one pile of $5$ stones and one pile of $3$ stones,</li>
	<li>or $2$ piles of $2$ stones and $4$ piles of $1$ stone,</li>
	<li>or one pile of $8$ stones,</li>
	<li>etc.</li>
</ul>

<p>After the setup stage, the Nim stage comes. At this stage, the game of Nim is played. Players take turns, starting from Georgiy. On each turn, the player must remove at least one stone and may remove any number of stones, provided they all come from the same pile. The player who takes the last stone wins at Nim and, consequently, wins the entire game.</p>

<p>Georgiy and Gennady have just started the game, and now it is the middle of the setup stage: Georgiy has already made his pile of $p$ stones, but Gennady has not divided the remaining $(n - p)$ stones into piles yet. Now Gennady wants to know what his chances are to win the game.</p>

<p>You are to calculate the number of ways Gennady can divide $(n - p)$ stones into piles so that he will win the game, assuming that both players will play Nim optimally.</p>

<p>As you may know, according to the Sprague-Grundy theory, Gennady will win if and only if the bitwise exclusive or (XOR) of all pile sizes (the pile of $p$ stones and all piles made from the remaining $(n-p)$ stones) is equal to zero.</p>

<p>Since the answer can be large, please calculate it modulo $m$. Two ways are considered to be different if the corresponding multisets of pile sizes are different --- that is, the order of piles does not matter.</p>

### 입력

<p>The only line contains three integers $n$, $p$, and $m$, denoting the total number of stones in the game, the size of the pile chosen by Georgiy, and the value of the modulus ($1 \le p &lt; n \le 500$; $2 \le m \le 10^9$).</p>

### 출력

<p>Print the number of ways Gennady can divide the remaining $(n - p)$ stones into piles so that he will win the game, modulo $m$.</p>

### 힌트

<p>In the first example, the only two winning ways for Gennady to divide the remaining $5$ stones are:</p>

<ul>
	<li>one pile of $3$ stones and $2$ piles of $1$ stone,</li>
	<li>or one pile of $2$ stones and $3$ piles of $1$ stone.</li>
</ul>

<p>In the second example, no matter how Gennady divides the remaining $3$ stones, he is bound to lose.</p>