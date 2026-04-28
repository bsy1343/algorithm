# [Gold I] Automobil - 15362

[문제 링크](https://www.acmicpc.net/problem/15362)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 95, 정답: 38, 맞힌 사람: 28, 정답 비율: 38.356%

### 분류

수학, 구현

### 문제 설명

<p>Mirko has found a matrix with N rows and M columns at the back seat of his car. The first row of the matrix consists of numbers 1, 2, &hellip; M, the second row of numbers M+1, M+2, &hellip; 2&sdot;M and so on until the N th row which consists of numbers (N-1)&sdot;M + 1, (N-1)&sdot;M + 2, &hellip; N&sdot;M, respectively.</p>

<p>For example, for N = 3 and M = 4:</p>

<table class="table table-bordered" style="width:100%">
	<tbody>
		<tr>
			<td style="text-align:center; width:25%">1</td>
			<td style="text-align:center; width:25%">2</td>
			<td style="text-align:center; width:25%">3</td>
			<td style="text-align:center; width:25%">4</td>
		</tr>
		<tr>
			<td style="text-align:center; width:25%">5</td>
			<td style="text-align:center; width:25%">6</td>
			<td style="text-align:center; width:25%">7</td>
			<td style="text-align:center; width:25%">8</td>
		</tr>
		<tr>
			<td style="text-align:center; width:25%">9</td>
			<td style="text-align:center; width:25%">10</td>
			<td style="text-align:center; width:25%">11</td>
			<td style="text-align:center; width:25%">12</td>
		</tr>
	</tbody>
</table>

<p>Such matrix wasn&rsquo;t interesting enough to him, so he chose a row or a column K times and multiplied its values with a non-negative integer.</p>

<p>Naturally, now he wants to know the sum of all the values from the matrix. Since this sum can be very large, Mirko will be satisfied with the value modulo 10 9 + 7. Help Mirko answer this question.</p>

### 입력

<p>The first line of input contains the numbers N (1 &le; N &le; 1 000 000), M (1 &le; M &le; 1 000 000) and K (1 &le; K &le; 1000) from the task. Each of the following K lines describes:</p>

<ul>
	<li>Either the multiplication of the Xth row with Y, in the form of &quot;R X Y&quot;, where &ldquo;R&rdquo; represents row multiplication, X is a positive integer (1 &le; X &le; N), and Y is a non-negative integer (0 &le; Y &le; 10<sup>9</sup>).</li>
	<li>Or the multiplication of the Xth column with Y, in the form of &ldquo;S X Y&rdquo;, where &ldquo;S&rdquo; represents column multiplication, X is a positive integer (1 &le; X &le; M), and Y is a non-negative integer (0 &le; Y &le; 10<sup>9</sup>).</li>
</ul>

### 출력

<p>You must output the sum of the final values from the matrix modulo 10<sup>9</sup> + 7.</p>

### 힌트

<p>Clarification of the first test case:</p>

<p>After multiplying the second row with 4, the fourth column with 1, the third row with 2, and again the second row with 0, the final matrix looks like this:</p>

<table class="table table-bordered" style="width:100%">
	<tbody>
		<tr>
			<td style="text-align:center; width:25%">1</td>
			<td style="text-align:center; width:25%">2</td>
			<td style="text-align:center; width:25%">3</td>
			<td style="text-align:center; width:25%">4</td>
		</tr>
		<tr>
			<td style="text-align:center; width:25%">0</td>
			<td style="text-align:center; width:25%">0</td>
			<td style="text-align:center; width:25%">0</td>
			<td style="text-align:center; width:25%">0</td>
		</tr>
		<tr>
			<td style="text-align:center; width:25%">18</td>
			<td style="text-align:center; width:25%">20</td>
			<td style="text-align:center; width:25%">22</td>
			<td style="text-align:center; width:25%">24</td>
		</tr>
	</tbody>
</table>

<p>The sum of the elements from the final matrix is 1 + 2 + 3 + 4 + 0 + 0 + 0 + 0 + 18 + 20 + 22 + 24 = 94.</p>