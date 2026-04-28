# [Gold III] Autobiography - 31110

[문제 링크](https://www.acmicpc.net/problem/31110)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 22, 정답: 15, 맞힌 사람: 14, 정답 비율: 73.684%

### 분류

수학, 그래프 이론, 조합론

### 문제 설명

<p>Bobo has an undirected graph with $n$ vertices and $m$ edges. The vertices are numbered by $1, \dots, n$, and the $i$-th edge is between the $a_i$-th and the $b_i$-th vertex. Plus, the $i$-th vertex is associated with a character $c_i$.</p>

<p>Find the number of ways to choose four <strong>distinct</strong> vertices $(u, v, w, x)$ such that</p>

<ul>
	<li>$u$ and $v$, $v$ and $w$, $w$ and $x$ are connected by an edge,</li>
	<li>$c_u = \mathtt{b}$, $c_v = \mathtt{o}$, $c_w = \mathtt{b}$, $c_x = \mathtt{o}$.</li>
</ul>

### 입력

<p>The input consists of several test cases terminated by end-of-file. For each test case,</p>

<p>The first line contains two integers $n$ and $m$.</p>

<p>The second line contains $n$ characters $c_1 \dots c_n$.</p>

<p>For the following $m$ lines, the $i$-th line contains two integers $a_i$ and $b_i$.</p>

### 출력

<p>For each test case, output an integer which denotes the number of ways.</p>

### 제한

<ul>
	<li>$4 \le n \le 2 \times 10^5$</li>
	<li>$0 \le m \le 2 \times 10^5$</li>
	<li>$c_i \in \{\mathtt{b}, \mathtt{o}\}$ for each $1 \leq i \leq n$</li>
	<li>$1 \leq a_i, b_i \leq n$ for each $1 \leq i \leq m$</li>
	<li>$a_i \neq b_i$ for each $1 \leq i \leq m$</li>
	<li>$\{a_i, b_i\} \neq \{a_j, b_j\}$ for each $1 \leq i &lt; j \leq m$</li>
	<li>In each input, the sum of $n$ does not exceed $2 \times 10^5$. The sum of $m$ does not exceed $2 \times 10^5$.</li>
</ul>

### 힌트

<p>For the first test case, there are $2$ quadrangles $(1, 3, 4, 5)$, $(2, 3, 4, 5)$.</p>

<p>For the second test case, there are $4$ quadrangles $(1, 2, 3, 4)$, $(1, 4, 3, 2)$, $(3, 2, 1, 4)$, $(3, 4, 1, 2)$.</p>

<p>For the third test case, there are no valid quadrangles.</p>