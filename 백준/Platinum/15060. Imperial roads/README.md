# [Platinum I] Imperial roads - 15060

[문제 링크](https://www.acmicpc.net/problem/15060)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 191, 정답: 101, 맞힌 사람: 84, 정답 비율: 51.852%

### 분류

그래프 이론, 트리, 최소 스패닝 트리, 최소 공통 조상

### 문제 설명

<p>The roads of Cubiconia are in a dire state, after years of neglect and lack of maintenance. Each road connects two different cities A and B and can be traveled in both ways (from A to B or from B to A). There is at most one road between each pair of cities, and using the existing roads it is possible to travel between any pair of cities. The new emperor of Cubiconia has just raised the taxes (again!), but promised to repair at least some of the roads, guaranteeing that Cubiconians will be able to travel between any pair of cities using only restored roads.</p>

<p>The Department of Public Works have calculated the cost of repairing each individual road. Now they want to calculate the minimum cost for repairing a set of roads so that the emperor&rsquo;s promise is made true. This is not easy because the emperor wants the set of repaired roads to include one particular road, but he has not yet decided which particular road to include: could be the one that connects the city where his castle is to the city where his daughter&rsquo;s royal residence is, or the road that connects the city where his summer palace is to the only city by the seaside, or. . . Fearing the emperor will take too long to decide, the engineers want your help.</p>

<p>Given the description of the roads in Cubiconia, with their respective repairing costs, you must write a program to answer a set of queries. For each query you will be given one specific road that should be repaired, and must determine the minimum cost for repairing a set of roads (including the given specific road) so that Cubiconians will be able to travel between any pair of cities using only restored roads.</p>

### 입력

<p>The first line contains two integers N (2 &le; N &le; 10<sup>5</sup>) and R (N &minus; 1 &le; R &le; 2 &times; 10<sup>5</sup>), representing respectively the number of cities and the number of roads in Cubiconia. Cities are identified by distinct integers from 1 to N. Each of the next R lines describes a road with three integers A, B (1 &le; A &lt; B &le; N) and C (1 &le; C &le; 10<sup>4</sup>), indicating that there is a road between cities A and B and the cost of repairing it is C. There is at most one road between each pair of cities, and using the existing roads it is possible to travel between any pair of cities. The next line contains an integer Q (1 &le; Q &le; 10<sup>5</sup>) representing the number of queries. Each of the next Q lines describes a query with two integers U and V (1 &le; U &lt; V &le; N), indicating the specific road that should be repaired. There are no repeated queries.</p>

### 출력

<p>Output Q lines, each line with an integer indicating the answer to the corresponding query of the input, that is, the minimum cost for repairing a set of roads (including the specific road in the query) so that Cubiconians will be able to travel between any pair of cities using only restored roads.</p>