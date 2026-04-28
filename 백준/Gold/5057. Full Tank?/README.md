# [Gold I] Full Tank? - 5057

[문제 링크](https://www.acmicpc.net/problem/5057)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 120, 정답: 45, 맞힌 사람: 27, 정답 비율: 34.177%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>After going through the receipts from your car trip through Europe this summer, you realised that the gas prices varied between the cities you visited. Maybe you could have saved some money if you were a bit more clever about where you filled your fuel?</p>

<p>To help other tourists (and save money yourself next time), you want to write a program for finding the cheapest way to travel between cities, filling your tank on the way. We assume that all cars use one unit of fuel per unit of distance, and start with an empty gas tank.</p>

### 입력

<p>The first line of input gives 1 &le; n &le; 1000 and 0 &le; m &le; 10000, the number of cities and roads. Then follows a line with n integers 1 &le; p<sub>i</sub> &le; 100, where p<sub>i</sub> is the fuel price in the ith city. Then follow m lines with three integers 0 &le; u, v &lt; n and 1 &le; d &le; 100, telling that there is a road between u and v with length d. Then comes a line with the number 1 &le; q &le; 100, giving the number of queries, and q lines with three integers 1 &le; c &le; 100, s and e, where c is the fuel capacity of the vehicle, s is the starting city, and e is the goal.</p>

### 출력

<p>For each query, output the price of the cheapest trip from s to e using a car with the given capacity, or &ldquo;impossible&rdquo; if there is no way of getting from s to e with the given car.</p>