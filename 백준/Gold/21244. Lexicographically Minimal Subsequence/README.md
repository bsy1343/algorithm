# [Gold III] Lexicographically Minimal Subsequence - 21244

[문제 링크](https://www.acmicpc.net/problem/21244)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 42, 정답: 27, 맞힌 사람: 25, 정답 비율: 71.429%

### 분류

자료 구조, 그리디 알고리즘, 스택

### 문제 설명

<p>Your are given a string $s$ and an integer $k$. Find the lexicographically minimal subsequence of $s$ which length is $k$.</p>

### 입력

<p>The first line contains a string $s$ ($1 \le |s| \le 10^6$). It consists of lowercase Latin letters.</p>

<p>The second line contains an integer $k$ ($1 \le k \le |s|$) --- the length of the resulting subsequence.</p>

### 출력

<p>Output the lexicographically minimal subsequence of $s$ which length is $k$.</p>

### 힌트

<p>String $s_{p_{1}}s_{p_{2}}\dots s_{p_{k}} (1 \le p_{1} &lt; p_{2} &lt; \dots &lt; p_{k} \le |s|)$ is called a <em>subsequence</em> of string $s$.</p>

<p>String $x = x_{1}x_{2}\dots x_{k}$ is <em>lexicographically less</em> than string $y = y_{1}y_{2}\dots y_{k}$, if there exists such number $i$ $(1 \le i \le k)$, that $x_{1} = y_{1}, x_{2} = y_{2}, \ldots , x_{i-1} = y_{i-1}$ and $x_{i} &lt; y_{i}$. Characters in strings are compared as their ASCII codes.</p>