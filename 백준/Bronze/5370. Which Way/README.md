# [Bronze II] Which Way - 5370

[문제 링크](https://www.acmicpc.net/problem/5370)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 216, 정답: 132, 맞힌 사람: 105, 정답 비율: 58.333%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>You are trapped in Jabba&rsquo;s Palace. You have a coded map that describes the way out from your current location. The map contains a sequence of positive integers. Each integer corresponds to one of three directions (left, straight, right). To determine the direction you must convert the number into binary (base two with no leading 0s). If the binary number has more 0&rsquo;s than 1&rsquo;s go left. If the binary number has the same number of 0&rsquo;s and 1&rsquo;s go straight, and if it has more 1&rsquo;s than 0&rsquo;s go right. Your job is to read the sequence of positive integers and print the directions to find your way out.</p>

<p>Here are three example of converting positive (decimal) integers into binary and then into a direction.</p>

<table class="table table-bordered table-center-20">
	<tbody>
		<tr>
			<th>Decimal</th>
			<th>Binary</th>
			<th>Direction</th>
		</tr>
		<tr>
			<td><code>17 </code></td>
			<td><code>10001</code></td>
			<td><code>left </code></td>
		</tr>
		<tr>
			<td><code>9 </code></td>
			<td><code>1001</code></td>
			<td><code>straight</code></td>
		</tr>
		<tr>
			<td><code>22 </code></td>
			<td><code>10110</code></td>
			<td><code>right</code></td>
		</tr>
	</tbody>
</table>

### 입력

<p>A sequence of positive integers, one per line</p>

### 출력

<p>The correct directions (left, straight, right) for escaping the Jabba&rsquo;s Palace. You should write each move (left, straight, right) on a separate line with no extra lines.</p>