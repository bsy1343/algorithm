# [Gold I] Magic Bitstrings - 4292

[문제 링크](https://www.acmicpc.net/problem/4292)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 11, 맞힌 사람: 11, 정답 비율: 84.615%

### 분류

수학, 정수론

### 문제 설명

<p>A bitstring, whose length is one less than a prime, might be magic. 1001 is one such string. In order to see the magic in the string let us append a non-bit x to it, regard the new thingy as a cyclic string, and make this square matrix of bits</p>

<table class="table table-bordered" style="width:20%">
	<tbody>
		<tr>
			<th>each bit</th>
			<td><code>1001</code></td>
		</tr>
		<tr>
			<th>every 2nd bit</th>
			<td><code>0110</code></td>
		</tr>
		<tr>
			<th>every 3rd bit</th>
			<td><code>0110</code></td>
		</tr>
		<tr>
			<th>every 4th bit</th>
			<td><code>1001</code></td>
		</tr>
	</tbody>
</table>

<p>This matrix has the same number of rows as the length of the original bitstring. The m-th row of the matrix has every m-th bit of the original string starting with the m-th bit. Because the enlarged thingy has prime length, the appended x never gets used.</p>

<p>If each row of the matrix is either the original bitstring or its complement, the original bitstring is magic.</p>

### 입력

<p>Each line of input (except last) contains a prime number p &le; 100000. The last line contains 0 and this line should not be processed.</p>

### 출력

<p>For each prime number from the input produce one line of output containing the lexicographically smallest, non-constant magic bitstring of length p-1, if such a string exists, otherwise output Impossible.</p>