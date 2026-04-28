# [Gold IV] Playoff by all the teams - 16035

[문제 링크](https://www.acmicpc.net/problem/16035)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 39, 맞힌 사람: 38, 정답 비율: 55.882%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>The Minato Mirai Football Association hosts its annual championship as a single round-robin tournament, in which each team plays a single match against all the others. Unlike many other round-robin tournaments of football, matches never result in a draw in this tournament. When the regular time match is a tie, overtime is played, and, when it is a tie again, a penalty shootout is played to decide the winner.</p>

<p>If two or more teams won the most number of matches in the round-robin, a playoff is conducted among them to decide the champion. However, if the number of teams is an odd number, it is possible that all the teams may have the same number of wins and losses, in which case all the teams participate in the playoff, called a &quot;full playoff&quot; here.</p>

<p>Now, some of the tournament matches have already been played and we know their results. Whether or not a full playoff will be required may depend on the results of the remaining matches. Write a program that computes the number of win/loss combination patterns of the remaining matches that lead to a full playoff.</p>

<p>The first datatset of the Sample Input represents the results of the first three matches in a round-robin tournament of five teams, shown in the following table. In the table, gray cells indicate the matches not played yet.</p>

<table class="table table-bordered" style="width: 60%;">
	<tbody>
		<tr>
			<th style="text-align: center;">Team \ Against</th>
			<th style="text-align: center;">Team<sub>1</sub></th>
			<th style="text-align: center;">Team<sub>2</sub></th>
			<th style="text-align: center;">Team<sub>3</sub></th>
			<th style="text-align: center;">Team<sub>4</sub></th>
			<th style="text-align: center;">Team<sub>5</sub></th>
		</tr>
		<tr>
			<th style="text-align: center;">Team<sub>1</sub></th>
			<td>&nbsp;</td>
			<td style="background-color:#cccccc">&nbsp;</td>
			<td style="background-color:#cccccc">&nbsp;</td>
			<td style="text-align: center;">lost</td>
			<td style="text-align: center;">lost</td>
		</tr>
		<tr>
			<th style="text-align: center;">Team<sub>2</sub></th>
			<td style="background-color:#cccccc">&nbsp;</td>
			<td>&nbsp;</td>
			<td style="text-align: center;">lost</td>
			<td style="background-color:#cccccc">&nbsp;</td>
			<td style="background-color:#cccccc">&nbsp;</td>
		</tr>
		<tr>
			<th style="text-align: center;">Team<sub>3</sub></th>
			<td style="background-color:#cccccc">&nbsp;</td>
			<td style="text-align: center;">won</td>
			<td>&nbsp;</td>
			<td style="background-color:#cccccc">&nbsp;</td>
			<td style="background-color:#cccccc">&nbsp;</td>
		</tr>
		<tr>
			<th style="text-align: center;">Team<sub>4</sub></th>
			<td style="text-align: center;">won</td>
			<td style="background-color:#cccccc">&nbsp;</td>
			<td style="background-color:#cccccc">&nbsp;</td>
			<td>&nbsp;</td>
			<td style="background-color:#cccccc">&nbsp;</td>
		</tr>
		<tr>
			<th style="text-align: center;">Team<sub>5</sub></th>
			<td style="text-align: center;">won</td>
			<td style="background-color:#cccccc">&nbsp;</td>
			<td style="background-color:#cccccc">&nbsp;</td>
			<td style="background-color:#cccccc">&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
	</tbody>
</table>

<p>In this case, all the teams win the same number of matches with only two win/loss combination patterns of the remaining matches, which lead to a full playoff, as shown below. In the two tables, the differences are indicated in light yellow.</p>

<table class="table table-bordered" style="width: 60%;">
	<tbody>
		<tr>
			<th style="text-align: center;">Team \ Against</th>
			<th style="text-align: center;">Team<sub>1</sub></th>
			<th style="text-align: center;">Team<sub>2</sub></th>
			<th style="text-align: center;">Team<sub>3</sub></th>
			<th style="text-align: center;">Team<sub>4</sub></th>
			<th style="text-align: center;">Team<sub>5</sub></th>
		</tr>
		<tr>
			<th style="text-align: center;">Team<sub>1</sub></th>
			<td style="text-align: center;">&nbsp;</td>
			<td style="text-align: center;">won</td>
			<td style="text-align: center;">won</td>
			<td style="text-align: center;">lost</td>
			<td style="text-align: center;">lost</td>
		</tr>
		<tr>
			<th style="text-align: center;">Team<sub>2</sub></th>
			<td style="text-align: center;">lost</td>
			<td style="text-align: center;">&nbsp;</td>
			<td style="text-align: center;">lost</td>
			<td style="text-align: center;">won</td>
			<td style="text-align: center;">won</td>
		</tr>
		<tr>
			<th style="text-align: center;">Team<sub>3</sub></th>
			<td style="text-align: center;">lost</td>
			<td style="text-align: center;">won</td>
			<td style="text-align: center;">&nbsp;</td>
			<td style="background-color: #ffffcc; text-align: center;">won</td>
			<td style="background-color: #ffffcc; text-align: center;">lost</td>
		</tr>
		<tr>
			<th style="text-align: center;">Team<sub>4</sub></th>
			<td style="text-align: center;">won</td>
			<td style="text-align: center;">lost</td>
			<td style="background-color: #ffffcc; text-align: center;">lost</td>
			<td style="text-align: center;">&nbsp;</td>
			<td style="background-color: #ffffcc; text-align: center;">won</td>
		</tr>
		<tr>
			<th style="text-align: center;">Team<sub>5</sub></th>
			<td style="text-align: center;">won</td>
			<td style="text-align: center;">lost</td>
			<td style="background-color: #ffffcc; text-align: center;">won</td>
			<td style="background-color: #ffffcc; text-align: center;">lost</td>
			<td style="text-align: center;">&nbsp;</td>
		</tr>
	</tbody>
</table>

<table class="table table-bordered" style="width: 60%;">
	<tbody>
		<tr>
			<th style="text-align: center;">Team \ Against</th>
			<th style="text-align: center;">Team<sub>1</sub></th>
			<th style="text-align: center;">Team<sub>2</sub></th>
			<th style="text-align: center;">Team<sub>3</sub></th>
			<th style="text-align: center;">Team<sub>4</sub></th>
			<th style="text-align: center;">Team<sub>5</sub></th>
		</tr>
		<tr>
			<th style="text-align: center;">Team<sub>1</sub></th>
			<td style="text-align: center;">&nbsp;</td>
			<td style="text-align: center;">won</td>
			<td style="text-align: center;">won</td>
			<td style="text-align: center;">lost</td>
			<td style="text-align: center;">lost</td>
		</tr>
		<tr>
			<th style="text-align: center;">Team<sub>2</sub></th>
			<td style="text-align: center;">lost</td>
			<td style="text-align: center;">&nbsp;</td>
			<td style="text-align: center;">lost</td>
			<td style="text-align: center;">won</td>
			<td style="text-align: center;">won</td>
		</tr>
		<tr>
			<th style="text-align: center;">Team<sub>3</sub></th>
			<td style="text-align: center;">lost</td>
			<td style="text-align: center;">won</td>
			<td style="text-align: center;">&nbsp;</td>
			<td style="background-color: #ffffcc; text-align: center;">lost</td>
			<td style="background-color: #ffffcc; text-align: center;">won</td>
		</tr>
		<tr>
			<th style="text-align: center;">Team<sub>4</sub></th>
			<td style="text-align: center;">won</td>
			<td style="text-align: center;">lost</td>
			<td style="background-color: #ffffcc; text-align: center;">won</td>
			<td style="text-align: center;">&nbsp;</td>
			<td style="background-color: #ffffcc; text-align: center;">lost</td>
		</tr>
		<tr>
			<th style="text-align: center;">Team<sub>5</sub></th>
			<td style="text-align: center;">won</td>
			<td style="text-align: center;">lost</td>
			<td style="background-color: #ffffcc; text-align: center;">lost</td>
			<td style="background-color: #ffffcc; text-align: center;">won</td>
			<td style="text-align: center;">&nbsp;</td>
		</tr>
	</tbody>
</table>

### 입력

<p>The input consists of multiple datasets, each in the following format.</p>

<pre>
<i>n</i>
<i>m</i>
<i>x</i><sub>1</sub> <i>y</i><sub>1</sub>
...
<i>x<sub>m</sub></i> <i>y<sub>m</sub></i></pre>

<p><i>n</i> is an odd integer, 3, 5, 7, or 9, indicating the number of teams participating in the tournament. <i>m</i> is a positive integer less than <i>n</i>(<i>n</i>&minus;1)/2, which is the number of matches already finished. <i>x<sub>i</sub></i> and <i>y<sub>i</sub></i> give the result of the <i>i</i>-th match that has already taken place, indicating that team <i>x<sub>i</sub></i> defeated team <i>y<sub>i</sub></i>. Each of <i>x<sub>i</sub></i> and <i>y<sub>i</sub></i> is an integer 1 through <i>n</i> which indicates the team number. No team plays against itself, that is, for any <i>i</i>, <i>x<sub>i</sub></i> &ne; <i>y<sub>i</sub></i>. The match result of the same team pair appears at most once. That is, if <i>i</i> &ne; <i>j</i>, then (<i>x<sub>i</sub></i>,<i>y<sub>i</sub></i>) &ne; (<i>x<sub>j</sub></i>,<i>y<sub>j</sub></i>) and (<i>x<sub>i</sub></i>,<i>y<sub>i</sub></i>) &ne; (<i>y<sub>j</sub></i>,<i>x<sub>j</sub></i>) hold.</p>

<p>The end of the input is indicated by a line containing a zero. The number of datasets does not exceed 100.</p>

### 출력

<p>For each dataset, output a single line containing one integer which indicates the number of possible future win/loss patterns that a full playoff will be required.</p>