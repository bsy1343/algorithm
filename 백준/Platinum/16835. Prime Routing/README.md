# [Platinum V] Prime Routing - 16835

[문제 링크](https://www.acmicpc.net/problem/16835)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 25, 맞힌 사람: 25, 정답 비율: 86.207%

### 분류

수학, 그래프 이론, 그래프 탐색, 정수론, 너비 우선 탐색, 소수 판정, 홀짝성

### 문제 설명

<p>Fox Jiro is one of the staffs of the ACM-ICPC 2018 Asia Yokohama Regional Contest and is responsible for designing the network for the venue of the contest. His network consists of $N$ computers, which are connected by $M$ cables. The $i$-th cable connects the $a_i$-th computer and the $b_i$-th computer, and it carries data in both directions. Your team will use the $S$-th computer in the contest, and a judge server is the $T$-th computer.</p>

<p>He decided to adjust the routing algorithm of the network to maximize the performance of the contestants through the magical power of prime numbers. In this algorithm, a packet (a unit of data carried by the network) is sent from your computer to the judge server passing through the cables a prime number of times if possible. If it is impossible, the contestants cannot benefit by the magical power of prime numbers. To accomplish this target, a packet is allowed to pass through the same cable multiple times.</p>

<p>You decided to write a program to calculate the minimum number of times a packet from $S$ to $T$ needed to pass through the cables. If the number of times a packet passes through the cables cannot be a prime number, print $-1$.</p>

### 입력

<p>The input consists of a single test case, formatted as follows.</p>

<pre class="mathjax">
$N$ $M$ $S$ $T$ $a_1$ $b_1$ $\vdots$ $a_M$ $b_M$</pre>

<p>The first line consists of four integers $N$, $M$, $S$, and $T$ ($2 \leq N \leq 10^5$, $1 \leq M \leq 10^5$, $1 \leq S, T \leq N$, $S \neq T$). The $i$-th line of the following $M$ lines consists of two integers $a_i$ and $b_i$ ($1 \leq a_i &lt; b_i \leq N$), which means the $i$-th cables connects the $a_i$-th computer and the $b_i$-th computer in the network. You can assume that the network satisfies the following conditions.</p>

<ul>
	<li>The network has no multi-edge, i.e., $(a_i, b_i) \neq (a_j, b_j)$ for all $i$, $j$ ($1 \leq i \lt j \leq M$).</li>
	<li>The packets from $N$ computers are reachable to $T$ by passing through some number of cables. The number is not necessarily a prime.</li>
</ul>

### 출력

<p>If there are ways such that the number of times a packet sent from $S$ to $T$ passes through the cables is a prime number, print the minimum prime number of times in one line. Otherwise, print $-1$.</p>