# [Gold II] Nature Reserve - 35013

[문제 링크](https://www.acmicpc.net/problem/35013)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 12, 정답: 9, 맞힌 사람: 9, 정답 비율: 75.000%

### 분류

기하학, 브루트포스 알고리즘

### 문제 설명

<p>There are unicorns living in a magical kingdom on a plane. People know the coordinates of $n$ points on the map: the places of unicorn sightings.</p>

<p>Recently, the king agreed to declare the territory inhabited by unicorns a nature reserve. The boundaries of the reserve should be two parallel lines that will contain all $n$ places of unicorn sightings between them (or on them). However, land in the kingdom is expensive, so the king does not want to allocate anything extra for the reserve: each boundary must pass through at least one of the $n$ points.</p>

<p>You are the chief ecologist of the kingdom. Your task is to choose the boundaries of the reserve so that the king's will is fulfilled, but the reserve is as large as possible. The size of the reserve is defined as the distance between the boundaries.</p>

### 입력

<p>The first line contains an integer $n$: the number of places unicorn sightings ($2 \le n \le 1000$).</p>

<p>Each of the following $n$ lines contains two integers $x$ and $y$: the coordinates of a point on the map where unicorns have been seen ($0 \le x, y \le 10^4$). All given points are distinct.</p>

### 출력

<p>We will define a line by three coefficients: $a$, $b$, and $c$. Such a line contains points $(x, y)$ that satisfy the equation $a x + b y + c = 0$.</p>

<p>Output two lines specifying the borders. On each line, print three integers: $a$, $b$, and $c$, the coefficients of a line equation ($|a|, |b|, |c| \le 10^9$).</p>

<p>The distance between the lines must be the maximum possible. It can be shown that there exists an optimal answer that satisfies the above constraints. If there are several optimal answers, print any one of them.</p>