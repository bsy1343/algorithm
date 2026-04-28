# [Bronze II] 운동 - 1173

[문제 링크](https://www.acmicpc.net/problem/1173)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 16 MB

### 통계

제출: 12104, 정답: 5676, 맞힌 사람: 5192, 정답 비율: 49.074%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>영식이가 운동을 하는 과정은 1분 단위로 나누어져 있다. 매 분마다 영식이는 운동과 휴식 중 하나를 선택해야 한다.</p>

<p>운동을 선택한 경우, 영식이의 맥박이 T만큼 증가한다. 즉, 영식이의 맥박이 X였다면, 1분 동안 운동을 한 후 맥박이 X+T가 되는 것이다. 영식이는 맥박이 M을 넘는 것을 원하지 않기 때문에, X+T가 M보다 작거나 같을 때만 운동을 할 수 있다. 휴식을 선택하는 경우 맥박이 R만큼 감소한다. 즉, 영식이의 맥박이 X였다면, 1분 동안 휴식을 한 후 맥박은&nbsp;X-R이 된다. 맥박은 절대로 m보다 낮아지면 안된다. 따라서, X-R이 m보다 작으면 맥박은 m이 된다.</p>

<p>영식이의 초기 맥박은 m이다. 운동을 N분 하려고 한다. 이때 운동을 N분하는데 필요한 시간의 최솟값을 구해보자. 운동하는 시간은 연속되지 않아도 된다.</p>

### 입력

<p>첫째 줄에 다섯 정수 N, m, M, T, R이 주어진다.</p>

### 출력

<p>첫째 줄에 운동을 N분하는데 필요한 시간의 최솟값을 출력한다.. 만약 운동을 N분 할 수 없다면 -1을 출력한다.</p>

### 제한

<ul>
	<li>1 &le; N, T, R &le; 200</li>
	<li>50 &le; m &le; M &le; 200</li>
</ul>

### 힌트

<table class="table table-bordered" style="width: 35%;">
	<thead>
		<tr>
			<th style="text-align: center;">시간</th>
			<th style="text-align: center;">행동</th>
			<th style="text-align: center;">행동을 한 후의 맥박</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">운동</td>
			<td style="text-align: center;">95</td>
		</tr>
		<tr>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">운동</td>
			<td style="text-align: center;">120</td>
		</tr>
		<tr>
			<td style="text-align: center;">3</td>
			<td style="text-align: center;">휴식</td>
			<td style="text-align: center;">105</td>
		</tr>
		<tr>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">휴식</td>
			<td style="text-align: center;">90</td>
		</tr>
		<tr>
			<td style="text-align: center;">5</td>
			<td style="text-align: center;">운동</td>
			<td style="text-align: center;">115</td>
		</tr>
		<tr>
			<td style="text-align: center;">6</td>
			<td style="text-align: center;">휴식</td>
			<td style="text-align: center;">100</td>
		</tr>
		<tr>
			<td style="text-align: center;">7</td>
			<td style="text-align: center;">휴식</td>
			<td style="text-align: center;">85</td>
		</tr>
		<tr>
			<td style="text-align: center;">8</td>
			<td style="text-align: center;">운동</td>
			<td style="text-align: center;">110</td>
		</tr>
		<tr>
			<td style="text-align: center;">9</td>
			<td style="text-align: center;">휴식</td>
			<td style="text-align: center;">95</td>
		</tr>
		<tr>
			<td style="text-align: center;">10</td>
			<td style="text-align: center;">운동</td>
			<td style="text-align: center;">120</td>
		</tr>
	</tbody>
</table>