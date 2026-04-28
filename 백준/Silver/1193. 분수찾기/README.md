# [Silver V] 분수찾기 - 1193

[문제 링크](https://www.acmicpc.net/problem/1193)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 155219, 정답: 80309, 맞힌 사람: 68730, 정답 비율: 52.352%

### 분류

수학, 구현

### 문제 설명

<p>무한히 큰 배열에 다음과 같이 분수들이&nbsp;적혀있다.</p>

<table class="table table-bordered" style="width:30%">
	<tbody>
		<tr>
			<td style="width:5%">1/1</td>
			<td style="width:5%">1/2</td>
			<td style="width:5%">1/3</td>
			<td style="width:5%">1/4</td>
			<td style="width:5%">1/5</td>
			<td style="width:5%">&hellip;</td>
		</tr>
		<tr>
			<td>2/1</td>
			<td>2/2</td>
			<td>2/3</td>
			<td>2/4</td>
			<td>&hellip;</td>
			<td>&hellip;</td>
		</tr>
		<tr>
			<td>3/1</td>
			<td>3/2</td>
			<td>3/3</td>
			<td>&hellip;</td>
			<td>&hellip;</td>
			<td>&hellip;</td>
		</tr>
		<tr>
			<td>4/1</td>
			<td>4/2</td>
			<td>&hellip;</td>
			<td>&hellip;</td>
			<td>&hellip;</td>
			<td>&hellip;</td>
		</tr>
		<tr>
			<td>5/1</td>
			<td>&hellip;</td>
			<td>&hellip;</td>
			<td>&hellip;</td>
			<td>&hellip;</td>
			<td>&hellip;</td>
		</tr>
		<tr>
			<td>&hellip;</td>
			<td>&hellip;</td>
			<td>&hellip;</td>
			<td>&hellip;</td>
			<td>&hellip;</td>
			<td>&hellip;</td>
		</tr>
	</tbody>
</table>

<p>이와 같이 나열된 분수들을 1/1 &rarr; 1/2 &rarr; 2/1 &rarr; 3/1 &rarr;&nbsp;2/2 &rarr; &hellip; 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, &hellip; 분수라고 하자.</p>

<p>X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 X(1 &le; X &le; 10,000,000)가 주어진다.</p>

### 출력

<p>첫째 줄에 분수를 출력한다.</p>