# [Gold I] Vampire Tunnels - 6789

[문제 링크](https://www.acmicpc.net/problem/6789)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 17, 맞힌 사람: 13, 정답 비율: 50.000%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>You are a vampire, and you want to travel from some point A to another point B. You may travel in the sunshine above ground or avoid the sunshine by travelling underground via certain tunnels. You have mapped out the area you wish to travel, and have found some secret tunnels between some points, some other points that you can walk between above ground. Both the tunnels and above ground paths are bidirectional. Given that you can&rsquo;t be exposed to the sunlight for more than S seconds in total (0 &le; S &le; 3600), you want to minimize the total travel time (given that you have a constant velocity of 1 unit of distance per second).</p>

### 입력

<p>On the first line of input, you have the number S, the maximum number of seconds that you can be exposed to the sun. On the next line is the number N (2 &le; N &le; 1, 600), which is the number of points, and the number E (1 &le; E &le; 10, 000), which is the number of connections between these N points, separated by one space.</p>

<p>The next E lines each contain information about the connections between points. Specifically, each of these lines contains four integers: s (one end point of a connection) (0 &le; s &le; N &minus; 1), t (the other end point of a connection) (0 &le; t &le; N &minus; 1, s &ne; t), d (the distance between s and t, 1 &le; d &le; 10, 000), u (indicate whether this is underground or above ground: 1 indicates it is above ground, and 0 indicates there is a tunnel between s and t).</p>

### 출력

<p>The output is one integer, which is the minimum amount of time required to get from point 0 to point N &minus; 1, with the constraint that there are not more than S seconds of exposure to the sun. If there is no possible path which satisfies the constraint, output &minus;1.</p>