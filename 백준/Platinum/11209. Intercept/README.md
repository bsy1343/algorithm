# [Platinum III] Intercept - 11209

[문제 링크](https://www.acmicpc.net/problem/11209)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 126, 정답: 46, 맞힌 사람: 34, 정답 비율: 30.631%

### 분류

그래프 이론, 그래프 탐색, 최단 경로, 깊이 우선 탐색, 데이크스트라, 단절점과 단절선

### 문제 설명

<p>Fatima commutes from KTH to home by subway every day. Today Robert decided to surprise Fatima by baking cookies and bringing them to an intermediate station. Fatima does not always take the same route home, because she loves to admire the artwork inside different stations in Stockholm. However, she always optimizes her travel by taking the shortest route. Can you tell Robert which station he should go to in order to surely intercept Fatima?</p>

### 입력

<p>The first line contains two integers N and M, 1 &le; N, M &le; 100 000, where N is the number of subway stations and M is the number of subway links. M lines follow, each with three integers u, v, w, 0 &le; u, v &lt; N, 0 &lt; w &le; 1 000 000 000, meaning that there is a one-way link from u to v that takes w seconds to complete. Note that different subway lines may serve the same route.</p>

<p>The last line contains two integers s and t, 0 &le; s, t &lt; N the number of the station closest to KTH and closest to home, respectively. It is possible to reach t from s.</p>

### 출력

<p>A space separated list of all the station numbers u such that all shortest paths from s to t pass through u, in increasing order.</p>