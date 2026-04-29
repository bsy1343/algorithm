# [Silver IV] Bikes and Barricades - 32497

[문제 링크](https://www.acmicpc.net/problem/32497)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 89, 정답: 61, 맞힌 사람: 57, 정답 비율: 67.857%

### 분류

기하학, 수학

### 문제 설명

<p>Scott wants to ride his bike along a straight road. But the road has some barricades! Scott will ride his bike up to the first barricade and stop.</p>

<p>Model Scott’s straight road as the positive $Y$ axis, with Scott starting at the origin. The barricades are line segments, specified by their endpoints. Determine how far Scott can ride, or if his path is completely unobstructed.</p>

### 입력

<p>The first line of input contains a single integer $n$ ($1≤n≤1\,000$), which is the number of barricades.</p>

<p>Each of the next 𝑛n lines contains four integers $x_1$, $y_1$, $x_2$ and $y_2$ ($-100≤x_1,y_1,x_2,y_2≤100$, $x_1 \ne 0$, $x_2 \ne 0$), representing a barricade that runs from $(x_1,y_1)$ to $(x_2,y_2)$. It is guaranteed that no barricade will run through the origin.</p>

### 출력

<p>Output a single real number, which is how far Scott can ride before he hits the closest barricade, or $-1.0$ if no barricades get in Scott’s way. This output will be considered correct if it is within an absolute or relative error of $10^{-2}$.</p>