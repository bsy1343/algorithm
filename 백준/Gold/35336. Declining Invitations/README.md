# [Gold I] Declining Invitations - 35336

[문제 링크](https://www.acmicpc.net/problem/35336)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 14, 정답: 10, 맞힌 사람: 10, 정답 비율: 71.429%

### 분류

우선순위 큐, 자료 구조, 재귀, 큐

### 문제 설명

<p>$N$ contestants participated in a contest, each placing a distinct rank from $1$ to $N$. There are $C$ criteria used to invite contestants to participate in the final round, and the $i$th-ranked contestant satisfies a specified $n_i$ of them ($1\le n_i\le C$).</p>

<p>The invitation process runs as follows. First, the top $f_1$ students who satisfy the $1$st criteria will be invited. Then, out of all students who haven't yet been invited, the top $f_2$ (or all remaining if there are fewer than $f_2$ remaining) students who satisfy the $2$nd criterion will be invited. This process repeats, for each $i$ from $1$ to $C$ ($1\le f_i\le N$).</p>

<p>However, some contestants will decline to participate in the final round, in which case they will be ignored when determining who to invite.</p>

<p>You are given a permutation $p_1, p_2, \dots, p_N$ of $1\dots N$. For each $i$ from $0$ to $N-1$, determine the sum of the ranks of the contestants who will be invited if the participants with ranks given by the first $i$ elements of $p$ decline to attend.</p>

### 입력

<p>The first line contains $N$ and $C$ ($1\le N,C\le 10^5$).</p>

<p>The next line contains $f_1,f_2, \dots, f_C$.</p>

<p>The next line contains $p_1, \dots, p_N$.</p>

<p>The next $N$ lines each contain $n_i$ ($1\le n_i\le C$), followed by $n_i$ distinct integers in $[1, C]$, representing the criteria that the $i$th-ranked contestant satisfies. It is guaranteed that $\sum n_i\le 10^6$.</p>

### 출력

<p>Output $N$ lines, the sum of ranks of invitees before each declination.</p>