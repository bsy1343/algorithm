# [Platinum I] Equivalent Pipelines - 23172

[문제 링크](https://www.acmicpc.net/problem/23172)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 231, 정답: 53, 맞힌 사람: 44, 정답 비율: 21.569%

### 분류

자료 구조, 분리 집합, 해싱, 트리, 트리 동형 사상

### 문제 설명

<p>You are planning to construct a water pipeline network, connecting $n$ buildings in KAIST. Due to budget problems, you can only use $n-1$ pipes. Each pipe is undirected and connects two different buildings, and all $n$ buildings must be pairwise connected through some sequence of pipes. These pipes form a network.</p>

<p>As a careful planner, you designed $d$ different networks and want to compare them. One can describe each pipe in the network with a durability, which is a single positive integer. Given a network $T$, define the <strong>vulnerability</strong> $v_{T}(i, j)$ of two distinct buildings $i$ and $j$ to be the minimum durability of a pipe whose removal separates buildings $i$ and $j$. In other words, $v_{T}(i, j)$ is the minimum durability over all pipes on the path connecting $i$ to $j$.</p>

<p>If two networks $T_{1}$ and $T_{2}$ satisfy $v_{T_1}(i, j) = v_{T_2}(i, j)$ for all $1 \le i &lt; j \le n$, we say $T_{1}$ and $T_{2}$ are <strong>equivalent</strong>. To filter out unnecessary plans, group the $d$ designs up to equivalency.</p>

### 입력

<p>The first line contains two integers $d$ and $n$ ($d \ge 1$, $n \ge 2$, $d\cdot n \le 500\,000$), separated by a space.</p>

<p>From the second line, the descriptions for the $d$ designs are given. Each design is described over $n-1$ lines, each line consisting of three integers $a$, $b$ and $c$ ($1 \le a, b \le n$, $a \neq b$, $1 \le c \le 10^{9}$), indicating there is a pipe connecting buildings $a$ and $b$ directly, whose durability is equal to $c$.</p>

### 출력

<p>Output $d$ integers in a line. For $1 \le i \le d$, the $i$-th number should be the minimum index $j$, where the $j$-th network in the input is equivalent to the $i$-th network in the input.</p>