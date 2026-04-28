# [Platinum III] Oh, Those Achin' Feet - 9131

[문제 링크](https://www.acmicpc.net/problem/9131)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 1, 맞힌 사람: 1, 정답 비율: 10.000%

### 분류

그래프 이론, 그래프 탐색, 최단 경로

### 문제 설명

<p>In recent days, a number of people have been injured after being pushed off the sidewalks due to overcrowding. City Hall is interested in figuring out how much pedestrian traffic its sidewalks receive every day. The results of this study will be used to determine whether the city needs to fund more sidewalks. The city has surveyed various buildings in several blocks to determine the traffic patterns they generate. Your job is to take this survey data and convert it into sidewalk utilization information.</p>

<p>Your program will read in the size of the map and a map of several city blocks. Buildings, streets, and building entrance/exits will be marked on the map. You will also be given a list of pedestrian load between several pairs of exits and entrances. Your program will determine the paths used by pedestrians between each source and destination, add up the total pedestrian load from all paths using each street, and output a table of the total pedestrian load on each square.</p>

### 입력

<p>Line 1: X Y&nbsp;<br />
X is the number of columns in the map, Y is the number of rows. Each is a positive integer less than 20.</p>

<p>Lines 2-(Y+1):&nbsp;<br />
Each line contains exactly X symbols indicating the contents of that square on the map. The symbols are:&nbsp;</p>

<p style="margin-left: 40px;">x: building, non-entrance/exit&nbsp;<br />
.: (period) street&nbsp;<br />
{A-O}: letter indicating exit/entrance. Each letter may occur at most once.</p>

<p>Lines (Y+2)-?:&nbsp;<br />
Each line indicates a pedestrian route and specifies a source, destination, and pedestrian load. Source and destination will each be a letter {A-O} with no spaces in between. The load factor will be a nonnegative integer, separated from the destination by whitespace. Source and destination will never be equal. At most 25 routes will be given. There will be a valid path in the map for each requested route.</p>

<p>The test case will terminate with the line:&nbsp;<br />
XX 0&nbsp;<br />
After this line, a next test case can follow. The input file is terminated by two zeros in place of a map size.</p>

### 출력

<p>The output consists of Y lines, each with X space-separated fields indicating the load factor. Each load factor is printed to two decimal places with 3 spaces for integer digits (C 6.2 format).</p>

<p>&nbsp;</p>

### 힌트

<ul>
	<li>The map is divided into squares. Each square of the map can be a street square, a building square, or an entrance/exit square. An entrance/exit square serves as both entrance and exit for that building. There will be no more than 90 street squares in the map.</li>
	<li>People will always follow the shortest path between their origin and destination. No shortest path will exceed 75 squares.</li>
	<li>If there are multiple equal-length shortest paths, the load will be divided equally amongst the paths. For shortest paths, there will be fewer than 50000 equal-length path combinations.</li>
	<li>If a building entrance/exit has multiple sides facing a street (for example, a corner of a building), the pedestrians may enter or exit through any street-facing side.</li>
	<li>All movement will be strictly N, E, S, or W. No diagonal movement is permitted.</li>
	<li>Pedestrians cannot move through buildings or off the edge of the map.</li>
	<li>For convenience, you may ignore the fact that each street section may have two sidewalks.</li>
	<li>Traffic load is not applied to the actual exit/entrance squares themselves.</li>
	<li>If an origin and destination are adjacent on the map, pedestrians may move directly between them. In this case, there is no resulting load placed on any portion of the map because no streets are used.</li>
</ul>