# [Gold I] biinfinite - 25038

[문제 링크](https://www.acmicpc.net/problem/25038)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 8, 맞힌 사람: 8, 정답 비율: 100.000%

### 분류

분할 정복을 이용한 거듭제곱, 수학

### 문제 설명

<p>A <em>bi-infinite sequence</em> means a sequence that is infinite in both directions. In other words, it means a function whose domain is the set of all integers. The writer of this problem defined their bi-infinite sequence $(K_n)_{n\in\mathbb Z}$ and called it &quot;KSA bi-infinite sequence&quot; with a parameter $t$ where $t$ is a positive integer. It satisfies the following for all integers $n$.</p>

<ul>
	<li>$K_n=5701.5+0.5\cdot(-1)^n$ if $0\le n&lt;t$</li>
	<li>$K_n=\sum_{j=1}^t(t+1-j)K_{n-j}$</li>
</ul>

<p>Write a function <u><code>biinfinite</code></u>:</p>

<ul>
	<li>input parameter: two <code>int</code>-type objects whose values are $t$ and $n$, respectively, where $1\le t\le 8$ and $|n|\le10^{12}$</li>
	<li>return value: the <code>int</code>-type object whose value is $\lfloor K_n\rfloor-M\left\lfloor\frac{K_n}M\right\rfloor$ where $M=202112210950$ and $K_n$ is the $n$-th term of KSA bi-infinite sequence with a parameter $t$</li>
</ul>

### 입력



### 출력

