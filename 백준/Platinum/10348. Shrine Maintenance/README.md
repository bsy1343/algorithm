# [Platinum V] Shrine Maintenance - 10348

[문제 링크](https://www.acmicpc.net/problem/10348)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 29, 정답: 19, 맞힌 사람: 15, 정답 비율: 88.235%

### 분류

이분 탐색, 기하학, 수학, 정수론, 매개 변수 탐색

### 문제 설명

<p>A religious sect has holy sites with shrines placed around a circle of radius 1000.&nbsp; The circle is split into N equal length arcs and the endpoints are numbered in order, 1 through N.&nbsp; The first figure shows a circle where N is 12, with 12 gray tick marks like on a 12-hour analog clock.&nbsp; We can imagine the marks numbered, as on a clock, with 12 at the top.&nbsp; Each circle has one or more <em>sacred numbers</em> associated with it.&nbsp;&nbsp; The sacred numbers for the circle in the first figure are 2 and 3.&nbsp; A shrine, indicated by a black dot in the figure, is placed at each mark whose number is a multiple of at least one of the sacred numbers, so in this case the shrines are at positions 2, 3, 4, 6, 8, 9, 10, and 12.&nbsp;&nbsp;</p>

<table style="height:204px; text-align:center; width:406px">
	<tbody>
		<tr>
			<td><img alt="optimal paths" src="%EB%B0%B1%EC%A4%80/Platinum/10348.%E2%80%85Shrine%E2%80%85Maintenance/c06495be.png" data-original-src="https://www.acmicpc.net/upload/images2/fig1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width:200px" /></td>
			<td><img alt="optimal paths" src="%EB%B0%B1%EC%A4%80/Platinum/10348.%E2%80%85Shrine%E2%80%85Maintenance/c6ac9618.png" data-original-src="https://www.acmicpc.net/upload/images2/fig3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width:225px" /></td>
			<td><img alt="optimal paths" src="%EB%B0%B1%EC%A4%80/Platinum/10348.%E2%80%85Shrine%E2%80%85Maintenance/3a16ebe8.png" data-original-src="https://www.acmicpc.net/upload/images2/fig4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width:215px" /></td>
			<!--
      <td><img style="width: 205px;" alt="optimal paths" src="fig2.png"><br>
	  -->
		</tr>
		<tr>
			<td>Figure 1</td>
			<td>Figure 2</td>
			<td>Figure 3</td>
			<!--
      <td>Figure 4</td>
	  -->
		</tr>
	</tbody>
</table>

<p>When it comes time to inspect and repair the shrines at a given site, the area is closed and a team of workers simultaneously fan out from a maintenance shed, located in the center of the circle, so that each shrine is visited by at least one worker. Once all workers have returned to the shed, the site is reopened to the public. Because these sites are in great demand, it is important that they be closed as briefly as possible. In order to minimize this time, they must figure out how to apportion the shrines among the current number of workers, so the maximum distance traveled by any one worker is as small as possible.&nbsp; Figure 1 shows one choice for the optimal solution paths for 3 workers.&nbsp; The lower left path has darker lines, to indicate that it is one with the longest length, which in this case is approximately 3517.6.</p>

<p>This sect has many circular sites with multiple shrines.&nbsp; The number of available workers at a site, W, the value of the number equal arcs, N, and the sacred numbers vary between sites.&nbsp; The sacred numbers are always divisors of N.&nbsp;&nbsp; Your job is to help figure out how much time is required for maintenance.&nbsp; Figures 2 and 3 show optimal solutions for other sites.&nbsp;</p>

### 입력

<p>The input consists of one or more data sets.&nbsp; Each data set is on a single line and consists entirely of positive integers.&nbsp; The first three entries are W, the number of workers, N, the number of equal arcs around the circle, and D, the number of sacred divisors of N.&nbsp; At the end come the D divisors of N.&nbsp; W is no more than the total number of shrines; N &le; 8600, and D &le; 6; each listed divisor of N is smaller than&nbsp;N.</p>

<p>A single zero, 0, will be placed on the last line to indicate the end of the input.</p>

### 출력

<p>The output is a single line for each dataset:&nbsp; the maximum distance a worker must travel with an optimal assignment of the shrines.&nbsp; This number is displayed so that it is rounded to one decimal place, and always shows that decimal place, even if it is 0.&nbsp; To ensure unique answers with double arithmetic, the datasets are chosen so that if your answer is anywhere within .005 of the exact minimum distance, then the answer rounded to one decimal place will be the same.</p>

<p>The first three sample datasets correspond to the three figures.</p>

<p>Caution:&nbsp; Be careful with your algorithm so it finishes rapidly.</p>