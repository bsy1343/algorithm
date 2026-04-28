# [Gold I] Unseen Segments - 19011

[문제 링크](https://www.acmicpc.net/problem/19011)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 19, 정답: 11, 맞힌 사람: 11, 정답 비율: 68.750%

### 분류

자료 구조, 정렬, 이분 탐색, 누적 합, 스위핑, 값 / 좌표 압축, 차분 배열 트릭

### 문제 설명

<p>Consider a two-dimensional grid with $n$ vertical segments on it. There are two observers, one on the west and one on the east, standing at points on the X axis which are infinitely far from the segments.</p>

<p>Each observer has an x-ray vision of some non-negative integer power that allows him to look through segments. A point of a segment can be seen with vision of power $p$ if there are no more than $p$ other segments crossing the straight line between the observer and this point. We say that a part of a segment is <em>invisible</em>&nbsp;if it is not seen by any of the observers.</p>

<p>You are given $q$ queries. Each query contains two integers: the power of vision of the west and the east observer, respectively. For each query, you need to determine the total length of the invisible parts over all segments.</p>

### 입력

<p>The first line contains one integer $n$ ($1 \le n \le 10^5$), the number of segments.</p>

<p>The $i$-th of the following $n$ lines contains three integers $x_i$, $a_i$, and $b_i$ ($1 \le x \le 10^9$, $1 \le a_i &lt; b_i \le 10^9$), which describe placement of the $i$-th segment: its endpoints have coordinates $(x_i, a_i)$ and $(x_i, b_i)$. It is guaranteed that each segment has positive length and no two segments share a common point.</p>

<p>The next line contains one integer $q$ ($1 \le q \le 10^5$), the number of queries.</p>

<p>Each of the following $q$ lines contains two integers $l$ and $r$ ($0 \le l \le r \le 10^5$), the power of vision of the west and the east observer in this query, respectively.</p>

### 출력

<p>Output $q$ lines, one integer per line: the answers for the corresponding queries.</p>

### 힌트

<p>In the first query, the western observer fully sees the first segment, the part of the fourth segment at Y-coordinates $[5, 6]$, and the part of the sixth one at Y-coordinates $[6, 7]$.</p>

<p>The eastern observer fully sees the fifth and the sixth segments, the part of the fourth segment at Y-coordinates $[2, 3]$, and the part of the third one at Y-coordinates $[1, 2]$.</p>

<p>The parts that remain invisible: the complete second segment, the part of the third one at Y-coordinates $[2, 3]$, and the part of the fourth one at Y-coordinates $[3, 5]$. Their total length is $1 + 1 + 2 = 4$.</p>

<p>In all other queries, there are no invisible parts.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/19011.%E2%80%85Unseen%E2%80%85Segments/eaaaddd2.png" data-original-src="https://upload.acmicpc.net/99d3f283-c797-4622-9fba-aa16a9997ca8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 200px;" /></p>