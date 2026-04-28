# [Platinum IV] Open cup - 19831

[문제 링크](https://www.acmicpc.net/problem/19831)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 4, 맞힌 사람: 4, 정답 비율: 36.364%

### 분류

자료 구조, 기하학, 집합과 맵

### 문제 설명

<p>Year 3017. Human race has become so good in space flights, that one of the most popular sport activities is now racing between asteroids. In two days the next stage of Asteroid Races Open Cup will take place. It is known that the Open Cup is organized by a famous space races evangelist Spark.</p>

<p>Spark likes to keep track of statistics about top participants, and he likes to tell interesting stories about previous races and their results. In one of such stories he has accidentally disclosed, that the stage that will take place in two days is named &quot;Grand Prix of Alpha Centauri&quot;. Alpha Centauri is a well-studied system, so anybody familiar with the rules of the races can guess that participants will have to fly from asteroid ICM-2017 to asteroid YOY-2018.</p>

<p>For each race a two-dimensional plane is chosen and all racing space ships movements always take place in that plane. Let&#39;s assume that asteroids don&#39;t change their mutual positions while race is going on. The plane where the race takes place intersects the two asteroids via convex non-intersecting and non-touching polygons, specified by their vertices in counterclockwise order.</p>

<p>Racing space ship can depart and land only perpendicular to the surface of an asteroid. Participant has to choose the starting point of the race strictly inside one of the edges of the polygon. After taking off the asteroid, the space ship is going in the direction perpendicular to the edge that it started from, moving away from the asteroid. When the space ship lands to the other asteroid, it should land to a point strictly inside some edge of the polygon, its movement when landing must be perpendicular to that edge.</p>

<p>Elbrus is a novice racer, and he plans to participate in the race, but he has not trained enough yet, so he can&#39;t maneuver in space. Fortunately, it can happen that there is a direct route between asteroids, so a space ship can fly from one asteroid to another without turning at all. In other words, it is possible to choose start and finish points so that the segment between them is perpendicular to the edges that contain the points, and the segment doesn&#39;t intersect the interior of the asteroids.&nbsp;</p>

<p>Help Elbrus to figure out whether he can take part in the race or not.</p>

### 입력

<p>The first line contains one integer $n$ --- the number of vertices in the polygon of the asteroid ICM-2017 ($3 \le n \le 200\,000$). The following $n$ lines contain pairs of integer $x_i, y_i$ --- coordinates of vertices of the polygon ICM-2017 ($-10^9 \le x_i, y_i \le 10^9$).</p>

<p>The following line contains one integer $m$ --- the number of vertices of the polygon of the asteroid \mbox{YOY-2018} ($3 \le m \le 200\,000$). The following $m$ lines contain pairs of integer $x&#39;_i, y&#39;_i$ --- coordinates of vertices of polygon YOY-2018 ($-10^9 \le x&#39;_i, y&#39;_i \le 10^9$).</p>

<p>It is guaranteed that both polygons are convex, their vertices are given in counterclockwise order, and no three vertices of one polygon belong to the same line.</p>

### 출력

<p>If it is possible to find direct route between polygons, output &quot;<code>YES</code>&quot; in the first line, and output numbers of edges of asteroids ICM-2017 and YOY-2018 that the direct route must connect in the second line.</p>

<p>You can assume that the edge $i$ connect vertices $i$ and $i+1$ of the polygon, the edge $n$ of the polygon ICM-2017 connect vertices $n$ and $1$, the edge $m$ of the polygon YOY-2018 connect vertices $m$ and $1$.</p>

<p>It there is no direct route between polygons, output a word &quot;<code>NO</code>&quot;.</p>

### 힌트

<p>The picture shows the polygons of the asteroids in sample tests.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/39393d5f-c0af-4cf1-8d7d-7e2fd5fddf5d/-/preview/" style="width: 562px; height: 211px;" /></p>