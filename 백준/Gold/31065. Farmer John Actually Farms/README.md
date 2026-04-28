# [Gold II] Farmer John Actually Farms - 31065

[문제 링크](https://www.acmicpc.net/problem/31065)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 594, 정답: 194, 맞힌 사람: 155, 정답 비율: 34.910%

### 분류

수학, 정렬

### 문제 설명

<p>Farmer John is growing $N$ ($1 \leq N \leq 2\cdot 10^5$) plants of asparagus on his farm! However some of his plants have genetic differences, so some plants will grow faster than others. The initial height of the $i$th plant is $h_i$ inches, and after each day, the $i$th plant grows by $a_i$ inches.</p>

<p>FJ likes some of his plants more than others, and he wants some specific plants to be taller than others. He gives you an array of distinct values $t_1,\dots,t_N$ containing all integers from $0$ to $N-1$ and he wants the $i$th plant to have exactly $t_i$ other plants that are taller than it. Find the minimum number of days so that FJ&#39;s request is satisfied, or determine that it is impossible.</p>

### 입력

<p>The first will consist of an integer $T$, denoting the number of independent test cases $(1 \leq T \leq 10)$.</p>

<p>The first line of each test case consists of an integer $N$.</p>

<p>The second line consists of $N$ integers $h_i$ $(1 \leq h_i \leq 10^9)$ denoting the initial height of the $i$th plant in inches.</p>

<p>The third line consists of $N$ integers $a_i$ $(1 \leq a_i \leq 10^9)$ denoting the number of inches the $i$th plant grows each day.</p>

<p>The fourth line consists of $N$ distinct integers $t_i$ denoting the array that FJ gives you.</p>

<p>It is guaranteed that the sum of $N$ over all test cases does not exceed $2\cdot 10^5$.</p>

### 출력

<p>Output $T$ lines, the answer to each test case on a different line. If it is not possible, output $-1$.</p>

<p><strong>Note that the large size of integers involved in this problem may require the use of 64-bit integer data types (e.g., a &quot;long long&quot; in C/C++).</strong></p>