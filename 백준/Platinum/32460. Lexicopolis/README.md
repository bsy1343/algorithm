# [Platinum III] Lexicopolis - 32460

[문제 링크](https://www.acmicpc.net/problem/32460)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 15, 맞힌 사람: 15, 정답 비율: 65.217%

### 분류

값 / 좌표 압축, 그래프 이론, 분할 정복을 이용한 거듭제곱, 수학, 이분 탐색, 정렬, 해싱

### 문제 설명

<p>Welcome to Lexicopolis, the ancient city of legends and treasures. The city is famous for its intricate network of one-way roads. There are $n$ intersections and $m$ one-way roads connecting the intersections. People can only travel from intersection $u_i$ to intersection $v_i$ along road $i$, and road $i$ is associated with a magical number $w_i$. A path of length $k$ from intersection $s$ to $t$ is a sequence of roads $e_1, e_2, \dots ,e_k$ that allows travel from intersection $s$ to intersection $t$. A path is lexicographically smaller than another path if at the frst road where they have different magic numbers (not index), the number on the frst path is smaller than the number on the second path.</p>

<p>It is rumored that the tourist who figures out the lexicographically smallest path of length $k$ from intersection s$ $to intersection $t$ can receive a gift from the Lexicopolis government. Please write a program to fnd the lexicographicall smallest path of length $k$ from intersection $s$ to $t$. If it is impossible to travel from intersection $s$ to $t$ with exactly $k$ roads, output <code>-1</code>.</p>

### 입력

<p>The first line contains six integers $n$, $m$, $s$, $t$, $x$, $k$. $n$ is the number of intersections. $m$ is the number of roads. $s$ is the starting intersection and $t$ is the ending intersection. $x$ is a number that will be used for outputting the answer. $k$ is the length of path. The $i$-th of the $m$ following lines contains three integers $u_i$, $v_i$ and $w_i$. That means road $i$ is from intersection $u_i$ to intersection $v_i$ and associated with magic number $w_i$.</p>

### 출력

<p>If there is no path of length $k$ from intersection $s$ to $t$, output <code>-1</code>. Otherwise, assume such a path exists. Consider the lexicographically smallest path $e_1, e_2, \dots ,e_k$, and output $\sum^k_{i=1}{w_{e_i}x^{k-i}}$ modulo $10^9+7$, where $x$ is the number provided as the fifth value in the first line of the input.</p>

### 제한

<ul>
	<li>$2 ≤ n ≤ 50$</li>
	<li>$1 ≤ m ≤ n^2 - n$</li>
	<li>$1 ≤ u_i ≤ n$ for $i \in \{1, 2, \dots ,m\}$</li>
	<li>$1 ≤ v_i ≤ n$ for $i \in \{1, 2, \dots ,m\}$</li>
	<li>$1 ≤ w_i ≤ 10^9$ for $i \in \{1, 2, \dots ,m\}$</li>
	<li>$u_i \ne v_i$ for $i \in \{1, 2, \dots ,m\}$</li>
	<li>$(u_i, v_i) \ne (u_j , v_j )$ for $i \ne j$</li>
	<li>$1 ≤ s ≤ n$</li>
	<li>$1 ≤ t ≤ n$</li>
	<li>$1 ≤ k ≤ 10^9$</li>
	<li>$1 ≤ x ≤ 10^9$</li>
</ul>