# [Platinum I] Maximum Islands - 13980

[문제 링크](https://www.acmicpc.net/problem/13980)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 53, 정답: 35, 맞힌 사람: 34, 정답 비율: 75.556%

### 분류

그래프 이론, 그래프 탐색, 이분 매칭

### 문제 설명

<p>You are mapping a faraway planet using a satellite.</p>

<p>Your satellite has captured an image of the planet&rsquo;s surface. The photographed section can be modeled as a grid. Each grid cell is either land, water, or covered by clouds. Clouds mean that the surface could either be land or water, but we can&rsquo;t tell.</p>

<p>An island is a set of connected land cells. Two cells are considered connected if they share an edge.</p>

<p>Given the image, determine the maximum number of islands that is consistent with the given information.</p>

### 입력

<p>The first line of input contains two space-separated integers n and m (1 &le; n, m &le; 40).</p>

<p>Each of the next n lines contains m characters, describing the satellite image. Land cells are denoted by &lsquo;L&rsquo;, water cells are denoted by &lsquo;W&rsquo;, and cells covered by clouds are denoted by &lsquo;C&rsquo;.</p>

### 출력

<p>Print, on a single line, a single integer indicating the maximum number of islands that is consistent with the given grid.</p>