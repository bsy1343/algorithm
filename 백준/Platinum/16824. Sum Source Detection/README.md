# [Platinum II] Sum Source Detection - 16824

[문제 링크](https://www.acmicpc.net/problem/16824)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 10, 정답: 9, 맞힌 사람: 9, 정답 비율: 90.000%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>JAG members began a game with integers. The game consists of $N + M + 1$ players: $N$ open number holders, $M$ secret number holders, and one answerer, you.</p>

<p>In the preparation, an integer $K$ is told to all $N+M+1$ players. $N + M$ number holders choose their own integers per person under the following restrictions:</p>

<ul>
	<li>Each holder owns a positive integer.</li>
	<li>The sum of all the integers equals $K$.</li>
	<li>Every integer owned by secret number holders is strictly less than any integers owned by open number holders.</li>
</ul>

<p>After the choices, $N$ open number holders show their integers $O_{1}, \dots, O_{N}$ to the answerer while secret number holders do not.</p>

<p>The game has $Q$ rounds. At the beginning of each round, $M$ secret number holders can change their numbers under the above restrictions, while open number holders cannot. Then $N + M$ number holders select part of members among them arbitrary, calculate the sum $X$ of the integers owned by the selected members, and tell $X$ to the answerer. For each round, the answerer tries to identify the definitely selected open number holders from the information $K$, $X$, and $O_{1}, \dots, O_{N}$: The answerer will get points per actually selected open number holder in the answer. On the other hand, if the answer contains at least one non-selected member, you lose your points got in the round. Thus, the answerer, you, must answer only the open number holders such that the holders are definitely selected.</p>

<p>Your task in this problem is to write a program to determine all the open number holders whose integers are necessary to the sum for each round in order to maximize your points.</p>

### 입력

<p>The input consists of a single test case formatted as follows.</p>

<pre class="mathjax">
$N$ $M$ $K$ $Q$ $O_{1}$ $\cdots$ $O_{N}$ $X_{1}$ $\cdots$ $X_{Q}$</pre>

<p>The first line consists of four integers $N$, $M$, $K$, and $Q$. $N$ and $M$ are the numbers of open number holders and secret number holders respectively $(1 \le N, 0 \le M, N + M \le 40)$. $K$ is an integer $(1 \le K \le 200{,}000)$. $Q$ is the number of rounds of the game $(1 \le Q \le 10{,}000)$.</p>

<p>The second line contains $N$ integers $O_{1}, \cdots, O_{N}$, as the $i$-th open number holder owns $O_{i}$ ($1 \le O_{1} \le \dots \le O_{N} \le K$).</p>

<p>The third line indicates $Q$ integers $X_{1}, \cdots, X_{Q}$ $(0 \le X_{i} \le K)$. $X_{i}$ is the sum of the integers owned by the selected members in the $i$-th round.</p>

<p>It is guaranteed that there is at least one way to compose $X_{i}$. In other words, you can assume that there is at least one integer sequence $S_{1}, \dots, S_{M}$, which represents integers owned by secret number holders, satisfying the followings:</p>

<ul>
	<li>$0 &lt; S_{j} &lt; O_{1}$ for $1 \le j \le M$. Note that $O_{1} = \min_{1 \le k \le N} O_{k}$ holds.</li>
	<li>$\sum_{j=1}^{N} O_{j} + \sum_{k=1}^{M} S_{k} = K$.</li>
	<li>There is at least one pair of subsets $U \subseteq \{1, \dots, N\}$ and $V \subseteq \{1, \dots, M\}$ such that $\sum_{j \in U} O_{j} + \sum_{k \in V} S_{k} = X_{i}$ holds.</li>
</ul>

### 출력

<p>On each sum $X_{i}$, print the indices of the open number holders whose integers are required to make up $X_{i}$. The output for each sum has to be printed in one line, in ascending order, and separated by a single space. If there is no open number holder whose integer is certainly used for $X_{i}$, print $-1$ in one line.</p>