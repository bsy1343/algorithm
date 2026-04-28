# [Platinum II] Maximum Strategic Savings - 16025

[문제 링크](https://www.acmicpc.net/problem/16025)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 49, 정답: 22, 맞힌 사람: 21, 정답 비율: 47.727%

### 분류

자료 구조, 그래프 이론, 분리 집합, 최소 스패닝 트리

### 문제 설명

<p>A long time ago in a galaxy far, far away, there are N planets numbered from 1 to N. Each planet has M cities numbered from 1 to M. Let city f of planet e be denoted as (e, f).</p>

<p>There are N &times; P two-way flights in the galaxy. For every planet e (1 &le; e &le; N), there are P flights numbered from 1 to P. Flight i connects cities (e, a<sub>i</sub>) and (e, b<sub>i</sub>) and costs ci energy daily to maintain.</p>

<p>There are M &times; Q two-way portals in the galaxy. For all cities with number f (1 &le; f &le; M), there are Q portals numbered from 1 to Q. Portal j connects cities (x<sub>j</sub>, f) and (y<sub>j</sub>, f) and costs z<sub>j</sub> energy daily to maintain.</p>

<p>It is possible to travel between any two cities in the galaxy using only flights and/or portals.</p>

<p>Hard times have fallen on the galaxy. It was decided that some flights and/or portals should be shut down to save as much energy as possible, but it should remain possible to travel between any two cities afterwards.</p>

<p>What is the maximum sum of energy that can be saved daily?</p>

### 입력

<p>The first line contains four space-separated integers N, M, P, Q (1 &le; N, M, P, Q &le; 10<sup>5</sup>).</p>

<p>Then P lines follow; the i-th one contains three space-separated integers a<sub>i</sub>, b<sub>i</sub>, c<sub>i</sub> (1 &le; a<sub>i</sub>, b<sub>i</sub> &le; M, 1 &le; c<sub>i</sub> &le; 10<sup>8</sup>).</p>

<p>Then Q lines follow; the j-th one contains three space-separated integers x<sub>j</sub>, y<sub>j</sub>, z<sub>j</sub> (1 &le; x<sub>j</sub>, y<sub>j</sub> &le; N, 1 &le; z<sub>j</sub> &le; 10<sup>8</sup>).</p>

<p>It is guaranteed that it will be possible to travel between any two cities using flights and/or portals. There may be multiple flights/portals between the same pair of cities or a flight/portal between a city and itself.</p>

### 출력

<p>Output a single integer, the maximum sum of energy that can be saved daily.</p>