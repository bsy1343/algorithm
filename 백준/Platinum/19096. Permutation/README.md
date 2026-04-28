# [Platinum III] Permutation - 19096

[문제 링크](https://www.acmicpc.net/problem/19096)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 48, 정답: 19, 맞힌 사람: 13, 정답 비율: 40.625%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 해 구성하기, 역추적

### 문제 설명

<p>Byteasar urgently needs two integer sequences for his research: an increasing one and a decreasing one. However, the only thing he has is a permutation $(p_1, p_2, \ldots, p_n)$ of the numbers in the range $[1, n]$. Can you help him partition this permutation into two such sequences?</p>

<p>Formally, we&#39;re looking for two subsequences $p_{r_1}, p_{r_2}, \ldots, p_{r_R}$ and $p_{m_1}, p_{m_2}, \ldots, p_{m_M}$ ($R, M \geq 0$) such that:</p>

<ul>
	<li>$1 \leq r_1 &lt; \ldots &lt; r_R \leq n$ and $p_{r_1}&lt;\ldots&lt;p_{r_R}$,</li>
	<li>$1 \leq m_1 &lt; \ldots &lt; m_M \leq n$ and $p_{m_1}&gt;\ldots&gt;p_{m_M}$,</li>
	<li>$r_i \neq m_j$ for all $i,j$ ($1\leq i\leq R$, $1\leq j\leq M$),</li>
	<li>$R+M=n$.</li>
</ul>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \leq t \leq 50$) -- the number of testcases in the input file. The following lines describe the consecutive testcases.</p>

<p>A single testcase description consists of two lines. The first of them contains an integer $n$ ($1 \leq n \leq 100\,000$) -- the length of the permutation $(p_i)$. The following line contains $n$ integers $p_1, \ldots, p_n$ ($1 \leq p_i \leq n$ and $p_i \neq p_j$ for all $i \neq j$) -- the permutation itself.</p>

### 출력

<p>For each testcase (in the order they appear in the input) you should output <code>YES</code>&nbsp;if the permutation can be partitioned into suitable subsequences or&nbsp;<code>NO</code>&nbsp;otherwise. If the partitioning is possible, you should output another two lines describing a sample solution. You should follow the format described below: $$R \; p_{r_1} \; p_{r_2} \; \ldots \; p_{r_R}$$ $$M \; p_{m_1} \; p_{m_2} \; \ldots \; p_{m_M}$$ In case there are many solutions, you can output any of them.</p>