# [Platinum III] 동아리 박람회 - 25923

[문제 링크](https://www.acmicpc.net/problem/25923)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 82, 정답: 43, 맞힌 사람: 35, 정답 비율: 64.815%

### 분류

애드 혹, 해 구성하기, 비트마스킹

### 문제 설명

<p>기나긴 비대면의 시대가 끝나고 연세대에도 동아리 박람회가 열리게 되었다! 오랜만에 신촌에 오게 된 건우도 설레는 마음으로 동아리 박람회를 둘러보기로 했다. </p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25923.%E2%80%85%EB%8F%99%EC%95%84%EB%A6%AC%E2%80%85%EB%B0%95%EB%9E%8C%ED%9A%8C/8d789490.png" data-original-src="https://upload.acmicpc.net/9c48b5d8-7d8d-4fbd-9ddb-9a2091a3303c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 1000px; height: 196px;" /></p>

<p>동아리 박람회는 각 동아리가 부스에서 동아리를 홍보하는 행사이다. 동아리 부스는 백양로를 따라 일렬로 설치되어 있으며, $1$번부터 $N$번까지의 번호가 차례대로 붙어 있다. 이웃한 부스 사이의 거리는 $1$이며, $i$번 부스와 $j$번 부스 사이의 거리는 $|i-j|$이다. </p>

<p>건우는 $1$번 부스에서 시작해서 $2$번부터 $N$번 부스를 <strong>한 번씩만</strong> 방문하고 $1$번 부스로 돌아오려고 한다. 그러나 건우는 두 수를 보면 bitwise AND 연산을 하는 습관이 있고, 그 값이 $0$이 되는 것을 싫어한다. 그러므로 $i$번 부스에서 $j$번 부스로 이동할 때, $i$와 $j$에 AND 연산을 적용한 값이 $0$이 아닐 때만 이동할 수 있다. AND 연산의 정의는 하단의 힌트에 있다. 그리고 오래 걷는 것은 힘들기 때문에, 한 번에 이동할 수 있는 최대 거리는 $K$이다. </p>

<p>건우는 이동 거리의 합을 최소화하기 위해, 가능한 부스 방문 순서를 모두 찾은 다음에 이동 거리의 합이 가장 작은 것을 찾으려고 한다. 즉 가능한 경로들 중에서 최단 경로를 찾으려고 한다. 그러나 동아리의 수가 너무 많아서 최단 경로를 찾다가 박람회가 끝날 것이다. 건우를 위해 최단 경로를 빠르게 찾아 주는 프로그램을 작성하시오. </p>

### 입력

<p>입력은 아래와 같이 주어진다.</p>

<div style="background:#eeeeee;border:1px solid #cccccc;padding:5px 10px;">
<p>$N$ $K$</p>
</div>

### 출력

<p>조건을 만족하는 경로가 존재한다면, 첫째 줄에 최단 경로의 길이를 출력한다. 둘째 줄에 방문할 부스의 번호를 순서대로 출력한다. $1$로 시작해서 $1$로 끝나야 한다.</p>

<p>조건을 만족하는 경로가 존재하지 않는다면, 첫째 줄에 <span style="color:#e74c3c;"><code>-1</code></span>을 출력한다. </p>

### 제한

<ul>
	<li>$2\leq K&lt;N\leq500\,000$</li>
</ul>

### 힌트

<p>Bitwise AND 연산은 두 값을 이진수로 나타낸 다음, 같은 자릿수끼리 비교해서 둘 다 1일 때만 1을, 나머지 경우에는 0을 계산하는 연산이다. </p>

<table class="table table-bordered" style="width: 200px;">
	<tbody>
		<tr>
			<td style="text-align: center;">비트1</td>
			<td style="text-align: center;">비트2</td>
			<td style="text-align: center;">결과</td>
		</tr>
		<tr>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">0</td>
		</tr>
		<tr>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">0</td>
		</tr>
		<tr>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">0</td>
		</tr>
		<tr>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1</td>
		</tr>
	</tbody>
</table>


<p>다음은 12 AND 5의 값을 구하는 과정을 나타낸 것이다. </p>

<table class="table table-bordered" style="width: 400px;">
	<tbody>
		<tr>
			<td style="width: 100px; text-align: center;"> </td>
			<td style="text-align: center; width: 25%;">십진수 표현</td>
			<td colspan="4" rowspan="1" style="text-align: center;">이진수 표현</td>
		</tr>
		<tr>
			<td style="width: 25px; text-align: center;">X</td>
			<td style="width: 25%; text-align: center;">12</td>
			<td style="width: 75px; text-align: center;">1</td>
			<td style="width: 75px; text-align: center;">1</td>
			<td style="width: 75px; text-align: center;">0</td>
			<td style="width: 75px; text-align: center;">0</td>
		</tr>
		<tr>
			<td style="width: 25px; text-align: center;">Y</td>
			<td style="width: 25%; text-align: center;">5</td>
			<td style="width: 75px; text-align: center;">0</td>
			<td style="width: 75px; text-align: center;">1</td>
			<td style="width: 75px; text-align: center;">0</td>
			<td style="width: 75px; text-align: center;">1</td>
		</tr>
		<tr>
			<td style="width: 25px; text-align: center;">X AND Y</td>
			<td style="width: 25%; text-align: center;">4</td>
			<td style="width: 75px; text-align: center;">0</td>
			<td style="width: 75px; text-align: center;">1</td>
			<td style="width: 75px; text-align: center;">0</td>
			<td style="width: 75px; text-align: center;">0</td>
		</tr>
	</tbody>
</table>