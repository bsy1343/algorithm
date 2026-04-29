# [Silver I] Fixing Figures - 34370

[문제 링크](https://www.acmicpc.net/problem/34370)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 25, 정답: 13, 맞힌 사람: 10, 정답 비율: 45.455%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>You have just been hired to the Fixing Good lawyer team as an editor. Your boss, Saul Badman, is an incredible lawyer, but has one small quirk: he always forgets to spell out numbers as words in his reports.</p>

<p>It is customary in formal documents to write out numbers, and unfortunately for Saul, he is dealing with lawsuits which involve lots of numbers. Saul forgets to write out numbers so often that you decide it would be easier to write a program that does the job.</p>

<p>Your task is to translate a given number into the corresponding English word(s). For instance, $5280$ becomes "five thousand two hundred eighty".</p>

<p>If a number is in the ones place after a number in the tens place, it should have a dash between the words representing the tens and ones places, such as $45$ becoming "forty-five". This rule applies to thousands as well, such as "forty-five thousand".</p>

<p>You should not include "and" nor "," in your answer.</p>

<p>For a full word to number reference, view the following tables:</p>

<table class="table table-bordered table-center-10 td-center th-center">
	<tbody>
		<tr>
			<th> </th>
			<th>Ones</th>
		</tr>
		<tr>
			<td>$0$</td>
			<td>zero</td>
		</tr>
		<tr>
			<td>$1$</td>
			<td>one</td>
		</tr>
		<tr>
			<td>$2$</td>
			<td>two</td>
		</tr>
		<tr>
			<td>$3$</td>
			<td>three</td>
		</tr>
		<tr>
			<td>$4$</td>
			<td>four</td>
		</tr>
		<tr>
			<td>$5$</td>
			<td>five</td>
		</tr>
		<tr>
			<td>$6$</td>
			<td>six</td>
		</tr>
		<tr>
			<td>$7$</td>
			<td>seven</td>
		</tr>
		<tr>
			<td>$8$</td>
			<td>eight</td>
		</tr>
		<tr>
			<td>$9$</td>
			<td>nine</td>
		</tr>
	</tbody>
</table>

<table class="table table-bordered table-center-20 td-center th-center">
	<tbody>
		<tr>
			<th> </th>
			<th>Teens</th>
		</tr>
		<tr>
			<td>$11$</td>
			<td>eleven</td>
		</tr>
		<tr>
			<td>$12$</td>
			<td>twelve</td>
		</tr>
		<tr>
			<td>$13$</td>
			<td>thirteen</td>
		</tr>
		<tr>
			<td>$14$</td>
			<td>fourteen</td>
		</tr>
		<tr>
			<td>$15$</td>
			<td>fifteen</td>
		</tr>
		<tr>
			<td>$16$</td>
			<td>sixteen</td>
		</tr>
		<tr>
			<td>$17$</td>
			<td>seventeen</td>
		</tr>
		<tr>
			<td>$18$</td>
			<td>eighteen</td>
		</tr>
		<tr>
			<td>$19$</td>
			<td>nineteen</td>
		</tr>
	</tbody>
</table>

<table class="table table-bordered table-center-20 td-center th-center">
	<tbody>
		<tr>
			<th> </th>
			<th>Tens</th>
		</tr>
		<tr>
			<td>$10$</td>
			<td>ten</td>
		</tr>
		<tr>
			<td>$20$</td>
			<td>twenty</td>
		</tr>
		<tr>
			<td>$30$</td>
			<td>thirty</td>
		</tr>
		<tr>
			<td>$40$</td>
			<td>forty</td>
		</tr>
		<tr>
			<td>$50$</td>
			<td>fifty</td>
		</tr>
		<tr>
			<td>$60$</td>
			<td>sixty</td>
		</tr>
		<tr>
			<td>$70$</td>
			<td>seventy</td>
		</tr>
		<tr>
			<td>$80$</td>
			<td>eighty</td>
		</tr>
		<tr>
			<td>$90$</td>
			<td>ninety</td>
		</tr>
	</tbody>
</table>

<p>Powers of Ten</p>

<table class="table table-bordered table-center-20 td-center th-center">
	<tbody>
		<tr>
			<td>$10^2$</td>
			<td>hundred</td>
		</tr>
		<tr>
			<td>$10^3$</td>
			<td>thousand</td>
		</tr>
		<tr>
			<td>$10^6$</td>
			<td>million</td>
		</tr>
	</tbody>
</table>

<p>Also note that if a number is negative, the word "negative" should be prepended to the front of the resulting written number.</p>

### 입력

<p>The first line of input will be an integer $1 \leq N \leq 1\,000$, the number of numbers you are to convert to English word(s) The next $N$ lines will each contain an integer $X_i$ in the range $[-9\,999\,999, 9\,999\,999]$, the $i^\text{th}$ number you are to convert. Numbers are guaranteed to be integers.</p>

### 출력

<p>The program should output $N$ lines, with the $i^\text{th}$ line containing the English word(s) for the number $X_i$ from the input.</p>