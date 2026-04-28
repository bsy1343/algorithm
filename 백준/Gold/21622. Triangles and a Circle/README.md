# [Gold V] Triangles and a Circle - 21622

[문제 링크](https://www.acmicpc.net/problem/21622)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 14, 맞힌 사람: 13, 정답 비율: 72.222%

### 분류

기하학, 두 포인터

### 문제 설명

<p>You are given $n$ distinct points on a circle of length $L$.</p>

<p>You need to find the number of triangles with vertices in these points that contain the center of the circle inside, or on their border.&nbsp;</p>

### 입력

<p>The first line of input contains two integers $n$ and $L$ ($3 \leq n \leq 300\,000$, $n \leq L \leq 10^9$).</p>

<p>Let&#39;s choose any point on the circle and call it $S$. Then any point $A$ on the circle can be encoded as $x$, $0 \le x &lt; L$: clockwise distance from $S$ to $A$. We will call this number a coordinate of $A$.</p>

<p>The second line contains $n$ distinct integers $x_1, x_2, \ldots, x_n$: coordinates of the given points on the circle ($0 \leq x_i &lt; L$).</p>

### 출력

<p>Print one integer: the number of triangles with vertices in the given points, that contain the center of the circle inside or on their border.&nbsp;</p>