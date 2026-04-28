# [Gold I] Divisible by 3 - 21909

[문제 링크](https://www.acmicpc.net/problem/21909)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 121, 정답: 94, 맞힌 사람: 81, 정답 비율: 80.198%

### 분류

수학, 다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>For an array $[b_1, b_2, \dots&nbsp;, b_m]$ of integers, let&rsquo;s define its <strong>weight</strong> as the sum of pairwise products of its elements, namely as the sum of $b_ib_j$ over $1 \le i &lt; j \le m$.</p>

<p>You are given an array of $n$ integers $[a_1, a_2, \dots , a_n]$,&nbsp;and are asked to find the number of pairs of integers $(l, r)$ with $1 \le l \le r \le n$, for which the weight of the subarray&nbsp;$[a_l, a_{l+1}, \dots , a_r]$ is divisible by $3$.</p>

### 입력

<p>The first line of the input contains a single integer $n$ ($1 \le n \le 5 \cdot 10^5$) &mdash; the length of the array.</p>

<p>The second line contains $n$ integers $a_1, a_2, \dots , a_n$ ($0 \le a_i \le 10^9$) &mdash; the elements of the array.</p>

### 출력

<p>Output a single integer &mdash; the number of pairs of integers $(l, r)$ with $1 \le l \le r \le n$, for which the weight of the corresponding subarray is divisible by $3$.</p>

### 힌트

<p>In the first sample, the weights of exactly $4$ subarrays are divisible by $3$:</p>

<ul>
	<li>weight($[5]$) = weight($[23]$) = weight($[2021]$) = $0$</li>
	<li>weight($[5, 23, 2021]$) = $56703$ = $3 \cdot&nbsp;41 \cdot 461$</li>
</ul>