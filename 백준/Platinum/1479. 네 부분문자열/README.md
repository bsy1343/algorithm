# [Platinum III] 네 부분문자열 - 1479

[문제 링크](https://www.acmicpc.net/problem/1479)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 282, 정답: 72, 맞힌 사람: 53, 정답 비율: 30.994%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>어떤 문자열 S와, S의 부분문자열 a, b, c, d가 주어졌을 때, 각각의 부분문자열 a, b, c, d가 S와 어디에서 겹쳐졌는지 구해보자. 이때, S의 어떤 위치에 있는 문자가 a, b, c, d중 하나에 속했을 때, 이 문자를 가릴 수 있다고 한다. (겹치는 것도 가능하다.)</p>

<p>예를 들어, S = foursubstrings이고, a = our, b = s, c = ring, d = sub라고 했을 때,</p>

<table class="table table-bordered" style="width: 42%;">
	<tbody>
		<tr>
			<td style="width: 3%;">f</td>
			<td style="width: 3%;">o</td>
			<td style="width: 3%;">u</td>
			<td style="width: 3%;">r</td>
			<td style="width: 3%;">s</td>
			<td style="width: 3%;">u</td>
			<td style="width: 3%;">b</td>
			<td style="width: 3%;">s</td>
			<td style="width: 3%;">t</td>
			<td style="width: 3%;">r</td>
			<td style="width: 3%;">i</td>
			<td style="width: 3%;">n</td>
			<td style="width: 3%;">g</td>
			<td style="width: 3%;">s</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>o</td>
			<td>u</td>
			<td>r</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>s</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>r</td>
			<td>i</td>
			<td>n</td>
			<td>g</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>s</td>
			<td>u</td>
			<td>b</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>+</td>
			<td>+</td>
			<td>+</td>
			<td>+</td>
			<td>+</td>
			<td>+</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>+</td>
			<td>+</td>
			<td>+</td>
			<td>+</td>
			<td>&nbsp;</td>
		</tr>
	</tbody>
</table>

<p>가장 위의 문자열은 S이고, 그 밑에는 차례대로 a, b, c, d이다. 가장 마지막의 +는 가려진 문자를 말한다.</p>

<p>가려진 문자의 최솟값과 최댓값을 출력하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 문자열 S가 주어진다. S의 길이는 2500보다 작거나 같다. 둘째 줄부터 다섯째 줄에는 부분 문자열 a, b, c, d가 한 줄에 하나씩 차례대로 주어진다. 부분문자열의 길이는 50보다 작거나 같다. 모든 문자열은 소문자로만 이루어져 있다.</p>

### 출력

<p>첫째 줄에 가려지는 문자열의 개수의 최솟값과 최댓값을 공백을 사이에 두고 구분해서 출력한다.</p>

### 힌트

<p>ABACaba로 가리면 4개를 가릴 수 있고 (대문자가 가려진 문자), ABACaBA로 가리면 6개를 가릴 수 있다.</p>