# [Platinum V] Hole Cutter - 6691

[문제 링크](https://www.acmicpc.net/problem/6691)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 6, 맞힌 사람: 6, 정답 비율: 31.579%

### 분류

값 / 좌표 압축, 플러드 필, 그래프 이론, 그래프 탐색, 구현, 시뮬레이션

### 문제 설명

<p>The assistants of Summit Headquarters often need to cut various shapes from the large sheet of paper. For instance, they want to distribute posters of various sizes etc. They have just acquired a new cutter which can make cuts much more freely than any of their previous machines, and they want you to write a program to calculate exactly what happens when a complex series of cuts are made. In particular, they need to know the number of holes which are formed in the sheet by the cuts. The pictures show some examples of situations that can arise after cutting.</p>

<table class="table">
	<tbody>
		<tr>
			<td style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6691.%E2%80%85Hole%E2%80%85Cutter/50c8dea0.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/6691.%E2%80%85Hole%E2%80%85Cutter/50c8dea0.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6691/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:103px; width:99px" /></td>
			<td style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6691.%E2%80%85Hole%E2%80%85Cutter/2c91c807.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/6691.%E2%80%85Hole%E2%80%85Cutter/2c91c807.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6691/2.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:103px; width:99px" /></td>
			<td style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6691.%E2%80%85Hole%E2%80%85Cutter/812bc4c1.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/6691.%E2%80%85Hole%E2%80%85Cutter/812bc4c1.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6691/3.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:100px; width:99px" /></td>
			<td style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6691.%E2%80%85Hole%E2%80%85Cutter/3f9d1dae.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/6691.%E2%80%85Hole%E2%80%85Cutter/3f9d1dae.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6691/4.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:103px; width:99px" /></td>
		</tr>
	</tbody>
	<tfoot>
		<tr>
			<th style="text-align:center">Two holes</th>
			<th style="text-align:center">Two holes</th>
			<th style="text-align:center">One hole</th>
			<th style="text-align:center">One hole</th>
		</tr>
	</tfoot>
</table>

### 입력

<p>The input consists of several operation descriptions. Each description starts with a line containing an integer number N, giving the number of cuts in the operation, 1 &lt;= N &lt;= 100. This line is followed by N lines giving the actual cuts. Each cut will be given by four whole numbers separated by one space, X1, Y1, X2, Y2, -10<sup>5</sup> &lt; X1, Y1, X2, Y2 &lt; 10<sup>5</sup>. X1 and Y1 are the coordinates of the start of the cut line, X2 and Y2 define the end of the cut line.</p>

<p>You should assume the points are always internal to the sheet, never on the boundary. Each cut will be parallel to the x- or y-axis of the table. The input will be terminated by a line consisting of a single 0, i.e. a cutting operation description with N = 0.</p>

### 출력

<p>For each cutting operation, output a single line containing the sentence &quot;There are H holes.&quot; where H is the number of distinct holes in the sheet after all the cuts have been made. Note that the minimum area of any hole is 1 square unit.</p>

<p>&nbsp;</p>