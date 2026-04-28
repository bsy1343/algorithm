# [Platinum V] The Adventure in Panda Land Part I: Panda Number - 7809

[문제 링크](https://www.acmicpc.net/problem/7809)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 3, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

수학, 구현, 많은 조건 분기

### 문제 설명

<p>In Panda Land, pandas have their own numeral system to represent a number. Surprisingly, this numeral system is similar to the famous Roman Numerals in our ancient civilization. Although pandas are aware about numeral system, they can not write (imagine how can a panda write!). Instead, they cut and arrange bamboos to form a number.</p>

<p>These are the production rules of Panda Number:</p>

<ul>
	<li>Letters which represent powers-of-ten (I, X, C, M, W, Y, H, A) can be repeated at most three times. The others (V, L, N, E, F, K, T) can not be repeated.</li>
	<li>If one or more letters are placed after another letter of greater value, add that amount. The letters should be written in descending order from the largest to the least value. For example:
	<ul>
		<li>FXVIII = 50000 + 10 + 5 + 1 + 1 + 1 = 50018</li>
	</ul>
	</li>
	<li>If a letter is placed before another letter of greater value, subtract that amount. Only subtract one letter from another. For example:
	<ul>
		<li>XIV = 10 + (5 - 1) = 14</li>
		<li>CIX = 100 + (10 - 1) = 109</li>
		<li>MECIX = (5000 - 1000) + 100 + (10 - 1) = 4109</li>
	</ul>
	</li>
	<li>Only powers-of-ten can be used to subtract a value (that is, you can subtract I from V, or X from L, but not V from X (V is not powers-of-ten.)</li>
	<li>Do not subtract a letter from one that is more than 10 times greater (that is, you can subtract I from X, but not I from L &ndash; there is no such number as IL.)</li>
</ul>

<p>The aforementioned rules imply that there is exactly one representation in Panda Number for each number in decimal system.</p>

<p>Unlike those Roman Numerals, pandas do recognize zero and negative number (which prove pandas are more advanced than our ancient Romans). To represent a negative number, they add one bamboo as a negative sign in front of the letters. Zero is a special number which doesn&#39;t fall into any rules above. To form a zero, pandas need five bamboos.</p>

<p>The number of bamboos needed to form a number is the sum of required bamboos for each letter that appears in that number. For Example:</p>

<ul>
	<li>4108 = 4000+100+8 = (5000-1000)+100+5+1+1+1 = MECVIII (16 bamboos).</li>
	<li>4109 = 4000+100+9 = (5000-1000)+100+(10-1) = MECIX (14 bamboos).</li>
	<li>-205 = [-], 200+5 = 100+100+ 5 = -CCV (9 bamboos)</li>
</ul>

<p>Given two numbers A and B, find out how many bamboos needed by panda to form (remember, they can&#39;t write) all number between A and B inclusively.</p>

<table class="table table-bordered" style="width:40%">
	<thead>
		<tr>
			<th>Decimal</th>
			<th>Panda Number</th>
			<th>Required Bamboo</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1</td>
			<td>I</td>
			<td>1</td>
		</tr>
		<tr>
			<td>5</td>
			<td>V</td>
			<td>2</td>
		</tr>
		<tr>
			<td>10</td>
			<td>X</td>
			<td>2</td>
		</tr>
		<tr>
			<td>50</td>
			<td>L</td>
			<td>2</td>
		</tr>
		<tr>
			<td>100</td>
			<td>C</td>
			<td>3</td>
		</tr>
		<tr>
			<td>500</td>
			<td>N</td>
			<td>3</td>
		</tr>
		<tr>
			<td>1,000</td>
			<td>M</td>
			<td>4</td>
		</tr>
		<tr>
			<td>5,000</td>
			<td>E</td>
			<td>4</td>
		</tr>
		<tr>
			<td>10,000</td>
			<td>W</td>
			<td>4</td>
		</tr>
		<tr>
			<td>50,000</td>
			<td>F</td>
			<td>3</td>
		</tr>
		<tr>
			<td>100,000</td>
			<td>Y</td>
			<td>3</td>
		</tr>
		<tr>
			<td>500,000</td>
			<td>K</td>
			<td>3</td>
		</tr>
		<tr>
			<td>1,000,000</td>
			<td>H</td>
			<td>3</td>
		</tr>
		<tr>
			<td>5,000,000</td>
			<td>T</td>
			<td>2</td>
		</tr>
		<tr>
			<td>10,000,000</td>
			<td>A</td>
			<td>3</td>
		</tr>
	</tbody>
</table>

### 입력

<p>The input begins with a single positive integer T in a line indicating the number of test cases. Each case contains two numbers A and B (-25,000,000 &lt;= A &lt;= B &lt;= 25,000,000) in a line.</p>

<p>&nbsp;</p>

### 출력

<p>For each case, print in a single line the number of needed bamboos to form all numbers between A and B (inclusive).</p>

<p>&nbsp;</p>