# [Gold V] Hopscotch 50 - 18529

[문제 링크](https://www.acmicpc.net/problem/18529)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 158, 정답: 102, 맞힌 사람: 93, 정답 비율: 63.699%

### 분류

다이나믹 프로그래밍, 그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>There&rsquo;s a new art installation in town, and it inspires you... to play a childish game. The art installation consists of a floor with an n&times;n matrix of square tiles. Each tile holds a single number from 1 to k. You want to play hopscotch on it. You want to start on some tile numbered 1, then hop to some tile numbered 2, then 3, and so on, until you reach some tile numbered k. You are a good hopper, so you can hop any required distance. You visit exactly one tile of each number from 1 to k.</p>

<p>What&rsquo;s the shortest possible total distance over a complete game of Hopscotch? Use the Manhattan distance: the distance between the tile at (x<sub>1</sub>, y<sub>1</sub>) and the tile at (x<sub>2</sub>, y<sub>2</sub>) is |x<sub>1</sub> &minus; x<sub>2</sub>| + |y<sub>1</sub> &minus; y<sub>2</sub>|.</p>

### 입력

<p>The first line of input contains two space-separated integers n (1 &le; n &le; 50) and k (1 &le; k &le; n<sup>2</sup>), where the art installation consists of an n&times;n matrix with tiles having numbers from 1 to k.</p>

<p>Each of the next n lines contains n space-separated integers x (1 &le; x &le; k). This is the art installation.</p>

### 출력

<p>Output a single integer, which is the total length of the shortest path starting from some 1 tile and ending at some k tile, or &minus;1 if it isn&rsquo;t possible.</p>