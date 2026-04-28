# [Gold IV] 이동하기 5 - 20035

[문제 링크](https://www.acmicpc.net/problem/20035)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 382, 정답: 162, 맞힌 사람: 104, 정답 비율: 54.450%

### 분류

그리디 알고리즘

### 문제 설명

<p>준규는 N&times;M 크기의 미로에 갇혀있다.&nbsp;미로는 1&times;1크기의 방으로 나누어져 있고, 각 방에는 사탕이 놓여져 있다. (i, j)에 놓여져 있는 사탕의 개수는 A<sub>i</sub>&nbsp;&times; 10<sup>9</sup> +&nbsp;B<sub>j</sub>개이다. 미로의 가장 왼쪽 윗 방은&nbsp;(1, 1)이고, 가장 오른쪽 아랫 방은&nbsp;(N, M)이다.</p>

<p>준규는 현재 (1, 1)에 있고, (N, M)으로 이동하려고 한다. 준규가 (r, c)에 있으면, (r+1, c), (r, c+1)로 이동할 수 있고, 각 방을 방문할 때마다 방에 놓여져있는 사탕을 모두 가져갈 수 있다. 또,&nbsp;미로 밖으로 나갈 수는 없다.</p>

<p>준규가 (N, M)으로 이동할 때, 가져올 수 있는 사탕 개수의 최댓값을 구하시오.</p>

### 입력

<p>첫째 줄에 미로의 크기 N, M이 주어진다. (1 &le; N, M &le; 100,000)</p>

<p>둘째 줄에는 A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>이, 셋째 줄에는 B<sub>1</sub>, B<sub>2</sub>, ..., B<sub>M</sub>이 주어진다. (0 &le; A<sub>i</sub>, B<sub>j</sub> &le; 9)</p>

### 출력

<p>첫째 줄에 준규가 (N, M)으로 이동할 때, 가져올 수 있는 사탕 개수를 출력한다.</p>

### 힌트

<p>예제로 만들 수 있는 미로는 다음과 같은 모양이며, 편의상 (i, j)에 놓여진 사탕의 개수는 A<sub>i</sub>, B<sub>j</sub>로 표시했다.</p>

<table class="table table-bordered table-center-20 td-center">
	<tbody>
		<tr>
			<td>0, 4</td>
			<td>0, 1</td>
			<td>0, 9</td>
			<td>0, 7</td>
		</tr>
		<tr>
			<td>7, 4</td>
			<td>7, 1</td>
			<td>7, 9</td>
			<td>7, 7</td>
		</tr>
		<tr>
			<td>1, 4</td>
			<td>1, 1</td>
			<td>1, 9</td>
			<td>1, 7</td>
		</tr>
		<tr>
			<td>7, 4</td>
			<td>7, 1</td>
			<td>7, 9</td>
			<td>7, 7</td>
		</tr>
		<tr>
			<td>6, 4</td>
			<td>6, 1</td>
			<td>6, 9</td>
			<td>7, 7</td>
		</tr>
		<tr>
			<td>7, 4</td>
			<td>7, 1</td>
			<td>7, 9</td>
			<td>7, 7</td>
		</tr>
		<tr>
			<td>6, 4</td>
			<td>6, 1</td>
			<td>6, 9</td>
			<td>6, 7</td>
		</tr>
	</tbody>
</table>