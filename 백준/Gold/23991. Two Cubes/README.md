# [Gold II] Two Cubes - 23991

[문제 링크](https://www.acmicpc.net/problem/23991)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

구현, 매개 변수 탐색

### 문제 설명

<p>&quot;Look at the stars, look how they shine for you.&quot; - Coldplay, &quot;Yellow&quot;</p>

<p>In a galaxy far, far away, there are many stars. Each one is a sphere with a certain position (in three-dimensional space) and radius. It is possible for stars to overlap each other.</p>

<p>The stars are so incredibly beautiful to you that you want to capture them forever! You would like to build two cubes of the same integer edge length, and place them in space such that for each star, there is at least one cube that&nbsp;<i>completely</i>&nbsp;contains it. (It&#39;s not enough for a star to be completely contained by the union of the two cubes.) A star is completely contained by a cube if no point on the star is outside the cube; a point exactly on a cube face is still considered to be inside the cube.</p>

<p>The cubes can be placed anywhere in space, but they must be placed with their edges parallel to the coordinate axes. It is acceptable for the cubes to overlap stars or each other.</p>

<p>What is the minimum integer edge length that allows you to achieve this goal?</p>

### 입력

<p>The input starts with one line containing exactly one integer&nbsp;<b>T</b>, which is the number of test cases.&nbsp;<b>T</b>&nbsp;test cases follow.</p>

<p>Each test case begins with a line containing an integer,&nbsp;<b>N</b>, representing the number of stars.</p>

<p>This is followed by&nbsp;<b>N</b>&nbsp;lines. On the ith line, there are 4 space-separated integers,&nbsp;<b>X<sub>i</sub></b>,&nbsp;<b>Y<sub>i</sub></b>,&nbsp;<b>Z<sub>i</sub></b>&nbsp;and&nbsp;<b>R<sub>i</sub></b>, indicating the (X, Y, Z) coordinates of the center of the&nbsp;<b>i<sup>th</sup></b>&nbsp;star, and the radius of the&nbsp;<b>i<sup>th</sup></b>&nbsp;star.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the minimum cube edge length that solves the problem, as described above.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>-10<sup>8</sup>&nbsp;&le;&nbsp;<b>X<sub>i</sub></b>&nbsp;&le; 10<sup>8</sup>, for all i.</li>
	<li>-10<sup>8</sup>&nbsp;&le;&nbsp;<b>Y<sub>i</sub></b>&nbsp;&le; 10<sup>8</sup>, for all i.</li>
	<li>-10<sup>8</sup>&nbsp;&le;&nbsp;<b>Z<sub>i</sub></b>&nbsp;&le; 10<sup>8</sup>, for all i.</li>
	<li>1 &le;&nbsp;<b>R<sub>i</sub></b>&nbsp;&le; 10<sup>8</sup>, for all i.</li>
</ul>

### 힌트

<p>In the first test case, one solution is to place two cubes with an edge length of 3 such that their corners with minimum (x, y, z) coordinates are at (0, 0, 0) and (3, 3, 3).</p>

<p>In the second test case, one solution is to place two cubes with an edge length of 5 such that their corners with minimum (x, y, z) coordinates are at (-1, -1, -1) and (1, 2, 3).</p>