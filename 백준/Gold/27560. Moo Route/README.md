# [Gold II] Moo Route - 27560

[문제 링크](https://www.acmicpc.net/problem/27560)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 347, 정답: 169, 맞힌 사람: 145, 정답 비율: 53.506%

### 분류

그리디 알고리즘, 해 구성하기

### 문제 설명

<p>Farmer Nhoj dropped Bessie in the middle of nowhere! At time $t=0$, Bessie is located at $x=0$ on an infinite number line. She frantically searches for an exit by moving left or right by $1$ unit each second. However, there actually is no exit and after $T$ seconds, Bessie is back at $x=0$, tired and resigned.</p>

<p>Farmer Nhoj tries to track Bessie but only knows how many times Bessie crosses $x=.5, 1.5, 2.5, \ldots, (N-1).5$, given by an array $A_0,A_1,\dots,A_{N-1}$ ($1\leq N \leq 10^5$, $1 \leq A_i \leq 10^6$, $\sum A_i\le 10^6$). Bessie never reaches $x&gt;N$ nor $x&lt;0$.</p>

<p>In particular, Bessie&#39;s route can be represented by a string of $T = \sum_{i=0}^{N-1} A_i$ $L$s and $R$s where the $i$th character represents the direction Bessie moves in during the $i$th second. The number of direction changes is defined as the number of occurrences of $LR$s plus the number of occurrences of $RL$s.</p>

<p>Please help Farmer Nhoj find any route Bessie could have taken that is consistent with $A$ and minimizes the number of direction changes. It is guaranteed that there is at least one valid route.</p>

### 입력

<p>The first line contains $N$. The second line contains $A_0,A_1,\dots,A_{N-1}$.</p>

### 출력

<p>Output a string $S$ of length $T = \sum_{i=0}^{N-1} A_i$ where $S_i$ is $L$ or $R$, indicating the direction Bessie travels in during second $i$. If there are multiple routes minimizing the number of direction changes, output any.</p>