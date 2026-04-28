# [Platinum I] Nim without Zero - 16831

[문제 링크](https://www.acmicpc.net/problem/16831)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 188, 정답: 74, 맞힌 사람: 60, 정답 비율: 40.816%

### 분류

게임 이론, 스프라그–그런디 정리

### 문제 설명

<p>Alice: &quot;Hi, Bob! Let&#39;s play Nim!&quot;</p>

<p>Bob: &quot;Are you serious? I don&#39;t want to play it. I know how to win the game.&quot;</p>

<p>Alice: &quot;Right, there is an algorithm to calculate the optimal move using XOR. How about changing the rule so that a player loses a game if he or she makes the XOR to $0$?&quot;</p>

<p>Bob: &quot;It sounds much better now, but I suspect you know the surefire way to win.&quot;</p>

<p>Alice: &quot;Do you wanna test me?&quot;</p>

<p>This game is defined as follows.</p>

<ol>
	<li>The game starts with $N$ heaps where the $i$-th of them consists of $a_i$ stones.</li>
	<li>A player takes any positive number of stones from any single one of the heaps in one move.</li>
	<li>Alice moves first. The two players alternately move.</li>
	<li>If the XOR sum, $a_1$ XOR $a_2$ XOR $\cdots$ XOR $a_N$, of the numbers of remaining stones of these heaps becomes $0$ as a result of a player&#39;s move, the player loses.</li>
</ol>

<p>Your task is to find which player will win if they do the best move.</p>

### 입력

<p>The input consists of a single test case in the format below.</p>

<pre class="mathjax">
$N$
$a_{1}$
$\vdots$
$a_{N}$</pre>

<p>The first line contains an integer $N$ which is the number of the heaps ($1 \le N \le 10^5$). Each of the following $N$ lines gives the number of stones in each heap ($1 \le a_i \le 10^9$).</p>

### 출력

<p>Output the winner, Alice or Bob, when they do the best move.</p>

### 힌트

<p>In the first example, the XOR sum is 0 in the initial state, but the game is going because nobody moves yet. First Alice takes a stone and the XOR sum becomes 1, then Bob takes the last stone and the XOR sum becomes 0. Therefore, Alice will win, and Bob will lose.</p>