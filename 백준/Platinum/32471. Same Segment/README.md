# [Platinum I] Same Segment - 32471

[문제 링크](https://www.acmicpc.net/problem/32471)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 161, 정답: 32, 맞힌 사람: 26, 정답 비율: 20.000%

### 분류

다이나믹 프로그래밍, 두 포인터, 역추적, 자료 구조

### 문제 설명

<p>You have a sequence $a$ of $N$ integers between $0$ and $K$ inclusive. $M$ segments are given, where $i$th segment is $[l_i,r_i]$. We want $\sum_{j=l_i}^{r_i}a_j=K$ to satisfy for every segment. Determine whether there exists such sequence $a$.</p>

### 입력

<p>Each test data contains one or more test cases. The first line contains an integer $T$ — the number of test cases for this input file.</p>

<p>First line of each test case contains $3$ integers $N$, $M$, $K$.</p>

<p>$i$-th of the next $M$ lines contain two integers $l_i$ and $r_i$: left and right end of $i$-th segment.</p>

### 출력

<p>For each test case, if a sequence that satisfies the condition exists, output the elements of the sequence. In case of multiple answers you may output any of them.</p>

<p>If no valid sequence exists, output a single integer $-1$.</p>

### 제한

<ul>
	<li>$1\leq T\leq 10^5$</li>
	<li>$2\leq N\leq 4\times 10^5$</li>
	<li>$1\leq M\leq\min\left( 2\times 10^5,\frac{N(N+1)}{2} \right)$</li>
	<li>$1\leq K\leq 20$</li>
	<li>$1\leq l_i\leq r_i\leq N$</li>
	<li>$(l_i,r_i)\neq(l_j,r_j)$ for $i\neq j$</li>
	<li>Sum of $N$ over every test case does not exceed $4\times 10^5$.</li>
	<li>Sum of $M$ over every test case does not exceed $2\times 10^5$.</li>
</ul>