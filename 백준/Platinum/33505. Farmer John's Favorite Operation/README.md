# [Platinum IV] Farmer John's Favorite Operation - 33505

[문제 링크](https://www.acmicpc.net/problem/33505)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 117, 정답: 74, 맞힌 사람: 72, 정답 비율: 66.055%

### 분류

누적 합, 수학, 정렬

### 문제 설명

<p>It is another cold and boring day on Farmer John's farm. To pass the time, Farmer John has invented a fun leisure activity involving performing operations on an integer array.</p>

<p>Farmer John has an array $a$ of $N$ ($1 \leq N \leq 2 \cdot 10^5$) non-negative integers and an integer $M$ ($1 \leq M \leq 10^9$). Then, FJ will ask Bessie for an integer $x$. In one operation, FJ can pick an index $i$ and subtract or add $1$ to $a_i$. FJ's boredom value is the minimum number of operations he must perform so that $a_i-x$ is divisible by $M$ for all $1 \leq i \leq N$.</p>

<p>Among all possible $x$, output FJ's minimum possible boredom value.</p>

### 입력

<p>The first line contains $T$ ($1 \leq T \leq 10$), the number of independent test cases to solve.</p>

<p>The first line of each test case contains $N$ and $M$.</p>

<p>The second line of each test case contains $a_1, a_2, ..., a_N$ ($0 \leq a_i \leq 10^9$).</p>

<p>It is guaranteed that the sum of $N$ over all test cases does not exceed $5 \cdot 10^5$.</p>

### 출력

<p>For each test case, output an integer on a new line containing FJ's minimum possible boredom value among all possible values of $x$.</p>