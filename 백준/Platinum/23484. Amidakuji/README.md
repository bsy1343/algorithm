# [Platinum I] Amidakuji - 23484

[문제 링크](https://www.acmicpc.net/problem/23484)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 43, 정답: 20, 맞힌 사람: 19, 정답 비율: 52.778%

### 분류

해 구성하기

### 문제 설명

<p>You are given a positive integer $N$. Construct a sequence of permutations of $(1,2,\cdots,N)$, $p_1,p_2,\ldots,p_K$, that satisfy following conditions, or report that it&#39;s impossible.</p>

<ul>
	<li>$0 \leq K \leq \lceil \log_2 N \rceil + 1$, where $K$ is the length of the sequence.</li>
	<li>$p_1,p_2,\ldots,p_K$ are permutations of $(1,2,\ldots,N)$.</li>
</ul>

<p>In other words, they are bijections from $\{1,2,\ldots,N\}$ to $\{1,2,\ldots,N\}$.</p>

<ul>
	<li>For all $x$ and $y$ ($1 \leq x,y \leq N$), there is a sequence of bijections $q_1,q_2,\ldots,q_K$ such that $(q_K \circ q_{K-1} \circ \cdots \circ q_1)(x) = y$ and $q_i=p_i$ or $p_i^{-1}$ for all $i$.</li>
</ul>

<p>Here, $\circ$ denotes function composition, and when $K=0$, $q_K \circ q_{K-1} \circ \cdots \circ q_1$ is defined as an identity function.</p>

### 입력

<p>Input is given from Standard Input in the following format:</p>

<p>$N$</p>

### 출력

<p>If there is no solution, print $-1$. Otherwise, print the answer in the following format:</p>

<p>$K$</p>

<p>$p_{1,1}$ $p_{1,2}$ $\cdots$ $p_{1,N}$</p>

<p>$\vdots$</p>

<p>$p_{K,1}$ $p_{K,2}$ $\cdots$ $p_{K,N}$</p>

<p>Here, $p_{i,j}$ must be a value of $p_i(j)$.</p>

<p>If there are multiple solutions, you can print any of them.</p>

### 제한

<ul>
	<li>$1 \leq N \leq 1000$</li>
</ul>

### 힌트

<p>In Sample 1 for $x=2,y=1$, we can set $q_1 = p_1, q_2 = p_2^{-1}, q_3 = p_3$ and get $q_3(q_2(q_1(2)))=1$.</p>