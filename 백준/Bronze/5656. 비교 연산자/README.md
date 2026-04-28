# [Bronze II] 비교 연산자 - 5656

[문제 링크](https://www.acmicpc.net/problem/5656)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 4164, 정답: 2500, 맞힌 사람: 2183, 정답 비율: 61.080%

### 분류

구현, 문자열

### 문제 설명

<p>C언어의 비교 연산자는 아래 표에 나와있다.&nbsp;</p>

<table class="table table-bordered" style="width:30%">
	<thead>
		<tr>
			<th style="width:10%">연산자</th>
			<th style="width:20%">뜻</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>&gt;</td>
			<td>크다</td>
		</tr>
		<tr>
			<td>&gt;=</td>
			<td>크거나 같다</td>
		</tr>
		<tr>
			<td>&lt;</td>
			<td>작다</td>
		</tr>
		<tr>
			<td>&lt;=</td>
			<td>작거나 같다</td>
		</tr>
		<tr>
			<td>==</td>
			<td>같다</td>
		</tr>
		<tr>
			<td>!=</td>
			<td>같지 않다</td>
		</tr>
	</tbody>
</table>

<p>이 연산자는 두 피연산자를 비교하고, (왼쪽 값과 오른쪽 값) true또는 false (1 또는 0)을 리턴한다. 예를 들어, 2 &gt; 3은 &quot;false&quot;를 리턴하고 (2는 3보다 작기 때문), 3 != 4는 &quot;true&quot;, 3 &gt;= 3은 &quot;true&quot;를 리턴한다.</p>

<p>C언어의 비교 연산식이 주어졌을 때, 결과를 구하는 프로그램을 작성하시오.</p>

### 입력

<p>입력은 최대 12000줄로 이루어져 있다. 각 줄은 두 정수 a, b가 주어지며, 정수 사이에는 연산자 &quot;&gt;&quot;, &quot;&gt;=&quot;, &quot;&lt;&quot;, &quot;&lt;=&quot;, &quot;==&quot;, &quot;!=&quot;중 하나가 주어진다. 연산자와 피연산자 사이에는 공백이 하나 있으며, 연산자로 &quot;E&quot;가 주어진 경우에는 프로그램을 끝낸다. (-10000 &le; a,b &le; 10000)</p>

### 출력

<p>입력의 각 줄 마다 입력으로 주어진 식의 결과가 &quot;true&quot;인지 &quot;false&quot;인지 출력한다.</p>