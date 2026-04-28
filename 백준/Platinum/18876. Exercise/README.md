# [Platinum II] Exercise - 18876

[문제 링크](https://www.acmicpc.net/problem/18876)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 194, 정답: 109, 맞힌 사람: 97, 정답 비율: 56.069%

### 분류

수학, 다이나믹 프로그래밍, 정수론, 소수 판정, 에라토스테네스의 체, 순열 사이클 분할

### 문제 설명

<p>Farmer John has come up with a new morning exercise routine for the cows (again)!</p>

<p>As before, Farmer John&#39;s $N$ cows ($1\le N\le 10^4$) are standing in a line. The $i$-th cow from the left has label $i$ for each $1\le i\le N$. He tells them to repeat the following step until the cows are in the same order as when they started.</p>

<ul>
	<li>Given a permutation $A$ of length $N$, the cows change their order such that the $i$-th cow from the left before the change is $A_i$-th from the left after the change.</li>
</ul>

<p>For example, if $A=(1,2,3,4,5)$ then the cows perform one step. If $A=(2,3,1,5,4)$, then the cows perform six steps. The order of the cows from left to right after each step is as follows:</p>

<ul>
	<li>0 steps: $(1,2,3,4,5)$</li>
	<li>1 step: $(3,1,2,5,4)$</li>
	<li>2 steps: $(2,3,1,4,5)$</li>
	<li>3 steps: $(1,2,3,5,4)$</li>
	<li>4 steps: $(3,1,2,4,5)$</li>
	<li>5 steps: $(2,3,1,5,4)$</li>
	<li>6 steps: $(1,2,3,4,5)$</li>
</ul>

<p>Find the sum of all positive integers $K$ such that there exists a permutation of length $N$ that requires the cows to take exactly $K$ steps.</p>

<p>As this number may be very large, output the answer modulo $M$ ($10^8\le M\le 10^9+7$, $M$ is prime).</p>

### 입력

<p>The first line contains $N$ and $M$.</p>

### 출력

<p>A single integer.</p>

### 힌트

<p>There exist permutations that cause the cows to take $1$, $2$, $3$, $4$, $5$, and $6$ steps. Thus, the answer is $1+2+3+4+5+6=21$.</p>