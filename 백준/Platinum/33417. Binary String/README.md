# [Platinum I] Binary String - 33417

[문제 링크](https://www.acmicpc.net/problem/33417)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 1, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

비트 집합

### 문제 설명

<p>You are given a string $s_1 s_2 \ldots s_n$ of length $n$ with elements from the character set "<code>01?</code>".</p>

<p>For every $k \in [1, n]$, consider the string $T_k = t_1 t_2 \ldots t_n$ where, for $1 \le i \le n$:</p>

<ul>
	<li>If $s_i \ne $<code>?</code>, then $t_i = s_i$.</li>
	<li>Otherwise, if $i \le k$, then $t_i =$<code>0</code>.</li>
	<li>Otherwise, $t_i = t_{i-k}$, and you can recursively compute $t_{i-k}$ to obtain $t_i$.</li>
</ul>

<p>It is easy to see that the character set of $T_k$ is "<code>01</code>". You need to calculate the number of <code>1</code> in $T_k$ for all $k \in [1, n]$.</p>

### 입력

<p>The first line of input contains an integer $n$ ($1 \le n \le 10^5$) representing the length of the string.</p>

<p>The second line contains the string $s_1 s_2 \ldots s_n$ of length $n$ with elements from the character set "<code>01?</code>".</p>

### 출력

<p>Output $n$ lines, where the $k$-th line contains an integer representing the number of <code>1</code> in $T_k$.</p>