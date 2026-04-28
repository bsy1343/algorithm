# [Gold V] Connect the Cows - 5894

[문제 링크](https://www.acmicpc.net/problem/5894)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 227, 정답: 83, 맞힌 사람: 68, 정답 비율: 38.636%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>Every day, Farmer John walks around his farm to check on the health and well-being of his N (1 &lt;= N &lt;= 10) cows.</p><p>The location of each cow is described by a point in the 2D plane, and Farmer John starts out at the origin (0,0).  To make his route more interesting, Farmer John decides that he will only walk in directions parallel to the coordinate axes -- that is, only north, south, east, or west.  Furthermore, he only changes his direction of travel when he reaches the location of a cow (he may also opt to pass through the location of a cow without changing direction, if desired).  When he changes his direction of travel, he may make either a 90-degree or 180-degree turn.  FJ&apos;s route must take him back to the origin after visiting all his cows.</p><p>Please compute the number of different routes FJ can take to visit his N cows, if he changes direction exactly once at the location of each cow.  He is allowed to pass through the location of a cow without changing direction an arbitrary number of times.  The same geometric route taken forward versus backward counts as two different routes.</p>

### 입력

<ul><li>Line 1: The integer N.</li><li>Lines 2..1+N: Line i+1 contains the x and y coordinates (space-separated) of the ith point (each values is in the range -1000...1000).</li></ul>

### 출력

<ul><li>Line 1: The number of different routes FJ can take (this could be zero if there are no valid routes).</li></ul>

### 힌트

<h4>Input Details</h4><p>There are 4 cows, at positions (0,1), (2,1), (2,0), and (2,-5).</p><h4>Output Details</h4><p>There are two different routes: Farmer John can visit cows in the orders 1-2-4-3 or 3-4-2-1 before returning to the origin.</p>