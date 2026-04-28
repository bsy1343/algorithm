# [Platinum I] Rotate Sum 3 - 25646

[문제 링크](https://www.acmicpc.net/problem/25646)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 1, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

수학, 기하학, 미적분학, 회전하는 캘리퍼스

### 문제 설명

<p>Grammy loves geometry. Today, she takes out her precious convex polygon and plays with it.</p>

<p>Grammy thinks that symmetry is a fun characteristic for a convex polygon, so she draws out all the axes of symmetry on the polygon.</p>

<p>NIO is a naughty boy. He repeats the following operation several times. In each operation, he chooses an axis of symmetry as the rotation axis and rotates the polygon in three-dimensional space along the axis arbitrarily. Note that after rotating the polygon, the axes of symmetry will also rotate with the polygon.</p>

<p>Grammy wants to know the total volume that can be sweeped by the convex polygon during NIO&#39;s operations. Please help her.</p>

### 입력

<p>The first line contains an integer $n$ ($3 \leq n \leq 10^5$), denoting the number of vertices of the convex polygon.</p>

<p>In each of the next $n$ lines contains two integers $x_i$, $y_i$ ($-10^9 \leq x_i, y_i \leq 10^9$), denoting the coordinates of the $i$-th vertex. The vertices are given in counterclockwise order. No three vertices lie on the same line.</p>

### 출력

<p>Output a real number, denoting the volume of the sweeped area. Your answer will be considered correct if the absolute or relative error is less than $10^{-6}$.</p>