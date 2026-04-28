# [Platinum I] Three Slices - 21766

[문제 링크](https://www.acmicpc.net/problem/21766)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 460, 정답: 74, 맞힌 사람: 64, 정답 비율: 21.405%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색, 두 포인터

### 문제 설명

<p>You are given an array $A_{0}$, $A_{1}$, $A_{2}$, $...$ , $A_{N-1}$ of $N$ positive integers. Also, you are given an positive integer $K$. Your task is to find the largest positive integer $M$ such that the following condition is satisfied:</p>

<ul>
	<li>There exists an integer $0 \le i \le N-3M$ such that
	<ol>
		<li>$\sum_{j=i}^{i+M-1}A_{j} \le K$</li>
		<li>$\sum_{j=i+M}^{i+2M-1}A_{j} \le K$</li>
		<li>$\sum_{j=i+2M}^{i+3M-1}A_{j} \le K$</li>
	</ol>
	</li>
</ul>

### 입력

<p>The first line contains two integers, $N$ and $K$. The second line contains $N$ integers, the array $A$ given in order.</p>

### 출력

<p>Output a single positive integer denoting the largest possible $M$. If there is no such $M$, output $0$.</p>

### 제한

<ul>
	<li>$1 \le N \le 5 \times 10^{5}$</li>
	<li>$1 \le K \le 10^{9}$</li>
	<li>$1 \le A_{i} \le 10^{9}$</li>
</ul>