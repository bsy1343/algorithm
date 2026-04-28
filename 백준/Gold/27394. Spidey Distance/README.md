# [Gold IV] Spidey Distance - 27394

[문제 링크](https://www.acmicpc.net/problem/27394)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 13, 맞힌 사람: 13, 정답 비율: 68.421%

### 분류

기하학, 수학

### 문제 설명

<p>Consider a 2D plane of points with integer coordinates. The <em>Taxi-cab Distance</em> between two points is a measure of the shortest path between the points where movement is restricted to only horizontal and vertical paths, similar to following the lines on traditional graph paper. Each point connects to exactly four others, and each is one unit away.</p>

<p>The <em>Spidey Distance</em> is a similar measure of the shortest path, but allows movement horizontally, vertically, or along diagonal paths. Horizontal and vertical points are separated by one unit, but diagonal points are $1.5$ units away. Thus, each point connects to eight other points, four of which are one unit away and four of which are $1.5$ units away.</p>

<p>Write a program to compute the fraction of the number of points reachable via a given taxi-cab distance from a point, within an area defined by a spidey distance around that point.</p>

### 입력

<p>The single line of input contains two integers $t$ and $s$ ($0 \le t,s \le 10^6$), where $t$ is a taxi-cab distance, and $s$ is a spidey distance.</p>

### 출력

<p>Output a fraction in the form $n$/$d$, which is the fraction of points within the given spidey distance that can also be reached within the given taxi-cab distance. Output this fraction reduced to lowest form. If $d=1$ only output $n$. Do not output any spaces around the $/$.</p>