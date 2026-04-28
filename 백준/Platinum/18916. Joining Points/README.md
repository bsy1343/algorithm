# [Platinum I] Joining Points - 18916

[문제 링크](https://www.acmicpc.net/problem/18916)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 24, 맞힌 사람: 21, 정답 비율: 60.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You are given $3n$ different points on a circle. Each of these points is colored in one of $n$ colors, such that each color appears exactly three times.&nbsp;</p>

<p>You want to draw $n$ non-intersecting arcs with ends on given points.&nbsp;</p>

<p>For these arcs, the ends of the arc should have equal colors, and no other point on the arc should have this color.</p>

<p>Note that you are drawing arcs, not chords.</p>

<p>Find the number of suitable drawings, modulo $998\,244\,353$.</p>

### 입력

<p>The first line of input contains one integer $n$ ($1 \leq n \leq 200\,000$): the number of colors.</p>

<p>Next line contains $3n$ integers $c_1, c_2, \ldots, c_{3n}$ ($1 \leq c_i \leq n$): the color of the $i$-th point on the circle, in clockwise order.</p>

<p>It is guaranteed that each color appears exactly three times.</p>

### 출력

<p>Print one integer: the number of suitable drawings modulo $998\,244\,353$.</p>