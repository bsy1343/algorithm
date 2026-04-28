# [Platinum I] Paired Up - 23872

[문제 링크](https://www.acmicpc.net/problem/23872)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 151, 정답: 79, 맞힌 사람: 60, 정답 비율: 49.587%

### 분류

다이나믹 프로그래밍, 많은 조건 분기, 두 포인터

### 문제 설명

<p>There are a total of $N$ ($1\le N\le 10^5$) cows on the number line. The location of the $i$-th cow is given by $x_i$ ($0 \leq x_i \leq 10^9$), and the weight of the $i$-th cow is given by $y_i$ ($1 \leq y_i \leq 10^4$).</p>

<p>At Farmer John&#39;s signal, some of the cows will form pairs such that</p>

<ul>
	<li>Every pair consists of two distinct cows $a$ and $b$ whose locations are within $K$ of each other ($1\le K\le 10^9$); that is, $|x_a-x_b|\le K$.</li>
	<li>Every cow is either part of a single pair or not part of a pair.</li>
	<li>The pairing is <em>maximal;</em> that is, no two unpaired cows can form a pair.</li>
</ul>

<p>It&#39;s up to you to determine the range of possible sums of weights of the unpaired cows. Specifically,</p>

<ul>
	<li>If $T=1$, compute the minimum possible sum of weights of the unpaired cows.</li>
	<li>If $T=2$, compute the maximum possible sum of weights of the unpaired cows.</li>
</ul>

### 입력

<p>The first line of input contains $T$, $N$, and $K$.</p>

<p>In each of the following $N$ lines, the $i$-th contains $x_i$ and $y_i$. It is guaranteed that $0\le x_1&lt; x_2&lt; \cdots&lt; x_N\le 10^9$.</p>

### 출력

<p>Please print out the minimum or maximum possible sum of weights of the unpaired cows.</p>