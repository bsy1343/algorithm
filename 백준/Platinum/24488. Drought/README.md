# [Platinum II] Drought - 24488

[문제 링크](https://www.acmicpc.net/problem/24488)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 193, 정답: 93, 맞힌 사람: 67, 정답 비율: 45.578%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>The grass has dried up in Farmer John&#39;s pasture due to a drought. After hours of despair and contemplation, FJ comes up with the brilliant idea of purchasing corn to feed his precious cows.</p>

<p>FJ&rsquo;s $N$ ($1 \leq N \leq 100$) cows are arranged in a line such that the $i$th cow in line has a non-negative integer hunger level of $h_i$. As FJ&rsquo;s cows are social animals and insist on eating together, the only way FJ can decrease the hunger levels of his cows is to select two adjacent cows $i$ and $i+1$ and feed each of them a bag of corn, causing each of their hunger levels to decrease by one.</p>

<p>FJ wants to feed his cows until all of them have the same non-negative hunger level. Although he doesn&#39;t know his cows&#39; exact hunger levels, he does know an upper bound on the hunger level of each cow; specifically, the hunger level $h_i$ of the $i$-th cow is at most $H_i$ ($0\le H_i\le 1000$).</p>

<p>Your job is to count the number of $N$-tuples of hunger levels $[h_1,h_2,\ldots,h_N]$ that are consistent with these upper bounds such that it is possible for FJ to achieve his goal, modulo $10^9+7$.</p>

### 입력

<p>The first line contains $N$.</p>

<p>The second line contains $H_1,H_2,\ldots,H_N$.</p>

### 출력

<p>The number of $N$-tuples of hunger levels modulo $10^9+7$.</p>