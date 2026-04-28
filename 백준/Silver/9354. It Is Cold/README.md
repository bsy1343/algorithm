# [Silver V] It Is Cold - 9354

[문제 링크](https://www.acmicpc.net/problem/9354)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 173, 정답: 74, 맞힌 사람: 65, 정답 비율: 43.919%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>Dr. Ziad Najem is known as the godfather of the ACPC. When the regional contest was held in Alexandria, Egypt, the weather was very cold. What surprised Dr. Ziad was that in the contest hall the fans were turned on! Dr. Ziad immediately needed to know, for each team, the speed in which the air reached that team.</p>

<p>Each team has N fans placed on a straight line to its right. Each fan i has a speed Si and direction Ci. Directions are either towards the team &quot;T&quot; or away from the team &quot;A&quot;.</p>

<p>If two fans face the same direction, their speeds add up in the same direction. E.g.</p>

<table border="1" cellpadding="1" cellspacing="1" style="width:500px">
	<tbody>
		<tr>
			<td style="text-align: center;">&nbsp;</td>
			<td style="text-align: center;">Fan 1</td>
			<td style="text-align: center;">Fan 2</td>
			<td style="text-align: center;">Result</td>
		</tr>
		<tr>
			<td style="text-align: center;">Direction</td>
			<td style="text-align: center;">T</td>
			<td style="text-align: center;">T</td>
			<td style="text-align: center;">T</td>
		</tr>
		<tr>
			<td style="text-align: center;">Speed</td>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">2+4 = 6</td>
		</tr>
	</tbody>
</table>

<p>If two fans face each other, their speeds cancel out. E.g.</p>

<div>
<table border="1" cellpadding="1" cellspacing="1" style="width:500px">
	<tbody>
		<tr>
			<td style="text-align: center;">&nbsp;</td>
			<td style="text-align: center;">Fan 1</td>
			<td style="text-align: center;">Fan 2</td>
			<td style="text-align: center;">Result</td>
		</tr>
		<tr>
			<td style="text-align: center;">Direction</td>
			<td style="text-align: center;">A</td>
			<td style="text-align: center;">T</td>
			<td style="text-align: center;">T</td>
		</tr>
		<tr>
			<td style="text-align: center;">Speed</td>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">4-2 = 2</td>
		</tr>
	</tbody>
</table>
</div>

### 입력

<p>The first line of input contains an integer T, the number of teams. For each team, you will be given an integer N, the number of fans. Two lines follow; the first line contains N space separated integers S<sub>i</sub>, the speed of the air produced by fan i (0 &le; i &lt; N). The second line contains N characters that describe the direction of the fans C<sub>i </sub>(as described above).</p>

<p>T &le; 100<br />
0 &lt; N &le; 1000<br />
0 &le; Si &le; 1000000000</p>

### 출력

<p>There should be T lines, containing a single integer S each that represents the speed in which the air reaches the team. S is zero if no air reaches the team.</p>