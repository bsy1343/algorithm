# [Platinum I] Cowpproximation - 32573

[문제 링크](https://www.acmicpc.net/problem/32573)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 137, 정답: 50, 맞힌 사람: 30, 정답 비율: 30.303%

### 분류

경사 하강법, 기하학, 최소 외접원

### 문제 설명

<p>There are cows in a $2$ by $2$ kilometer field. The cows want to have a group meeting, and all of them must attend! It is up to you to plan the meeting to take place as soon as possible.</p>

<p>To model this problem, we approximate each cow as a circle, and for our purposes, there are no collisions — cows can pass through each other freely.</p>

<p>The $i$-th cow is represented by its initial position $(x_i , y_i)$ and its radius $r_i$, all distances are measured in meters. You can tell each cow to travel in any direction from its initial position at a constant speed from $0$ to $1$ meter per second. The meeting takes place as soon as all cows occupy the same point in the plane, i.e., there exists a point contained within all circles representing the cows. Find the minimum time in seconds required for the cows to meet.</p>

### 입력

<p>The first input line contains a single integer $N$ ($1 ≤ N ≤ 10^3$), representing the number of cows. Each of the following $N$ lines contains three space separated integers $x_i$, $y_i$, $r_i$, describing a cow, where $-10^3 ≤ x_i , y_i ≤ 10^3$ and $1 ≤ r_i ≤ 10^3$.</p>

### 출력

<p>Output the minimum time $T$ in seconds after which all the cows meet. Your answer will be considered correct if it has an absolute or relative error at most $10^{-5}$. Formally, let $T_{OPT}$ be the optimal value. Then your answer is considered correct if either $|T - T_{OPT}| ≤ 10^{-5}$ or $\left| \frac{T - T_{OPT}}{\max\{1,T_{OPT}\}} \right| ≤ 10^{-5}$ holds.</p>