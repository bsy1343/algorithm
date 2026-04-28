# [Gold I] Autobus - 24470

[문제 링크](https://www.acmicpc.net/problem/24470)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 77, 정답: 36, 맞힌 사람: 26, 정답 비율: 46.429%

### 분류

다이나믹 프로그래밍, 그래프 이론, 최단 경로

### 문제 설명

<p>In a country there are $n$ cities. The cities are connected by $m$ bus routes, where the $i$-th route starts in city $a_i$, ends in city $b_i$ and takes $t_i$ minutes.</p>

<p>Ema loves to travel, but doesn&rsquo;t like transferring between buses. On her trip she wants to use <strong>at most</strong>&nbsp;$k$ different bus routes.</p>

<p>Help her answer $q$ questions of the form &lsquo;What is the shortest travel time to get from city $c_j$ to city $d_j$ (using at most $k$ different bus routes)?&rsquo;.</p>

### 입력

<p>The first line contains two positive integers $n$ and $m$ ($2 &le; n &le; 70$, $1 &le; m &le; 10^6$), the number of cities and the number of bus routes.</p>

<p>The $i$-th of the next $m$ lines contains positive integers $a_i$, $b_i$ and $t_i$ ($1 &le; a_i , b_i &le; n$, $1 &le; t_i &le; 10^6$), the terminal cities and the travel time of the $i$-th bus route.</p>

<p>The next line contains two positive integers $k$ and $q$ ($1 &le; k &le; 10^9$, $1 &le; q &le; n^2$), the maximum number of used routes and the number of queries.</p>

<p>The $j$-th of the next $q$ lines contains positive integers $c_j$ and $d_j$ ($1 &le; c_j , d_j &le; n$), the cities from the $j$-th query.</p>

### 출력

<p>Print $q$ lines. In the $j$-th line print the shortest travel time from the $j$-th query, or <code>-1</code> if there is no trip that satisfies the requirements.</p>

### 힌트

<p>Clarification of the examples:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24470.%E2%80%85Autobus/dfa923eb.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/24470.%E2%80%85Autobus/dfa923eb.png" data-original-src="https://upload.acmicpc.net/ca69355f-c80c-4760-82ea-991f9a7fd16a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 544px; height: 133px;" /></p>

<p>The answer to the first query from each example is marked on the graph.</p>