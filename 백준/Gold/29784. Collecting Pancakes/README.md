# [Gold IV] Collecting Pancakes - 29784

[문제 링크](https://www.acmicpc.net/problem/29784)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 14, 맞힌 사람: 13, 정답 비율: 59.091%

### 분류

누적 합

### 문제 설명

<p>Alice and Bob both have a sweet tooth, and they are going to play a game to collect pancakes. There are $\mathbf{N}$ pancake stacks lined up on the table labeled from $1$ to $\mathbf{N}$. The $i$-th stack has exactly $\mathbf{A_i}$ pancakes. Alice and Bob are going to collect pancakes by alternating turns claiming full stacks. For the first turn, Alice must choose a stack labeled between $\mathbf{L_a}$ and $\mathbf{R_a}$, inclusive, and claim it. Then, Bob must choose a stack labeled between $\mathbf{L_b}$ and $\mathbf{R_b}$, inclusive, and different from the one chosen by Alice, and claim it.</p>

<p>In subsequent turns, each of them must choose an unclaimed stack that is adjacent to a stack they claimed themselves before. That is, for Alice to claim stack $i$ on one of her turns other than the first, she must have claimed either stack $i-1$ or stack $i+1$ in one of her previous turns. The same is true for Bob. If at some point there is no valid choice for either player, they skip that turn and claim no stack.</p>

<p>The game ends when every stack is claimed. At that point, Alice collects all pancakes from all stacks she claimed, and Bob collects all pancakes in all stacks he claimed.</p>

<p>Alice wants to get as many pancakes as possible for herself, and Bob wants to get as many pancakes as possible for himself. Can you help Alice find out the maximum number of pancakes she can collect if they both play optimally?</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow. Each test case consists of three lines.</p>

<p>The first line of each test case contains an integer $\mathbf{N}$, representing the number of pancake stacks.</p>

<p>The second line contains $\mathbf{N}$ integers $\mathbf{A_1}, \mathbf{A_2}, \dots, \mathbf{A_N}$, where $\mathbf{A_i}$ denotes the number of pancakes in stack $i$.</p>

<p>The third line contains $4$ integers $\mathbf{L_a}$, $\mathbf{R_a}$, $\mathbf{L_b}$, and $\mathbf{R_b}$, the inclusive ranges of pancake stack labels Alice and Bob can choose for their first turn, respectively.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the maximum number of pancakes Alice can collect after playing the game optimally.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$1 \le \mathbf{A_i} \le 10^9$, for all $i$.</li>
	<li>$1 \le \mathbf{L_a} \le \mathbf{R_a} \le \mathbf{N}$</li>
	<li>$1 \le \mathbf{L_b} \le \mathbf{R_b} \le \mathbf{N}$</li>
	<li>It is not the case that $\mathbf{L_a} \le \mathbf{L_b} = \mathbf{R_b} \le \mathbf{R_a}$. (Bob is guaranteed to be able to pick a stack for his first turn regardless of Alice&#39;s choice.)</li>
</ul>

### 힌트

<p>In Sample Case #1, there are $5$ pancake stacks with $30, 50, 40, 20, 10$ pancakes in them. Alice can choose the first or second stack at the beginning of the game, and Bob can choose the fourth or fifth stack to begin with. One way in which they both play optimally is:</p>

<ol>
	<li>At the beginning, Alice claims stack $2$, then Bob claims stack $4$.</li>
	<li>Alice claims stack $3$ in her second turn, then Bob claims stack $5$ in his second turn.</li>
	<li>Alice claims stack $1$ in her third turn, then the game ends because all stacks have been claimed.</li>
</ol>

<p>At the end of the game, Alice claimed stacks $1, 2$, and $3$ and Bob claimed stacks $4$ and $5$. The number of pancakes Alice collects is $30+50+40=120$.</p>

<p>In Sample Case #2, one way of optimal play is:</p>

<ol>
	<li>At the beginning, Alice claims stack $3$, then Bob claims stack $2$.</li>
	<li>Alice claims stack $4$ in her second turn, then Bob claims stack $1$ in his second turn.</li>
	<li>Alice claims stack $5$ in her third turn, then the game ends because all stacks have been claimed.</li>
</ol>

<p>The number of pancakes Alice collects is $80+10+10=100$.</p>

<p>In Sample Case #3, both can claim any stack in their first turn. Since stack $1$ is more valuable than everything else combined, Alice claims it before Bob does. Then, Bob can claim stack $2$, making Alice have to skip all her subsequent turns. Alice still finishes with $90$ pancakes and Bob with just $30$.</p>