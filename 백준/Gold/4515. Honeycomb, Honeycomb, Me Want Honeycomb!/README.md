# [Gold III] Honeycomb, Honeycomb, Me Want Honeycomb! - 4515

[문제 링크](https://www.acmicpc.net/problem/4515)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 10, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

구현

### 문제 설명

<p>A windstorm has knocked over a beekeeper&#39;s hive boxes. A hive box contains a number of panels. Each panel contains a honeycomb. The panels are thin enough that the bees create a single layer of hexagonal cells in each panel. All cells are hexagonal and of uniform size.</p>

<p>Upon inspecting the panels, the beekeeper discovers that many of the hexagonal cells have been damaged. Given as input a list of line segments representing undamaged cell walls, compute the number of undamaged (i.e. containing all six walls) hexagons in the panel. You can assume that the only damage to the honeycomb is that some cell walls are missing, but none of them are moved, broken in half, etc. Below is an example honeycomb with the undamaged hexagons shaded in gray:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4515.%E2%80%85Honeycomb%2C%E2%80%85Honeycomb%2C%E2%80%85Me%E2%80%85Want%E2%80%85Honeycomb!/1ff822ce.png" data-original-src="https://www.acmicpc.net/upload/images2/honey-screen.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:120px; width:300px" /></p>

### 입력

<p>Input to this problem will begin with a line containing a single integer <em>N</em> (1 &le; <em>N</em> &le; 100) indicating the number of data sets. Each data set begins with a line containing a single integer <em>S</em> (1 &le; <em>S</em> &le; 1000) specifying the number of line segments in the data set. This is followed by <em>S</em> lines of the form &quot;<em>X<sub><small>1</small></sub></em><code>,</code><em>Y<sub><small>1</small></sub></em> &nbsp;<em>X<sub><small>2</small></sub></em><code>,</code><em>Y<sub><small>2</small></sub></em>&quot; which specify the individual cell walls of the honeycomb. Each coordinate is a floating point number greater than or equal to zero but less than or equal to 1000 and with at most 3 digits after the decimal point (i.e. rounded to the nearest thousandth). The coordinates will <em>not</em> use &quot;exponent notation&quot; such as &quot;<code>3.123e+3</code>&quot;.</p>

<p>You can make the following assumptions about the input:</p>

<ul>
	<li>The length of each cell wall is 1 unit</li>
	<li>The honeycomb will have the same orientation as the example figure. In other words, if the top or bottom cell walls of a unit are present, they will be always parellel to the x-axis.</li>
	<li>There will be no duplicate or overlapping cell walls. The line segments can only touch each other at the endpoints.</li>
</ul>

### 출력

<p>For each data set, print the number of undamaged hexagonal cells that were detected.</p>