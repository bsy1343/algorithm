# [Silver III] Numbers - 7114

[문제 링크](https://www.acmicpc.net/problem/7114)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 103, 정답: 38, 맞힌 사람: 29, 정답 비율: 31.868%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>During a lesson of algebra Liene has written the following table on the board:</p>

<table class="table table-bordered td-center th-center table-center-20">
	<thead>
		<tr>
			<th>a</th>
			<th>b</th>
			<th>a<sup>2</sup>b</th>
			<th>ab<sup>2</sup></th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>12</td>
			<td>2</td>
			<td>288</td>
			<td>48</td>
		</tr>
		<tr>
			<td>-1</td>
			<td>-1</td>
			<td>-1</td>
			<td>-1</td>
		</tr>
		<tr>
			<td>9</td>
			<td>-3</td>
			<td>-243</td>
			<td>81</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
	</tbody>
</table>

<p>Liene chose integer numbers a un b, 0&lt;|a|&lt;1000, 0&lt;|b|&lt;1000, a &ge; b, wrote these in the first and second column, then calculated the value ab<sup>2</sup>, wrote it in the third column and, finally, calculated ab<sup>2</sup> and wrote it in the fourth column. You can assume that Liene did not make errors in her calculations.</p>

<p>Peter erased some of the numbers in the table and wrote 0 instead:</p>

<table class="table table-bordered td-center th-center table-center-20">
	<thead>
		<tr>
			<th>a</th>
			<th>b</th>
			<th>a<sup>2</sup>b</th>
			<th>ab<sup>2</sup></th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>12</td>
			<td>0</td>
			<td>288</td>
			<td>0</td>
		</tr>
		<tr>
			<td>-1</td>
			<td>-1</td>
			<td>-1</td>
			<td>-1</td>
		</tr>
		<tr>
			<td>0</td>
			<td>0</td>
			<td>0</td>
			<td>81</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
	</tbody>
</table>

<p>Your task is to write a program that from this type of a (Peter&#39;s modified) table finds and outputs the starting values of a, b, a<sup>2</sup>b un ab<sup>2</sup>. If more than one answer is possible, output the one with the smallest value of the leftmost repairable number.</p>

### 입력



### 출력

