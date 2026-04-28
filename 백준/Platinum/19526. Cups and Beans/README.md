# [Platinum I] Cups and Beans - 19526

[문제 링크](https://www.acmicpc.net/problem/19526)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 26, 정답: 19, 맞힌 사람: 16, 정답 비율: 84.211%

### 분류

이분 탐색, 자료 구조, 게임 이론, 세그먼트 트리, 스프라그–그런디 정리

### 문제 설명

<p>There are $N$ cups numbered 0 through $N-1$. For each $i (1 \leq i \leq N-1)$, the cup $i$ contains $A_i$ beans, and this cup is labeled with an integer $C_i$.</p>

<p>Two people will play the following game:</p>

<ul>
	<li>In each turn, the player chooses a bean from one of the cups except for the cup $0$.</li>
	<li>If he chooses a bean from the cup $i$, he must move it to one of the cups $i-C_i, \ldots, i-1$.</li>
	<li>The players take turns alternately. If a player can&#39;t choose a bean, he loses.</li>
</ul>

<p>Who will win if both players play optimally?</p>

### 입력

<p>$N$<br />
$C_1$&nbsp;$A_1$<br />
$C_2$ $A_2$<br />
$\vdots$<br />
$C_{N-1}$ $A_{N-1}$</p>

### 출력

<p>Print the name of the winner: &quot;<code>First</code>&quot; or &quot;<code>Second</code>&quot;.</p>

### 제한

<ul>
	<li>$2 \leq N \leq 10^5$</li>
	<li>$1 \leq C_i \leq i$</li>
	<li>$0 \leq A_i \leq 10^9$</li>
	<li>At least one of $A_i$ is nonzero.</li>
	<li>All values in the input are integers.</li>
</ul>

### 힌트

<p>Notes to the Sample 1:</p>

<ul>
	<li>In the first turn, the first player must move a bean from $2$ to $1$.</li>
	<li>In the second turn, the second player must move a bean from $1$ to $0$.</li>
	<li>In the third turn, the first player can&#39;t choose a bean and loses.</li>
</ul>