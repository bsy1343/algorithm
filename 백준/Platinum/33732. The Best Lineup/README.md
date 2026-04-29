# [Platinum IV] The Best Lineup - 33732

[문제 링크](https://www.acmicpc.net/problem/33732)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 123, 정답: 51, 맞힌 사람: 41, 정답 비율: 49.398%

### 분류

그리디 알고리즘, 세그먼트 트리, 스택, 자료 구조

### 문제 설명

<p>Farmer John has $N$ $(1 \leq N \leq 2 \cdot 10^5)$ cows in a line $a$. The $i$'th cow from the front of line $a$ is labeled an integer $a_i$ ($1 \leq a_i \leq N$). Multiple cows may be labeled the same integer.</p>

<p>FJ will construct another line $b$ in the following manner:</p>

<ul>
	<li>Initially, $b$ is empty.</li>
	<li>While $a$ is nonempty, remove the cow at the front of $a$ and potentially add that cow to the back of $b$.</li>
</ul>

<p>FJ wants to construct line $b$ such that the sequence of labels in $b$ from front to back is lexicographically greatest (see the footnote).</p>

<p>Before FJ constructs line $b$, he can perform the following operation at most once:</p>

<ul>
	<li>Choose a cow in line $a$ and move it anywhere before its current position.</li>
</ul>

<p>Given that FJ optimally performs the aforementioned operation at most once, output the lexicographically greatest label sequence of $b$ he can achieve.</p>

<p>Each input will consist of $T$ ($1 \leq T \leq 100$) independent test cases.</p>

### 입력

<p>The first line contains $T$.</p>

<p>The first line of each test case contains $N$.</p>

<p>The second line of each test case contains $N$ space-separated integers $a_1, a_2, \ldots, a_N$.</p>

<p>It is guaranteed that the sum of $N$ over all test cases does not exceed $10^6$.</p>

### 출력

<p>For each test case, output the lexicographically greatest $b$ on a new line.</p>

### 힌트

<p>Recall that a sequence $s$ is lexicographically greater than a sequence $t$ if and only if one of the following holds:</p>

<ul>
	<li>At the first position $i$ where $s_i \neq t_i$, $s_i &gt; t_i$.</li>
	<li>If no such $i$ exists, $s$ is longer than $t$.</li>
</ul>