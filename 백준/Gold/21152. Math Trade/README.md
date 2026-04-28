# [Gold V] Math Trade - 21152

[문제 링크](https://www.acmicpc.net/problem/21152)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 29, 맞힌 사람: 27, 정답 비율: 65.854%

### 분류

자료 구조, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 해시를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Suppose a group of people have objects they want to trade, and objects they want to get in return:</p>

<table class="table table-bordered table-center-50 th-center td-center">
	<tbody>
		<tr>
			<th>Name</th>
			<th>Haas</th>
			<th>Wants</th>
		</tr>
		<tr>
			<td>Sally</td>
			<td>Clock</td>
			<td>Doll</td>
		</tr>
		<tr>
			<td>Steve</td>
			<td>Doll</td>
			<td>Painting</td>
		</tr>
		<tr>
			<td>Carlos</td>
			<td>Painting</td>
			<td>Clock</td>
		</tr>
		<tr>
			<td>Maria</td>
			<td>Candlestick</td>
			<td>Vase</td>
		</tr>
	</tbody>
</table>

<p>Notice how none of the people listed can pair off and trade with each other. &nbsp;However, if Sally, Steve, and Carlos all got together, Sally could trade her clock to Steve for the doll she wants, and Steve can then trade that clock to Carlos for the painting Steve wants.</p>

<p>This creation of a chain of individual trades that gets a large number of people the objects they want is called a <em>math trade</em>. Ideally everyone is involved in the math trade but that is not always possible (sorry Maria). The object therefore is to create a single chain of the longest length. Determining the longest math trade gets complicated if the participants have multiple items that they want to trade or obtain. &nbsp;Luckily for you, we are only worried about the situation where each person has and wants exactly one item, and no item is owned by or desired by more than one person.</p>

### 입력

<p>Input begins with a line containing a positive integer $n\,(n \leq 100)$, the number of people interested in trading. &nbsp;After this are $n$ lines, each with three strings separated by spaces. &nbsp;The first string will be the name of the trader. &nbsp;The second string will be the object the trader has. &nbsp;The third string will be the object the trader wants. &nbsp;All trader names will be unique, and no object will be wanted by more than one person and owned by more than one person.</p>

### 출력

<p>Output the length of the longest math trade. &nbsp;If no trading is possible, output the phrase &quot;No trades possible&quot;</p>