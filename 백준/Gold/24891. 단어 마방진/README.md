# [Gold V] 단어 마방진 - 24891

[문제 링크](https://www.acmicpc.net/problem/24891)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 963, 정답: 369, 맞힌 사람: 268, 정답 비율: 36.314%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>$L \times L$행렬에 $L^2$개의 알파벳을 적어 가로로 읽었을 때와 세로로 읽었을 때 얻는 단어들과 그 순서가&nbsp;서로 같은 경우 우리는 이러한 행렬을 단어 마방진이라고 부른다.</p>

<p>예를 들어, 다음 행렬은 $5 \times 5$ 단어 마방진이다.</p>

<table border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 100px;">
	<tbody>
		<tr>
			<td style="text-align: center;">H</td>
			<td style="text-align: center;">E</td>
			<td style="text-align: center;">A</td>
			<td style="text-align: center;">R</td>
			<td style="text-align: center;">T</td>
		</tr>
		<tr>
			<td style="text-align: center;">E</td>
			<td style="text-align: center;">M</td>
			<td style="text-align: center;">B</td>
			<td style="text-align: center;">E</td>
			<td style="text-align: center;">R</td>
		</tr>
		<tr>
			<td style="text-align: center;">A</td>
			<td style="text-align: center;">B</td>
			<td style="text-align: center;">U</td>
			<td style="text-align: center;">S</td>
			<td style="text-align: center;">E</td>
		</tr>
		<tr>
			<td style="text-align: center;">R</td>
			<td style="text-align: center;">E</td>
			<td style="text-align: center;">S</td>
			<td style="text-align: center;">I</td>
			<td style="text-align: center;">N</td>
		</tr>
		<tr>
			<td style="text-align: center;">T</td>
			<td style="text-align: center;">R</td>
			<td style="text-align: center;">E</td>
			<td style="text-align: center;">N</td>
			<td style="text-align: center;">D</td>
		</tr>
	</tbody>
</table>

<p>인규는 길이가 $L$인 단어 $N$개가 주어졌을 때, 여기서 $L$개를 골라 크기가 $L \times L$인 단어 마방진을 만들려고 한다. 하지만 인규는 곧 입대를 해야 해서 이 문제를 해결할 수 없었다. 인규를 위해 단어 마방진을 만드는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 단어의 길이 $L(2 \le L \le 5)$, 단어의 개수 $N(L \le N \le 20)$이 주어진다.</p>

<p>둘째 줄부터 $N$개의 줄에는 길이가 $L$인 단어가 한 줄에 하나씩 주어진다. 모든 단어는 알파벳 대문자로 이루어져 있으며, 같은 단어가 여러 번 주어질 수 있다.</p>

### 출력

<p>단어 마방진을 출력한다. 만들 수 있는 단어 마방진이 여러 개인 경우, 사전 순으로 가장 빠른 단어 마방진을 출력한다.</p>

<p>어떤 경우에도 단어 마방진을 만들 수 없는 경우 &quot;NONE&quot;을 따옴표를 제외하고&nbsp;출력한다.</p>

### 힌트

<p>단어 마방진의 정렬 순서는 마방진에 적힌 모든 문자를 순서대로 이어 만든 하나의 문자열의 정렬 순서와 같다.</p>

<table border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 100px;">
	<tbody>
		<tr>
			<td style="text-align: center;">A</td>
			<td style="text-align: center;">C</td>
			<td style="text-align: center;">&nbsp;</td>
			<td style="text-align: center;">A</td>
			<td style="text-align: center;">B</td>
		</tr>
		<tr>
			<td style="text-align: center;">C</td>
			<td style="text-align: center;">A</td>
			<td style="text-align: center;">&nbsp;</td>
			<td style="text-align: center;">B</td>
			<td style="text-align: center;">A</td>
		</tr>
	</tbody>
</table>

<p>위 두 마방진의 경우, 각각 ACCA, ABBA의 정렬 순서와 같으므로 아래와 같이 정렬된다.</p>

<table border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 100px;">
	<tbody>
		<tr>
			<td style="text-align: center;">A</td>
			<td style="text-align: center;">B</td>
			<td style="text-align: center;">&nbsp;</td>
			<td style="text-align: center;">A</td>
			<td style="text-align: center;">C</td>
		</tr>
		<tr>
			<td style="text-align: center;">B</td>
			<td style="text-align: center;">A</td>
			<td style="text-align: center;">&nbsp;</td>
			<td style="text-align: center;">C</td>
			<td style="text-align: center;">A</td>
		</tr>
	</tbody>
</table>