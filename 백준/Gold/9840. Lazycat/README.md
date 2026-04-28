# [Gold II] Lazycat - 9840

[문제 링크](https://www.acmicpc.net/problem/9840)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 20, 정답: 17, 맞힌 사람: 11, 정답 비율: 84.615%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 비트마스킹, 격자 그래프, 외판원 순회 문제

### 문제 설명

<p>The map of a house is given by an&nbsp;<i>n</i>&nbsp;x&nbsp;<i>n</i>&nbsp;grid as shown below (for a 4 x 4 case):</p>

<table class="table table-bordered" style="width: 20%;">
	<tbody>
		<tr>
			<td style="text-align: center;">B</td>
			<td style="text-align: center;">&nbsp;</td>
			<td style="text-align: center;">F</td>
			<td style="text-align: center;">&nbsp;</td>
		</tr>
		<tr>
			<td style="text-align: center;">X</td>
			<td style="text-align: center;">X</td>
			<td style="text-align: center;">F</td>
			<td style="text-align: center;">&nbsp;</td>
		</tr>
		<tr>
			<td style="text-align: center;">F</td>
			<td style="text-align: center;">X</td>
			<td style="text-align: center;">X</td>
			<td style="text-align: center;">F</td>
		</tr>
		<tr>
			<td style="text-align: center;">S</td>
			<td style="text-align: center;">&nbsp;</td>
			<td style="text-align: center;">&nbsp;</td>
			<td style="text-align: center;">&nbsp;</td>
		</tr>
	</tbody>
</table>

<p>The walls of the house are marked with &#39;X&#39;, food items are marked by &#39;F&#39;, and a single bed is marked by a &#39;B&#39;. The cat begins at position &#39;S&#39; (which can be anywhere within the grid and not just at the bottom left hand corner). The objective of this question is to find the smallest number of steps needed to reach the bed from the starting position &#39;S&#39;, while visiting all food items. The cat can only step up, down, left and right, and cannot enter squares marked with &#39;X&#39;.</p>

### 입력

<p>Your program will read from standard input the following data. The first line specifies the grid size&nbsp;<i>n</i>, where 2 &le;&nbsp;<i>n</i>&nbsp;&le; 30. Each of the following&nbsp;<i>n</i>&nbsp;lines contains&nbsp;<i>n</i>&nbsp;characters, each of which characterizes the corresponding cell of the grid. The bed is marked with a &#39;B&#39;, the food items with &#39;F&#39;, the walls with &#39;X&#39; and the empty squares with &#39;0&#39; (the digit zero). All letters are uppercase only. You can assume that there are at least one and at most 10 occurrences of &#39;F&#39;.</p>

### 출력

<p>Your program must write one line to the standard output, containing the smallest number of steps required for reaching all food items and then go to bed. If there is no way for the cat to reach all food items and the bed, the output line contains the number -1 instead. The line is terminated by a newline character.</p>