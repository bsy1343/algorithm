# [Gold II] Cake Game - 33059

[문제 링크](https://www.acmicpc.net/problem/33059)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 302, 정답: 162, 맞힌 사람: 152, 정답 비율: 59.144%

### 분류

게임 이론, 누적 합

### 문제 설명

<p>Bessie and Elsie have discovered a row of $N$ cakes $(2 \leq N \leq 5\cdot 10^5, N \text{ even})$ cakes, with sizes $a_1,a_2,\dots,a_N$ in that order ($1\le a_i\le 10^9$).</p>

<p>Each cow wants to eat as much as possible. However, being very civilized cows, they decided to play a game to split it! The game proceeds with both cows alternating turns. Each turn consists of one of the following:</p>

<ol>
	<li>Bessie chooses two adjacent cakes and stacks them, creating a new cake with the sum of the sizes.</li>
	<li>Elsie chooses either the leftmost or rightmost cake and puts it in her stash.</li>
</ol>

<p>When only one cake remains, Bessie eats it, and Elsie eats all cakes in her stash. If both cows play optimally to maximize the amount of cake they eat and Bessie plays first, how much cake will each cow eat?</p>

### 입력

<p>Each input consists of $T$ ($1\le T\le 10$) independent test cases. It is guaranteed that the sum of all $N$ within an input does not exceed $10^6$.</p>

<p>Each test case is formatted as follows. The first line contains $N$. The next line contains $N$ space-separated integers, $a_1,a_2,\ldots,a_N$.</p>

### 출력

<p>For each test case, output a line containing $b$ and $e$, representing the amounts of cake Bessie and Elsie respectively will consume if both cows play optimally.</p>

### 힌트

<p>For the first test case, under optimal play,</p>

<ol>
	<li>Bessie will stack the middle two cakes. The cakes now have sizes $[40,50,10]$.</li>
	<li>Elsie will eat the leftmost cake. The remaining cakes now have sizes $[50,10]$.</li>
	<li>Bessie stacks the remaining two cakes.</li>
</ol>

<p>Bessie will eat $30+20+10=60$ cake, while Elsie will eat $40$ cake.</p>

<p>The second test case is the reverse of the first, so the answer is the same.</p>