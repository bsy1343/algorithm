# [Platinum III] 2-LIS - 26464

[문제 링크](https://www.acmicpc.net/problem/26464)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 73, 정답: 31, 맞힌 사람: 25, 정답 비율: 47.170%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>You are given an integer sequence $A = (a_1, a_2, \dots , a_N)$. Find the length of the longest sequence $B = (b_1, b_2, \dots , b_N)$ which satisfies the following two conditions:</p>

<ul>
	<li>$B$ is a subsequence of $A$</li>
	<li>$b_i &lt; b_{i+2}$ for all $i$ ($1 &le; i &le; M-2$)</li>
</ul>

<p>A subsequence of a sequence is a sequence obtained by removing zero or more elements from the original sequence and then concatenating the remaining elements without changing the order.</p>

### 입력

<blockquote>
<p>$N$</p>

<p>$a_1$ $a_2$ $\dots$ $a_N$</p>
</blockquote>

<p>The first line consists of an integer $N$ between $1$ and $5\,000$, inclusive. This represents the number of elements in $A$.</p>

<p>The second line consists of $N$ integers between $1$ and $N$, inclusive. For each $i$ ($1 &le; i &le; N $), $a_i$ represents the $i$-th element of $A$.</p>

### 출력

<p>Print the answer in a line.</p>