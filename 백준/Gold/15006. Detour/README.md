# [Gold II] Detour - 15006

[문제 링크](https://www.acmicpc.net/problem/15006)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 282, 정답: 88, 맞힌 사람: 79, 정답 비율: 36.744%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>After last year&rsquo;s edition of the BAPC, you are still stuck in Delft. In order to participate again this year, you are going to Amsterdam by bus. During the journey you look out of the window and look for traffic signs that point in the direction of Amsterdam. To your surprise, you notice that the bus is never taking the roads that are pointed out by the signs!</p>

<p>You think that the bus company might have chosen a route such that, at no intersection, the bus goes in the direction that is pointed to by the signs. Your friends, however, find this very unbelievable, and don&rsquo;t think this is possible. Can you figure out whether there exists a bus route that satisfies this requirement? Note that a bus route never visits the same place twice.</p>

<p>A traffic sign pointing in the direction of the shortest route to Amsterdam is placed at every intersection. You may assume that the input graph is both simple and connected, and that there is a unique optimal route to Amsterdam from every intersection.</p>

### 입력

<ul>
	<li>A single line containing two integers: n (2 &le; n &le; 10<sup>5</sup>), the number of intersections, and m (1 &le; m &le; 10<sup>6</sup>), the number of undirected roads that connect the intersections. The intersections are numbered from 0 to n &minus; 1. Delft is denoted by intersection i = 0 and Amsterdam is denoted by intersection i = 1.</li>
	<li>m lines that specify the roads
	<ul>
		<li>A road is specified by three integers, a<sub>i</sub>, b<sub>i</sub> (0 &le; a<sub>i</sub>, b<sub>i</sub> &lt; n and a<sub>i</sub> &ne;&nbsp;b<sub>i</sub>) and d<sub>i</sub> (0 &le; d<sub>i</sub> &le; 500000), where a<sub>i</sub> and b<sub>i</sub> are ids of the two intersections that are connected by this road and d<sub>i</sub> is the distance that the bus has to travel to get from a<sub>i</sub> to b<sub>i</sub> or vice versa.</li>
	</ul>
	</li>
</ul>

### 출력

<p>As output, give one of the following:</p>

<ul>
	<li>A path from Delft to Amsterdam that satisfies the requirements, in case such a path exists.
	<ul>
		<li>A path is specified by a single line containing an integer k, the length of the path, followed by k integers p<sub>i</sub> that specify the intersections along the path in the order in which they are crossed, with p<sub>0</sub> = 0 and p<sub>k&minus;1</sub> = 1.</li>
	</ul>
	</li>
	<li>The text &ldquo;impossible&rdquo;, if such a path does not exist.</li>
</ul>