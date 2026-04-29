# [Platinum III] Friend Meetup - 35445

[문제 링크](https://www.acmicpc.net/problem/35445)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 7, 정답: 7, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

기하학, 매개 변수 탐색, 수학

### 문제 설명

<p>A group of friends live happily on a 2D Manhattan grid, which has a horizontal road $y=a$ running through it for every integer $a$ and a vertical road $x=b$ for every integer $b$. Each friend is located at the intersection of two roads and has a walking speed (in grid units per second). They can only travel by moving along the roads at those speeds.</p>

<p>Life on the grid gets boring, so pairs of friends sometimes like to meet up. They do so by moving towards each other along routes that cause them to meet at a common point as quickly as possible. (This point does not have to be at the intersection of two roads; but does have to lie on a road, of course.) They would like to know: over all possible pairs of friends, what's the longest it could take a pair of friends to meet up?</p>

### 입력

<p>The first line of input contains an integer $N$ $(2 \leq N \leq 2 \cdot 10^{5})$, the number of friends.</p>

<p>Each of the next $N$ lines contains three space-separated integers $x$, $y$, and $v$ $(|x|, |y| \leq 10^{6}, 1 \leq v \leq 10^{6})$, indicating a friend located at $(x,y)$ who travels at $v$ units per second along the grid.</p>

### 출력

<p>Print the real number of seconds it would take for a pair of friends to meet up for whom this time is the longest, assuming that each pair takes optimal routes to meet up as quickly as possible. Your answer will be accepted if it differs from the judge solution by relative or absolute error at most $10^{-6}$.</p>