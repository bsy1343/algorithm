# [Gold II] Trucking - 4837

[문제 링크](https://www.acmicpc.net/problem/4837)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 7, 맞힌 사람: 7, 정답 비율: 46.667%

### 분류

그래프 이론, 이분 탐색, 최단 경로, 데이크스트라, 매개 변수 탐색

### 문제 설명

<p>A certain local trucking company would like to transport some goods on a cargo truck from one place to another. It is desirable to transport as much goods as possible each trip. Unfortunately, one cannot always use the roads in the shortest route: some roads may have obstacles (e.g. bridge overpass, tunnels) which limit heights of the goods transported. Therefore, the company would like to transport as much as possible each trip, and then choose the shortest route that can be used to transport that amount.</p>

<p>For the given cargo truck, maximizing the height of the goods transported is equivalent to maximizing the amount of goods transported. For safety reasons, there is a certain height limit for the cargo truck which cannot be exceeded.</p>

### 입력

<p>The input consists of a number of cases. Each case starts with two integers, separated by a space, on a line. These two integers are the number of cities (C) and the number of roads (R). There are at most 1000 cities, numbered from 1. This is followed by R lines each containing the city numbers of the cities connected by that road, the maximum height allowed on that road, and the length of that road. The maximum height for each road is a positive integer, except that a height of -1 indicates that there is no height limit on that road. The length of each road is a positive integer at most 1000. Every road can be travelled in both directions, and there is at most one road connecting each distinct pair of cities. Finally, the last line of each case consists of the start and end city numbers, as well as the height limit (a positive integer) of the cargo truck. The input terminates when C = R = 0.</p>

### 출력

<p>For each case, print the case number followed by the maximum height of the cargo truck allowed and the length of the shortest route. Use the format as shown in the sample output. If it is not possible to reach the end city from the start city, print &quot;cannot reach destination&quot; after the case number. Print a blank line between the output of the cases.</p>