# [Platinum V] Pyramid - 15204

[문제 링크](https://www.acmicpc.net/problem/15204)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 128, 정답: 64, 맞힌 사람: 34, 정답 비율: 43.038%

### 분류

이분 탐색, 매개 변수 탐색, 포함 배제의 원리

### 문제 설명

<p>Archaeologists have just deciphered hieroglyphs on walls of a pyramid. The&nbsp;writings on one of the walls describe $N$ sacred numbers. All numbers which are&nbsp;divisible by at least one of these numbers are also sacred.</p>

<p>The writings on $M$ other walls claim that the $Q_i$-th lowest sacred number has&nbsp;magic properties. The archaeologists would like to know which numbers have the&nbsp;magic properties. Could you help them with that?</p>

<p>You are given $N$ positive integers $A_1, A_2, \ldots, A_N$ and $M$ positive&nbsp;integers $Q_1, Q_2, \ldots, Q_M$. For each $i \in \{ 1, 2, \ldots, M \}$ find the&nbsp;$Q_i$-th lowest positive integer which is divisible by at least one of the&nbsp;integers $A_1, A_2, \ldots, A_N$.</p>

### 입력

<p>The first line of the input contains two integers $N$ a $M$. The second line&nbsp;contains space-separated integers $A_1$, $A_2$, $\ldots$, $A_N$. Then, $M$ lines&nbsp;follow. Each of them contains an integer $Q_i$.</p>

<ul>
	<li>It holds $1 \leq N \leq 15$ and $1 \leq M \leq 50$.</li>
	<li>For all $i \in \{ 1, 2, \ldots, N \}$ it holds $2 \leq A_i \leq 10^{18}$.</li>
	<li>For the product of these numbers it holds $A_1 \cdot A_2 \cdot \ldots \cdot A_N \leq 10^{18}$.</li>
	<li>For all $i \in \{ 1, 2, \ldots, M \}$ it holds $1 \leq Q_i \leq 10^{18}$.</li>
	<li>Each number on the output is lower than or equal to $10^{18}$.</li>
	<li>Furthermore, in 10 % of the testcases $Q_1, Q_2, \ldots, Q_M \leq 10^6$.&nbsp;Furthermore, in 30 % of the testcases $N \leq 2$.</li>
</ul>

### 출력

<p>Output $M$ lines. The $i$-th line should contain the $Q_i$-th lowest positive&nbsp;integer which is divisible by at least one of the integers&nbsp;$A_1, A_2, \ldots, A_N$.</p>