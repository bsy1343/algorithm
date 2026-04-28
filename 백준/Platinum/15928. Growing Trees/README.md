# [Platinum III] Growing Trees - 15928

[문제 링크](https://www.acmicpc.net/problem/15928)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 768 MB

### 통계

제출: 107, 정답: 32, 맞힌 사람: 27, 정답 비율: 41.538%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍, 삼분 탐색

### 문제 설명

<p>You are given a weighted tree $T$ with $N$ nodes. The initial weight of the $i^{th}$ edge is $C_i$, but every day the weight changes by $A_i$. Thus, its weight will be $C_i + k * A_i$ in day $k$. Note that the weights might be negative.</p>

<p>The diameter of $T$ is defined as a the maximum distance between any two nodes. Note that because the weights might be negative, it is possible the two nodes determining the diameter are not distinct.</p>

<p>You will observe the tree for $D+1$ days, starting from day 0 until day $D$. You want to find a date which minimizes the diameter. Formally, you need to find an integer $x \in [0, D]$ such that no other integer in $[0, D]$ yields a smaller diameter. If there is more than one such integer, you should find a smallest such integer.</p>

### 입력

<p>The first line contains the number of nodes $N$, and the number of observing days $D$.</p>

<p>Each of the next $N-1$ lines contains four integer $S_i, E_i, C_i, A_i$, which indicates edge $i$ connects two vertices $S_i$ and $E_i$, and it has cost $C_i$ in day $0$, and it changes by $A_i$ everyday.</p>

### 출력

<p>On the first line, print the integer $x \in [0, D]$ that minimizes the diameter in interval $[0, D]$. If there is more than one such integer, find a smallest such integer.</p>

<p>On the next line, print the diameter of tree in day $x$, when $x$ is the day you found in first line.</p>

### 제한

<ul>
	<li>$1 \leq N \leq 250\ 000$&nbsp;</li>
	<li>$0 \leq D \leq 10^6$&nbsp;</li>
	<li>$1 \leq S_i, E_i \leq N$&nbsp;</li>
	<li>$|C_i| \leq 10^8$&nbsp;</li>
	<li>$|A_i| \leq 10^3$</li>
</ul>