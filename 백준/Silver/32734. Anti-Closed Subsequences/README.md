# [Silver II] Anti-Closed Subsequences - 32734

[문제 링크](https://www.acmicpc.net/problem/32734)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 74, 정답: 45, 맞힌 사람: 30, 정답 비율: 54.545%

### 분류

수학, 애드 혹

### 문제 설명

<p>We consider a set of integers $S$ to be <em>anti-closed</em> if there <strong>do not</strong> exist elements $x$, $y$ and $z$ in $S$ where $x+y=z$ ($x$, $y$ and $z$ do not necessarily have to be distinct).</p>

<p>For example:</p>

<ul>
	<li>$\{2, 3, 7\}$ is anti-closed, because no such $x$, $y$, $z$ exist</li>
	<li>$\{1, 3, 7, 10\}$ is not anti-closed, because $3$, $7$, and $10$ are all in the set and $3+7=10$</li>
	<li>$\{2, 4\}$ is also not anti-closed, because $2$ and $4$ are in the set and $2+2=4$</li>
</ul>

<p>You are given an array $a$ of $n$ distinct integers. Partition it into at most $60$ anti-closed subsequences. Formally, find an array $b$ of size $n$ such that</p>

<ul>
	<li>$1 \leq b_i \leq 60$ for all $1 \le i \le n$</li>
	<li>For each $1 \le x \le 60$, the subsequence of $a$ containing all values at indices $i$ where $b_i = x$ is anti-closed (The empty subsequence is considered anti-closed)</li>
</ul>

<p>It can be shown that a solution always exists.</p>

### 입력

<p>The first line of the input contains a single integer $n$ ($1 \le n \le 10^4$) --- the size of the array $a$.</p>

<p>The next line of the input contains $n$ distinct integers $a_1, a_2 \cdots a_n$ ($1 \le a_i \le 10^{18}$) --- the elements of the array $a$.</p>

### 출력

<p>Output $n$ integers $b_1, b_2, \cdots b_n$ ($1 \le b_i \le 60$), representing the partition of $a$, as described above.</p>

<p>If there are multiple solutions, print any.</p>

### 힌트

<p>For the first test case, the input array is partitioned into these subsequences:</p>

<ul>
	<li>$b_i = 1$: $\{1, 4, 6, 15\}$</li>
	<li>$b_i = 2$: $\{2, 3, 9, 10, 14\}$</li>
	<li>$b_i = 3$: $\{5, 7, 8\}$</li>
	<li>$b_i = 4$: $\{11, 12, 13\}$</li>
</ul>

<p>We can show that each of these sets is anti-closed.</p>