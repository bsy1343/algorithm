# [Platinum III] Spinach Pizza - 27597

[문제 링크](https://www.acmicpc.net/problem/27597)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 51, 정답: 30, 맞힌 사람: 29, 정답 비율: 58.000%

### 분류

기하학, 그리디 알고리즘

### 문제 설명

<p>The two siblings Alberto and Beatrice have to eat a spinach pizza together. However, none of them likes spinach, so they both want to eat as little as possible.</p>

<p>The pizza has the shape of a strictly convex polygon with $n$ vertices located at integer coordinates $(x_1, y_1), (x_2, y_2), \dots , (x_n, y_n)$ of the plane.</p>

<p>The siblings have decided to eat the pizza in the following way: taking turns, starting with Alberto, each sibling chooses a vertex of the remaining part of the pizza and eats out the triangle determined by its two neighboring edges. In this way, after each of the first $n - 3$ turns the pizza will have one less vertex. The game ends after the $(n - 2)$-th turn, when all the pizza has been eaten.</p>

<p>Assuming that Alberto and Beatrice choose the slices to eat optimally, which of the siblings manages to eat <strong>at most half</strong> of the pizza? You should identify a sibling that has a strategy to do so and help them choose the slices appropriately. Note that it is possible that both Alberto and Beatrice end up eating exactly half of the area if they choose their slices optimally.</p>

### 입력

<p>The first line contains a single integer $n$ ($4 &le; n &le; 100$) &mdash; the number of vertices.</p>

<p>The next $n$ lines contain two integers $x_i$ and $y_i$ each ($-10^6 &le; x_i , y_i &le; 10^6$) &mdash; the coordinates of the $i$-th vertex of the polygon representing the initial shape of the pizza.</p>

<p>It is guaranteed that the polygon is strictly convex and that its vertices are given in counterclockwise order.</p>

### 출력

