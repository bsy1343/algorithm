# [Platinum II] Closest Cow Wins - 23875

[문제 링크](https://www.acmicpc.net/problem/23875)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 288, 정답: 113, 맞힌 사람: 102, 정답 비율: 43.220%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 스위핑, 우선순위 큐, 두 포인터

### 문제 설명

<p>Farmer John owns a long farm along the highway that can be considered somewhat like a one-dimensional number line. Along the farm, there are $K$ grassy patches ($1 \leq K \leq 2\cdot 10^5$); the $i$-th patch is located at position $p_i$ and has an associated tastiness value $t_i$ ($0\le t_i\le 10^9$). Farmer John&#39;s nemesis, Farmer Nhoj, has already situated his $M$ cows ($1 \leq M \leq 2\cdot 10^5$) at locations $f_1 \ldots f_M$. All $K+M$ of these locations are distinct integers in the range $[0,10^9]$.</p>

<p>Farmer John needs to pick $N$ ($1\le N\le 2\cdot 10^5$) locations (not necessarily integers) for his cows to be located. These must be distinct from those already occupied by the cows of Farmer Nhoj, but it is possible for Farmer John to place his cows at the same locations as grassy patches.</p>

<p>Whichever farmer owns a cow closest to a grassy patch can claim ownership of that patch. If there are two cows from rival farmers equally close to the patch, then Farmer Nhoj claims the patch.</p>

<p>Given the locations of Farmer Nhoj&#39;s cows and the locations and tastiness values of the grassy patches, determine the maximum total tastiness Farmer John&#39;s cows can claim if optimally positioned.</p>

### 입력

<p>The first line contains $K$, $M$, and $N$.</p>

<p>The next $K$ lines each contain two space-separated integers $p_i$ and $t_i$.</p>

<p>The next $M$ lines each contain a single integer $f_i$.</p>

### 출력

<p>An integer denoting the maximum total tastiness. Note that the answer to this problem can be too large to fit into a 32-bit integer, so you probably want to use 64-bit integers (e.g., &quot;long long&quot;s in C or C++).</p>