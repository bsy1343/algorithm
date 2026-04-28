# [Platinum II] Commemorative Race - 18199

[문제 링크](https://www.acmicpc.net/problem/18199)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 11, 맞힌 사람: 11, 정답 비율: 84.615%

### 분류

깊이 우선 탐색, 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 위상 정렬, 방향 비순환 그래프

### 문제 설명

<p>Filiberto is planning a race to celebrate the 2019 ICPC Mid-Central Regional. The racers compete by going down a mountain on a set of roads. As it would be dangerous to have cars speeding at each other in opposite directions, racers may only drive downhill on each road in a single direction. The endpoint of each road is called a station, and roads connect only at stations.</p>

<p>A path is a sequence of roads where the ending station of one road is the starting station of the next. Each racer must choose a path to race on. The length of a path is the number of roads in it.</p>

<p>The goal of this race is to stay on the course as long as possible &ndash; that is, to find a path of maximum length. Every racer knows the full layout of the stations and roads, and will choose some path of maximal length.</p>

<p>Filiberto is concerned about natural disasters (e.g., landslides) blocking off roads during the competition. If a road is blocked off, it may reduce the length of some paths of the race. This works as follows: say the road from station u to station v is blocked off. Then the racer will follow their path until station u, at which point they have to modify their path starting from station u, while still trying to maximize the length of their new path. As each racer knows the full map of the mountain, they will optimally re-route to maximize the length of their new path.</p>

<p>To understand the worst-case scenario, Filiberto wants to know the minimum length path that a winning racer would take if at most one of the roads is blocked off. This means that among all sets of maximum length paths that racers can choose and all possible roads that can be blocked off, what is the minimum length path that a racer may take after that road is blocked off and that path is at least as long as any other racers&rsquo; path (other racers are also effected by the same blocked road)?</p>

### 입력

<p>The first line of the input contains two integers n and m (2 &le; n &le; 10<sup>5</sup>, 1 &le; m &le; min(n(n &minus; 1)/2, 10<sup>6</sup>)) &ndash; the number of stations and number of roads on the mountain. The next m lines each contain two integers u and v (1 &le; u, v &le; n, u &ne;&nbsp;v) representing a one-way road from station u to station v. It is guaranteed that there is at most one road between any pair of stations and there are no loops in the road graph (i.e. the input is a directed acyclic graph).</p>

### 출력

<p>Print a line with a single integer &ndash; the minimum length path that competitors can achieve if at most one of the roads is blocked off. That is, Filiberto wants to know the minimum longest time with the worst landslide location.</p>

### 힌트

<p>In the second sample, every racer will start from stations number 1 or 7. If the road (2, 3) is blocked, then all racers will have to re-route at station 2 towards station 5.</p>

<p>In the third sample, the minimum path that could be taken happens by blocking the first road of the only path that racers can choose. Blocking any other road results in a longer path.</p>

<p>In the last sample there is only one maximum length path, but the best option is to block the road (4, 5). If we block the road (1, 4) the racers can re-route earlier and achieve a path of length 2.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18199.%E2%80%85Commemorative%E2%80%85Race/a6966a6e.png" data-original-src="https://upload.acmicpc.net/b6ff9c11-83d5-443d-8961-cf3e2630f6d2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 418px; height: 284px;" /></p>