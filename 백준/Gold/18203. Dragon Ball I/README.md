# [Gold II] Dragon Ball I - 18203

[문제 링크](https://www.acmicpc.net/problem/18203)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 93, 정답: 42, 맞힌 사람: 38, 정답 비율: 48.101%

### 분류

그래프 이론, 브루트포스 알고리즘, 최단 경로, 데이크스트라

### 문제 설명

<p>There is a legendary tale about Dragon Balls on Planet X: if one collects seven Dragon Balls, the Dragon God will show up and help you fulfill your wishes.</p>

<p>One day, you are surprised to discover that the tale might possibly be true: you found a Dragon Ball radar at a flea market! The radar shows you the locations of the seven Dragon Balls on Planet X. You want to waste no time checking the truth of the old legend about wish-granting for yourself!</p>

<p>There are n cities in total on the Planet X, numbered from 1 to n. You are currently at city 1. To travel from one city to another, you can take any of m bidirectional teleport trips, as many times as you like. The i-th teleporter costs t<sub>i</sub> coins to use each time, and it can teleport you between cities a<sub>i</sub> and b<sub>i</sub>. To collect a Dragon Ball, you simply need to visit the city where it&rsquo;s located, as indicated on your radar. It is possible that multiple Dragon Balls are at the same city; in this case you pick all of them all up at once if you visit that city.</p>

### 입력

<p>The first line of input contains two space-separated integers n and m (1 &le; n, m &le; 200 000), the number of cities and possible teleport trips. Then follow m lines containing three space-separated integers a<sub>i</sub>, b<sub>i</sub>, and t<sub>i</sub> each (1 &le; a<sub>i</sub>, b<sub>i</sub> &le; n, 0 &le; t<sub>i</sub> &le; 10 000), which, as explained above, represent the two cities connected by the teleport trip, and cost to use the teleporter. Then follows one line of seven space-separated integers, representing the city IDs of the seven Dragon Balls showing on the radar. Each ID c satisfies the bound 1 &le; c &le; n.</p>

### 출력

<p>Print the minimum number of coins that you need to spend to collect all seven Dragon Balls shown on the Dragon Ball radar. If there is no way to complete this task, print &minus;1 instead.</p>