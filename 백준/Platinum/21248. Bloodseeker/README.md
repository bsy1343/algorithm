# [Platinum V] Bloodseeker - 21248

[문제 링크](https://www.acmicpc.net/problem/21248)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 8, 맞힌 사람: 8, 정답 비율: 33.333%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Bloodseeker is facing $n$ enemies. At the beginning, he has $m$ hit-points, and every second his hit-points are decreased by $1$. If his hit-points become $0$, he dies. But he can kill the enemies to regenerate his hit-points.</p>

<p>The $i$-th enemy is to be hit $t_i$ times to kill. Bloodseeker makes one hit per second. Every second, he is able to hit any enemy. After the $i$-th enemy receives a last hit, Bloodseeker regenerates $h_i$ hit-points (but his hit-points can&#39;t become greater than $m$). Note that if Bloodseeker had $1$ hit-point before he last-hits the $i$-th enemy, he doesn&#39;t die.</p>

<p>Can Bloodseeker kill all enemies?</p>

### 입력

<p>The first line contains an integer $T$ ($1 \le T \le 200000$) --- the number of test cases.</p>

<p>The first line of each test case contains two integers $n$ and $m$ ($1 \le n \le 200000, 1 \le m \le 10^9$) --- the number of enemies and the maximal Bloodseeker&#39;s hit-points.</p>

<p>Each of the next $n$ lines in each test case contains two integers $t_i$ and $h_i$ ($1 \le t_i, h_i \le 10^9$) --- the time required for killing the $i$-th enemy and the number of hit-points regenerated after it.</p>

<p>It is guaranteed that the sum of all $n$ does not exceed $200000$.</p>

### 출력

<p>For each test case, if it&#39;s possible to kill all the enemies, output &quot;<code>YES</code>&quot;, otherwise output &quot;<code>NO</code>&quot;.</p>