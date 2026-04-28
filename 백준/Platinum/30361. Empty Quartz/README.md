# [Platinum IV] Empty Quartz - 30361

[문제 링크](https://www.acmicpc.net/problem/30361)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 27, 맞힌 사람: 24, 정답 비율: 77.419%

### 분류

수학, 누적 합, 조합론

### 문제 설명

<p>$N$ crystals are aligned in a row. However, some of them may be phantoms.</p>

<p>Jun counted the number of <strong>real</strong> crystals from $l$-th to $r$-th (closed interval) for every $l$, $r$ ($1 \le l \le r \le N$) pair and recorded their evenness.</p>

<p>His $\frac{N(N+1)}{2}$ records show that there were $k$ intervals that contained an odd number of real crystals. How many possible crystal alignments are there? Answer the remainder divided by $998244353$.</p>

<p>Note that if there is $i$ such that the $i$-th crystal from the left is real on one side and phantom on the other, the two alignments are considered different.</p>

<p>You are given $T$ of the above problems. Answer each of them.</p>

### 입력

<blockquote>
<p>$T$</p>

<p>$N_1$ $K_1$</p>

<p>$\vdots$</p>

<p>$N_T$ $K_T$</p>
</blockquote>

### 출력

<p>Output $T$ lines. On the line $i$, answer the problem when $N = N_i$, $K = K_i$. Add a new line at the end of each line.</p>

### 제한

<ul>
	<li>All inputs consist of integers.</li>
	<li>$1 \le T \le 10^5$</li>
	<li>$1 \le N_i \le 10^5$</li>
	<li>$0 \le K_i \le \frac{N_i(N_i+1)}{2}$</li>
</ul>

### 힌트

<p>If we denote a real crystal as $1$ and an phantom as $0$, the following three alignments satisfy the condition at Sample Input 1.</p>

<ul>
	<li>$0, 1, 0$</li>
	<li>$1, 0, 1$</li>
	<li>$1, 1, 1$</li>
</ul>