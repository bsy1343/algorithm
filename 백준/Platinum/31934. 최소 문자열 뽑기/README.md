# [Platinum II] 최소 문자열 뽑기 - 31934

[문제 링크](https://www.acmicpc.net/problem/31934)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 153, 정답: 21, 맞힌 사람: 19, 정답 비율: 20.652%

### 분류

자료 구조, 그리디 알고리즘, 스택

### 문제 설명

<p>크기가 $N$ x $M$인 2차원 배열이 주어진다. 배열의 원소의 값은 알파벳 소문자이다.</p>

<p>배열에서 문자열을 뽑으려 하는데, 방식은 다음과 같다. 먼저 $M$개의 열 중 $K$개의 열을 가린 뒤, 배열에 보이는 원소들을 좌측 상단부터 우측 하단까지 알파벳을 이어 붙인다. 이때 먼저 열이 증가하고 그 다음 행이 증가하는 순서대로 붙인다.</p>

<p>예를 들어, 아래에 다음과 같은 2차원 배열이 존재하고 $K=1$일 때, 뽑을 수 있는 문자열은 cbudqr, abzdpr, aczupq로 총 $3$가지 이다.</p>

<table class="table table-bordered table-center-30 td-center">
	<tbody>
		<tr>
			<td><strong>a</strong></td>
			<td><strong>c</strong></td>
			<td><strong>b</strong></td>
		</tr>
		<tr>
			<td><strong>z</strong></td>
			<td><strong>u</strong></td>
			<td><strong>d</strong></td>
		</tr>
		<tr>
			<td><strong>p</strong></td>
			<td><strong>q</strong></td>
			<td><strong>r</strong></td>
		</tr>
	</tbody>
</table>

<p>$K$개의 열을 모두 가려야 하며 어떤 열을 가릴지에 따라 다양한 문자열이 나올 수 있다. 이때, 사전 순으로 가장 앞서는 문자열을 구해보자.</p>

### 입력

<p>입력의 첫 줄에 $2$차원 배열의 크기를 나타내는 $N,M$과 가려야 하는 열의 개수를 나타내는 $K$가 공백으로 구분되어 정수로 주어진다.$(1 \le N \le 1\,000\,000;$ $2 \le M \le 1\,000\,000;$ $2 \le N \times M \le 2\,000\,000;$ $1 \le K &lt; M)$</p>

<p>입력의 두 번째 줄부터 $N$개의 줄에 각 줄마다 $M$개의 알파벳 소문자가 공백으로 구분되어 주어진다.</p>

### 출력

<p>뽑을 수 있는 문자열 중 사전 순으로 가장 앞서는 문자열을 출력한다.</p>