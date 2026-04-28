# [Gold I] Patkice II - 20664

[문제 링크](https://www.acmicpc.net/problem/20664)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 26, 맞힌 사람: 24, 정답 비율: 45.283%

### 분류

구현, 그래프 이론, 최단 경로, 데이크스트라, 역추적, 0-1 너비 우선 탐색

### 문제 설명

<p>After Holywood got its hands on the fascinating story of the successful umbrella voyage between two islands, Netflix executives decided to make a series adaptation of the three ducks&#39; travels.</p>

<p>As you may remember from the first round of COCI 20/21, the ducks have a map of ocean currents. The ducks travel together. The island where the ducks live is marked by the letter &#39;<code>o</code>&#39;. The ducks can start their voyage in any of the four directions. Ocean currents in these seas move in one of the four directions, and are marked in the following way: west-east &#39;<code>&gt;</code>&#39;, east-west &#39;<code>&lt;</code>&#39;, north-south &#39;<code>v</code>&#39; and south-north &#39;<code>^</code>&#39;. When the ducks are located on a cell with a current, they will move one cell in the direction of the current.</p>

<p>Calm sea is marked by a dot &#39;<code>.</code>&#39;. If the currents bring the ducks to a cell with calm sea, outside the map, or back to the starting island, they will stop their voyage. The island that the ducks want to visit is marked by &#39;<code>x</code>&#39;.</p>

<p>In order to make the series more appealing, Netflix made a few changes to the story: the sea now may contain wild vortexes (the ducks can get stuck in a cycle) and sea currents that carry the ducks outside the map. (The ducks also form a heartbreaking love triangle, but that is not important right now.)</p>

<p>Therefore, the original map of currents has been changed. But under heavy deadline pressure, the director has made some mistakes: the ducks cannot arrive from the initial to the target island via sea currents anymore.</p>

<p>Netflix directors are very important persons, so they don&#39;t really spend time contemplating plot holes. Thus it is your task now to replace as few as possible characters on the map, so that the ducks can go from the initial to the target island.</p>

<p>For story purposes, the cells with (&#39;<code>o</code>&#39; and &#39;<code>x</code>&#39;) cannot be modified. All other cells are either sea currents or calm sea (characters &#39;<code>&lt;&gt;v^.</code>&#39;). You can replace characters in those cells with characters from the same set &#39;<code>&lt;&gt;v^.</code>&#39;.</p>

### 입력

<p>The first line contains integers r and s (3 &le; r, s &le; 2000), the number of rows and columns of the map.</p>

<p>Each of the following r lines contains s characters from the set &#39;<code>o&lt;&gt;v^.x</code>&#39;, that represent the map of ocean currents. There will always be exactly one character &#39;<code>o</code>&#39; and exactly one character &#39;<code>x</code>&#39; on the map, and they will not be adjacent.</p>

### 출력

<p>In the first line output k, the minimum number of changes so that the ducks can go from the initial to the target island.</p>

<p>In the each of the next r lines, output s characters, describing a map which differs from the input map in exactly k cells, satisfying the requirements of the problem.</p>

<p>If there are multiple valid maps, output any of them.</p>