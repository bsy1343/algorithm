# [Platinum IV] Rectangular Pasture - 20648

[문제 링크](https://www.acmicpc.net/problem/20648)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 473, 정답: 240, 맞힌 사람: 192, 정답 비율: 50.394%

### 분류

자료 구조, 세그먼트 트리, 누적 합, 스위핑, 값 / 좌표 압축

### 문제 설명

<p>Farmer John&#39;s largest pasture can be regarded as a large 2D grid of square &quot;cells&quot; (picture a huge chess board). Currently, there are $N$ cows occupying some of these cells ($1 \leq N \leq 2500$).</p>

<p>Farmer John wants to build a fence that will enclose a rectangular region of cells; the rectangle must be oriented so its sides are parallel with the $x$ and $y$ axes, and it could be as small as a single cell. Please help him count the number of distinct subsets of cows that he can enclose in such a region. Note that the empty subset should be counted as one of these.</p>

### 입력

<p>The first line contains a single integer $N$. Each of the next $N$ lines Each of the next $N$ lines contains two space-separated integers, indicating the $(x,y)$ coordinates of a cow&#39;s cell. All $x$ coordinates are distinct from each-other, and all $y$ coordinates are distinct from each-other. All $x$ and $y$ values lie in the range $0 \ldots 10^9$.</p>

### 출력

<p>The number of subsets of cows that FJ can fence off. It can be shown that this quantity fits within a signed 64-bit integer (e.g., a &quot;long long&quot; in C/C++).</p>