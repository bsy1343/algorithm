# [Platinum II] Minimum Longest Trip - 31058

[문제 링크](https://www.acmicpc.net/problem/31058)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 175, 정답: 92, 맞힌 사람: 76, 정답 비율: 55.072%

### 분류

다이나믹 프로그래밍, 그래프 이론, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>Bessie is going on a trip in Cowland, which has $N$ ($2\le N\le 2\cdot 10^5$) towns numbered from $1$ to $N$ and $M$ ($1\le M\le 4\cdot 10^5$) one-way roads. The $i$th road runs from town $a_i$ to town $b_i$ and has label $l_i$ ($1\le a_i,b_i\le N$, $1\le l_i\le 10^9$).</p>

<p>A <em>trip</em> of length $k$ starting at town $x_0$ is a sequence of towns $x_0, x_1, \ldots, x_k$, such that there is a road from town $x_i$ to town $x_{i+1}$ for all $0\le i &lt; k$. It is guaranteed that there are no trips of infinite length in Cowland, and that no two roads connect the same pair of towns.</p>

<p>For each town, Bessie wants to know the longest possible trip starting at it. For some starting towns, there are multiple longest trips - out of these, she prefers the trip with the lexicographically minimum sequence of road labels. A sequence is lexicographically smaller than another sequence of the same length if, at the first position in which they differ, the first sequence has a smaller element than the second sequence.</p>

<p>Output the length and sum of road labels of Bessie&#39;s preferred trip starting at each town.</p>

### 입력

<p>The first line contains $N$ and $M$.</p>

<p>The next $M$ lines each contain three integers $a_i$, $b_i$, and $l_i$, denoting a road from $a_i$ to $b_i$ with label $l_i$.</p>

### 출력

<p>Output $N$ lines. The $i$th should contain two space-separated integers, the length and sum of road labels of Bessie&#39;s preferred trip starting at town $i$.</p>