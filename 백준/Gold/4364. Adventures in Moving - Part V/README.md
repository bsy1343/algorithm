# [Gold I] Adventures in Moving - Part V - 4364

[문제 링크](https://www.acmicpc.net/problem/4364)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 3, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

기하학

### 문제 설명

<p>To save money you are considering renting a small cube van to transport your belongings to the Big City. The interior of the van is a rectangular box with width w, height h, and length l. The box has a sliding door that lifts but only to height H. That is, there is an immovable overhang of height H-h at the top of the door.</p>

<p>You have a large rectangular box that you wish to load on the truck. Can you get it on the truck subject to the following constraints:</p>

<ul>
	<li>The box must fit through the door, tilting it forward or sideways (but not both) as necessary (see figure below).</li>
	<li>The box must be placed with one side flat against the floor.</li>
	<li>The box must be placed with one side flat against the front wall.</li>
	<li>The door must close once the box is in place.</li>
</ul>

<p>You may assume there are no obstructions (such as a ceiling or the ground) outside the truck that might interfere with loading.</p>

<p style="text-align: center;"><img alt="" src="/upload/images3/tilt.gif" style="height:250px; width:512px" /></p>

### 입력

<p>There are several test cases, each represented by two lines of input. The first line of each contains 4 integers: w, h, l, H. The next line contains 3 integers - the dimensions of the box.</p>

### 출력

<p>For each test case, print &quot;The box goes on the truck.&quot; if it is possible to load the box on the truck; otherwise print &quot;The box will not go on the truck.&quot; You may assume that you start with an empty truck for each test case.</p>