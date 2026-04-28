# [Platinum I] IXth Problem - 23775

[문제 링크](https://www.acmicpc.net/problem/23775)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 8, 맞힌 사람: 8, 정답 비율: 29.630%

### 분류

구현, 이분 탐색, 많은 조건 분기, 매개 변수 탐색

### 문제 설명

<p>Emily recently learned about the Roman Empire and its civilization at school. One aspect that was especially fascinating to her is the number system that they used, the <em>Roman numerals</em>. The Roman number system uses seven distinct digits, each representing a different value and denoted by a letter, where <code>I</code> is $1$, <code>V</code> is $5$, <code>X</code> is $10$, <code>L</code> is $50$, <code>C</code> is $100$, <code>D</code> is $500$ and <code>M</code> is $1\,000$. Multiples of $1$, $10$, $100$ and $1\,000$ are then written according to the following table:</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<th>$\times$</th>
			<th>$1$</th>
			<th>$2$</th>
			<th>$3$</th>
			<th>$4$</th>
			<th>$5$</th>
			<th>$6$</th>
			<th>$7$</th>
			<th>$8$</th>
			<th>$9$</th>
		</tr>
		<tr>
			<th>$1$</th>
			<td><code>I</code></td>
			<td><code>II</code></td>
			<td><code>III</code></td>
			<td><code>IV</code></td>
			<td><code>V</code></td>
			<td><code>VI</code></td>
			<td><code>VII</code></td>
			<td><code>VIII</code></td>
			<td><code>IX</code></td>
		</tr>
		<tr>
			<th>$10$</th>
			<td><code>X</code></td>
			<td><code>XX</code></td>
			<td><code>XXX</code></td>
			<td><code>XL</code></td>
			<td><code>L</code></td>
			<td><code>LX</code></td>
			<td><code>LXX</code></td>
			<td><code>LXXX</code></td>
			<td><code>XC</code></td>
		</tr>
		<tr>
			<th>$100$</th>
			<td><code>C</code></td>
			<td><code>CC</code></td>
			<td><code>CCC</code></td>
			<td><code>CD</code></td>
			<td><code>D</code></td>
			<td><code>DC</code></td>
			<td><code>DCC</code></td>
			<td><code>DCCC</code></td>
			<td><code>CM</code></td>
		</tr>
		<tr>
			<th>$1\,000$</th>
			<td><code>M</code></td>
			<td><code>MM</code></td>
			<td><code>MMM</code></td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
	</tbody>
</table>

<p>Most of the numerals in this table are formed additively, i.e. by summing the values of the digits. For example, <code>LXX</code> is $50+10+10=70$. Columns $4$ and $9$, however, use so-called subtractive notation, where <code>IV</code> is read as $5-1$, <code>IX</code> is read as $10-1$, and so on.</p>

<p>Each number from $1$ to $3\,999$ is written as a combination of numerals from the table, using at most one numeral from each row and going from bottom to top. For instance, $2\,021$ is <code>MMXXI</code> and $594$ is <code>DXCIV</code>. Note that in this number system it is not possible to write numbers greater than $3\,999$ and also that subtractive notation can only be used in the six cases above (e.g. <code>IC</code> is not considered a valid Roman numeral).</p>

<p>Emily found a bunch of old Scrabble sets in her attic. She threw out all the tiles with letters other than the Roman digits and started forming Roman numerals from the remaining tiles. It is easy to form valid numerals from the tiles by using just one tile per numeral, but what is the minimal number of numerals that can be formed while still using all the available tiles?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with seven integers $m$, $d$, $c$, $\ell$, $x$, $v$ and $i$ ($0 \le m,d,c,\ell,x,v,i \le 10^{18}$), which respectively are the number of <code>M</code>, <code>D</code>, <code>C</code>, <code>L</code>, <code>X</code>, <code>V</code> and <code>I</code> tiles that must be used.</li>
</ul>

<p>There is at least one tile, that is $m+d+c+\ell+x+v+i \ge 1$.</p>

### 출력

<p>Output an integer $n$, the minimal possible number of Roman numerals that can be formed while using all of the tiles in the input. Then output an optimal solution in the following format.</p>

<ul>
	<li>An integer $k$, the number of distinct Roman numerals used in this solution.</li>
	<li>$k$ pairs of a Roman numeral and a positive integer indicating how often this numeral is used in this solution.</li>
</ul>

<p>The solution must consist of exactly $n$ numerals in total and must use exactly the specified number of each letter. The $k$ Roman numerals in the solution must be distinct. You do not need to minimize $k$. If there is more than one optimal solution, any one of them will be accepted.</p>