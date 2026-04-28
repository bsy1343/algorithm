# [Platinum V] Radio direction finder - 6734

[문제 링크](https://www.acmicpc.net/problem/6734)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 8, 맞힌 사람: 8, 정답 비율: 38.095%

### 분류

기하학, 수학

### 문제 설명

<p>A boat with a directional antenna can determine its present position with the help of readings from local beacons (radio transmitters). Each beacon is located at a known position and emits a unique signal. When a boat detects a signal, it rotates its antenna until the signal is at maximal strength. This gives a relative bearing to the position of the beacon. Given a previous beacon reading (the time, the relative bearing, and the position of the beacon), a new beacon reading is usually sufficient to determine the boat&rsquo;s present position. You are to write a program to determine, when possible, boat positions from pairs of beacon readings.</p>

<p>For this problem, the positions of beacons and boats are relative to a rectangular coordinate system. The positive x-axis points east; the positive y-axis points north. The course is the direction of travel of the boat and is measured in degrees clockwise from north. That is, north is 0&deg;, east is 90&deg;, south is 180&deg;, and west is 270&deg;. The relative bearing of a beacon is given in degrees clockwise relative to the course of the boat. A boat&rsquo;s antenna cannot indicate on which side the beacon is located. A relative bearing of 90&deg; means that the beacon is toward 90&deg; or 270&deg;.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6734.%E2%80%85Radio%E2%80%85direction%E2%80%85finder/b059ee81.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/6734.%E2%80%85Radio%E2%80%85direction%E2%80%85finder/b059ee81.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/6734/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%205.45.49.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:277px; width:359px" /></p>

### 입력

<p>The first line of input is an integer specifying the number of beacons (at most 30). Following that is a line for each beacon. Each of those lines begins with the beacon&rsquo;s name (a string of 20 or fewer alphabetical characters), the x-coordinate of its position, and the y-coordinate of its position. These fields are single-space separated.</p>

<p>Coming after the lines of beacon information is an integer specifying a number of boat scenarios to follow. A boat scenario consists of three lines, one for velocity and two for beacon readings.&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</p>

<table class="table table-bordered" style="width: 50%;">
	<tbody>
		<tr>
			<td style="text-align:center">Data</td>
			<td style="text-align:center">Meaning</td>
		</tr>
		<tr>
			<td>course speed</td>
			<td>the boat&rsquo;s course and the speed at which it is traveling</td>
		</tr>
		<tr>
			<td>time<sub>1</sub>&nbsp;name<sub>1</sub>&nbsp;angle<sub>1</sub></td>
			<td>time of first reading, name of first beacon, relative bearing of first beacon</td>
		</tr>
		<tr>
			<td>time<sub>2</sub>&nbsp;name<sub>2</sub>&nbsp;angle<sub>2</sub></td>
			<td>time of second reading, name of second beacon, relative bearing of second beacon</td>
		</tr>
	</tbody>
</table>

<p>All times are given in minutes since midnight measured over a single 24-hour clock. The speed is the distance (in units matching those of the rectangular coordinate system) per minute. The second line of the scenario gives the first beacon reading as the time of the reading (an integer), the name of the beacon, and the angle of the reading as measured from the boat&rsquo;s course. These 3 fields have single space separators. The third line gives the second beacon reading. The time for that reading will always be at least as large as the time for the first reading.</p>

### 출력

<p>For each scenario, your program should print the scenario number (Scenario 1, Scenario 2, etc.) and a message indicating the position (rounded to 2 decimal places) of the boat as of the time of the second reading. If it is impossible to determine the position of the boat, the message should say</p>

<p>&nbsp;&nbsp; &nbsp;Position cannot be determined&nbsp;&nbsp; &nbsp;</p>