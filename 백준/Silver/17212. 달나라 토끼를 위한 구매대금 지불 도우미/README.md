# [Silver III] 달나라 토끼를 위한 구매대금 지불 도우미 - 17212

[문제 링크](https://www.acmicpc.net/problem/17212)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 4713, 정답: 2364, 맞힌 사람: 1929, 정답 비율: 50.710%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>달나라 토끼들이 사용하는 화폐는 동전뿐이다. 동전의 종류는 1원, 2원, 5원, 7원 이렇게&nbsp;4종류가 있다. 물건을 사고 동전으로 계산을 하는데 동전의 개수가 최소가 되도록 지불하지 않는 것은&nbsp;불법이다. 예를 들어, 17원을 지불할 때&nbsp;7원짜리 동전 1개와 5원짜리 동전 2개로 지불해야 합법이고,&nbsp;7원짜리 동전 2개와 2원짜리 동전&nbsp;1개, 1원짜리 동전 1개로 지불해도 17원이 되지만, 총 동전의 개수가 4개가 되어 최소 개수가 아니므로 불법이다.</p>

<p>지불 금액을 입력받아&nbsp;합법이 되는&nbsp;동전 개수를 출력으로 내어주는 프로그램을 작성해보자.</p>

### 입력

<p>첫 번째 줄에 달나라 토끼가 지불해야하는 금액 N(0 &le; N&nbsp;&le; 100,000)이 주어진다.</p>

### 출력

<p>첫 번째 줄에 달나라 토끼가 합법적으로 낼 수 있는 동전의 개수를 출력한다.</p>

### 힌트

<table class="table table-bordered" style="width: 100%;">
	<tbody>
		<tr>
			<td style="text-align: center;">지불 금액</td>
			<td style="text-align: center;">합법 지불</td>
			<td style="text-align: center;">불법 지불(예)</td>
		</tr>
		<tr>
			<td style="text-align: center;">12원</td>
			<td style="text-align: center;">7원 x 1개 + 5원 x 1개</td>
			<td style="text-align: center;">5원 x 2개 + 2원 x 1개</td>
		</tr>
		<tr>
			<td style="text-align: center;">17원</td>
			<td style="text-align: center;">7원 x 1개 + 5원 x 2개</td>
			<td style="text-align: center;">7원 x 2개 + 2원 x 1개 + 1원 x 1개</td>
		</tr>
		<tr>
			<td style="text-align: center;">21원</td>
			<td style="text-align: center;">7원 x 3개</td>
			<td style="text-align: center;">7원 x 2개 + 5원 x 1개 + 2원 x 1개</td>
		</tr>
	</tbody>
</table>