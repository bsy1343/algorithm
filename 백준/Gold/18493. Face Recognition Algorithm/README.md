# [Gold II] Face Recognition Algorithm - 18493

[문제 링크](https://www.acmicpc.net/problem/18493)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 45, 맞힌 사람: 33, 정답 비율: 80.488%

### 분류

기하학, 오일러 지표 (χ=V-E+F)

### 문제 설명

<p>I have drawn n dots on a plane and m straight segments connecting these dots. No segment goes through dots other than its endpoints, and no two segments intersect in any point other than their common endpoint. Also, if you start in one dot and move only by segments, you can go to any other dot. All n dots are in distinct positions.</p>

<p>Yes, that&rsquo;s a planar embedding of some connected graph with n vertices and m edges. Your task is to check if each face of this graph, including the outer face, is a triangle. Face is a triangle if and only if it is bounded by exactly 3 edges. If face is on both sides of some edge, this edge is counted twice.</p>

<p>Strive for excellence! Allow yourself nothing less than the best possible complexity for your <em>algorithm</em>.</p>

### 입력

<p>The first line contains two integers n and m (3 &le; n &le; 10<sup>5</sup>, n &minus; 1 &le; m &le; 3 &middot; 10<sup>5</sup>) &mdash; the number of dots and the number of segments, respectively.</p>

<p>The next n lines contain coordinates of dots. All the coordinates are not greater than 10<sup>9</sup> by absolute value. All n dots are in distinct positions.</p>

<p>Each of the next m lines contains two integers u and v (1 &le; u, v &le; n, u &ne;&nbsp;v) &mdash; the ids of dots connected by a segment. It is guaranteed that there are no two segments connecting the same pair of dots.</p>

<p>It is guaranteed that the input describes a valid planar embedding of a connected graph with all edges drawn as straight segments.</p>

### 출력

<p>If each face of the given graph, including its outer face, is a triangle, print &ldquo;YES&rdquo;, otherwise print &ldquo;NO&rdquo;.</p>