# [Platinum I] Primes and Queries - 23014

[문제 링크](https://www.acmicpc.net/problem/23014)

### 성능 요약

시간 제한: 90 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 38, 정답: 12, 맞힌 사람: 10, 정답 비율: 35.714%

### 분류

자료 구조, 수학, 정수론, 세그먼트 트리

### 문제 설명

<p>You are given a prime number&nbsp;$P$.</p>

<p>Let&#39;s define&nbsp;$V(x)$&nbsp;as the degree of&nbsp;$P$&nbsp;in the prime factorization of&nbsp;$x$. To be clearer, if&nbsp;$V(x)=y$&nbsp;then&nbsp;$x$&nbsp;is divisible by&nbsp;$P^y$, but not divisible by&nbsp;$P^{y+1}$. Also we define $V(0)=0$.</p>

<p>For example, when&nbsp;$P=3$, and&nbsp;$x=45$, since&nbsp;$45=5 \cdot 3^2$, therefore&nbsp;$V(45)=2$.</p>

<p>You are also given an array&nbsp;$A$&nbsp;with&nbsp;$N$&nbsp;elements. You need to process&nbsp;$Q$&nbsp;queries of&nbsp;$2$&nbsp;types on this array:</p>

<ul>
	<li>type&nbsp;$1$&nbsp;query:&nbsp;<code>1&nbsp;pos&nbsp;val</code>&nbsp;- assign a value $val$&nbsp;to the element at&nbsp;$pos$, i.e.&nbsp;$A_{pos} := val$</li>
	<li>type&nbsp;$2$&nbsp;query:&nbsp;<code>2&nbsp;S L R</code>&nbsp;- print&nbsp;$\displaystyle\sum_{i=L}^{R}{V(A_i^S - (A_i \bmod P)^S)}$.</li>
</ul>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;$T$.&nbsp;$T$&nbsp;test cases follow.</p>

<p>The first line of each test case contains&nbsp;$3$&nbsp;space separated positive integers&nbsp;$N$,&nbsp;$Q$&nbsp;and&nbsp;$P$&nbsp;- the number of elements in the array, the number of queries and a prime number.</p>

<p>The next line contains&nbsp;$N$&nbsp;positive integers&nbsp;$A_1$, $A_2$, $\cdots$, $A_N$&nbsp;representing elements of array&nbsp;$A$.</p>

<p>Each of the next&nbsp;$Q$&nbsp;lines describes a query, and contains either</p>

<ul>
	<li>$3$&nbsp;space separated positive integers:&nbsp;<code>1 pos&nbsp;val</code></li>
	<li>or $4$ space separated positive integers:&nbsp;<code>2&nbsp;S&nbsp;L&nbsp;R</code></li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;$x$&nbsp;is the test case number (starting from 1) and&nbsp;$y$&nbsp;is a list of the answers for each query of type&nbsp;$2$.</p>

### 제한

<ul>
	<li>$1 \le T \le 100$</li>
	<li>$2 \le P \le 10^9$</li>
	<li>$P$&nbsp;is a prime number.</li>
	<li>$1 \le pos \le N$</li>
	<li>$1 \le L \le R \le N$</li>
</ul>

<p>For at most 10 cases:</p>

<ul>
	<li>$1 \le N \le 5 \times 10^5$</li>
	<li>$1 \le Q \le 10^5$</li>
</ul>

<p>For the remaining test cases:</p>

<ul>
	<li>$1 \le N \le 10^3$</li>
	<li>$1 \le Q \le 10^3$</li>
</ul>

<p>There will always be at least one query of type $2$.</p>

### 힌트

<p>In Sample Case #1</p>

<p>The first query is a query of type $2$, where&nbsp;$S=3$, $L=3$, $R=4$. Let&#39;s calculate the result for this query:</p>

<p>$i=3$, $V(62^3 - (62 \bmod 2)^3)=3$</p>

<p>$i=4$, $V(67^3 - (67 \bmod 2)^3)=1$</p>

<p>$\displaystyle\sum_{i=3}^{4}{V(A_i^3 - (A_i \bmod P)^3)} = 3+1 = 4$</p>

<p>The second query is of type&nbsp;$1$, where we need to assign&nbsp;$69$&nbsp;to&nbsp;$A_1$, so our array&nbsp;$A$&nbsp;now becomes:&nbsp;<code>69 94 62 67 91</code>.</p>