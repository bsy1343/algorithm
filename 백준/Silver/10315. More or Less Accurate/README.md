# [Silver I] More or Less Accurate - 10315

[문제 링크](https://www.acmicpc.net/problem/10315)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 52, 정답: 17, 맞힌 사람: 17, 정답 비율: 35.417%

### 분류

수학, 구현

### 문제 설명

<p>During the last 20 years, the Czech Technical University organized not only 20 nation-wide (and later even international) competitions known as CTU Open but also 7 internal competitions of the Faculty of Electrical Engineering (FEL++) and 5 Central Europe Regional Contests (CERC, in 1998, 1999, 2000, 2007, and 2011). As one of the original organizers has pointed out, together there were 0x20 contests during those 20 years (not speaking about hosting the World Finals in 2004). Seven years ago, in CERC 2007, the contestants were given a problem called Weird Numbers dealing with numeric systems using a negative base. The problem assignment said:</p>

<hr />
<p>A number N written in the system with a positive base R will always appear as a string of digits between 0 and R - 1, inclusive. A digit at the position P (positions are counted from right to left and starting with zero) represents a value of RP . This means the value of the digit is multiplied by R<sup>P</sup> and values of all positions are summed together. For example, if we use the octal system (radix R = 8), a number written as 17024 has the following value:</p>

<p style="text-align:center">1 &middot; 8<sup>4</sup> + 7 &middot; 8<sup>3</sup> + 0 &middot; 8<sup>2</sup> + 2 &middot; 8<sup>1</sup> + 4 &middot; 8<sup>0</sup> = 1 &middot; 4096 + 7 &middot; 512 + 2 &middot; 8 + 4 &middot; 1 = 7700</p>

<p>With a negative radix -R, the principle remains the same: each digit will have a value of (-R)<sup>P</sup>.</p>

<p>For example, a negaoctal (radix -R = -8) number 17024 counts as:</p>

<p style="text-align:center">1 &middot; (-8)<sup>4</sup> + 7 &middot; (-8)<sup>3</sup> + 0 &middot; (-8)<sup>2</sup> + 2 &middot; (-8)<sup>1</sup> + 4 &middot; (-8)<sup>0</sup> = 1 &middot; 4096 - 7 &middot; 512 - 2 &middot; 8 + 4 &middot; 1 = 500</p>

<p>One big advantage of systems with a negative base is that we do not need a minus sign to express negative numbers. A couple of examples for the negabinary system (-R = -2):</p>

<table class="table table-bordered" style="width:60%">
	<thead>
		<tr>
			<th>decimal</th>
			<th>negabinary</th>
			<th>decimal</th>
			<th>negabinary</th>
			<th>decimal</th>
			<th>negabinary</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>-10</td>
			<td>1010</td>
			<td>-3</td>
			<td>1101</td>
			<td>4</td>
			<td>100</td>
		</tr>
		<tr>
			<td>-9</td>
			<td>1011</td>
			<td>-2</td>
			<td>10</td>
			<td>5</td>
			<td>101</td>
		</tr>
		<tr>
			<td>-8</td>
			<td>1000</td>
			<td>-1</td>
			<td>11</td>
			<td>6</td>
			<td>11010</td>
		</tr>
		<tr>
			<td>-7</td>
			<td>1001</td>
			<td>0</td>
			<td>0</td>
			<td>7</td>
			<td>11011</td>
		</tr>
		<tr>
			<td>-6</td>
			<td>1110</td>
			<td>1</td>
			<td>1</td>
			<td>8</td>
			<td>11000</td>
		</tr>
		<tr>
			<td>-5</td>
			<td>1111</td>
			<td>2</td>
			<td>110</td>
			<td>9</td>
			<td>11001</td>
		</tr>
		<tr>
			<td>-4</td>
			<td>1100</td>
			<td>3</td>
			<td>111</td>
			<td>10</td>
			<td>11110</td>
		</tr>
	</tbody>
</table>

<p>You may notice that the negabinary representation of any integer number is unique, if no &ldquo;leading zeros&rdquo; are allowed. The only number that can start with the digit &ldquo;0&rdquo; is the zero itself.</p>

<hr />
<p>Today, we are interested whether there were any contestants&rsquo; answers in 2007 that were almost correct, i.e., their program output was different from the correct answer only by one. Will you help us to find out?</p>

### 입력

<p>The input contains several test cases. Each test case is given on a single line containing number X written in the negabinary notation. The line contains N (1 &le; N &le; 10<sup>6</sup>) characters &ldquo;0&rdquo; or &ldquo;1&rdquo; representing the negabinary bits a<sub>N-1</sub>...a<sub>1</sub>a<sub>0</sub> respectively. Numbers will be given to you without leading zeros, i.e., for each input where X&nbsp;&ne;&nbsp;0 it holds that a<sub>N-1</sub> = 1.</p>

### 출력

<p>For each test case, print a single line with number (X + 1) written in the negabinary notation. Output the number without any leading zeros.</p>