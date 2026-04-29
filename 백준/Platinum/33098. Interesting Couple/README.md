# [Platinum I] Interesting Couple - 33098

[문제 링크](https://www.acmicpc.net/problem/33098)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 6, 정답: 6, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

세그먼트 트리, 스위핑, 자료 구조

### 문제 설명

<p>You are hosting a party with $N$ guests (numbered from $1$ to $N$) in a large room. The party room can be represented as a $2$-dimensional Cartesian space where guest $i$ stands at $(X_i , Y_i)$. Since you have a unique personality, you require each guest to only move horizontally or vertically within this room.</p>

<p>The <strong>distance</strong> between two guests $i$ and $j$, denoted as $d(i, j)$, is the total distance they need to travel in both horizontal and vertical directions to reach each other, i.e., $d(i, j) = |X_i - Xj | + |Y_i - Yj |$.</p>

<p>The <strong>privacy value</strong> of two guests $i$ and $j$, denoted as $p(i, j)$, is determined by their distances to the closest other guest. Formally, $p(i, j)$ is the smallest $\min(d(i, k), d(j, k))$ over all $k$ where $k \ne i$ and $k \ne j$.</p>

<p>A pair of guest $i$ and $j$ is an <strong>interesting couple</strong> if and only if their privacy value is greater or equal to the distance between them. In other words, it is a pair $(i, j)$ such that $p(i, j) ≥ d(i, j)$.</p>

<p>Your task in this problem is to find the minimum value of $p(i, j)$ among all such interesting couples.</p>

### 입력

<p>The first line consists of an integer $N$ ($3 ≤ N ≤ 100\, 000$).</p>

<p>Each of the next $N$ lines consists of two integers $X_i$ $Y_i$ ($0 ≤ X_i , Y_i ≤ 10^9$). There are no two guests stand at the same location. Formally, $(X_i , Y_i) \ne (X_j , Y_j )$ for $1 ≤ i &lt; j ≤ N$.</p>

<p>Under the given constraints, it can be shown that an interesting couple always exists.</p>

### 출력

<p>Output an integer representing the minimum value of $p(i, j)$ among all interesting couples.</p>