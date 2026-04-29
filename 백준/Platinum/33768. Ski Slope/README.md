# [Platinum III] Ski Slope - 33768

[문제 링크](https://www.acmicpc.net/problem/33768)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 92, 정답: 48, 맞힌 사람: 40, 정답 비율: 54.054%

### 분류

이분 탐색, 자료 구조, 트리

### 문제 설명

<p>Bessie is going on a ski trip with her friends. The mountain has $N$ waypoints ($1\leq N \leq 10^5$) labeled $1, 2, \ldots, N$ in increasing order of altitude (waypoint $1$ is the bottom of the mountain).</p>

<p>For each waypoint $i &gt; 1$, there is a ski run starting from waypoint $i$ and ending at waypoint $p_i$ ($1\le p_i&lt;i$). This run has difficulty $d_i$ ($0 \leq d_i \leq 10^9$) and enjoyment $e_i$ ($0 \leq e_i \leq 10^9$).</p>

<p>Each of Bessie's $M$ friends ($1\leq M \leq 10^5$) will do the following: They will pick some initial waypoint $i$ to start at, and then follow the runs downward (to $p_i$, then to $p_{p_i}$, and so forth) until they get to waypoint $1$.</p>

<p>The enjoyment each friend gets is equal to the sum of the enjoyments of the runs they follow. Each friend also has a different skill level $s_j$ ($0 \leq s_j \leq 10^9$) and courage level $c_j$ ($0 \leq c_j \leq 10$), which limits them to selecting an initial waypoint that results in them taking at most $c_j$ runs with difficulty greater than $s_j$.</p>

<p>For each friend, compute the maximum enjoyment they can get.</p>

### 입력

<p>The first line contains $N$.</p>

<p>Then for each $i$ from $2$ to $N$, a line follows containing three space-separated integers $p_i$, $d_i$, and $e_i$.</p>

<p>The next line contains $M$.</p>

<p>The next $M$ lines each contain two space-separated integers $s_j$ and $c_j$.</p>

### 출력

<p>Output $M$ lines, with the answer for each friend on a separate line.</p>

<p><strong>Note that the large size of integers involved in this problem may require the use of 64-bit integer data types (e.g., a "long long" in C/C++).</strong></p>