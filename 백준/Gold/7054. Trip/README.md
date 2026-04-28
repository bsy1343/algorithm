# [Gold III] Trip - 7054

[문제 링크](https://www.acmicpc.net/problem/7054)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 39, 정답: 13, 맞힌 사람: 10, 정답 비율: 37.037%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Alice and Bob want to go on holiday. Each of them has planned a route, which is a list of cities to be visited in a given order. A route may contain a city more than once.</p>

<p>As they want to travel together, they have to agree on a common route. None wants to change the order of the cities on his or her route or add other cities. Therefore they have no choice but to remove some cities from the route. Of course the common route should be as long as possible.</p>

<p>There are exactly 26 cities in the region. Therefore they are encoded on the lists as lower case letters from &rsquo;a&rsquo; to &rsquo;z&rsquo;.</p>

### 입력

<p>The standard input consists of two lines; the first line is Alice&rsquo;s list, the second line is Bob&rsquo;s list. Each list consists of 1 to 80 lower case letters with no spaces in between.</p>

### 출력

<p>The standard output should contain all routes that meet the conditions described above, but no route should be listed more than once. Each route should be printed on a separate line. There is at least one such non-empty route, but never more than 1000 different ones. The order of the routes in the output file doesn&rsquo;t matter.</p>