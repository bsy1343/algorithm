# [Platinum II] The Chase - 35334

[문제 링크](https://www.acmicpc.net/problem/35334)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

구현, 그래프 이론, 다이나믹 프로그래밍, 함수형 그래프

### 문제 설명

<p>Bessie is trying to evade the farmers. The farmers own $N$ ($2 \le N \le 5 \cdot 10^5$) farms with a one way road between the $i$-th farm and the $a_i$-th farm ($1 \le i \le N$, $a_i \neq i$). There are $F$ ($1 \le F \le N$) farmers and the $i$-th farmer is initially stationed at farm $s_i$ ($1 \le s_i \le N$, all $s_i$ unique). At each time step, every farmer takes the road at their current farm and moves to the next. Bessie gets caught if she is ever located at the same farm as any farmer.</p>

<p>Suppose Bessie starts at some farm $b$. At each time step, she has two options: she can either choose to rest (stay at her current farm) or take the road and move to the next farm. If she chooses to move, she moves simultaneously with the farmers. Bessie moves so that she is never caught by any farmer in a finite number of timesteps.</p>

<p>For each starting farm $b$ ($1 \le b \le N$), find the maximum number of times Bessie can choose the rest option if she starts at farm $b$.</p>

### 입력

<p>The first line contains $N$ and $F$, the number of farms and the number of farmers.</p>

<p>The second line contains $a_1 \ldots a_N$, the one-way roads going out of each farm.</p>

<p>The third line contains $s_1 \ldots s_F$, the starting locations of each farmer.</p>

### 출력

<p>Output $N$ lines, the $b$-th of which must consist of a single integer denoting the maximum number of times Bessie can choose the rest option if she starts at farm $b$. If there is no way for Bessie to ensure she is never caught after a finite number of timesteps, then output $-1$. If Bessie can rest an infinite number of times, then output $-2$.</p>