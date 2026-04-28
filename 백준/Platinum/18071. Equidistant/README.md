# [Platinum V] Equidistant - 18071

[문제 링크](https://www.acmicpc.net/problem/18071)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 148, 정답: 55, 맞힌 사람: 48, 정답 비율: 47.059%

### 분류

그래프 이론, 그래프 탐색, 트리, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>In 2019 ICPC subregions structure was changed a little. Now for each subregion, we need to choose the best place for the subregion finals. To make things fair we want to choose a city in such a way that all teams will spend the same amount of time to get there.</p>

<p>To make things simpler we say that all teams will use trains to get to the finals. The railroad system can be represented as a tree where each city is a vertex and some pairs of cities are connected by a railroad. It takes exactly one hour to get from one city to another if they are directly connected.</p>

<p>You are given a description of the railroad system and the cities where teams are located. You need to choose any city that has an equal distance to all teams&rsquo; cities or detect that no such city exists.</p>

### 입력

<p>The first line of the input contains two integers n and m &mdash; the number of cities and the number of teams (1 &le; m &le; n &le; 2 &middot; 10<sup>5</sup>). Each of the following n &minus; 1 lines contains two integers v<sub>i</sub> and u<sub>i</sub> &mdash; the indices of the cities connected by the i-th railroad (1 &le; v<sub>i</sub>, u<sub>i</sub> &le; n). It is guaranteed that for each pair of cities there is exactly one simple path connecting them.</p>

<p>The next line contains m integers c<sub>1</sub>, c2, . . . , c<sub>m</sub> &mdash; the cities of the teams (1 &le; c<sub>i</sub> &le; n). All teams are located in different cities.</p>

### 출력

<p>If it is impossible to choose a city fairly, output a single word &ldquo;NO&rdquo;. Otherwise, output a the word &ldquo;YES&rdquo; at the first line. The second line should contain a single integer &mdash; the city where subregion finals should be held. If there is more than one solution, output any of them.</p>