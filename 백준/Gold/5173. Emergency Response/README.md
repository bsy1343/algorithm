# [Gold III] Emergency Response - 5173

[문제 링크](https://www.acmicpc.net/problem/5173)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 30, 정답: 11, 맞힌 사람: 11, 정답 비율: 36.667%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>When a crime happens, it is imperative that the emergency police response reach the crime scene as quickly as possible. That allows them to secure as much evidence as possible, perhaps save the victim, and maybe even catch the perpetrator. In order to achieve this, it is often useful to dispatch emergency response vehicles from multiple starting locations, to avoid traffic delays and such. Here, you are to write a program that will calculate when the first of multiple vehicles will reach the crime scene.</p>

<p>The city is described as n intersections and m roads. For each road, the starting and ending intersections i and j and the travel time t(i,j) &ge; 0 are given. When a pair (i,j) does not appear in the list, that means that there is no direct road from i to j. Notice that the time from i to j may not be the same as the one from j to i. For instance, a street could be a one-way street, or have different traffic patterns in both directions. In addition, you will be given the starting locations of all the cars and the destination, each as an intersection.</p>

### 입력

<p>The first line contains three numbers, n,m,s. n &le; 1000 is the number of intersections, m &le; 10000 the number of roads, and s the number of subsequent scenarios. This is followed by m lines, each specifying a road with three numbers: the starting and ending points i and j and the travel time t(i,j) &ge; 0, a floating point number.</p>

<p>Subsequently, there are s scenarios. Each scenario has as its first line two numbers c,k. c is the number of the intersection at which the crime happened, and k is the number of cars dispatched. This is followed by another line with k numbers on it, the starting intersections of the k cars, separated by a single space.</p>

### 출력

<p>For each scenario, output &ldquo;Scenario x:&rdquo; on a line by itself, where x is its number. On the next line, output the earliest arrival time of any vehicle, as a floating point number rounded to two decimals. If no vehicle can reach the target intersection, output &ldquo;Impossible.&rdquo; instead. Each scenario should be followed by an empty line.</p>