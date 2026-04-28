# [Platinum III] Color Numbers - 23639

[문제 링크](https://www.acmicpc.net/problem/23639)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 8, 맞힌 사람: 6, 정답 비율: 33.333%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>You are given an array of non-negative integers $a_1, a_2, \ldots, a_n$ and an integer $k$. Two indices $i, j$ are called <em>inconsistent</em> if both of the two conditions hold:</p>

<ol>
	<li>$a_i \text{ }\mathrm{AND}\text{ } a_j = a_i$,</li>
	<li>Binary representation of $(a_i \text{ }\mathrm{XOR}\text{ } a_j)$ have at least $k$ bits set to $1$.</li>
</ol>

<p>Here $\mathrm{AND}$ stands for bitwise and operation, $\mathrm{XOR}$ stands for bitwise exclusive-OR operation.</p>

<p>A <em>consistent coloring</em> of $a_1, \ldots, a_n$ in $m$ colors is an array of $n$ integers $c_1, \ldots, c_n$ ($1 \leq c_i \leq m$) such that there is no pair of inconsistent indices $i, j$ with $c_i = c_j$.</p>

<p>Your task is to find the smallest possible number of colors in a consistent coloring of $a_1, \ldots, a_n$.</p>

### 입력

<p>In the first line you are given two integers $n, k$ ($1\leq n, k\leq 5\cdot 10^5$).</p>

<p>In the next line you are given $n$ integers $a_i$ ($0\leq a_i &lt; 2^{22}$).</p>

### 출력

<p>Print one integer --- the smallest number of colors in a consistent coloring.</p>

### 힌트

<p>One possible consistent coloring in two colors is $1, 1, 1, 2$. Since indices $2$ and $4$ are inconsistent, one color is not enough.</p>