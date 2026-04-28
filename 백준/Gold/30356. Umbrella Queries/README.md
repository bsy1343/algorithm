# [Gold IV] Umbrella Queries - 30356

[문제 링크](https://www.acmicpc.net/problem/30356)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 79, 정답: 54, 맞힌 사람: 45, 정답 비율: 78.947%

### 분류

수학, 기하학

### 문제 설명

<p>Micchan noticed that an umbrella is a regular polygon when looking from above. So, she created the following problem.</p>

<p><strong>Umbrella Query</strong></p>

<p>A regular $N$ polygon has $N$ edges and $\frac{N(N-1)}{2} - N$ diagonals. Consider the union of them, which includes $\frac{N(N-1)}{2}$ line segments.</p>

<p>How many pairs of line segments satisfy the following $2$ conditions?</p>

<ul>
	<li>The $2$line segments have a common endpoint. In other words, they have a common point at one of the vertices of the regular $N$ polygon.</li>
	<li>The $2$ line segments are perpendicular.</li>
</ul>

<p>Micchan has given $T$ of the above problems. However, her friend cannot solve too many requests. Answer each problem on her behalf.</p>

### 입력

<blockquote>
<p>$T$</p>

<p>$N_1$</p>

<p>$N_2$</p>

<p>$\vdots$</p>

<p>$N_T$</p>
</blockquote>

### 출력

<p>Output the answer in $T$ lines. On the $i$-th line, output the answer to the problem when $N = N_i$. Add a new line at the end of each line.</p>

### 제한

<ul>
	<li>All inputs consist of integers.</li>
	<li>$1 \le T \le 10^5$</li>
	<li>$3 \le N_i \le 10^9$</li>
</ul>

### 힌트

<p>In Sample Input 1, you count only pairs of line segments that intersect perpendicularly at the vertices of the square.</p>