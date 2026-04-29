# [Platinum III] Balancing the Barns - 35332

[문제 링크](https://www.acmicpc.net/problem/35332)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 42, 정답: 8, 맞힌 사람: 8, 정답 비율: 19.048%

### 분류

매개 변수 탐색, 수학, 이분 탐색

### 문제 설명

<p>Farmer John has $N$ ($1\le N\le 5\cdot 10^4$) barns arranged along a road. The $i$-th barn contains $a_i$ bales of hay and $b_i$ bags of feed $(0\le a_i,b_i\le 10^9$).</p>

<p>Bessie has been complaining about the inequality between barns. She defines the "imbalance" of the farm as the difference between the maximum hay in any barn and the minimum feed in any barn. Formally, the imbalance is $\max(a) - \min(b)$.</p>

<p>To address Bessie's concerns, Farmer John can perform exactly $K$ ($1\le K\le 10^{18}$) transfers. In each transfer, he selects a barn $i$, sells one of its haybales, and buys it a new bag of feed for the same barn. Note that there can be negative amounts in his farm (he is not afraid of debt). Formally, $K$ times, you choose an index $i\in [1,N]$, decrement $a_i$, and increment $b_i$.</p>

<p>Help Farmer John determine the minimum possible imbalance after performing exactly $K$ transfers.</p>

### 입력

<p>The first line contains $T$ ($1 \leq T \leq 10^3$), the number of independent test cases.</p>

<p>The first line of each test case contains $N$ and $K$.</p>

<p>The following line contains $a_1\dots a_N$.</p>

<p>The following line contains $b_1\dots b_N$.</p>

<p>The sum of $N$ over all test cases is at most $5 \cdot 10^4$.</p>

### 출력

<p>For each test case, output a single integer, the minimum possible value of $\max(a) - \min(b)$ after performing $K$ operations.</p>

### 힌트

<p>In the first test case, Farmer John can transfer $10$ haybales from barn $1$ into bags of feed. This leaves $a = [-5]$ and $b = [13]$. The imbalance is $\max(a) - \min(b) = -5 - 13 = -18$.</p>

<p>In the second test case, Farmer john can transfer $5$ haybales from barn $1$ and $1$ haybale from barn $2$. This leaves $a = [95, 95]$ and $b = [5, 5]$. The imbalance is $95 - 5 = 90$. This is the minimum imbalance Farmer John can achieve.</p>