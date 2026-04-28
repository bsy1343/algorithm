# [Platinum I] Wavel Sequence - 19041

[문제 링크](https://www.acmicpc.net/problem/19041)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 15, 맞힌 사람: 13, 정답 비율: 52.000%

### 분류

다이나믹 프로그래밍, 자료 구조, 세그먼트 트리, 스위핑, 다차원 세그먼트 트리

### 문제 설명

<p>Have you ever seen a wave? It&#39;s a wonderful display of nature. Little Q is attracted to this wonderful thing, he even likes everything that looks like a wave. Formally, he says that a sequence $a_1, a_2, \ldots, a_n$ is a <em>wavel</em>&nbsp;if and only if $a_1 &lt; a_2 &gt; a_3 &lt; a_4 &gt; a_5 &lt; a_6 \ldots$.</p>

<p>Now, given two sequences $a_1, a_2, \ldots, a_n$ and $b_1, b_2, \ldots, b_m$, Little Q wants to find two sequences $f_1, f_2, \ldots, f_k$ and $g_1, g_2, \ldots, g_k$ ($1 \leq f_i \leq n$, $f_i &lt; f_{i + 1}$ and $1 \leq g_i \leq m$, $g_i &lt; g_{i + 1}$) such that $a_{f_i} = b_{g_i}$ always holds and the sequence $a_{f_1}, a_{f_2}, \ldots, a_{f_k}$ is a wavel. Moreover, Little Q is wondering how many pairs of such sequences $f$ and $g$ exist. Please write a program to help him figure out the answer.</p>

### 입력

<p>The first line of the input contains two integers $n$ and $m$: the lengths of $a$ and $b$, respectively ($1 \leq n, m \leq 2000$).</p>

<p>The second line contains $n$ integers $a_1, a_2, \ldots, a_n$: the sequence $a$ ($1 \leq a_i \leq 2000$).</p>

<p>The third line contains $m$ integers $b_1, b_2, \ldots, b_m$: the sequence $b$ ($1 \leq b_i \leq 2000$).</p>

### 출력

<p>Print a single line containing a single integer: the answer to the problem. As the answer can be very large, print it modulo $998\,244\,353$.</p>

### 힌트

<p>Here is the list of such sequences.</p>

<ol>
	<li>$f=(1)$, $g=(2)$.</li>
	<li>$f=(1)$, $g=(3)$.</li>
	<li>$f=(2)$, $g=(4)$.</li>
	<li>$f=(3)$, $g=(5)$.</li>
	<li>$f=(1,2)$, $g=(2,4)$.</li>
	<li>$f=(1,2)$, $g=(3,4)$.</li>
	<li>$f=(1,3)$, $g=(2,5)$.</li>
	<li>$f=(1,3)$, $g=(3,5)$.</li>
	<li>$f=(1,2,3)$, $g=(2,4,5)$.</li>
	<li>$f=(1,2,3)$, $g=(3,4,5)$.</li>
</ol>