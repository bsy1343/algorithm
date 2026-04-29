# [Gold III] Copogonia - 32312

[문제 링크](https://www.acmicpc.net/problem/32312)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 22, 정답: 17, 맞힌 사람: 14, 정답 비율: 73.684%

### 분류

그래프 이론, 기하학, 데이크스트라, 브루트포스 알고리즘, 비트마스킹, 최단 경로, 플로이드–워셜, 피타고라스 정리

### 문제 설명

<p>Copogonia is a country with a set of n cities, which currently has n roads. The set of roads forms a convex polygon, hence the name of the country. Unfortunately, some of the citizens have been complaining about traveling times between cities. Due to the limited road system, there are always precisely two ways to travel between any pair of distinct cities (clockwise or counter-clockwise), and for some pairs of cities, even the shorter of the two possible routes seems like it takes too long.</p>

<p>After many rounds of careful surveys, it's been determined that the citizens would be happy if no individual travel distance between a pair of cities exceeded length m, i.e., the path between any two cities has length m or less.</p>

<p>The government of Copogonia has done extensive research and decided that they could potentially build up to k new roads where each road directly connects two cities that were not previously connected via a direct road with a distance equal to the straight line distance between the two cities. Each road, however, comes with a cost of development. Naturally, the government of Copogonia would like to minimize the cost of development while keeping all of its citizens happy. They have tasked you with finding the precise subset of roads to develop to achieve their goals.</p>

<p>Given the locations on the Cartesian plane of the n cities of Copogonia (in the order they are connected with roads, noting that there is also a road from the last city to the first), a list of k potential additional roads that could be added (pair of cities and cost to build the road), and the maximum distance, m, that citizens are willing to travel on a single trip between pairs of cities, determine the minimal cost of developing a subset of roads that will keep the citizens of Copogonia happy.</p>

### 입력

<p>The first input line contains three space separated integers: n (4 ≤ n ≤ 50), indicating the number of cities in Copogonia, k (1 ≤ k ≤ 10), indicating the number of potential additional roads to build, and m, indicating the maximal travel distance between any pair of cities that the Copogonians are willing to tolerate.</p>

<p>Each of the next n input lines contains two space separated integers, x<sub>i</sub> and y<sub>i</sub> (0 ≤ x<sub>i</sub>, y<sub>i</sub> ≤ 10<sup>4</sup>, 1 ≤ i ≤ n), indicating the location of city i on the Cartesian grid (assume that no two cities are at the same location). There is a straight line road connecting city i to city i+1 (1 ≤ i ≤ n – 1) and a road connecting cities n and 1. Roads can be travelled in either direction.</p>

<p>The potential roads that can be added are provided in the next k input lines. Each of these k input lines contains three space separated integers: u , v (1 ≤ u, v ≤ n, u ≠ v) and c (1 ≤ c ≤ 10<sup>8</sup>), indicating that a road could be added between city u and city v at a cost of c. It's guaranteed that there's currently no road from city u to v and that no two of the potential roads listed will be between the same pair of cities.</p>

<p>Assume that:</p>

<ul>
	<li>The input is such that at least one road must be added, i.e., with no extra roads the citizens are not happy (at least one of the shortest paths is greater than length m).</li>
	<li>If all of the potential roads are built, the citizens will be happy, i.e., all of the shortest paths will have length m or less.</li>
	<li>The value of m will be such that adding or subtracting 0.001 to m will not modify the answer.</li>
</ul>

### 출력

<p>Print the minimum cost of a set of roads to build that would keep all the citizens of Copogonia happy.</p>