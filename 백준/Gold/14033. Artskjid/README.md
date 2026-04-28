# [Gold I] Artskjid - 14033

[문제 링크](https://www.acmicpc.net/problem/14033)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 65, 정답: 18, 맞힌 사람: 15, 정답 비율: 28.302%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>There are many well-known algorithms for finding the shortest route from one location to another. People have GPS devices in their cars and in their phones to show them the fastest way to get where they want to go. While on vacation, however, Troy likes to travel slowly. He would like to take the longest route to his destination so that he can visit many new and interesting places along the way.</p>

<p>As such, a valid route consists of a sequence of distinct cities c<sub>1</sub>, c<sub>2</sub>, ..., c<sub>k</sub>, such that there is a road from c<sub>i</sub> to c<sub>i+1</sub> for each 1 &le; i &lt; k.</p>

<p>He does not want to visit any city more than once. Can you help him find the longest route?</p>

### 입력

<p>The first line of input contains two integers n, m, the total number of cities and the number of roads connecting the cities (2 &le; n &le; 18; 1 &le; m &le; n<sup>2</sup> &minus; n). There is at most one road from any given city to any other given city. Cities are numbered from 0 to n &minus; 1, with 0 being Troy&rsquo;s starting city, and n &minus; 1 being his destination.</p>

<p>The next m lines of input each contain three integers s, d, l. Each triple indicates that there is a one way road from city s to city d of length l km (0 &le; s &le; n &minus; 1; 0 &le; d &le; n &minus; 1; s &ne; d; 1 &le; l &le; 10000). Each road is one-way: it can only be taken from s to d, not vice versa. There is always at least one route from city 0 to city n &minus; 1.</p>

### 출력

<p>Output a single integer, the length of the longest route that starts in city 0, ends in city n &minus; 1, and does not visit any city more than once. The length is the sum of the lengths of the roads taken along the route.</p>