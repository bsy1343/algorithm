# [Platinum III] Game with Balls and Boxes - 24659

[문제 링크](https://www.acmicpc.net/problem/24659)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 82, 정답: 35, 맞힌 사람: 32, 정답 비율: 44.444%

### 분류

다이나믹 프로그래밍, 순열 사이클 분할

### 문제 설명

<p>There are $N$ boxes and $N$ balls. You are playing a game that goes as follows.</p>

<p>The boxes are enumerated by sequential integers from $1$ to $N$, and the balls are also enumerated by sequential integers from $1$ to $N$. The $i$-th box initially contains the ball $P_i$.</p>

<p>Each box is either open or closed. Initially, all boxes are closed.</p>

<p>Then two rounds of ball movement are performed. In each round, you:</p>

<ol>
	<li>Select zero or more boxes and open them. To open the box $i$ for the first round, you pay $A_i$ coins. To open the box $i$ for the second round, you pay $B_i$ coins.</li>
	<li>Move the balls freely between the open boxes. However, each box must contain exactly one ball when the move is complete.</li>
	<li>Close all open boxes.</li>
</ol>

<p>After two rounds, for each $i$, the box $i$ must contain the ball $i$. Find the minimal sum of coins you shall pay to complete the game.</p>

### 입력

<p>The first line of input contains one integer $N$ ($1 \le N \le 10^5$).</p>

<p>The second line contains $N$ integers $P_1, P_2, \ldots, P_N$: here, $P_i$ is the number of the ball that was initially placed in $i$-th box ($1 \le P_i \le N$, $P_i \ne P_j$ if $i \ne j$).</p>

<p>The third line contains $N$ integers $A_1, A_2, \ldots, A_N$: here, $A_i$ is the price of opening the $i$-th box for the first round ($1 \le A_i \le 10^9$).</p>

<p>The fourth line contains $N$ integers $B_1, B_2, \ldots, B_N$: here, $B_i$ is the price of opening the $i$-th box for the second round ($1 \le B_i \le 10^9$).</p>

### 출력

<p>Print one integer: the minimal sum of coins you need to pay to have $i$-th ball in the $i$-th box for each $i$ after two rounds.</p>