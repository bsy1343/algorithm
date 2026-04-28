# [Platinum II] The Kingdom of JOIOI - 14421

[문제 링크](https://www.acmicpc.net/problem/14421)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 256 MB

### 통계

제출: 224, 정답: 96, 맞힌 사람: 76, 정답 비율: 41.081%

### 분류

이분 탐색, 매개 변수 탐색

### 문제 설명

<p>The Kingdom of JOIOI is a rectangular grid of H x W cells. In the Kingdom of JOIOI, in order to improve efficiency of administrative institutions, the country will be divided into two regions called &ldquo;JOI&rdquo; and &ldquo;IOI.&rdquo;</p>

<p>Since we do not want to divide it in a complicated way, the division must satisfy the following conditions:</p>

<ul>
	<li>Each region must contain at least one cell.</li>
	<li>Each cell must belong to exactly one of two regions.</li>
	<li>For every pair of cells in the JOI region, we can travel from one to the other by passing through cells belonging to the JOI region only. When move from a cell to another cell, the two cells must share an edge. The same is true for the IOI region.</li>
	<li>For each row or column, if we take all the cells in that row or column, the cells belonging to each region must be connected. All the cells in a row or column may belong to the same region.</li>
</ul>

<p>Each cell has an integer called the altitude. After we divide the country into two regions, it is expected that traveling in each region will be active. But, if the difference of the altitudes of cells are large, traveling between them becomes hard. Therefore, we would like to minimize the maximum of the difference of the altitudes between cells belonging to the same region. In other words, we would like to minimize the larger value of</p>

<ul>
	<li>the difference between the maximum and the minimum altitudes in the JOI region, and</li>
	<li>the difference between the maximum and the minimum altitudes in the IOI region.</li>
</ul>

<p>Given the altitudes of cells in the Kingdom of JOIOI, write a program which calculates the minimum of the larger value of the difference between the maximum and the minimum altitudes in the JOI region and the difference between the maximum and the minimum altitudes in the IOI region when we divide the country into two regions.</p>

### 입력

<p>Read the following data from the standard input.</p>

<ul>
	<li>The first line of input contains two space separated integers H;W. This means the Kingdom of JOIOI is a rectangular grid of H x W cells.</li>
	<li>The i-th line (1 &le; i &le; H) of the following H lines contains W space separated integers A<sub>i,1</sub>, A<sub>i,2</sub>, ...,A<sub>i,W</sub>. This means the cell in the i-th row from above and j-th column from left (1 &le; j &le; W) has altitude A<sub>i,j</sub>.</li>
</ul>

### 출력

<p>Write one line to the standard output. The output contains the minimum of the larger value of the difference between the maximum and the minimum altitudes in the JOI region and the difference between the maximum and the minimum altitudes in the IOI region when we divide the country into two regions.</p>

### 제한

<p>All input data satisfy the following conditions.</p>

<ul>
	<li>2 &le; H &le; 2 000.</li>
	<li>2 &le; W &le; 2 000.</li>
	<li>1 &le; A<sub>i,j</sub> &le; 1 000 000 000 (1 &le;&nbsp;i &le; H, 1 &le; j &le; W).</li>
</ul>