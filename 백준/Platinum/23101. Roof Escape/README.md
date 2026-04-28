# [Platinum III] Roof Escape - 23101

[문제 링크](https://www.acmicpc.net/problem/23101)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 79, 정답: 24, 맞힌 사람: 20, 정답 비율: 31.250%

### 분류

많은 조건 분기, 기하학, 구현

### 문제 설명

<p>Escaping from the police over city roofs is often tricky and the gangsters have to be trained properly. To keep up with current AI trends in criminality, they are developing a general computerized model of escape paths.</p>

<p>In the model, the city area where the escape happens is modeled as a 3D grid made of rectangular cuboids with square bases forming a 2D grid on flat ground. Each cuboid represents a block of houses. Top face of a cuboid is called a roof. In the model, all distances between adjacent blocks are reduced to 0. The path of escaping gangsters is modeled as a polyline &ndash; a sequence of straight horizontal and vertical segments where the end point of one segment is the start point of the next segment. The basic path properties are:</p>

<ul>
	<li>Each point on the path is on the surface of at least one block.</li>
	<li>No part of the path is in the interior of any block.</li>
	<li>The height of any point on the path is bigger than or equal to the lowest height of roofs of all blocks to which surface the point belongs.</li>
	<li>The path starts and ends in the center of a block roof.</li>
	<li>The sum over the lengths of horizontal segments of the path is minimum possible.</li>
</ul>

<p>It may happen that two consecutive segments on the path share common points. This stems from the fact that the path models a real behavior of a person moving over physical obstacles. Thus an additional path rule also holds:</p>

<ul>
	<li>Let P be a point on the path. If there is a point Q directly above P, and Q belongs to at least two blocks, then the point Q is on the path.</li>
</ul>

<p>The total length of the escape path should be carefully calculated in the model.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/15f87ea5-98fa-4ee2-8fb7-218ceee9f177/-/preview/" style="width: 308px; height: 163px;" /></p>

### 입력

<p>The first line of the input contains six positive integers W, H, S<sub>x</sub>, S<sub>y</sub>, E<sub>x</sub>, E<sub>y</sub> (1 &le; W &middot; H &le; 10<sup>5</sup>, 1 &le; S<sub>x</sub>, E<sub>x</sub> &le; W, 1 &le; S<sub>y</sub>, E<sub>y</sub> &le; H). W and H are even integers representing the dimensions of the grid base in meters, integers S<sub>x</sub>, S<sub>y</sub> denote starting coordinates of the escape path and E<sub>x</sub>, E<sub>y</sub> denote coordinates of the end.</p>

<p>Each of the next H/2 lines contains W/2 integers, the i-th integer on j-th line is the height of the corresponding block T<sub>i,j</sub> in meters (0 &le; T<sub>i,j</sub> &le; 10<sup>3</sup>). Each grid block base is a square with dimensions of 2 &times; 2 meters in the model.</p>

### 출력

<p>Print the length of the escape path. The difference between the printed length and the exact length must be less than 10<sup>&minus;4</sup>.</p>

### 힌트

<p>The sample input with its solution is shown on the picture above.</p>