# [Platinum IV] Bright Bracelet - 4638

[문제 링크](https://www.acmicpc.net/problem/4638)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 7, 맞힌 사람: 5, 정답 비율: 22.727%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4638.%E2%80%85Bright%E2%80%85Bracelet/3dd1fa00.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4638.%E2%80%85Bright%E2%80%85Bracelet/3dd1fa00.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4638/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:121px; width:464px" /></p>

<p style="text-align:center">Bracelet 1</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4638.%E2%80%85Bright%E2%80%85Bracelet/7dcba01f.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4638.%E2%80%85Bright%E2%80%85Bracelet/7dcba01f.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4638/2.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:121px; width:464px" /></p>

<p style="text-align:center">Bracelet 2</p>

<p>Bracelets can be made from a collection of octagonal pieces, with two opposite sides of an octagon attached to octagons on either side. The colors of the edges of the octagons vary. The different colors are labeled with different letters in the diagrams. Bracelets only look good if the connecting sides of two adjacent octagons are the same color. Above are two possible bracelets. (The ends also get fastened together.) These two bracelets could be made from the same four octagons, reordered and rotated. Assume that the octagons are never flipped over.</p>

<p>It happens that the better selling bracelets are those with the darker colors on the edges connecting the bracelet. The brightness of each lettered color is a positive integer, with higher numbers being brighter. Suppose the brightness of the labeled colors are:</p>

<table class="table table-bordered" style="width:40%">
	<thead>
		<tr>
			<th>A</th>
			<th>B</th>
			<th>C</th>
			<th>D</th>
			<th>E</th>
			<th>F</th>
			<th>G</th>
			<th>H</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>70</td>
			<td>90</td>
			<td>10</td>
			<td>50</td>
			<td>60</td>
			<td>30</td>
			<td>20</td>
			<td>40</td>
		</tr>
	</tbody>
</table>

<p>We can compare the desirability of these two arrangements of the octagons by adding the brightness of the colors at each joint (including the connection of the two ends). For Bracelet 1, colors A, A, E, and E have sum 70 + 70 + 60 + 60 = 260. For Bracelet 2, colors C, C, G, and E have sum 10 + 10 + 20 + 60 = 100. Bracelet 2 is preferable, having the smaller sum. In fact, Bracelet 2 provides the best possible result among all rearrangements and rotations of these four octagons.</p>

### 입력

<p>There are from one to 20 data sets, followed by a final line containing only 0. A data set starts with a line containing nine blank-separated integers. The first is the number, n, of octagons that form the bracelet, where 4 &le; n &le; 11. The remaining eight numbers are the brightness for colors A through H, in order. Each brightness is positive and less than 256.</p>

<p>The next n lines each contain eight letters, all in the range from A through H. Each gives the edge colors for one octagon, in clockwise order. Individual colors may appear zero or more times in the octagons. Different colors may have the same brightness, but that does not make them the same color.</p>

### 출력

<p>The output contains one line for each data set: If no bracelet can be constructed using all the octagons, the line contains &quot;impossible&quot;. Otherwise the line contains the minimal sum of the brightness for the connections. Caution: If your solution considers all possible orderings and rotations individually, it will run out of time.</p>