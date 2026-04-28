# [Platinum IV] Efficient Partitioning - 23107

[문제 링크](https://www.acmicpc.net/problem/23107)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 50, 정답: 18, 맞힌 사람: 16, 정답 비율: 44.444%

### 분류

이분 탐색, 매개 변수 탐색

### 문제 설명

<p>Let a <em>partition</em> of $[0, N)$ be an integer sequence $S = (s_0, \ldots, s_r$) that satisfies the following three conditions:</p>

<ul>
	<li>$s_0 = 0$,</li>
	<li>$s_r = N$,</li>
	<li>$s_i &lt; s_{i + 1}$ ($0 \le i &lt; r$).</li>
</ul>

<p>That is, for each $i$, $[s_i, s_i + 1)$ represents a continuous interval, and $[0, N)$ is the union of these $r$ intervals.</p>

<p>Given are three sequences of length $N$ consisting of integers between $-10^9$ and $10^9$: $A$ ($a_0, \ldots, a_{N-1}$), $B$ ($b_0, \ldots, b_{N-1}$), $C$ ($c_0, \ldots, c_{N-1}$).</p>

<p>Let the score of partition $S$ be $f(S)$ defined as follows:</p>

<p>$$ f(S)=\min_{0 \leq i &lt; r}\left\{b_{s_i}+c_{s_{i+1}-1}+\sum_{s_i \leq j &lt; s_{i+1}} a_j\right\} $$</p>

<p>Find the maximum value of $f$ over all possible partitions $S$.</p>

### 입력

<p>The first line of input contains one integer $N$ ($1 \le N \le 2 \cdot 10^5$). The second line contains $n$ integers: $i$-th of them denotes $a_i$. The third and fourth lines describe the sequences $b$ and $c$ in the same format ($-10^9 \le a_i, b_i, c_i \le 10^9$).</p>

### 출력

<p>Print one integer: the maximum score over all possible partitions.</p>