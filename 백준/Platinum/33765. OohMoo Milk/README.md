# [Platinum I] OohMoo Milk - 33765

[문제 링크](https://www.acmicpc.net/problem/33765)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 79, 정답: 32, 맞힌 사람: 29, 정답 비율: 38.667%

### 분류

그리디 알고리즘, 수학, 이분 탐색

### 문제 설명

<p>Farmer John is trying to make his world's famous OohMoo Milk to sell for a profit. He has $N$ $(1 \leq N \leq 10^5)$ bottles that he is trying to fill. Each bottle initially contains some amount of milk $m_i$ $(0 \leq m_i \leq 10^9)$. Every day, he takes $A$ $(1 \le A \le N)$ bottles and fills each bottle with one unit of milk.</p>

<p>Unfortunately, Farmer Nhoj, Farmer John's competitor in the business of OohMoo Milk, knows about Farmer John's production processes and has a plan to curtail his business. Every day, after Farmer John fills his $A$ bottles, Farmer Nhoj will sneakily steal one unit of milk from each of $B$ $(0 \le B &lt; A)$ different nonempty bottles. To remain sneaky, Farmer Nhoj chooses $B$ so that it is strictly less than $A$, so that it is less likely for Farmer John to discover him.</p>

<p>After $D$ ($1 \leq D \leq 10^9$) days, Farmer John will sell his OohMoo Milk. If a bottle has $M$ units of milk, it will sell for $M^2$ moonies.</p>

<p>Let $P$ be the unique profit such that FJ can guarantee that he makes at least $P$ profit regardless of how FN behaves, and FN can guarantee that FJ makes at most $P$ profit regardless of how FJ behaves. Output the value of $P$ modulo $10^9+7$.</p>

### 입력

<p>The first line of the input contains $N$ and $D$, where $N$ is the number of bottles and $D$ is the number of days that take place.</p>

<p>The second line of the input contains $A$ and $B$ representing the number of units of milk that Farmer John fills and Farmer Nhoj steals respectively.</p>

<p>The third line of the input contains $N$ space-separated integers $m_i$ representing the initial amount of milk in each bottle.</p>

### 출력

<p>Output the value of $P$ modulo $10^9+7$.</p>