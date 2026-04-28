# [Gold III] Stringer - 4725

[문제 링크](https://www.acmicpc.net/problem/4725)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 28, 정답: 8, 맞힌 사람: 5, 정답 비율: 50.000%

### 분류

수학, 구현, 문자열, 조합론, 재귀

### 문제 설명

<p>Imagine a list of strings that are all built from the first N letters of the alphabet, which all have a predetermined number of a&rsquo;s, a predetermined (but possibly different) number of b&rsquo;s, and so on. Imagine that it&rsquo;s sorted in alphabetical order, and numbered, starting at 0. What&rsquo;s the Kth string in the list?</p>

<p>For example, look at all strings of a&rsquo;s and b&rsquo;s (N=2) with 2 a&rsquo;s and 3 b&rsquo;s:</p>

<table class = "table table-bordered" style="width : 50%;">
	<tbody>
		<tr>
			<td>0: aabbb</td>
			<td>5: babab</td>
		</tr>
		<tr>
			<td>1: ababb</td>
			<td>6: babba</td>
		</tr>
		<tr>
			<td>2: abbab</td>
			<td>7: bbaab</td>
		</tr>
		<tr>
			<td>3: abbba</td>
			<td>8: bbaba</td>
		</tr>
		<tr>
			<td>4: baabb</td>
			<td>9: bbbaa</td>
		</tr>
	</tbody>
</table>

<p>If K=5, then the K<sup>th</sup> string in the list would be babab.</p>

### 입력

<p>Input will consist of multiple datasets. Each dataset consists of two lines.</p>

<p>On the first line are two integers, N (1 &le; N &le; 20) and K (0 &le; K &lt; m), where N is the<br />
number of letters of the alphabet used, K is the index of the list element that should be found, and m (not given explicitly in the input) denotes the number of strings make up the list.</p>

<p>m, the number of strings in the list may be very, very large (too large to permit generating the whole list), but the input will be chosen so that m and K will each fit in a 32 bit integer.</p>

<p>On the second line will be N non-negative integers, which represent the number of a&rsquo;s, the number of b&rsquo;s and so on. The sum of these integers is guaranteed to be at least 1 and no greater than 50.</p>

<p>End of input is indicated by a line with two zeros.</p>

### 출력

<p>Output each answer string on its own line. Do not print any extra white space. Do not print any blank lines between answers.</p>

<p>&nbsp;</p>