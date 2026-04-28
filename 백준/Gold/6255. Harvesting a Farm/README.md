# [Gold V] Harvesting a Farm - 6255

[문제 링크](https://www.acmicpc.net/problem/6255)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 25, 맞힌 사람: 20, 정답 비율: 95.238%

### 분류

너비 우선 탐색, 깊이 우선 탐색, 플러드 필, 그래프 이론, 그래프 탐색, 트리

### 문제 설명

<p>Mr. Farmer owns a rectangular farm in Newfoundland. He has partitioned his farm into n &times; m equal-size squares. In each square, he has planted either of the two grains: wheat or corn. By many years of experience, Mr. Farmer has found a simple rule for improving the quality of the grains: if &ldquo;1&rdquo; represents wheat, and &ldquo;2&rdquo; represents corn, then there must be no 2 &times; 2 adjacent squares in the farm forming one of the following &ldquo;crossing&rdquo; patterns:</p>

<table border="1" cellpadding="1" cellspacing="1" style="width:50px">
	<tbody>
		<tr>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">2</td>
		</tr>
		<tr>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">1</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;">&nbsp;</p>

<table border="1" cellpadding="1" cellspacing="1" style="width:50px">
	<tbody>
		<tr>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">1</td>
		</tr>
		<tr>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">2</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;">&nbsp;</p>

<p><br />
Mr. Farmer has a combine for harvesting the grains. To harvest each type of grain, the farmer needs to attach a special cutter to his combine. At the beginning, when no cutter is attached to the combine, and also, during the course of replacing the combine&rsquo;s cutter, the farmer can move the combine to any place of the farm, without harvesting the grains. However, once a cutter is attached, the combine can only move either on the squares containing grains compatible with the combine&rsquo;s cutter, or on the squares with no grain (namely, those harvested before).</p>

<p>Since replacing the cutter is a tedious task, the farmer wishes to hire you to show him the best way for harvesting the whole farm using a minimum number of cutter replacements. Your task is to write a program to help the farmer find such a minimum number.</p>

### 입력

<p>There are multiple test cases in the input. Each test case starts with a line containing two integers n and m(1 &le; n &times; m &le; 10<sup>5</sup>) that specify the number of rows and columns in the farm, respectively. The next n lines, each contains m characters from the set {1, 2}, representing the type of grain in the corresponding square of the farm. The input terminates with a line containing &ldquo;0 0&rdquo;.</p>

### 출력

<p>For each test case, output a single line containing the minimum number of times that the farmer needs to replace the combine&rsquo;s cutter. The first time that a cutter is attached to the combine is also counted as a replacement.</p>