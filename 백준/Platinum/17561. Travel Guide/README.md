# [Platinum I] Travel Guide - 17561

[문제 링크](https://www.acmicpc.net/problem/17561)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 512 MB

### 통계

제출: 121, 정답: 59, 맞힌 사람: 37, 정답 비율: 51.389%

### 분류

자료 구조, 그래프 이론, 세그먼트 트리, 최단 경로, 데이크스트라, 값 / 좌표 압축

### 문제 설명

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/84c58aca-e6c4-44f7-b0f2-9a30e6f6f078/-/preview/" style="width: 254px; height: 222px;" /></p>

<p>Paris counts many hotels. Some are very close to the Orly airport, which is very useful to spend a night before an early flight. Some are very close to the Notre-Dame cathedral which allows tourists to walk around the &ldquo;&Icirc;le Saint-Louis&rdquo; at dawn and enjoy the banks of the Seine. Finally, some are closer to the Disneyland Paris resort which is the most visited tourist attraction. Travelers who come to Paris usually want to stay near these three main Points Of Interest (POIs): Orly, Notre-Dame, and Disneyland.</p>

<p>You are employed by a travel agency and your manager Anna wants to prepare a list of hotels to include in her new travel guide. Her guide contains one entry per station of the metropolitan network. Anna notices that some stations do not have a convenient location with respect to the distance to the three POIs and therefore her guide should not contain a hotel section for such &ldquo;useless&rdquo; stations.</p>

<p>Anna considers that a station is useless when another station is closer to all the POIs. Formally a station A is useless when there exists another station B such that B is at least as close to the three POIs as A is and B is strictly closer than A to at least one of those POIs. A station is useful if it is not useless.</p>

<p>Anna asks you how many stations in her guide will have a hotel section. To compute this list you are given the plan of the metropolitan network. The plan of the metropolitan network is an undirected weighted graph. In this graph, each node corresponds to a station (note that each POI is also a station); each edge links two stations and takes a certain time to be traversed in either direction. This graph is connected and the distance between any two stations is the lowest total time of a path between the two nodes.</p>

### 입력

<p>The input comprises several lines, each consisting of integers separated with single spaces:</p>

<ul>
	<li>The first line consists of the number N of nodes and the number E of edges.</li>
	<li>Each of the following E lines describes an edge with three integers A, B, and W:
	<ul>
		<li>A and B are the endpoints of the edge (numbered from 0 to N &minus; 1);</li>
		<li>W is the weight of the edge.</li>
	</ul>
	</li>
</ul>

<p>In the graph:</p>

<ul>
	<li>Orly corresponds to the station 0;</li>
	<li>Notre-Dame corresponds to the station 1;</li>
	<li>Disneyland corresponds to the station 2.</li>
</ul>

### 출력

<p>The output should consist of a single line, whose content is an integer, the number of useful stations.</p>

### 제한

<ul>
	<li>4 &le; N &le; 100 000;</li>
	<li>E &le; 500 000;</li>
	<li>1 &le; w &le; 100.</li>
</ul>