# [Gold III] Multimodal Transport - 25886

[문제 링크](https://www.acmicpc.net/problem/25886)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 10, 맞힌 사람: 10, 정답 비율: 76.923%

### 분류

자료 구조, 데이크스트라, 그래프 이론, 해시를 사용한 집합과 맵, 최단 경로, 집합과 맵

### 문제 설명

<p>New methods of shipping goods have transformed the transportation industry and helped usher in an era of global commerce. Nowadays, someone can click a few buttons and have an item leave a factory on the other side of the world and show up at their doorstep the next day. To help accomplish this, there are a number of modes of transport within the shipping industry. The four most common are: air, boat, rail and truck.</p>

<p>Transportation companies tend to keep the mode of transport consistent throughout a packages journey (route/path). However, when customers are not very time sensitive, often times the cheapest way to move a package from one location to another is to use more than one mode of transport. One has to be careful, though, as additional costs are incurred when switching between transport modes within a city on the package path. (Switching transport mode refers to a package leaving a city in a different mode than it arrived at the city, e.g., the package arrived by air and leaves by truck.)</p>

<p>A new startup, KnightShip, has asked for your help in figuring out the cheapest way to ship packages when switching between transportation modes is acceptable.</p>

<p>Given the costs for various modes of transport between cities, and the cost of switching mode within a city, calculate the lowest cost to transport an item from an origin to a destination.</p>

### 입력

<p>The first input line contains a positive integer, n, indicating the number of test cases to process. Each test case will contain multiple input lines. The first line of each test case will contain an integer, c (2 &le; c &le; 400), representing the number of cities within the transportation network. Each of the following c input lines contains two values: a string (1 to 20 uppercase letters, inclusive), representing the name of a city and an integer (between 1 and 1000, inclusive), representing the cost of changing the transport mode within that city.</p>

<p>The city information for a test case is followed by the route information for the test case. There will be an input line containing one integer, r (1 &le; r &le; 40000), representing the number of route segments in the network. This will be followed by a listing of all route segments, one per line. Each route segment will contain four values: p, q, representing two cities from the previous list, m, representing the transport mode (one of four values AIR, BOAT, RAIL, TRUCK) for that route segment, and an integer v (1 &le; v &le; 1000), representing the cost to ship a package between the two cities (either direction). Note that there may be no route segments for a particular transport mode. There will be no duplicate city pair within a given mode of transport, but different transport modes (even all four modes) can exist between the same two cities.</p>

<p>The last input line for a test case contains two distinct cities o and d which represent the origin and destination cities for which we want the minimum cost to ship a package. Cities o and d are guaranteed to have a path (of finite cost) that exists between them. Any mode of transport can be used to leave city o and any mode can be used to reach city d (they don&rsquo;t necessarily need to match). The transport mode can change in the intermediate stages as well.</p>

### 출력

<p>For each test case, output a single integer on a line by itself indicating the minimum cost to move a package from city o to city d.</p>

### 힌트

<p>Due to the large input bounds on the number of cities (2 &le; c &le; 400) and route segments r (1 &le; r &le; 40000), an Order-cubed solution will result in &ldquo;time limit exceeded&rdquo; with the given judge run time for this problem.<span style="display: none;"> </span></p>