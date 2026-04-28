# [Platinum I] Game - 23157

[문제 링크](https://www.acmicpc.net/problem/23157)

### 성능 요약

시간 제한: 8 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 3, 맞힌 사람: 3, 정답 비율: 50.000%

### 분류

애드 혹, 게임 이론

### 문제 설명

<p>Koishi is playing a game with Satori.</p>

<p>There is an array of length $10^{18}$. In the game, Koishi and Satori take turns operating on this array, and Koishi goes first. At the start of a player&#39;s turn, if there is only one element left in the array, she loses the game immediately. Otherwise, she needs to delete either the leftmost number or the rightmost number of the remaining array.</p>

<p>The game is too boring for Koishi, so she came up with the following modified rules.</p>

<p>There are $n$ sub-segments of this array that are special. Specifically, the $i$-th sub-segment is described by three integers $(l_i, r_i, z_i)$. They mean that, at the start of a player&#39;s turn, if the remaining array is the sub-segment $[l_i, r_i]$, she will win immediately if $z_i = 1$ or lose immediately if $z_i = 0$.</p>

<p>If there is a special sub-segment $(x, x, 1)$ given for some $x$, a player will immediately win when the remaining array is $[x, x]$ at the start of their turn. Importantly, if there is no special sub-segment $(x, x, 1)$ given for some $x$, it is assumed that $[x, x]$ is an immediate loss, as in the original rules.</p>

<p>There will be $q$ games. At the beginning of the $i$-th game, Utuoho will give two players the sub-segment $[a_i, b_i]$ and take away all other parts of the array. That means Koishi and Satori only play on sub-segment $[a_i, b_i]$, not on the whole array. All the $q$ games are independent.</p>

<p>Two players always use the optimal strategy. Please tell them who will win in each game.</p>

### 입력

<p>The first line contains an integer $T$ ($1 \leq T \leq 2000$), the number of test cases. Then $T$ test cases follow.</p>

<p>The first line of each test case contains two integers $n$ and $q$ ($1 \leq n, q \leq 10^5$), the number of sub-segments and the number of games.</p>

<p>Then $n$ lines follow. Each of them contains three integers: $l_i$, $r_i$, $z_i$ ($1 \leq l_i \leq r_i \leq 10^9$, $0 \leq z_i \leq 1$). You may assume that, for any $i \neq j$, $(l_i, r_i) \neq (l_j, r_j)$ holds.</p>

<p>After that, $q$ lines follow. Each of them contains two integers $a_i$ and $b_i$ ($1 \leq a_i \leq b_i \leq 10^9$) describing the initial sub-segment of the $i$-th game.</p>

<p>It is guaranteed that $\sum (n + q) \leq 9 \cdot 10^5$.</p>

### 출력

<p>For each test case, output one line with $q$ integers $v_i$ ($0 \leq v_i \leq 1$) without spaces: $v_i = 0$ if Koishi loses the $i$-th game and $v_i = 1$ if she wins the $i$-th game, respectively.</p>