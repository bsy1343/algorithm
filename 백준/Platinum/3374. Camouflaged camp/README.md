# [Platinum V] Camouflaged camp - 3374

[문제 링크](https://www.acmicpc.net/problem/3374)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 112, 정답: 13, 맞힌 사람: 6, 정답 비율: 12.245%

### 분류

누적 합

### 문제 설명

<p>Squad commander is looking for a location to build a camouflaged camp of a certain size. He has a digital topographic map of the area, which is a rectangular grid with every element defining the altitude at a certain coordinate. Coordinates of any point on the map are identified by the row and the column in the table.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/44d6ff44-67a0-4341-beb3-6671d8810d31/-/preview/" style="width: 189px; height: 137px;" /></p>

<p style="text-align: center;">Digital topographic 5x6 map Camp of size 3&times;5 at position (3,2)</p>

<p>The camp location should be a rectangle fully located within the map area and satisfy certain characteristics. Each characteristic consists of two identical adjacent rectangular areas and the requirement for their altitudes. It is defined by</p>

<ul>
	<li>location, i.e. the coordinates of the topleft corner of the first (i.e. the left or the top) rectangular area; The coordinates are given in respect of the camp area.</li>
	<li>size (length and width) of the first (and the second because they are equal) rectangular areas;</li>
	<li>rectangle arrangement flag, 0 indicates horizontal arrangement of the rectangular areas (i.e. areas have common vertical side), while 1 &ndash; vertical arrangement (i.e. areas have common horizontal side);</li>
	<li>altitude flag, 0 indicates that the average altitude of the first (i.e. the left or the top) rectangular area should be strictly less (&lt;) than the average altitude of the second. 1 indicates the opposite (&ge;) situation.</li>
</ul>

<table class="table table-bordered">
	<tbody>
		<tr>
			<td><img alt="" src="https://upload.acmicpc.net/46068555-be20-4e0b-b4e7-8cfa10d3410f/-/preview/" style="width: 189px; height: 137px;" /></td>
			<td><img alt="" src="https://upload.acmicpc.net/5f16b378-a574-4bb3-a36f-e715da820156/-/preview/" style="width: 189px; height: 137px;" /></td>
		</tr>
		<tr>
			<td>
			<p>Characteristic A:</p>

			<ul>
				<li>Location &ndash; (1, 1)</li>
				<li>Size &ndash; (1, 3)</li>
				<li>Arrangement flag: 1</li>
				<li>Altitude flag: 0</li>
			</ul>

			<p>The selected location satisfies characteristic A.</p>
			</td>
			<td>
			<p>Characteristic B:</p>

			<ul>
				<li>Location &ndash; (2, 2)</li>
				<li>Size &ndash; (2, 2)</li>
				<li>Arrangement flag: 0</li>
				<li>Altitude flag: 0</li>
			</ul>

			<p>The selected location does not satisfy characteristic B.</p>
			</td>
		</tr>
	</tbody>
</table>

<p>The camp location satisfies the characteristic if the altitude requirement is satisfied.</p>

<p>Write a program which given the topographic map of the area and the characteristics would find the best (the one that satisfies most characteristics) location for building the camouflaged camp. In case of several solutions, output any of them.</p>

### 입력

<p>The first line contains two integers R and C (2 &le; R, C &le; 1000). They correspond to the number of rows and columns in the topographic map. The following R lines with C nonnegative integer numbers in each of them describe the topographic map. The altitude does not exceed 255 at any coordinate.</p>

<p>Two integer numbers L (number of rows) and W (number of columns) (1 &le; L, W &le; 1000; L &le; R; W &le; C) defining the size of the camp are written in the following line.</p>

<p>The next line contains one integer H (1 &le; H &le; 1000) &ndash; the number of characteristics.</p>

<p>Finally, the following H lines describe characteristics. Each of them contains 6 integers: coordinates of the characteristic&rsquo;s top-left corner, size of the first rectangular area, the arrangement and the altitude flags. All characteristics fit within the camp.</p>

### 출력

<p>The first line should contain two integers &ndash; the coordinates of top-left corner of camp location.</p>

### 힌트

<p>Location (3, 1) satisfies all three characteristics</p>