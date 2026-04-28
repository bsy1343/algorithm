# [Platinum III] Where Am I? - 26141

[문제 링크](https://www.acmicpc.net/problem/26141)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 89, 정답: 45, 맞힌 사람: 35, 정답 비율: 47.945%

### 분류

구현, 정렬

### 문제 설명

<p>Who am I? What am I? Why am I? These are all difficult questions that have kept philosophers reliably busy over the past millennia. But when it comes to &ldquo;Where am I?&rdquo;, then, well, modern smartphones and GPS satellites have pretty much taken the excitement out of that question.</p>

<p>To add insult to the injury of newly unemployed spatial philosophers formerly pondering the &ldquo;where&rdquo; question, the Instant Cartographic Positioning Company (ICPC) has decided to run a demonstration of just how much more powerful a GPS is compared to old-fashioned maps. Their argument is that maps are useful only if you already know where you are, but much less so if you start at an unknown location.</p>

<p>For this demonstration, the ICPC has created a test area that is arranged as an unbounded Cartesian grid. Most grid cells are empty, but a finite number of cells have a marker at their center (see Figure L.1(a) for an example with five marked cells). All empty grid cells look the same, and all cells with markers look the same. Suppose you are given a map of the test area (that is, the positions of all the markers), and you are placed at an (unknown to you) grid cell. How long will it take you to find out where you actually are? ICPC&rsquo;s answer is clear: potentially a very, very long time, while a GPS would give you the answer instantly. But how long exactly?</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26141.%E2%80%85Where%E2%80%85Am%E2%80%85I%3F/3f51f2c2.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26141.%E2%80%85Where%E2%80%85Am%E2%80%85I%3F/3f51f2c2.png" data-original-src="https://upload.acmicpc.net/d7b4f022-a86d-4d68-a09b-7a7001f55dbe/-/crop/531x532/0,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 266px; height: 266px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26141.%E2%80%85Where%E2%80%85Am%E2%80%85I%3F/32343a9e.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26141.%E2%80%85Where%E2%80%85Am%E2%80%85I%3F/32343a9e.png" data-original-src="https://upload.acmicpc.net/d7b4f022-a86d-4d68-a09b-7a7001f55dbe/-/crop/531x532/571,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 266px; height: 266px;" /></td>
		</tr>
		<tr>
			<td>(a) Grid with markers (&times;) corresponding to the first sample input.</td>
			<td>(b) The order in which a test subject visits grid cells, relative to starting cell 0.</td>
		</tr>
		<tr>
			<td colspan="2">Figure L.1: Sample grid and the order in which test subjects explore the grid.</td>
		</tr>
	</tbody>
</table>

<p>In the trial, test subjects will explore their environment by following an expanding clockwise spiral whose first few steps are shown in Figure L.1(b). The starting cell is labeled &ldquo;0&rdquo;, and the numbers show the order in which other cells are visited. The test subjects can see a marker only if they are at its grid cell, and they will stop their exploration as soon as they know where they are based on the grid cells that they have seen so far. That means that the observed sequence of empty and marked grid cells could have begun only at a single possible starting position. The grid is unbounded, but the exploration will be finite since once a test subject has seen all markers on the grid, they&rsquo;ll definitely know where they are.</p>

<p>Having hundreds of test subjects literally running in circles can be expensive, so the ICPC figures that writing a simulation will be cheaper and faster. Maybe you can help?</p>

### 입력

<p>The input describes a single grid. It starts with a line containing two integers d<sub>x</sub>, d<sub>y</sub> (1 &le; d<sub>x</sub>, d<sub>y</sub> &le; 100). The following d<sub>y</sub> lines contain d<sub>x</sub> characters each, and describe part of the test grid. The i<sup>th</sup> character of the j<sup>th</sup> line of this grid description specifies the contents of the grid cell at coordinate (i, d<sub>y</sub> -j  + 1). The character is either &lsquo;<code>.</code>&rsquo; or &lsquo;<code>X</code>&rsquo;, meaning that the cell is either empty, or contains a marker, respectively.</p>

<p>The total number of markers in the grid will be between 1 and 100, inclusive. All grid cells outside the range described by the input are empty</p>

### 출력

<p>In ICPC&rsquo;s experiment, a test subject knows they will start at some position (x, y) with 1 &le; x &le; d<sub>x</sub>, 1 &le; y &le; d<sub>y</sub>.</p>

<p>Output three lines. The first line should have the expected number of steps needed to identify the starting position, assuming that the starting position is chosen uniformly at random. This number needs to be exact to within an absolute error of 10<sup>-3</sup>.</p>

<p>The second line should have the maximum number of steps necessary until one can identify the starting position.</p>

<p>The third line should list all starting coordinates (x, y) that require that maximum number of steps. The coordinates should be sorted by increasing y-coordinates, and then (if the y-coordinates are the same) by increasing x-coordinates.</p>