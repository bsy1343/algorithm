# [Bronze II] Cow Routing - 10675

[문제 링크](https://www.acmicpc.net/problem/10675)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 1391, 정답: 634, 맞힌 사람: 565, 정답 비율: 46.464%

### 분류

구현

### 문제 설명

<p>Tired of the cold winter weather on her farm, Bessie the cow plans to fly to a warmer destination for vacation. &nbsp;Unfortunately, she discovers that only one airline, Air Bovinia, is willing to sell tickets to cows, and that these tickets are somewhat complicated in structure.</p>

<p>Air Bovinia owns N planes (1 &lt;= N &lt;= 500), each of which flies on a specific &quot;route&quot; consisting of two or more cities. &nbsp;For example, one plane might fly on a route that starts at city 1, then flies to city 5, then flies to city 2, and then finally flies to city 8. &nbsp;No city appears multiple times in a route. &nbsp;If Bessie chooses to utilize a route, she can board at any city along the route and then disembark at any city later along the route. &nbsp;She does not need to board at the first city or disembark at the last city. &nbsp;Each route has a certain cost, which Bessie must pay if she uses any part of the route, irrespective of the number of cities she visits along the route.</p>

<p>Bessie would like to find the cheapest way to travel from her farm (in city A) to her tropical destination (city B). Since she does not want to be confused by a complicated itinerary, she wants to use only a single route. &nbsp;Please help her decide what is the minimum cost she must pay.</p>

### 입력

<p>The first line of input contains A, B, and N, separated by spaces. &nbsp;</p>

<p>The next 2N lines describe the available routes, in two lines per route. The first line contains the cost of using the route (an integer in the range 1..1000), and the number of cities along the route (an integer in the range 1..500). &nbsp;The second line contains a list of the cities in order along the route. &nbsp;Each city is identified by an integer in the range 1..10,000.</p>

### 출력

<p>Output the minimum cost of a single route Bessie can use to travel from city A to city B. &nbsp;If there is no such route, output -1.</p>

### 힌트

<p>Although there is a cheaper two-route solution (use route 2 to travel from city 1 to city 3, then route 1 to travel from city 3 to city 2), Bessie is only allowed to use a single route, so she must use route 3 at a cost of 8.</p>