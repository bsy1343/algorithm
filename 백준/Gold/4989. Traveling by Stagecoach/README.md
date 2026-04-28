# [Gold I] Traveling by Stagecoach - 4989

[문제 링크](https://www.acmicpc.net/problem/4989)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 66, 정답: 30, 맞힌 사람: 28, 정답 비율: 45.902%

### 분류

그래프 이론, 최단 경로, 비트마스킹, 데이크스트라

### 문제 설명

<p>Once upon a time, there was a traveler.</p>

<p>He plans to travel using stagecoaches (horse wagons). His starting point and destination are fixed, but he cannot determine his route. Your job in this problem is to write a program which determines the route for him.</p>

<p>There are several cities in the country, and a road network connecting them. If there is a road between two cities, one can travel by a stagecoach from one of them to the other. A coach ticket is needed for a coach ride. The number of horses is specified in each of the tickets. Of course, with more horses, the coach runs faster.</p>

<p>At the starting point, the traveler has a number of coach tickets. By considering these tickets and the information on the road network, you should find the best possible route that takes him to the destination in the shortest time. The usage of coach tickets should be taken into account.</p>

<p>The following conditions are assumed.</p>

<ul>
	<li>A coach ride takes the traveler from one city to another directly connected by a road. In other words, on each arrival to a city, he must change the coach.</li>
	<li>Only one ticket can be used for a coach ride between two cities directly connected by a road.</li>
	<li>Each ticket can be used only once.</li>
	<li>The time needed for a coach ride is the distance between two cities divided by the number of horses.</li>
	<li>The time needed for the coach change should be ignored.</li>
</ul>

### 입력

<p>The input consists of multiple datasets, each in the following format. The last dataset is followed by a line containing five zeros (separated by a space).</p>

<pre>
n m p a b
t1 t2 ... tn
x1 y1 z1
x2 y2 z2
...
xp yp zp</pre>

<p>Every input item in a dataset is a non-negative integer. If a line contains two or more input items, they are separated by a space.</p>

<p>n is the number of coach tickets. You can assume that the number of tickets is between 1 and 8. m is the number of cities in the network. You can assume that the number of cities is between 2 and 30. p is the number of roads between cities, which may be zero.</p>

<p>a is the city index of the starting city. b is the city index of the destination city. a is not equal to b. You can assume that all city indices in a dataset (including the above two) are between 1 and m.</p>

<p>The second line of a dataset gives the details of coach tickets. ti is the number of horses specified in the i-th coach ticket (1&lt;=i&lt;=n). You can assume that the number of horses is between 1 and 10.</p>

<p>The following p lines give the details of roads between cities. The i-th road connects two cities with city indices xi and yi, and has a distance zi (1&lt;=i&lt;=p). You can assume that the distance is between 1 and 100.</p>

<p>No two roads connect the same pair of cities. A road never connects a city with itself. Each road can be traveled in both directions.</p>

### 출력

<p>For each dataset in the input, one line should be output as specified below. An output line should not contain extra characters such as spaces.</p>

<p>If the traveler can reach the destination, the time needed for the best route (a route with the shortest time) should be printed. The answer should not have an error greater than 0.001. You may output any number of digits after the decimal point, provided that the above accuracy condition is satisfied.</p>

<p>If the traveler cannot reach the destination, the string &quot;Impossible&quot; should be printed. One cannot reach the destination either when there are no routes leading to the destination, or when the number of tickets is not sufficient. Note that the first letter of &quot;Impossible&quot; is in uppercase, while the other letters are in lowercase.</p>