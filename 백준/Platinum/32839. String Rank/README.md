# [Platinum II] String Rank - 32839

[문제 링크](https://www.acmicpc.net/problem/32839)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 2048 MB

### 통계

제출: 214, 정답: 100, 맞힌 사람: 68, 정답 비율: 44.444%

### 분류

다이나믹 프로그래밍, 문자열

### 문제 설명

<p>Let $w$ and $u$ be strings consisting of the English lowercase alphabet. We say that a string $u$ is a subsequence of a string $w$ if there exists a strictly increasing sequence of integers $i_1, \cdots , i_k$, where $|w| = n$, $|u| = k$ and $u[j] = w[i_j]$ for all $j = 1, \dots , k$. Here, $v[i]$ denotes the $i$-th character of the string $v$. Let $w[i:]$ denote the suffix $w[i] \cdots w[n]$. If $i &gt; n$, then $w[i: ]$ is the empty string denoted by $\lambda$.</p>

<p>Given a nonempty string $w$ and a positive integer $k$, we define the $k$-set of $w$ to be the set $Q_k(w)$ of subsequences of $w$ whose lengths are $0, 1, \cdots , k$. This implies that, for any string $w$, the empty string $\lambda$ belongs to $Q_k(w)$ by definition.</p>

<p>For example, when $w = $<code>aaba</code>, we have $Q_3($<code>aaba</code>$) = \{\lambda$, <code>a</code>, <code>b</code>, <code>ba</code>, <code>ab</code>, <code>aa</code>, <code>aba</code>, <code>aab</code>, <code>aaa</code>$\}$.</p>

<p>For a string $w$, we define the rank of $w$ to be the minimum integer $t$ such that the $t$-sets for all suffixes of $w$ are all different. In other words, the rank of $w$ is $\min\{t ≥ 1 | Q_t(w[i:]) \ne Q_t(w[j:]), ∀1 ≤ i &lt; j ≤ 𝑛\}$.</p>

<p>For instance, when $w = $<code>aaba</code>, the $2$-sets $Q_2($<code>aba</code>$)$ and $Q_2($<code>aaba</code>$)$ are equal. On the other hand, for $t = 3$, we have</p>

<ul>
	<li>$Q_3(\lambda) = \{\lambda\}$,</li>
	<li>$Q_3($<code>a</code>$) = \{\lambda$, <code>a</code>$\}$,</li>
	<li>$Q_3($<code>ba</code>$) = \{\lambda$, <code>a</code>, <code>b</code>, <code>ba</code>$\}$,</li>
	<li>$Q_3($<code>aba</code>$) = \{\lambda$, <code>a</code>, <code>b</code>, <code>ba</code>, <code>ab</code>, <code>aa</code>, <code>aba</code>$\}$,</li>
	<li>$Q_3($<code>aaba</code>$) = \{\lambda$, <code>a</code>, <code>b</code>, <code>ba</code>, <code>ab</code>, <code>aa</code>, <code>aba</code>, <code>aab</code>, <code>aaa</code>$\}$.</li>
</ul>

<p>Therefore, the rank of the string $w = $<code>aaba</code> is $3$.</p>

<p>Given a string $w$, write a program to output its rank.</p>

### 입력

<p>Your program is to read from standard input. The input consists of a single nonempty string $w$, which consists only of lowercase characters from the English alphabet. The length of the string is at most $3 \times 10^6$.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line. The line should contain a positive integer to represent the rank $t$ of the input string $w$.</p>