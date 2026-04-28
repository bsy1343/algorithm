# [Bronze I] Converting Romans - 30434

[문제 링크](https://www.acmicpc.net/problem/30434)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 145, 정답: 71, 맞힌 사람: 63, 정답 비율: 50.806%

### 분류

구현, 문자열

### 문제 설명

<p>The Roman numerals are a numeral system that originated in ancient Rome and was widely used throughout Europe well into the Late Middle Ages. It differs from the Arabic system that we mostly use today in that numbers are written with combinations of letters from the Latin alphabet, where each letter is assigned a fixed integer value.  Over the years many different letters were used, which was a cause of frequent confusion.  But &quot;modern&quot; style uses only these seven:</p>

<table class="table table-bordered table-center-50 td-center th-center">
	<tbody>
		<tr>
			<th>I</th>
			<th>V</th>
			<th>X</th>
			<th>L</th>
			<th>C</th>
			<th>D</th>
			<th>M</th>
		</tr>
		<tr>
			<td>1</td>
			<td>5</td>
			<td>10</td>
			<td>50</td>
			<td>100</td>
			<td>500</td>
			<td>1000</td>
		</tr>
	</tbody>
</table>

<p>A very common misunderstanding of the Roman numerals is that they use a universal subtractive syntax. In a subtractive syntax, a lower digit written before a larger digit will be subtracted from the larger digit. 4 can be written as IIII and IV $(5-1)$. Romans themselves only really used the subtractive syntax for smaller numbers. For larger numbers, it was largely avoided, to give more clarity. For example, $499$ can be written LDVLIV, XDIX, VDIV or ID, while older sources most likely would use CDXCIX. Ain&#39;t Roman numbers fun?</p>

<p>You are given $n$ numbers written in the Roman numeral system, and your task is to convert them to the regular Arabic number system.</p>

<p>For the purposes of this problem we will subtract any digit written to the left of a larger digit, even if they are not directly adjacent.</p>

### 입력

<p>The inputs starts with an integer $0 &lt; n \leq 10^3$. Then follow $n$ lines, each containing up to $3 \cdot 10^5$ Roman digits. The total number of Roman digits in the input is at most $3 \cdot 10^5$.</p>

### 출력

<p>Output the corresponding Arabic numbers, one number per line.</p>