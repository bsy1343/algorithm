# [Gold V] CIVIC DILL MIX - 4060

[문제 링크](https://www.acmicpc.net/problem/4060)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 22, 맞힌 사람: 18, 정답 비율: 72.000%

### 분류

수학, 구현, 문자열

### 문제 설명

<p>Roman numerals are an ancient numbering system used extensively throughout Europe through the 13th century (where it was eventually replaced by our current positional system). Vestiges of this system still exist today on clock faces, building cornerstones, Super Bowls and Star Wars episodes. The system uses the following 7 symbols:</p>

<table class="table table-bordered" style="width:30%">
	<thead>
		<tr>
			<th>Symbol</th>
			<th>I</th>
			<th>V</th>
			<th>X</th>
			<th>L</th>
			<th>C</th>
			<th>D</th>
			<th>M</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th>Value</th>
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

<p>Symbols I, X, C and M can be repeated as needed (though never more than three times for I, X and C), so that 3 is represented as III, 27 as XXVII and 4865 as MMMMDCCCLXV. The symbols are always written from the highest value to the lowest, but for one exception: if a lower symbol precedes a higher one, it is subtracted from the higher. Thus 4 is written not as IIII but as IV, and 900 is written as CM.</p>

<p>The rules for this subtractive behavior are the following:</p>

<ol>
	<li>Only I, X and C can be subtracted.</li>
	<li>These numbers can only appear once in their subtractive versions (e.g., you can&rsquo;t write 8 as IIX).</li>
	<li>Each can only come before symbols that are no larger than 10 times their value. Thus we can not write IC for 99 or XD for 490 (these would be XCIX and CDXC, respectively). Note that the first two words in this problem title are invalid Roman numerals, but the third is fine.&nbsp;</li>
</ol>

<p>Your task for this problem is simple: read in a set of Roman numeral values and output their sum as a Roman numeral.</p>

### 입력

<p>Input will consist of multiple test cases. Each test case starts with a positive integer n indicating the number of values to add. After this will come n values (potentially several on a line), all valid Roman numerals with whitespace only coming between values. A value of n = 0 will indicate end of input. All sums will be less than 5000.</p>

### 출력

<p>For each test case, output the case number and the sum, both as Roman numerals, using the format shown below. Case numbers should start at I.</p>