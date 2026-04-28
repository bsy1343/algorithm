# [Platinum V] Disjoint water supply - 9528

[문제 링크](https://www.acmicpc.net/problem/9528)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 68, 정답: 27, 맞힌 사람: 25, 정답 비율: 53.191%

### 분류

다이나믹 프로그래밍, 그래프 이론

### 문제 설명

<p>Nlogonia is a queendom that consists of several cities located on a big mountain. The capital city is Logville, located on the mountain peak. Logville has a huge lake with a perfectly round shape, appropriately named &ldquo;The Big O&rdquo;. This is the only lake with drinkable water in the entire queendom, so it is used to supply all cities. Some cities in Nlogonia are connected with water pipes that allow the distribution of the water. As there are no pumps, each pipe carries water from a city to another city at a lower altitude, using gravity.</p>

<p>Nlogonia&rsquo;s water system has been a source of worries for the Queen, because since cities depend on other cities for their water supply, hot discussions occur about how much water a city is allowed to use. A water supply path is a sequence of cities in decreasing order of altitude, starting in Logville and such that there is a pipe connecting each pair of consecutive cities in the sequence. Two cities have disjoint water supply if and only if there exist two water supply paths, one supply path ending in each of the cities, such that Logville is the only city that is present in both paths. Notice that Logville itself has disjoint water supply with every other city.</p>

<p>The Queen considers disjoint water supply a nice property because it reduces dependency problems and also avoids water outages to spread as quickly through Nlogonia. She therefore ordered a survey to assess the current state of water supply disjointness in the whole queendom. Being the cleverest advisors in the Queen&rsquo;s court, you have been summoned to help calculate the number of pairs of distinct cities that have disjoint water supply.</p>

### 입력

<p>The first line contains two integers C (2 &le; C &le; 1000) and P (1 &le; P &le; 10<sup>5</sup>), representing respectively the number of cities and the number of water pipes in Nlogonia. Cities are identified with different integers from 1 to C, in strictly decreasing order of altitude (no two cities have the same altitude); Logville is city 1. Each of the next P lines describes a pipe with two integers U and V (1 &le; U &lt; V &le; C) indicating that the pipe connects city U with city V . You may assume that no two pipes connect the same pair of cities, and that for each city in Nlogonia there is at least one water supply path that ends in it.</p>

### 출력

<p>Output a line with an integer representing the number of pairs of distinct cities that have disjoint water supply.</p>