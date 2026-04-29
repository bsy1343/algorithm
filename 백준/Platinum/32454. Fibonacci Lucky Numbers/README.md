# [Platinum II] Fibonacci Lucky Numbers - 32454

[문제 링크](https://www.acmicpc.net/problem/32454)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 186, 정답: 97, 맞힌 사람: 70, 정답 비율: 46.980%

### 분류

분할 정복을 이용한 거듭제곱, 수학, 오일러 피 함수, 정수론, 피사노 주기

### 문제 설명

<p>Welcome to the <strong>Lucky 777 Slot Game</strong>! This game is known for its complex mathematical challenges, where only the smartest can win the jackpot.</p>

<p>The slot machine is powered by a mysterious sequence—the <strong>Fibonacci sequence</strong>. But it’s no ordinary Fibonacci sequence; it has a twist inspired by the number $7$, the symbol of luck in slot games.</p>

<p>When you pull the lever of the <strong>Lucky 777 Slot Machine</strong>, it generates a gigantic number using an integer $n$ and the power of sevens: $7^{7^{7^n}}$. This number, however, is so massive that even the most powerful computers cannot handle it directly.</p>

<p>To claim the jackpot, you need to compute the last $10$ digits of the $F_{7^{7^{7^n}}}$, the $7^{7^{7^n}}$-th Fibonacci number.</p>

### 입력

<p>The frst line contains an integer $t$ indicating the number of test cases. Each of the following $t$ lines is a test case and contains exactly one positive integer $n$.</p>

### 출력

<p>For each test case, output one line contains the last $10$ digits of $F_{7^{7^{7^n}}}$.</p>

### 제한

<ul>
	<li>$1 ≤ t ≤ 20$</li>
	<li>$1 ≤ n ≤ 10^9$</li>
</ul>

### 힌트

<p>The Fibonacci sequence is defined as:</p>

<ul>
	<li>$F_0 = 0$</li>
	<li>$F_1 = 1$</li>
	<li>$F_k = F_{k-1} + F_{k-2}$ for $k ≥ 2$</li>
</ul>