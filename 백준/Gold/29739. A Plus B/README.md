# [Gold II] A Plus B - 29739

[문제 링크](https://www.acmicpc.net/problem/29739)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 118, 정답: 39, 맞힌 사람: 33, 정답 비율: 29.730%

### 분류

자료 구조, 우선순위 큐

### 문제 설명

<p>Borcsa has two arrays, each of them containing $N$ non-negative integers.</p>

<p>The numbers in the first array are $A[0],A[1], \dots ,A[N - 1]$ and the numbers in the second array are $B[0],B[1], \dots ,B[N - 1]$. The numbers in both arrays are in increasing order, that is,</p>

<ul>
	<li>$A[0] &le; A[1] &le; \dots &le; A[N - 1]$, and</li>
	<li>$B[0] &le; B[1] &le; &hellip; &le; B[N - 1]$.</li>
</ul>

<p>Borcsa really likes arithmetical addition, so for each $i$ from $0$ to $N - 1$ and for each $j$ from $0$ to $N - 1$, inclusive, she computed the sum $A[i] + B[j]$.</p>

<p>Let array $C$ contain all $N^2$ sums computed by Borcsa, sorted in <em>increasing</em> order. Your task is to find the first $N$ values in $C$.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$1 &le; N &le; 100\,000$</li>
	<li>$0 &le; A[i] &le; 10^9$ (for each $i$ such that $0 &le; i &lt; N$)</li>
	<li>$0 &le; B[i] &le; 10^9$ (for each $i$ such that $0 &le; i &lt; N$)</li>
	<li>$A$ and $B$ are sorted in increasing order.</li>
</ul>