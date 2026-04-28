# [Gold IV] Painting the Floodwall - 32014

[문제 링크](https://www.acmicpc.net/problem/32014)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 39, 정답: 14, 맞힌 사람: 9, 정답 비율: 45.000%

### 분류

이분 탐색, 값 / 좌표 압축, 다이나믹 프로그래밍

### 문제 설명

<p>The town of South Riverside has a long floodwall to protect the residents against occasional rising waters from the nearby Little Muddy river.  It&#39;s very functional, but also a bit of an eyesore.</p>

<p>The town has decided to spruce it up by staging a competition for local artists to paint murals on sections of the wall. Artists have submitted applications for the contest, in which they have specified not only how long a section of wall they want to paint but also, based upon the surrounding scenery, where along the wall they would like to place their mural.</p>

<p>Obviously, the artists&#39; work cannot overlap, so there is a possibility that not all artists&#39; applications can be accepted. On the other hand, the town would like to see as much of the wall painted as possible.</p>

<p>Find the combination of artists whose applications can be accepted to maximize the amount of the wall painted without allowing any artists&#39; work to overlap.  A mural that starts at the same coordinate at which another mural stops is not considered to overlap.</p>

### 입력

<p>Input will begin with a line containing an integer $N$ denoting the number of artists whose have submitted applications.   $1 \leq N \leq 200\,000$</p>

<p>This will be followed by $N$ lines, each containing two integers $x_0$ and $x_1$, $0 \leq x_0 \leq x_1 \leq 10^{18}$, denoting a starting and ending position (inclusive) for a proposed mural.</p>

### 출력

<p>Print a single line containing the maximum total length of the fence that can be painted without allowing any two artists&#39; work to overlap.</p>

### 힌트

<p>The second example reflects a decision to accept the applications to paint portions $0 \ldots 5$, $7 \ldots 9$, and $12 \ldots 18$.</p>