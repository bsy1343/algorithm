# [Gold IV] Dome of Circus - 3521

[문제 링크](https://www.acmicpc.net/problem/3521)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 18, 맞힌 사람: 17, 정답 비율: 85.000%

### 분류

기하학, 삼분 탐색

### 문제 설명

<p>A travelling circus faces a tough challenge in designing the dome for its performances. The circus has a number of shows that happen above the stage in the air under the dome. Various rigs, supports, and anchors must be installed over the stage, but under the dome. The dome itself must rise above the center of the stage and has a conical shape. The space under the dome must be air-conditioned, so the goal is to design the dome that contains minimal volume.</p>

<p>You are given a set of n points in the space; (xi, yi, zi) for 1 &le; i &le; n are the coordinates of the points in the air above the stage that must be covered by the dome. The ground is denoted by the plane z = 0, with positive z coordinates going up. The center of the stage is on the ground at the point (0, 0, 0).</p>

<p>The tip of the dome must be located at some point with coordinates (0, 0, h) with h &gt; 0. The dome must have a conical shape that touches the ground at the circle with the center in the point (0, 0, 0) and with the radius of r. The dome must contain or touch all the n given points. The dome must have the minimal volume, given the above constraints.</p>

### 입력

<p>The first line of the input file contains a single integer number n (1 &le; n &le; 10 000) &mdash; the number of points under the dome. The following n lines describe points with three floating point numbers xi, yi, and zi per line &mdash; the coordinates of i-th point. All coordinates do not exceed 1000 by their absolute value and have at most 2 digits after decimal point. All zi are positive. There is at least one point with non-zero xi or yi.</p>

### 출력

<p>Write to the output file a single line with two floating point numbers h and r &mdash; the height and the base radius of the dome. The numbers must be precise up to 3 digits after decimal point.</p>