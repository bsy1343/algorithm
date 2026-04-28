# [Platinum III] Circuit Board Design - 16603

[문제 링크](https://www.acmicpc.net/problem/16603)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 169, 정답: 64, 맞힌 사람: 57, 정답 비율: 41.304%

### 분류

해 구성하기, 기하학, 트리

### 문제 설명

<p>You have been hired at the Nano Wiring Efficient Route Company (NWERC) to help with the design of their new circuit boards. The circuits themselves have already been designed, and your task is to come up with a way to print them onto the blank boards that the company has bought.</p>

<p>More specifically, each circuit design consists of a number of connection points with some connections between them such that the resulting graph is connected and does not have any cycles (i.e., the graph is a tree).</p>

<p>You are free to place the connection points anywhere on the circuit board and solder the connections between them so that no two connections intersect (except at the connection points). The boards you ordered are fairly large, so there is no danger of running out of space. You can solder so precisely that connections and connection points can be considered infinitesimal.</p>

<p>This would all be very easy, however your boss persists that each connection needs to be a straight line of length exactly 1 mm (this is, so he says, to make sure the electrons do not have to travel around corners, which would be detrimental to the efficiency of the design).</p>

<p>You soon realise that battling with him will be unsuccessful. Your quickest way out of this is to etch a new design according to his specifications.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with one integer n (2 &le; n &le; 1 000), the number of connection points. The points are numbered from 1 to n.</li>
	<li>n &minus; 1 lines, each with two integers a and b (1 &le; a, b &le; n), describing a connection between a and b.</li>
</ul>

<p>It is guaranteed that these edges describe a valid tree.</p>

### 출력

<p>Output n lines, the ith of which contains two real numbers x<sub>i</sub>, y<sub>i</sub>, the coordinates of point i. To make the production feasible, the following restrictions apply:</p>

<ul>
	<li>The distance between each pair of points should be at least 10<sup>&minus;4</sup>.</li>
	<li>The length of each edge should be 1, up to an absolute error of at most 10<sup>&minus;6</sup>.</li>
	<li>Edges that are not incident to the same vertex should be at least a distance 10<sup>&minus;6</sup> apart.</li>
	<li>The coordinates may not exceed an absolute value of 3 000.</li>
</ul>

<p>If there are multiple valid solutions, you may output any one of them.</p>