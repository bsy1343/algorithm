# [Platinum III] Mooclear Reactor - 35324

[문제 링크](https://www.acmicpc.net/problem/35324)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 39, 정답: 12, 맞힌 사람: 12, 정답 비율: 34.286%

### 분류

구현, 그래프 이론, 그래프 탐색, 분리 집합, 스위핑, 자료 구조

### 문제 설명

<p>Bessie is designing a nuclear reactor to power Farmer John's lucrative new AI data center business, CowWeave!</p>

<p>The reactor core consists of $N$ ($1\le N \le 2\cdot 10^5$) fuel rods, numbered $1$ through $N$. The $i$-th rod has a "stable operating range" $[l_i, r_i]$ ($-10^9 \leq l_i \leq r_i \leq 10^9$), meaning it can only generate power if its energy $a_i$ (chosen by Bessie) satisfies $l_i \le a_i \le r_i$; otherwise, it sits idle and does not generate power. Moreover, $a_i$ must always be an integer. <strong>Note that $a_i$ can be any integer, not limited to $[-10^9, 10^9]$.</strong></p>

<p>However, quantum interactions between the rods mean that there are $M$ constraints of the form $(x, y, z)$ where Bessie must satisfy $a_x + a_y = z$ ($1 \leq x,y \leq N$ and $-10^9\le z\le 10^9$) to prevent the reactor from melting down.</p>

<p>Help Bessie find the maximum number of power-generating rods she can achieve in her design without it melting down!</p>

### 입력

<p>The first line contains $T$ ($1\le T\le 10$), the number of independent tests. Each test is specified in the following format:</p>

<ul>
<li>The first line contains the two integers $N$ and $M$.</li>
<li>The second line contains the $N$ integers $l_1, \dots, l_N$.</li>
<li>The third line contains the $N$ integers $r_1, \dots, r_N$.</li>
<li>The next $M$ lines each contain three integers $x$, $y$, and $z$, each representing a constraint.</li>
</ul>

<p>It is guaranteed that neither the sum of $N$ nor the sum of $M$ over all tests exceeds $4\cdot 10^5$.</p>

### 출력

<p>If no choice of rod energies exists that satisfies all constraints, output $-1$. Otherwise, output the maximum number of power-generating rods Bessie can achieve.</p>