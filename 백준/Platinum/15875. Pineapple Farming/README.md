# [Platinum IV] Pineapple Farming - 15875

[문제 링크](https://www.acmicpc.net/problem/15875)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 421, 정답: 98, 맞힌 사람: 54, 정답 비율: 20.690%

### 분류

자료 구조, 정렬, 최단 경로, 분리 집합

### 문제 설명

<p>파인애플은 열대과일로, 잘 자라기 위해서 많은 비가 필요하다. 병찬이는 피자에 파인애플을 더 많이 넣기 위하여 비가 많이 오는 열대지역에 산을 통째로 구입했다.</p>

<p>병찬이는 모든 땅에 파인애플을 심어 자라게 하려 하는데, 문제가 발생했다. 비가 너무 많이 오게 되면 산에 거대한 물웅덩이가 생길 수 있는데, 파인애플이 물에 빠지면 재배를 할 수가 없다. 그래서 병찬이는 이 산에서 가장 큰 웅덩이를 찾고 싶다.</p>

<p>다음 조건을 만족하는 영역을 웅덩이라고 한다.</p>

<ol>
	<li>산은 가로 W, 세로 H 의 칸들로 구성되며, 각 칸의 높이는 1이상 10<sup>9</sup> 이하의 정수다. 이 산 바깥의 모든 높이는 0이라고 가정한다.</li>
	<li>한 웅덩이의 각 칸들은 연결되어 있다. 이때 연결되어 있다는 것은 칸들이 서로 상하좌우 넷 중 하나로 인접하다는 것을 의미하며, 대각선으로 나열된 칸은 연결된 것이 아니다.</li>
	<li>다음 조건을 만족하는 h가 존재한다.
	<ul>
		<li>웅덩이의 모든 칸의 높이는 h 이하이다.</li>
		<li>웅덩이와 상하좌우로 연결되어 있는, 웅덩이가 아닌 모든 칸의 높이는 h + 1 이상이다.</li>
	</ul>
	</li>
</ol>

### 입력

<p>첫 번째 줄에는 병찬이가 구입한 산의 세로 크기 H와 가로 크기 W가 주어진다. (1 &le; W, H &le; 1,000)</p>

<p>두 번째 줄부터 H&nbsp;+ 1번째 줄까지 각 줄마다 W개의 수가 주어진다.</p>

<p>i + 1(1 &le; i &le; H)번째 줄의 j번째 수는 산의 i행 j열 부분의 높이를 의미한다.</p>

### 출력

<p>이 산에 존재하는 가장 큰 웅덩이의 크기를 출력한다. 웅덩이가 없을 경우 0을 출력한다.</p>

### 힌트

<p>회색으로 칠한 부분이 최대 크기의 웅덩이다.</p>

<table class="table table-bordered" style="width: 15%;">
	<tbody>
		<tr>
			<td style="text-align: center;">8</td>
			<td style="text-align: center;">7</td>
			<td style="text-align: center;">6</td>
			<td style="text-align: center;">6</td>
			<td style="text-align: center;">8</td>
		</tr>
		<tr>
			<td style="text-align: center;">9</td>
			<td style="text-align: center;">8</td>
			<td style="text-align: center; background-color: #d3d3d3;">5</td>
			<td style="text-align: center; background-color: #d3d3d3;">4</td>
			<td style="text-align: center;">9</td>
		</tr>
		<tr>
			<td style="text-align: center;">7</td>
			<td style="text-align: center; background-color: #d3d3d3;">2</td>
			<td style="text-align: center; background-color: #d3d3d3;">3</td>
			<td style="text-align: center;">7</td>
			<td style="text-align: center;">5</td>
		</tr>
		<tr>
			<td style="text-align: center;">9</td>
			<td style="text-align: center; background-color: #d3d3d3;">5</td>
			<td style="text-align: center;">6</td>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">3</td>
		</tr>
		<tr>
			<td style="text-align: center;">9</td>
			<td style="text-align: center;">9</td>
			<td style="text-align: center;">6</td>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">1</td>
		</tr>
	</tbody>
</table>