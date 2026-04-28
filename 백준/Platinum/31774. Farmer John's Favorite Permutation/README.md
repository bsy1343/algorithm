# [Platinum V] Farmer John's Favorite Permutation - 31774

[문제 링크](https://www.acmicpc.net/problem/31774)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 164, 정답: 51, 맞힌 사람: 46, 정답 비율: 38.017%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>Farmer John has a permutation $p$ of length $N$ ($2 \leq N \leq 10^5)$, containing each positive integer from $1$ to $N$ exactly once. However, Farmer Nhoj has broken into FJ&#39;s barn and disassembled $p$. To not be too cruel, FN has written some hints that will help FJ reconstruct $p$. While there is more than one element remaining in $p$, FN does the following:</p>

<p>Let the remaining elements of $p$ be $p&#39;_1, p&#39;_2, \dots , p&#39;_n$,</p>

<ul>
	<li>If $p&#39;_1 &gt; p&#39;_n$, he writes down $p&#39;_2$ and removes $p&#39;_1$ from the permutation.</li>
	<li>Otherwise, he writes down $p&#39;_{n-1}$ and removes $p&#39;_n$ from the permutation.</li>
</ul>

<p>At the end, Farmer Nhoj will have written down $N - 1$ integers $h_1, h_2, \dots, h_{N-1}$, in that order. Given $h$, Farmer John wants to enlist your help to reconstruct the lexicographically minimum $p$ consistent with Farmer Nhoj&#39;s hints, or determine that Farmer Nhoj must have made a mistake. Recall that if you are given two permutations $p$ and $p&#39;$, $p$ is lexicographically smaller than $p&#39;$ if $p_i &lt; p&#39;_i$ at the first position $i$ where the two differ.</p>

### 입력

<p>Each input consists of $T$ independent test cases ($1\le T\le 10$). Each test case is described as follows:</p>

<p>The first line contains $N$.</p>

<p>The second line contains $N - 1$ integers $h_1, h_2, \dots, h_{N-1}$ ($1\le h_i\le N$).</p>

### 출력

<p>Output $T$ lines, one for each test case.</p>

<p>If there is a permutation $p$ of $1\dots N$ consistent with $h$, output the lexicographically smallest such $p$. If no such $p$ exists, output $-1$.</p>